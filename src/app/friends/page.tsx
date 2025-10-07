'use client';

import { useState, useEffect } from 'react';
import { Search, Loader2, UserPlus } from 'lucide-react';
import { Input } from '@/components/ui/input';
import { Button } from '@/components/ui/button';
import { Card, CardContent } from '@/components/ui/card';
import { Avatar, AvatarFallback, AvatarImage } from '@/components/ui/avatar';
import { useToast } from '@/hooks/use-toast';
import { auth } from '@/lib/firebase';
import type { User as FirebaseUser } from 'firebase/auth';

// Mock user data type
type User = {
  id: string;
  username: string;
  avatar: string;
  initials: string;
};

// Mock search function
const searchUsers = async (query: string, currentUsername: string | null): Promise<User[]> => {
  console.log(`Searching for: ${query}`);
  // In a real app, you'd fetch this from your database
  const mockUsers: User[] = [
    { id: '1', username: 'alex', avatar: 'https://i.pravatar.cc/150?u=alex', initials: 'A' },
    { id: '2', username: 'casey', avatar: 'https://i.pravatar.cc/150?u=casey', initials: 'C' },
    { id: '3', username: 'jordan', avatar: 'https://i.pravatar.cc/150?u=jordan', initials: 'J' },
    { id: '4', username: 'sam', avatar: 'https://i.pravatar.cc/150?u=sam', initials: 'S' },
    { id: '5', username: 'hello2', avatar: 'https://i.pravatar.cc/150?u=hello2', initials: 'H' },
  ];

  await new Promise(resolve => setTimeout(resolve, 500)); // Simulate network delay

  if (!query) {
    return [];
  }
  
  // Simulate searching by friend link (e.g., "alex.link")
  const searchUsername = query.replace('.link', '').toLowerCase();

  return mockUsers.filter(user => 
    user.username.toLowerCase().includes(searchUsername) &&
    user.username.toLowerCase() !== currentUsername?.toLowerCase() // Exclude current user
  );
};

export default function FriendsPage() {
  const [currentUser, setCurrentUser] = useState<FirebaseUser | null>(null);
  const [searchQuery, setSearchQuery] = useState('');
  const [searchResults, setSearchResults] = useState<User[]>([]);
  const [isLoading, setIsLoading] = useState(false);
  const [addedFriends, setAddedFriends] = useState<Set<string>>(new Set());
  const { toast } = useToast();

  useEffect(() => {
    const unsubscribe = auth.onAuthStateChanged((user) => {
      setCurrentUser(user);
    });
    return () => unsubscribe();
  }, []);

  const getUsername = (user: FirebaseUser | null) => {
    if (!user || !user.email) return null;
    return user.email.split('@')[0];
  };

  const handleSearch = async (e: React.FormEvent) => {
    e.preventDefault();
    if (!searchQuery.trim()) return;

    setIsLoading(true);
    const currentUsername = getUsername(currentUser);
    const results = await searchUsers(searchQuery, currentUsername);
    setSearchResults(results);
    setIsLoading(false);
  };

  const handleAddFriend = (user: User) => {
    // In a real app, this would send a friend request
    console.log(`Adding friend: ${user.username}`);
    setAddedFriends(prev => new Set(prev).add(user.id));
    toast({
      title: 'Friend Added!',
      description: `You are now friends with ${user.username}.`,
    });
  };

  return (
    <>
      <main className="container mx-auto max-w-2xl py-8 px-4">
        <div className="text-center mb-8">
          <h1 className="text-4xl font-headline font-bold text-primary">Find Friends</h1>
          <p className="mt-2 text-lg text-muted-foreground">Connect with others using their unique friend link.</p>
        </div>

        <form onSubmit={handleSearch} className="flex gap-2 mb-8">
          <Input
            type="search"
            placeholder="Search by friend link..."
            value={searchQuery}
            onChange={(e) => setSearchQuery(e.target.value)}
            className="flex-grow"
            disabled={isLoading}
          />
          <Button type="submit" disabled={isLoading}>
            {isLoading ? (
              <Loader2 className="mr-2 h-4 w-4 animate-spin" />
            ) : (
              <Search className="mr-2 h-4 w-4" />
            )}
            Search
          </Button>
        </form>

        <div className="space-y-4">
          {isLoading && <p className="text-center text-muted-foreground">Searching...</p>}
          
          {!isLoading && searchResults.length === 0 && searchQuery && (
             <p className="text-center text-muted-foreground">No users found for &quot;{searchQuery}&quot;.</p>
          )}

          {searchResults.map((user) => (
            <Card key={user.id}>
              <CardContent className="flex items-center justify-between p-4">
                <div className="flex items-center gap-4">
                  <Avatar>
                    <AvatarImage src={user.avatar} alt={user.username} />
                    <AvatarFallback>{user.initials}</AvatarFallback>
                  </Avatar>
                  <span className="font-medium">{user.username}</span>
                </div>
                <Button
                  size="sm"
                  onClick={() => handleAddFriend(user)}
                  disabled={addedFriends.has(user.id)}
                >
                  <UserPlus className="mr-2 h-4 w-4" />
                  {addedFriends.has(user.id) ? 'Friend' : 'Add Friend'}
                </Button>
              </CardContent>
            </Card>
          ))}
        </div>
      </main>
    </>
  );
}
