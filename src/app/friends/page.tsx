'use client';

import { useState } from 'react';
import { Search, Loader2, UserPlus } from 'lucide-react';
import Header from '@/components/header';
import { Input } from '@/components/ui/input';
import { Button } from '@/components/ui/button';
import { Card, CardContent } from '@/components/ui/card';
import { Avatar, AvatarFallback, AvatarImage } from '@/components/ui/avatar';
import { useToast } from '@/hooks/use-toast';

// Mock user data type
type User = {
  id: string;
  username: string;
  avatar: string;
  initials: string;
};

// Mock search function
const searchUsers = async (query: string): Promise<User[]> => {
  console.log(`Searching for: ${query}`);
  // In a real app, you'd fetch this from your database
  const mockUsers: User[] = [
    { id: '1', username: 'alex', avatar: 'https://i.pravatar.cc/150?u=alex', initials: 'A' },
    { id: '2', username: 'casey', avatar: 'https://i.pravatar.cc/150?u=casey', initials: 'C' },
    { id: '3', username: 'jordan', avatar: 'https://i.pravatar.cc/150?u=jordan', initials: 'J' },
    { id: '4', username: 'sam', avatar: 'https://i.pravatar.cc/150?u=sam', initials: 'S' },
  ];

  await new Promise(resolve => setTimeout(resolve, 500)); // Simulate network delay

  if (!query) {
    return [];
  }

  return mockUsers.filter(user => user.username.toLowerCase().includes(query.toLowerCase()));
};

export default function FriendsPage() {
  const [searchQuery, setSearchQuery] = useState('');
  const [searchResults, setSearchResults] = useState<User[]>([]);
  const [isLoading, setIsLoading] = useState(false);
  const [addedFriends, setAddedFriends] = useState<Set<string>>(new Set());
  const { toast } = useToast();

  const handleSearch = async (e: React.FormEvent) => {
    e.preventDefault();
    if (!searchQuery.trim()) return;

    setIsLoading(true);
    const results = await searchUsers(searchQuery);
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
      <Header />
      <main className="container mx-auto max-w-2xl py-8 pt-24 px-4">
        <div className="text-center mb-8">
          <h1 className="text-4xl font-headline font-bold text-primary">Find Friends</h1>
          <p className="mt-2 text-lg text-muted-foreground">Connect with others by searching their username.</p>
        </div>

        <form onSubmit={handleSearch} className="flex gap-2 mb-8">
          <Input
            type="search"
            placeholder="Search by username..."
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
