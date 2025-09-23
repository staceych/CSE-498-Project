package org.jfree.chart;


import org.junit.FixMethodOrder;
// import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionFourTest {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        relativeDateFormat1.setShowZeroDays(false);
        relativeDateFormat1.setMinuteSuffix("0.0");
        relativeDateFormat1.setMinuteSuffix("0.66");
        java.text.ParsePosition parsePosition9 = null;
        java.lang.Object obj10 = relativeDateFormat1.parseObject("d", parsePosition9);
        relativeDateFormat1.setDaySuffix("\u221e");
        org.jfree.chart.util.ObjectList objectList14 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat15 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str16 = relativeDateFormat15.getHourSuffix();
        boolean boolean17 = relativeDateFormat15.getShowZeroHours();
        java.lang.String str18 = relativeDateFormat15.getMinuteSuffix();
        long long19 = relativeDateFormat15.getBaseMillis();
        java.lang.String str20 = relativeDateFormat15.getHourSuffix();
        relativeDateFormat15.setPositivePrefix("");
        java.lang.Object obj23 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat15);
        boolean boolean24 = objectList14.equals((java.lang.Object) relativeDateFormat15);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat25 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str26 = relativeDateFormat25.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat31.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone35 = dateFormat34.getTimeZone();
        boolean boolean36 = logFormat31.equals((java.lang.Object) timeZone35);
        relativeDateFormat25.setHourFormatter((java.text.NumberFormat) logFormat31);
        java.text.ParsePosition parsePosition39 = null;
        java.util.Date date40 = relativeDateFormat25.parse("hi!", parsePosition39);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat41 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str42 = relativeDateFormat41.getHourSuffix();
        java.lang.String str43 = relativeDateFormat41.getDaySuffix();
        boolean boolean44 = relativeDateFormat41.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat49 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer51 = null;
        java.text.FieldPosition fieldPosition52 = null;
        java.lang.StringBuffer stringBuffer53 = logFormat49.format((-1L), stringBuffer51, fieldPosition52);
        logFormat49.setParseIntegerOnly(true);
        relativeDateFormat41.setDayFormatter((java.text.NumberFormat) logFormat49);
        relativeDateFormat25.setSecondFormatter((java.text.NumberFormat) logFormat49);
        relativeDateFormat15.setHourFormatter((java.text.NumberFormat) logFormat49);
        java.text.NumberFormat numberFormat59 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat59.setMinimumFractionDigits((int) '4');
        relativeDateFormat15.setMinuteFormatter(numberFormat59);
        relativeDateFormat1.setMinuteFormatter(numberFormat59);
        numberFormat59.setMinimumFractionDigits(8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "m" + "'", str18, "m");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "h" + "'", str42, "h");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "d" + "'", str43, "d");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(stringBuffer53);
        org.junit.Assert.assertEquals(stringBuffer53.toString(), "NaN");
        org.junit.Assert.assertNotNull(numberFormat59);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance();
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat9.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        boolean boolean14 = logFormat9.equals((java.lang.Object) timeZone13);
        dateFormat4.setTimeZone(timeZone13);
        dateFormat3.setTimeZone(timeZone13);
        relativeDateFormat0.setTimeZone(timeZone13);
        java.lang.String str18 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setShowZeroHours(true);
        relativeDateFormat0.setSecondSuffix("\24415.00");
        relativeDateFormat0.setSecondSuffix("\u221em0.004s");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        int int1 = objectList0.size();
        objectList0.clear();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setMinuteSuffix("SortOrder.DESCENDING");
        long long8 = relativeDateFormat4.getBaseMillis();
        objectList0.set(64, (java.lang.Object) relativeDateFormat4);
        java.lang.Class<?> wildcardClass10 = objectList0.getClass();
        boolean boolean11 = org.jfree.chart.util.SerialUtils.isSerializable((java.lang.Class) wildcardClass10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        boolean boolean3 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        java.lang.StringBuffer stringBuffer12 = logFormat8.format((-1L), stringBuffer10, fieldPosition11);
        logFormat8.setParseIntegerOnly(true);
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat8);
        java.lang.Object obj16 = logFormat8.clone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuffer12);
        org.junit.Assert.assertEquals(stringBuffer12.toString(), "NaN");
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance();
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat9.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        boolean boolean14 = logFormat9.equals((java.lang.Object) timeZone13);
        dateFormat4.setTimeZone(timeZone13);
        dateFormat3.setTimeZone(timeZone13);
        relativeDateFormat0.setTimeZone(timeZone13);
        java.lang.Object obj18 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        long long19 = relativeDateFormat0.getBaseMillis();
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat24.setMinimumIntegerDigits(1);
        boolean boolean27 = logFormat24.isGroupingUsed();
        logFormat24.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat30 = logFormat24.getExponentFormat();
        boolean boolean32 = logFormat24.equals((java.lang.Object) 0.0f);
        int int33 = logFormat24.getMaximumIntegerDigits();
        int int34 = logFormat24.getMaximumFractionDigits();
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat24);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        org.jfree.chart.PaintMap paintMap3 = new org.jfree.chart.PaintMap();
        java.lang.Object obj4 = paintMap3.clone();
        java.awt.Paint paint6 = null;
        paintMap3.put((java.lang.Comparable) '4', paint6);
        org.jfree.chart.util.ObjectList objectList9 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat10 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str11 = relativeDateFormat10.getHourSuffix();
        boolean boolean12 = relativeDateFormat10.getShowZeroHours();
        java.lang.String str13 = relativeDateFormat10.getMinuteSuffix();
        long long14 = relativeDateFormat10.getBaseMillis();
        java.lang.String str15 = relativeDateFormat10.getHourSuffix();
        relativeDateFormat10.setPositivePrefix("");
        java.lang.Object obj18 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat10);
        boolean boolean19 = objectList9.equals((java.lang.Object) relativeDateFormat10);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat20 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str21 = relativeDateFormat20.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat26.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone30 = dateFormat29.getTimeZone();
        boolean boolean31 = logFormat26.equals((java.lang.Object) timeZone30);
        relativeDateFormat20.setHourFormatter((java.text.NumberFormat) logFormat26);
        java.text.ParsePosition parsePosition34 = null;
        java.util.Date date35 = relativeDateFormat20.parse("hi!", parsePosition34);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat36 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str37 = relativeDateFormat36.getHourSuffix();
        java.lang.String str38 = relativeDateFormat36.getDaySuffix();
        boolean boolean39 = relativeDateFormat36.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat44 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer46 = null;
        java.text.FieldPosition fieldPosition47 = null;
        java.lang.StringBuffer stringBuffer48 = logFormat44.format((-1L), stringBuffer46, fieldPosition47);
        logFormat44.setParseIntegerOnly(true);
        relativeDateFormat36.setDayFormatter((java.text.NumberFormat) logFormat44);
        relativeDateFormat20.setSecondFormatter((java.text.NumberFormat) logFormat44);
        relativeDateFormat10.setHourFormatter((java.text.NumberFormat) logFormat44);
        boolean boolean54 = paintMap3.equals((java.lang.Object) logFormat44);
        boolean boolean55 = relativeDateFormat0.equals((java.lang.Object) paintMap3);
        boolean boolean56 = relativeDateFormat0.getShowZeroDays();
        relativeDateFormat0.setPositivePrefix("NaN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "m" + "'", str13, "m");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "h" + "'", str37, "h");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "d" + "'", str38, "d");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(stringBuffer48);
        org.junit.Assert.assertEquals(stringBuffer48.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean1 = relativeDateFormat0.isLenient();
        java.text.ParsePosition parsePosition3 = null;
        java.util.Date date4 = relativeDateFormat0.parse("m", parsePosition3);
        relativeDateFormat0.setBaseMillis((long) 8);
        java.text.NumberFormat numberFormat7 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat7.setParseIntegerOnly(false);
        java.lang.String str11 = numberFormat7.format((long) 15);
        relativeDateFormat0.setHourFormatter(numberFormat7);
        relativeDateFormat0.setMinuteSuffix("");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat15 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str16 = relativeDateFormat15.getHourSuffix();
        java.lang.String str17 = relativeDateFormat15.getDaySuffix();
        boolean boolean18 = relativeDateFormat15.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer25 = null;
        java.text.FieldPosition fieldPosition26 = null;
        java.lang.StringBuffer stringBuffer27 = logFormat23.format((-1L), stringBuffer25, fieldPosition26);
        logFormat23.setParseIntegerOnly(true);
        relativeDateFormat15.setDayFormatter((java.text.NumberFormat) logFormat23);
        java.util.TimeZone timeZone31 = relativeDateFormat15.getTimeZone();
        relativeDateFormat0.setTimeZone(timeZone31);
        relativeDateFormat0.setMinuteSuffix("NaN");
        java.util.Calendar calendar35 = relativeDateFormat0.getCalendar();
        java.text.NumberFormat numberFormat36 = relativeDateFormat0.getNumberFormat();
        relativeDateFormat0.setDaySuffix("1.58");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\24415.00" + "'", str11, "\24415.00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "NaN");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar35);
// flaky "1) test2007(RegressionTest4)":         org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=1758659545474,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=25,MILLISECOND=474,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat36);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        int int8 = logFormat4.getMaximumFractionDigits();
        boolean boolean9 = logFormat4.isParseIntegerOnly();
        java.lang.Object obj10 = logFormat4.clone();
        java.text.ParsePosition parsePosition12 = null;
        java.lang.Number number13 = logFormat4.parse("\2440.00", parsePosition12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = number13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(number13);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double) 7, "\u221em0.004s", false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross(100.0f, (float) 13);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getMinuteSuffix();
        relativeDateFormat0.setDaySuffix("5.7");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        boolean boolean2 = paintMap0.containsKey((java.lang.Comparable) (short) 10);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat3 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str4 = relativeDateFormat3.getHourSuffix();
        boolean boolean5 = relativeDateFormat3.getShowZeroHours();
        java.lang.String str6 = relativeDateFormat3.getMinuteSuffix();
        long long7 = relativeDateFormat3.getBaseMillis();
        java.lang.String str8 = relativeDateFormat3.getHourSuffix();
        relativeDateFormat3.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat15 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int16 = logFormat15.getMaximumFractionDigits();
        logFormat15.setGroupingUsed(true);
        logFormat15.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        java.lang.StringBuffer stringBuffer24 = logFormat15.format((java.lang.Object) 10, stringBuffer22, fieldPosition23);
        java.lang.String str26 = logFormat15.format(0L);
        java.lang.Object obj27 = logFormat15.clone();
        java.lang.String str29 = logFormat15.format((java.lang.Object) (byte) -1);
        relativeDateFormat3.setNumberFormat((java.text.NumberFormat) logFormat15);
        boolean boolean31 = paintMap0.equals((java.lang.Object) relativeDateFormat3);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat32 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str33 = relativeDateFormat32.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat38.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone42 = dateFormat41.getTimeZone();
        boolean boolean43 = logFormat38.equals((java.lang.Object) timeZone42);
        relativeDateFormat32.setHourFormatter((java.text.NumberFormat) logFormat38);
        java.text.ParsePosition parsePosition46 = null;
        java.util.Date date47 = relativeDateFormat32.parse("hi!", parsePosition46);
        org.jfree.chart.util.LogFormat logFormat52 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int53 = logFormat52.getMaximumFractionDigits();
        logFormat52.setGroupingUsed(true);
        logFormat52.setGroupingUsed(false);
        logFormat52.setMaximumIntegerDigits((-1));
        relativeDateFormat32.setNumberFormat((java.text.NumberFormat) logFormat52);
        relativeDateFormat3.setNumberFormat((java.text.NumberFormat) logFormat52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "m" + "'", str6, "m");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "3.32");
// flaky "2) test2012(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u221e" + "'", str26, "\u221e");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NaN" + "'", str29, "NaN");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "h" + "'", str33, "h");
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int8 = logFormat7.getMaximumFractionDigits();
        logFormat7.setGroupingUsed(true);
        logFormat7.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        java.lang.StringBuffer stringBuffer16 = logFormat7.format((java.lang.Object) 10, stringBuffer14, fieldPosition15);
        org.jfree.chart.util.LogFormat logFormat21 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat21.setMinimumIntegerDigits(1);
        logFormat21.setGroupingUsed(false);
        logFormat7.setExponentFormat((java.text.NumberFormat) logFormat21);
        boolean boolean27 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) shape1, (java.lang.Object) logFormat7);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) (short) 0, (float) 11);
        boolean boolean31 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape30);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) (byte) 10);
        boolean boolean34 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape33);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape33, (double) (byte) -1, (double) 0.0f);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(stringBuffer16);
        org.junit.Assert.assertEquals(stringBuffer16.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shape37);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        boolean boolean10 = logFormat5.equals((java.lang.Object) timeZone9);
        boolean boolean11 = paintList0.equals((java.lang.Object) logFormat5);
        java.awt.Paint paint13 = null;
        paintList0.setPaint(9, paint13);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) '#', (float) 100);
        boolean boolean18 = paintList0.equals((java.lang.Object) shape17);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((-1.0f), (float) (short) -1);
        boolean boolean22 = paintList0.equals((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        long long2 = relativeDateFormat1.getBaseMillis();
        boolean boolean3 = relativeDateFormat1.getShowZeroDays();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat10.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone14 = dateFormat13.getTimeZone();
        boolean boolean15 = logFormat10.equals((java.lang.Object) timeZone14);
        relativeDateFormat4.setHourFormatter((java.text.NumberFormat) logFormat10);
        java.lang.Object obj17 = logFormat10.clone();
        relativeDateFormat1.setDayFormatter((java.text.NumberFormat) logFormat10);
        relativeDateFormat1.setDaySuffix("0.66");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle(1.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, 10.0d, 10.0d);
        java.awt.Shape shape7 = null;
        boolean boolean8 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape7);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        java.lang.StringBuffer stringBuffer17 = logFormat13.format((-1L), stringBuffer15, fieldPosition16);
        java.text.FieldPosition fieldPosition18 = null;
        java.lang.StringBuffer stringBuffer19 = logFormat4.format((long) (short) 10, stringBuffer15, fieldPosition18);
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int25 = logFormat24.getMaximumFractionDigits();
        logFormat24.setGroupingUsed(true);
        logFormat24.setGroupingUsed(false);
        logFormat24.setMaximumIntegerDigits((-1));
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat24);
        java.text.ParsePosition parsePosition34 = null;
        java.lang.Number number35 = logFormat4.parse("hi!", parsePosition34);
        logFormat4.setMinimumFractionDigits((int) (short) 1);
        java.lang.Object obj38 = logFormat4.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat39 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str40 = relativeDateFormat39.getHourSuffix();
        boolean boolean41 = relativeDateFormat39.getShowZeroHours();
        java.lang.String str42 = relativeDateFormat39.getMinuteSuffix();
        long long43 = relativeDateFormat39.getBaseMillis();
        java.lang.String str44 = relativeDateFormat39.getHourSuffix();
        relativeDateFormat39.setShowZeroHours(false);
        long long47 = relativeDateFormat39.getBaseMillis();
        java.lang.String str48 = relativeDateFormat39.getMinuteSuffix();
        long long49 = relativeDateFormat39.getBaseMillis();
        boolean boolean50 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) logFormat4, (java.lang.Object) long49);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(number35);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "h" + "'", str40, "h");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "m" + "'", str42, "m");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "h" + "'", str44, "h");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "m" + "'", str48, "m");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(9, 36, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 36");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        long long6 = relativeDateFormat2.getBaseMillis();
        java.lang.String str7 = relativeDateFormat2.getHourSuffix();
        relativeDateFormat2.setPositivePrefix("");
        java.lang.Object obj10 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat2);
        boolean boolean11 = objectList1.equals((java.lang.Object) relativeDateFormat2);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat12 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str13 = relativeDateFormat12.getHourSuffix();
        boolean boolean14 = relativeDateFormat12.getShowZeroHours();
        java.lang.String str15 = relativeDateFormat12.getMinuteSuffix();
        long long16 = relativeDateFormat12.getBaseMillis();
        java.lang.String str17 = relativeDateFormat12.getHourSuffix();
        relativeDateFormat12.setPositivePrefix("");
        java.lang.Object obj20 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat12);
        int int21 = objectList1.indexOf((java.lang.Object) relativeDateFormat12);
        relativeDateFormat12.setLenient(true);
        relativeDateFormat12.setDaySuffix("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "m" + "'", str15, "m");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat8);
        java.lang.String str10 = relativeDateFormat0.getPositivePrefix();
        java.lang.String str11 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setHourSuffix("\2440.00");
        java.lang.String str14 = relativeDateFormat0.getPositivePrefix();
        boolean boolean15 = relativeDateFormat0.getShowZeroHours();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        relativeDateFormat1.setShowZeroDays(false);
        relativeDateFormat1.setMinuteSuffix("0.0");
        org.jfree.chart.util.ObjectList objectList7 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj8 = objectList7.clone();
        java.lang.Object obj9 = objectList7.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat10 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str11 = relativeDateFormat10.getHourSuffix();
        boolean boolean12 = relativeDateFormat10.getShowZeroHours();
        java.lang.String str13 = relativeDateFormat10.getMinuteSuffix();
        long long14 = relativeDateFormat10.getBaseMillis();
        java.lang.String str15 = relativeDateFormat10.getHourSuffix();
        relativeDateFormat10.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat22 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int23 = logFormat22.getMaximumFractionDigits();
        logFormat22.setGroupingUsed(true);
        logFormat22.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer29 = null;
        java.text.FieldPosition fieldPosition30 = null;
        java.lang.StringBuffer stringBuffer31 = logFormat22.format((java.lang.Object) 10, stringBuffer29, fieldPosition30);
        java.lang.String str33 = logFormat22.format(0L);
        java.lang.Object obj34 = logFormat22.clone();
        java.lang.String str36 = logFormat22.format((java.lang.Object) (byte) -1);
        relativeDateFormat10.setNumberFormat((java.text.NumberFormat) logFormat22);
        int int38 = objectList7.indexOf((java.lang.Object) logFormat22);
        java.lang.String str40 = logFormat22.format((long) 10);
        java.text.NumberFormat numberFormat41 = logFormat22.getExponentFormat();
        relativeDateFormat1.setSecondFormatter(numberFormat41);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "m" + "'", str13, "m");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "3.32");
// flaky "3) test2021(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u221e" + "'", str33, "\u221e");
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "NaN" + "'", str36, "NaN");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "3.32" + "'", str40, "3.32");
        org.junit.Assert.assertNotNull(numberFormat41);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance();
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat9.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        boolean boolean14 = logFormat9.equals((java.lang.Object) timeZone13);
        dateFormat4.setTimeZone(timeZone13);
        dateFormat3.setTimeZone(timeZone13);
        relativeDateFormat0.setTimeZone(timeZone13);
        java.lang.String str18 = relativeDateFormat0.getDaySuffix();
        java.lang.String str19 = relativeDateFormat0.getSecondSuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "s" + "'", str19, "s");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(9);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createDiagonalCross(10.0f, (float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.clone(shape4);
        int int6 = objectList1.indexOf((java.lang.Object) shape4);
        java.lang.Object obj8 = objectList1.get(13);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) 0);
        org.jfree.chart.util.ObjectList objectList3 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        boolean boolean6 = relativeDateFormat4.getShowZeroHours();
        java.lang.String str7 = relativeDateFormat4.getMinuteSuffix();
        long long8 = relativeDateFormat4.getBaseMillis();
        java.lang.String str9 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setPositivePrefix("");
        java.lang.Object obj12 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat4);
        boolean boolean13 = objectList3.equals((java.lang.Object) relativeDateFormat4);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat14 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str15 = relativeDateFormat14.getHourSuffix();
        boolean boolean16 = relativeDateFormat14.getShowZeroHours();
        java.util.Calendar calendar17 = relativeDateFormat14.getCalendar();
        relativeDateFormat4.setCalendar(calendar17);
        dateFormat1.setCalendar(calendar17);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "m" + "'", str7, "m");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(calendar17);
// flaky "4) test2024(RegressionTest4)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1758659545855,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=25,MILLISECOND=855,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        boolean boolean8 = logFormat4.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        boolean boolean14 = logFormat13.isParseIntegerOnly();
        java.lang.Object obj15 = logFormat13.clone();
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat13);
        int int17 = logFormat4.getMaximumIntegerDigits();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 40 + "'", int17 == 40);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        java.lang.String str15 = logFormat4.format(0L);
        java.lang.Object obj16 = logFormat4.clone();
        java.lang.String str18 = logFormat4.format((double) (byte) 0);
        java.lang.Object obj19 = logFormat4.clone();
        logFormat4.setMinimumIntegerDigits(309);
        logFormat4.setMinimumFractionDigits((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "5) test2026(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "1) test2026(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat8.setMinimumIntegerDigits(1);
        boolean boolean11 = logFormat8.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        java.lang.StringBuffer stringBuffer21 = logFormat17.format((-1L), stringBuffer19, fieldPosition20);
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat8.format((long) (short) 10, stringBuffer19, fieldPosition22);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat8);
        java.util.TimeZone timeZone25 = relativeDateFormat0.getTimeZone();
        java.lang.Class<?> wildcardClass26 = relativeDateFormat0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation5 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList1.set((int) (short) 1, (java.lang.Object) rotation5);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat7 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str8 = relativeDateFormat7.getHourSuffix();
        boolean boolean9 = relativeDateFormat7.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int15 = logFormat14.getMaximumFractionDigits();
        logFormat14.setGroupingUsed(true);
        logFormat14.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition21 = null;
        java.lang.Object obj22 = logFormat14.parseObject("", parsePosition21);
        org.jfree.chart.util.LogFormat logFormat27 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat27.setMinimumIntegerDigits(1);
        boolean boolean30 = logFormat27.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer38 = null;
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat36.format((-1L), stringBuffer38, fieldPosition39);
        java.text.FieldPosition fieldPosition41 = null;
        java.lang.StringBuffer stringBuffer42 = logFormat27.format((long) (short) 10, stringBuffer38, fieldPosition41);
        org.jfree.chart.util.LogFormat logFormat47 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int48 = logFormat47.getMaximumFractionDigits();
        logFormat47.setGroupingUsed(true);
        logFormat47.setGroupingUsed(false);
        logFormat47.setMaximumIntegerDigits((-1));
        logFormat27.setExponentFormat((java.text.NumberFormat) logFormat47);
        boolean boolean56 = logFormat14.equals((java.lang.Object) logFormat27);
        relativeDateFormat7.setMinuteFormatter((java.text.NumberFormat) logFormat14);
        org.jfree.chart.util.LogFormat logFormat62 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat62.setMinimumIntegerDigits(1);
        boolean boolean65 = logFormat62.isGroupingUsed();
        boolean boolean66 = logFormat62.isGroupingUsed();
        boolean boolean67 = logFormat14.equals((java.lang.Object) logFormat62);
        logFormat62.setMinimumFractionDigits((int) (byte) 100);
        int int70 = logFormat62.getMaximumFractionDigits();
        boolean boolean71 = objectList1.equals((java.lang.Object) int70);
        java.text.DateFormat dateFormat72 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat73 = dateFormat72.getNumberFormat();
        java.lang.Object obj74 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) dateFormat72);
        int int75 = objectList1.indexOf((java.lang.Object) dateFormat72);
        objectList1.clear();
        java.lang.Object obj78 = objectList1.get(128);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + rotation5 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation5.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer42);
        org.junit.Assert.assertEquals(stringBuffer42.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(dateFormat72);
        org.junit.Assert.assertNotNull(numberFormat73);
        org.junit.Assert.assertNotNull(obj74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 5, 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (5) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat8.setMinimumIntegerDigits(1);
        boolean boolean11 = logFormat8.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        java.lang.StringBuffer stringBuffer21 = logFormat17.format((-1L), stringBuffer19, fieldPosition20);
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat8.format((long) (short) 10, stringBuffer19, fieldPosition22);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat8);
        relativeDateFormat0.setPositivePrefix("Rotation.CLOCKWISE");
        java.text.NumberFormat numberFormat27 = relativeDateFormat0.getNumberFormat();
        java.text.NumberFormat numberFormat28 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat28.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean31 = numberFormat28.isParseIntegerOnly();
        java.math.RoundingMode roundingMode32 = numberFormat28.getRoundingMode();
        numberFormat27.setRoundingMode(roundingMode32);
        java.math.RoundingMode roundingMode34 = numberFormat27.getRoundingMode();
        java.text.NumberFormat numberFormat35 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean36 = numberFormat35.isGroupingUsed();
        int int37 = numberFormat35.getMinimumIntegerDigits();
        java.util.Currency currency38 = numberFormat35.getCurrency();
        numberFormat27.setCurrency(currency38);
        int int40 = numberFormat27.getMinimumIntegerDigits();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertNotNull(numberFormat28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + roundingMode32 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode32.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertTrue("'" + roundingMode34 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode34.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(currency38);
        org.junit.Assert.assertEquals(currency38.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) 5, paint3);
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 40, "31.0", false);
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat14.setMinimumIntegerDigits(1);
        boolean boolean17 = logFormat14.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer25 = null;
        java.text.FieldPosition fieldPosition26 = null;
        java.lang.StringBuffer stringBuffer27 = logFormat23.format((-1L), stringBuffer25, fieldPosition26);
        java.text.FieldPosition fieldPosition28 = null;
        java.lang.StringBuffer stringBuffer29 = logFormat14.format((long) (short) 10, stringBuffer25, fieldPosition28);
        java.text.FieldPosition fieldPosition30 = null;
        java.lang.StringBuffer stringBuffer31 = logFormat8.format((double) 64, stringBuffer29, fieldPosition30);
        boolean boolean32 = paintMap0.containsKey((java.lang.Comparable) 64);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer29);
        org.junit.Assert.assertEquals(stringBuffer29.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "1.13");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        long long6 = relativeDateFormat2.getBaseMillis();
        java.text.ParsePosition parsePosition8 = null;
        java.util.Date date9 = relativeDateFormat2.parse("", parsePosition8);
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat14.setMinimumIntegerDigits(1);
        logFormat14.setGroupingUsed(false);
        java.lang.String str20 = logFormat14.format((double) 0);
        relativeDateFormat2.setNumberFormat((java.text.NumberFormat) logFormat14);
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer28 = null;
        java.text.FieldPosition fieldPosition29 = null;
        java.lang.StringBuffer stringBuffer30 = logFormat26.format((-1L), stringBuffer28, fieldPosition29);
        logFormat26.setParseIntegerOnly(true);
        boolean boolean33 = logFormat26.isGroupingUsed();
        org.jfree.chart.util.ObjectList objectList35 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj37 = objectList35.get((int) (short) 1);
        boolean boolean38 = logFormat26.equals((java.lang.Object) (short) 1);
        java.text.ParsePosition parsePosition40 = null;
        java.lang.Number number41 = logFormat26.parse("\u221e", parsePosition40);
        java.text.NumberFormat numberFormat42 = logFormat26.getExponentFormat();
        relativeDateFormat2.setHourFormatter((java.text.NumberFormat) logFormat26);
        relativeDateFormat1.setSecondFormatter((java.text.NumberFormat) logFormat26);
        relativeDateFormat1.setLenient(true);
        java.text.NumberFormat numberFormat47 = java.text.NumberFormat.getIntegerInstance();
        int int48 = numberFormat47.getMaximumFractionDigits();
        java.text.NumberFormat numberFormat49 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean50 = numberFormat49.isGroupingUsed();
        int int51 = numberFormat49.getMinimumIntegerDigits();
        java.util.Currency currency52 = numberFormat49.getCurrency();
        numberFormat47.setCurrency(currency52);
        relativeDateFormat1.setNumberFormat(numberFormat47);
        boolean boolean55 = relativeDateFormat1.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat60 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat60.setMinimumIntegerDigits(1);
        boolean boolean63 = logFormat60.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat69 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int70 = logFormat69.getMaximumFractionDigits();
        logFormat69.setGroupingUsed(true);
        logFormat69.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer76 = null;
        java.text.FieldPosition fieldPosition77 = null;
        java.lang.StringBuffer stringBuffer78 = logFormat69.format((java.lang.Object) 10, stringBuffer76, fieldPosition77);
        java.text.FieldPosition fieldPosition79 = null;
        java.lang.StringBuffer stringBuffer80 = logFormat60.format((double) 2, stringBuffer76, fieldPosition79);
        relativeDateFormat1.setDayFormatter((java.text.NumberFormat) logFormat60);
        int int82 = logFormat60.getMaximumFractionDigits();
        int int83 = logFormat60.getMaximumFractionDigits();
        boolean boolean84 = logFormat60.isParseIntegerOnly();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(date9);
// flaky "6) test2032(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u221e" + "'", str20, "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(number41);
        org.junit.Assert.assertNotNull(numberFormat42);
        org.junit.Assert.assertNotNull(numberFormat47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(numberFormat49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(currency52);
        org.junit.Assert.assertEquals(currency52.toString(), "XXX");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 3 + "'", int70 == 3);
        org.junit.Assert.assertNotNull(stringBuffer78);
        org.junit.Assert.assertEquals(stringBuffer78.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer80);
        org.junit.Assert.assertEquals(stringBuffer80.toString(), "1.0");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3 + "'", int82 == 3);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 3 + "'", int83 == 3);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 52, 2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double) (-1), "-1", false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat8.setMinimumIntegerDigits(1);
        boolean boolean11 = logFormat8.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        java.lang.StringBuffer stringBuffer21 = logFormat17.format((-1L), stringBuffer19, fieldPosition20);
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat8.format((long) (short) 10, stringBuffer19, fieldPosition22);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat8);
        java.util.TimeZone timeZone25 = relativeDateFormat0.getTimeZone();
        long long26 = relativeDateFormat0.getBaseMillis();
        relativeDateFormat0.setMinuteSuffix("Rotation.ANTICLOCKWISE");
        boolean boolean29 = relativeDateFormat0.getShowZeroDays();
        relativeDateFormat0.setDaySuffix("LegendRenderingOrder.STANDARD");
        java.util.TimeZone timeZone32 = relativeDateFormat0.getTimeZone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross(1.0f, (float) 14);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, 0.0d, (double) (short) -1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        java.util.Calendar calendar3 = relativeDateFormat0.getCalendar();
        org.jfree.chart.util.ObjectList objectList5 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat6 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str7 = relativeDateFormat6.getHourSuffix();
        boolean boolean8 = relativeDateFormat6.getShowZeroHours();
        java.lang.String str9 = relativeDateFormat6.getMinuteSuffix();
        long long10 = relativeDateFormat6.getBaseMillis();
        java.lang.String str11 = relativeDateFormat6.getHourSuffix();
        relativeDateFormat6.setPositivePrefix("");
        java.lang.Object obj14 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat6);
        boolean boolean15 = objectList5.equals((java.lang.Object) relativeDateFormat6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat16 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str17 = relativeDateFormat16.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat22 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat22.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        boolean boolean27 = logFormat22.equals((java.lang.Object) timeZone26);
        relativeDateFormat16.setHourFormatter((java.text.NumberFormat) logFormat22);
        java.text.ParsePosition parsePosition30 = null;
        java.util.Date date31 = relativeDateFormat16.parse("hi!", parsePosition30);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat32 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str33 = relativeDateFormat32.getHourSuffix();
        java.lang.String str34 = relativeDateFormat32.getDaySuffix();
        boolean boolean35 = relativeDateFormat32.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer42 = null;
        java.text.FieldPosition fieldPosition43 = null;
        java.lang.StringBuffer stringBuffer44 = logFormat40.format((-1L), stringBuffer42, fieldPosition43);
        logFormat40.setParseIntegerOnly(true);
        relativeDateFormat32.setDayFormatter((java.text.NumberFormat) logFormat40);
        relativeDateFormat16.setSecondFormatter((java.text.NumberFormat) logFormat40);
        relativeDateFormat6.setHourFormatter((java.text.NumberFormat) logFormat40);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat40);
        org.jfree.chart.util.LogFormat logFormat55 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat55.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone59 = dateFormat58.getTimeZone();
        boolean boolean60 = logFormat55.equals((java.lang.Object) timeZone59);
        relativeDateFormat0.setTimeZone(timeZone59);
        java.lang.String str62 = relativeDateFormat0.getMinuteSuffix();
        java.lang.String str63 = relativeDateFormat0.getMinuteSuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(calendar3);
// flaky "7) test2037(RegressionTest4)":         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1758659546115,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=26,MILLISECOND=115,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "m" + "'", str9, "m");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "h" + "'", str33, "h");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "d" + "'", str34, "d");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "NaN");
        org.junit.Assert.assertNotNull(dateFormat58);
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "m" + "'", str62, "m");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "m" + "'", str63, "m");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) (short) 1);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj2 = objectList1.clone();
        java.lang.Object obj3 = objectList1.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat4.setPositivePrefix("\u221e");
        int int10 = objectList1.indexOf((java.lang.Object) relativeDateFormat4);
        java.lang.String str11 = relativeDateFormat4.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat16 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int17 = logFormat16.getMaximumFractionDigits();
        logFormat16.setGroupingUsed(true);
        logFormat16.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        java.lang.StringBuffer stringBuffer25 = logFormat16.format((java.lang.Object) 10, stringBuffer23, fieldPosition24);
        java.lang.String str27 = logFormat16.format(0L);
        java.lang.StringBuffer stringBuffer29 = null;
        java.text.FieldPosition fieldPosition30 = null;
        java.lang.StringBuffer stringBuffer31 = logFormat16.format(1L, stringBuffer29, fieldPosition30);
        java.lang.String str33 = logFormat16.format((long) 16);
        logFormat16.setGroupingUsed(true);
        relativeDateFormat4.setSecondFormatter((java.text.NumberFormat) logFormat16);
        relativeDateFormat4.setHourSuffix("4");
        relativeDateFormat4.setDaySuffix("\24415.000000");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
// flaky "8) test2039(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u221e" + "'", str27, "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "0.0");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4.0" + "'", str33, "4.0");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        java.awt.Paint paint6 = paintMap0.getPaint((java.lang.Comparable) "NaN");
        boolean boolean8 = paintMap0.containsKey((java.lang.Comparable) 2);
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat(0.0d, "SortOrder.DESCENDING", "1.58", false);
        boolean boolean14 = paintMap0.equals((java.lang.Object) logFormat13);
        java.awt.Paint paint16 = null;
        paintMap0.put((java.lang.Comparable) (short) -1, paint16);
        org.jfree.chart.util.ObjectList objectList19 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj21 = objectList19.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation23 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList19.set((int) (short) 1, (java.lang.Object) rotation23);
        java.lang.String str25 = rotation23.toString();
        double double26 = rotation23.getFactor();
        double double27 = rotation23.getFactor();
        java.lang.String str28 = rotation23.toString();
        double double29 = rotation23.getFactor();
        boolean boolean30 = paintMap0.containsKey((java.lang.Comparable) rotation23);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + rotation23 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation23.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Rotation.CLOCKWISE" + "'", str25, "Rotation.CLOCKWISE");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Rotation.CLOCKWISE" + "'", str28, "Rotation.CLOCKWISE");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        boolean boolean10 = logFormat5.equals((java.lang.Object) timeZone9);
        boolean boolean11 = paintList0.equals((java.lang.Object) logFormat5);
        java.lang.Object obj12 = null;
        boolean boolean13 = paintList0.equals(obj12);
        java.awt.Paint paint15 = paintList0.getPaint(12);
        java.lang.Object obj16 = paintList0.clone();
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        java.lang.StringBuffer stringBuffer17 = logFormat13.format((-1L), stringBuffer15, fieldPosition16);
        java.text.FieldPosition fieldPosition18 = null;
        java.lang.StringBuffer stringBuffer19 = logFormat4.format((long) (short) 10, stringBuffer15, fieldPosition18);
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int25 = logFormat24.getMaximumFractionDigits();
        logFormat24.setGroupingUsed(true);
        logFormat24.setGroupingUsed(false);
        logFormat24.setMaximumIntegerDigits((-1));
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat24);
        java.text.NumberFormat numberFormat33 = logFormat4.getExponentFormat();
        logFormat4.setGroupingUsed(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(numberFormat33);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.text.ParsePosition parsePosition6 = null;
        java.util.Date date7 = relativeDateFormat0.parse("", parsePosition6);
        org.jfree.chart.util.LogFormat logFormat12 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat12.setMinimumIntegerDigits(1);
        logFormat12.setGroupingUsed(false);
        java.lang.String str18 = logFormat12.format((double) 0);
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat12);
        java.lang.Object obj20 = relativeDateFormat0.clone();
        java.lang.String str21 = relativeDateFormat0.getHourSuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(date7);
// flaky "9) test2043(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        objectList1.clear();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat5 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str6 = relativeDateFormat5.getHourSuffix();
        boolean boolean7 = relativeDateFormat5.getShowZeroHours();
        java.lang.String str8 = relativeDateFormat5.getMinuteSuffix();
        long long9 = relativeDateFormat5.getBaseMillis();
        boolean boolean10 = relativeDateFormat5.getShowZeroHours();
        long long11 = relativeDateFormat5.getBaseMillis();
        int int12 = objectList1.indexOf((java.lang.Object) relativeDateFormat5);
        relativeDateFormat5.setLenient(true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "m" + "'", str8, "m");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double) 0, "s", true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList2 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean3 = legendRenderingOrder0.equals((java.lang.Object) objectList2);
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        java.lang.StringBuffer stringBuffer12 = logFormat8.format((-1L), stringBuffer10, fieldPosition11);
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        logFormat8.setExponentFormat((java.text.NumberFormat) logFormat17);
        boolean boolean19 = legendRenderingOrder0.equals((java.lang.Object) logFormat17);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat20 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str21 = relativeDateFormat20.getHourSuffix();
        boolean boolean22 = relativeDateFormat20.getShowZeroHours();
        boolean boolean23 = relativeDateFormat20.getShowZeroHours();
        java.util.TimeZone timeZone24 = relativeDateFormat20.getTimeZone();
        boolean boolean25 = legendRenderingOrder0.equals((java.lang.Object) relativeDateFormat20);
        java.lang.String str26 = legendRenderingOrder0.toString();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat27 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str28 = relativeDateFormat27.getHourSuffix();
        boolean boolean29 = relativeDateFormat27.getShowZeroHours();
        java.lang.String str30 = relativeDateFormat27.getMinuteSuffix();
        long long31 = relativeDateFormat27.getBaseMillis();
        java.lang.String str32 = relativeDateFormat27.getHourSuffix();
        relativeDateFormat27.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat39 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int40 = logFormat39.getMaximumFractionDigits();
        logFormat39.setGroupingUsed(true);
        logFormat39.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer46 = null;
        java.text.FieldPosition fieldPosition47 = null;
        java.lang.StringBuffer stringBuffer48 = logFormat39.format((java.lang.Object) 10, stringBuffer46, fieldPosition47);
        java.lang.String str50 = logFormat39.format(0L);
        java.lang.Object obj51 = logFormat39.clone();
        java.lang.String str53 = logFormat39.format((java.lang.Object) (byte) -1);
        relativeDateFormat27.setNumberFormat((java.text.NumberFormat) logFormat39);
        java.text.ParsePosition parsePosition56 = null;
        java.lang.Object obj57 = relativeDateFormat27.parseObject("6.64", parsePosition56);
        boolean boolean58 = legendRenderingOrder0.equals((java.lang.Object) relativeDateFormat27);
        relativeDateFormat27.setBaseMillis((long) 4);
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuffer12);
        org.junit.Assert.assertEquals(stringBuffer12.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "LegendRenderingOrder.REVERSE" + "'", str26, "LegendRenderingOrder.REVERSE");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "m" + "'", str30, "m");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(stringBuffer48);
        org.junit.Assert.assertEquals(stringBuffer48.toString(), "3.32");
// flaky "10) test2046(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u221e" + "'", str50, "\u221e");
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "NaN" + "'", str53, "NaN");
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        relativeDateFormat0.setDaySuffix("\2440.00");
        java.lang.String str7 = relativeDateFormat0.getPositivePrefix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        boolean boolean3 = paintMap0.containsKey((java.lang.Comparable) 0L);
        java.awt.Paint paint5 = paintMap0.getPaint((java.lang.Comparable) 100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat6 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str7 = relativeDateFormat6.getHourSuffix();
        relativeDateFormat6.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat6.setPositivePrefix("\u221e");
        java.lang.String str12 = relativeDateFormat6.getPositivePrefix();
        boolean boolean13 = relativeDateFormat6.getShowZeroHours();
        java.util.TimeZone timeZone14 = relativeDateFormat6.getTimeZone();
        relativeDateFormat6.setDaySuffix("4.0");
        boolean boolean17 = paintMap0.equals((java.lang.Object) relativeDateFormat6);
        java.lang.Object obj18 = relativeDateFormat6.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u221e" + "'", str12, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.text.ParsePosition parsePosition4 = null;
        java.util.Date date5 = relativeDateFormat0.parse("5.0", parsePosition4);
        relativeDateFormat0.setBaseMillis(0L);
        java.lang.String str8 = relativeDateFormat0.getHourSuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCurrencyInstance();
        java.lang.String str2 = numberFormat0.format((double) (byte) 0);
        boolean boolean3 = numberFormat0.isParseIntegerOnly();
        int int4 = numberFormat0.getMinimumFractionDigits();
        org.jfree.chart.util.ObjectList objectList6 = new org.jfree.chart.util.ObjectList(14);
        java.text.AttributedCharacterIterator attributedCharacterIterator7 = numberFormat0.formatToCharacterIterator((java.lang.Object) 14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = numberFormat0.parseObject("4.09");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\2440.00" + "'", str2, "\2440.00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(attributedCharacterIterator7);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.STANDARD;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (short) 0, (float) 4);
        boolean boolean4 = legendRenderingOrder0.equals((java.lang.Object) 4);
        java.lang.String str5 = legendRenderingOrder0.toString();
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.clone(shape7);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape8, (double) (byte) 10, (double) 10.0f);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtils.rotateShape(shape13, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtils.clone(shape17);
        boolean boolean19 = org.jfree.chart.util.ShapeUtils.equal(shape8, shape17);
        boolean boolean20 = legendRenderingOrder0.equals((java.lang.Object) shape17);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtils.clone(shape22);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtils.clone(shape22);
        boolean boolean25 = legendRenderingOrder0.equals((java.lang.Object) shape22);
        org.jfree.chart.PaintMap paintMap26 = new org.jfree.chart.PaintMap();
        paintMap26.clear();
        java.awt.Paint paint29 = null;
        paintMap26.put((java.lang.Comparable) 5, paint29);
        paintMap26.clear();
        boolean boolean32 = legendRenderingOrder0.equals((java.lang.Object) paintMap26);
        boolean boolean34 = paintMap26.containsKey((java.lang.Comparable) "64");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat35 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str36 = relativeDateFormat35.getHourSuffix();
        java.lang.String str37 = relativeDateFormat35.getDaySuffix();
        boolean boolean38 = relativeDateFormat35.getShowZeroHours();
        java.lang.String str39 = relativeDateFormat35.getMinuteSuffix();
        boolean boolean40 = relativeDateFormat35.isLenient();
        boolean boolean41 = paintMap26.equals((java.lang.Object) relativeDateFormat35);
        long long42 = relativeDateFormat35.getBaseMillis();
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str5, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "h" + "'", str36, "h");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "d" + "'", str37, "d");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "m" + "'", str39, "m");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation5 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList1.set((int) (short) 1, (java.lang.Object) rotation5);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat7 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str8 = relativeDateFormat7.getHourSuffix();
        boolean boolean9 = relativeDateFormat7.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int15 = logFormat14.getMaximumFractionDigits();
        logFormat14.setGroupingUsed(true);
        logFormat14.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition21 = null;
        java.lang.Object obj22 = logFormat14.parseObject("", parsePosition21);
        org.jfree.chart.util.LogFormat logFormat27 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat27.setMinimumIntegerDigits(1);
        boolean boolean30 = logFormat27.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer38 = null;
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat36.format((-1L), stringBuffer38, fieldPosition39);
        java.text.FieldPosition fieldPosition41 = null;
        java.lang.StringBuffer stringBuffer42 = logFormat27.format((long) (short) 10, stringBuffer38, fieldPosition41);
        org.jfree.chart.util.LogFormat logFormat47 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int48 = logFormat47.getMaximumFractionDigits();
        logFormat47.setGroupingUsed(true);
        logFormat47.setGroupingUsed(false);
        logFormat47.setMaximumIntegerDigits((-1));
        logFormat27.setExponentFormat((java.text.NumberFormat) logFormat47);
        boolean boolean56 = logFormat14.equals((java.lang.Object) logFormat27);
        relativeDateFormat7.setMinuteFormatter((java.text.NumberFormat) logFormat14);
        org.jfree.chart.util.LogFormat logFormat62 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat62.setMinimumIntegerDigits(1);
        boolean boolean65 = logFormat62.isGroupingUsed();
        boolean boolean66 = logFormat62.isGroupingUsed();
        boolean boolean67 = logFormat14.equals((java.lang.Object) logFormat62);
        logFormat62.setMinimumFractionDigits((int) (byte) 100);
        int int70 = logFormat62.getMaximumFractionDigits();
        boolean boolean71 = objectList1.equals((java.lang.Object) int70);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat73 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str74 = relativeDateFormat73.getHourSuffix();
        boolean boolean75 = relativeDateFormat73.getShowZeroHours();
        java.lang.String str76 = relativeDateFormat73.getMinuteSuffix();
        long long77 = relativeDateFormat73.getBaseMillis();
        java.lang.String str78 = relativeDateFormat73.getHourSuffix();
        relativeDateFormat73.setPositivePrefix("");
        java.lang.Object obj81 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat73);
        relativeDateFormat73.setBaseMillis((long) 4);
        relativeDateFormat73.setShowZeroDays(false);
        relativeDateFormat73.setHourSuffix("14");
        boolean boolean88 = relativeDateFormat73.getShowZeroHours();
        objectList1.set(5, (java.lang.Object) boolean88);
        int int90 = objectList1.size();
        org.jfree.chart.util.LogFormat logFormat94 = new org.jfree.chart.util.LogFormat((double) (-1.0f), "5.7", true);
        boolean boolean95 = objectList1.equals((java.lang.Object) logFormat94);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + rotation5 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation5.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer42);
        org.junit.Assert.assertEquals(stringBuffer42.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "h" + "'", str74, "h");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "m" + "'", str76, "m");
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "h" + "'", str78, "h");
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 6 + "'", int90 == 6);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 13);
        boolean boolean2 = relativeDateFormat1.getShowZeroDays();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 52);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) 5, paint3);
        org.jfree.chart.util.ObjectList objectList6 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj8 = objectList6.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation10 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList6.set((int) (short) 1, (java.lang.Object) rotation10);
        java.lang.String str12 = rotation10.toString();
        java.awt.Paint paint13 = null;
        paintMap0.put((java.lang.Comparable) str12, paint13);
        java.awt.Paint paint16 = paintMap0.getPaint((java.lang.Comparable) "hi!");
        java.awt.Paint paint18 = null;
        paintMap0.put((java.lang.Comparable) 8, paint18);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + rotation10 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation10.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Rotation.CLOCKWISE" + "'", str12, "Rotation.CLOCKWISE");
        org.junit.Assert.assertNull(paint16);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((-1.0d), 0.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        long long6 = relativeDateFormat2.getBaseMillis();
        java.lang.String str7 = relativeDateFormat2.getHourSuffix();
        relativeDateFormat2.setPositivePrefix("");
        java.lang.Object obj10 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat2);
        boolean boolean11 = objectList1.equals((java.lang.Object) relativeDateFormat2);
        relativeDateFormat2.setHourSuffix("h");
        relativeDateFormat2.setLenient(true);
        relativeDateFormat2.setSecondSuffix("3.32");
        boolean boolean18 = relativeDateFormat2.getShowZeroDays();
        java.util.Calendar calendar19 = relativeDateFormat2.getCalendar();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "11) test2057(RegressionTest4)":         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1758659546524,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=26,MILLISECOND=524,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance();
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat9.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        boolean boolean14 = logFormat9.equals((java.lang.Object) timeZone13);
        dateFormat4.setTimeZone(timeZone13);
        dateFormat3.setTimeZone(timeZone13);
        relativeDateFormat0.setTimeZone(timeZone13);
        java.lang.String str18 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setShowZeroHours(true);
        java.lang.String str21 = relativeDateFormat0.getSecondSuffix();
        java.lang.String str22 = relativeDateFormat0.getPositivePrefix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "s" + "'", str21, "s");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        boolean boolean5 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat6 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str7 = relativeDateFormat6.getHourSuffix();
        boolean boolean8 = relativeDateFormat6.getShowZeroHours();
        java.text.NumberFormat numberFormat9 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        dateFormat11.setLenient(true);
        java.util.Calendar calendar15 = dateFormat11.getCalendar();
        relativeDateFormat6.setCalendar(calendar15);
        relativeDateFormat0.setCalendar(calendar15);
        org.jfree.chart.util.LogFormat logFormat22 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int23 = logFormat22.getMaximumFractionDigits();
        logFormat22.setGroupingUsed(true);
        logFormat22.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer29 = null;
        java.text.FieldPosition fieldPosition30 = null;
        java.lang.StringBuffer stringBuffer31 = logFormat22.format((java.lang.Object) 10, stringBuffer29, fieldPosition30);
        java.lang.String str33 = logFormat22.format(0L);
        java.lang.Object obj34 = logFormat22.clone();
        java.lang.String str36 = logFormat22.format((double) (byte) 0);
        boolean boolean37 = logFormat22.isParseIntegerOnly();
        org.jfree.chart.util.LogFormat logFormat42 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int43 = logFormat42.getMaximumFractionDigits();
        logFormat22.setExponentFormat((java.text.NumberFormat) logFormat42);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat22);
        int int46 = logFormat22.getMinimumIntegerDigits();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar15);
// flaky "12) test2059(RegressionTest4)":         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-765948453435,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=26,MILLISECOND=565,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "3.32");
// flaky "2) test2059(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u221e" + "'", str33, "\u221e");
        org.junit.Assert.assertNotNull(obj34);
// flaky "1) test2059(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u221e" + "'", str36, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        logFormat4.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat10 = logFormat4.getExponentFormat();
        boolean boolean11 = logFormat4.isGroupingUsed();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        long long6 = relativeDateFormat2.getBaseMillis();
        java.lang.String str7 = relativeDateFormat2.getHourSuffix();
        relativeDateFormat2.setPositivePrefix("");
        java.lang.Object obj10 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat2);
        boolean boolean11 = objectList1.equals((java.lang.Object) relativeDateFormat2);
        relativeDateFormat2.setDaySuffix("\24414.00");
        relativeDateFormat2.setMinuteSuffix("hi!");
        long long16 = relativeDateFormat2.getBaseMillis();
        boolean boolean17 = relativeDateFormat2.isLenient();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) (byte) 100, (float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.rotateShape(shape2, (double) '4', 0.5f, (float) (short) 1);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.clone(shape6);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition11 = null;
        java.lang.Object obj12 = logFormat4.parseObject("", parsePosition11);
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat17.setMinimumIntegerDigits(1);
        boolean boolean20 = logFormat17.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer28 = null;
        java.text.FieldPosition fieldPosition29 = null;
        java.lang.StringBuffer stringBuffer30 = logFormat26.format((-1L), stringBuffer28, fieldPosition29);
        java.text.FieldPosition fieldPosition31 = null;
        java.lang.StringBuffer stringBuffer32 = logFormat17.format((long) (short) 10, stringBuffer28, fieldPosition31);
        org.jfree.chart.util.LogFormat logFormat37 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int38 = logFormat37.getMaximumFractionDigits();
        logFormat37.setGroupingUsed(true);
        logFormat37.setGroupingUsed(false);
        logFormat37.setMaximumIntegerDigits((-1));
        logFormat17.setExponentFormat((java.text.NumberFormat) logFormat37);
        boolean boolean46 = logFormat4.equals((java.lang.Object) logFormat17);
        java.text.NumberFormat numberFormat47 = java.text.NumberFormat.getInstance();
        int int48 = numberFormat47.getMaximumFractionDigits();
        int int49 = numberFormat47.getMaximumIntegerDigits();
        numberFormat47.setParseIntegerOnly(false);
        int int52 = numberFormat47.getMinimumIntegerDigits();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat53 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean54 = relativeDateFormat53.isLenient();
        java.text.ParsePosition parsePosition56 = null;
        java.util.Date date57 = relativeDateFormat53.parse("m", parsePosition56);
        relativeDateFormat53.setBaseMillis((long) 8);
        java.text.NumberFormat numberFormat60 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat60.setParseIntegerOnly(false);
        java.lang.String str64 = numberFormat60.format((long) 15);
        relativeDateFormat53.setHourFormatter(numberFormat60);
        java.text.NumberFormat numberFormat66 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean67 = numberFormat66.isGroupingUsed();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat68 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str69 = relativeDateFormat68.getHourSuffix();
        boolean boolean70 = relativeDateFormat68.getShowZeroHours();
        java.lang.String str71 = relativeDateFormat68.getMinuteSuffix();
        long long72 = relativeDateFormat68.getBaseMillis();
        java.lang.String str73 = relativeDateFormat68.getHourSuffix();
        relativeDateFormat68.setPositivePrefix("");
        java.lang.Object obj76 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat68);
        relativeDateFormat68.setBaseMillis((long) 4);
        java.lang.String str79 = numberFormat66.format((java.lang.Object) 4);
        numberFormat66.setMinimumFractionDigits(17);
        java.util.Currency currency82 = numberFormat66.getCurrency();
        numberFormat60.setCurrency(currency82);
        numberFormat47.setCurrency(currency82);
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setCurrency(currency82);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(numberFormat47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(date57);
        org.junit.Assert.assertNotNull(numberFormat60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\24415.00" + "'", str64, "\24415.00");
        org.junit.Assert.assertNotNull(numberFormat66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "h" + "'", str69, "h");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "m" + "'", str71, "m");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "h" + "'", str73, "h");
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "4" + "'", str79, "4");
        org.junit.Assert.assertNotNull(currency82);
        org.junit.Assert.assertEquals(currency82.toString(), "XXX");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 10, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        long long2 = relativeDateFormat1.getBaseMillis();
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat7.setMinimumIntegerDigits(1);
        logFormat7.setGroupingUsed(false);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        boolean boolean14 = logFormat7.equals((java.lang.Object) dateFormat12);
        relativeDateFormat1.setDayFormatter((java.text.NumberFormat) logFormat7);
        java.lang.String str16 = relativeDateFormat1.getSecondSuffix();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "s" + "'", str16, "s");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        logFormat4.setGroupingUsed(false);
        int int9 = logFormat4.getMinimumIntegerDigits();
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int15 = logFormat14.getMaximumFractionDigits();
        logFormat14.setGroupingUsed(true);
        logFormat14.setParseIntegerOnly(true);
        java.lang.String str21 = logFormat14.format((double) 0L);
        boolean boolean22 = logFormat4.equals((java.lang.Object) 0L);
        boolean boolean23 = logFormat4.isGroupingUsed();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
// flaky "13) test2066(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\u221e" + "'", str21, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        logFormat4.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat10 = logFormat4.getExponentFormat();
        boolean boolean12 = logFormat4.equals((java.lang.Object) 0.0f);
        int int13 = logFormat4.getMaximumIntegerDigits();
        logFormat4.setMaximumIntegerDigits(7);
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode16 = logFormat4.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 0.5f, "", "0.66", false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj2 = objectList1.clone();
        java.lang.Object obj3 = objectList1.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat5 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        java.text.ParsePosition parsePosition7 = null;
        java.util.Date date8 = relativeDateFormat5.parse("6.64", parsePosition7);
        boolean boolean9 = objectList1.equals((java.lang.Object) parsePosition7);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNull(date8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        java.util.Calendar calendar3 = relativeDateFormat0.getCalendar();
        org.jfree.chart.util.ObjectList objectList5 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat6 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str7 = relativeDateFormat6.getHourSuffix();
        boolean boolean8 = relativeDateFormat6.getShowZeroHours();
        java.lang.String str9 = relativeDateFormat6.getMinuteSuffix();
        long long10 = relativeDateFormat6.getBaseMillis();
        java.lang.String str11 = relativeDateFormat6.getHourSuffix();
        relativeDateFormat6.setPositivePrefix("");
        java.lang.Object obj14 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat6);
        boolean boolean15 = objectList5.equals((java.lang.Object) relativeDateFormat6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat16 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str17 = relativeDateFormat16.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat22 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat22.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat25 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone26 = dateFormat25.getTimeZone();
        boolean boolean27 = logFormat22.equals((java.lang.Object) timeZone26);
        relativeDateFormat16.setHourFormatter((java.text.NumberFormat) logFormat22);
        java.text.ParsePosition parsePosition30 = null;
        java.util.Date date31 = relativeDateFormat16.parse("hi!", parsePosition30);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat32 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str33 = relativeDateFormat32.getHourSuffix();
        java.lang.String str34 = relativeDateFormat32.getDaySuffix();
        boolean boolean35 = relativeDateFormat32.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer42 = null;
        java.text.FieldPosition fieldPosition43 = null;
        java.lang.StringBuffer stringBuffer44 = logFormat40.format((-1L), stringBuffer42, fieldPosition43);
        logFormat40.setParseIntegerOnly(true);
        relativeDateFormat32.setDayFormatter((java.text.NumberFormat) logFormat40);
        relativeDateFormat16.setSecondFormatter((java.text.NumberFormat) logFormat40);
        relativeDateFormat6.setHourFormatter((java.text.NumberFormat) logFormat40);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat40);
        relativeDateFormat0.setMinuteSuffix("5.0");
        java.text.ParsePosition parsePosition54 = null;
        java.util.Date date55 = relativeDateFormat0.parse("Rotation.ANTICLOCKWISE", parsePosition54);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(calendar3);
// flaky "14) test2070(RegressionTest4)":         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1758659546838,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=26,MILLISECOND=838,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "m" + "'", str9, "m");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertNotNull(dateFormat25);
        org.junit.Assert.assertNotNull(timeZone26);
        org.junit.Assert.assertEquals(timeZone26.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(date31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "h" + "'", str33, "h");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "d" + "'", str34, "d");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "NaN");
        org.junit.Assert.assertNull(date55);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList2 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean3 = legendRenderingOrder0.equals((java.lang.Object) objectList2);
        int int4 = objectList2.size();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat5 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str6 = relativeDateFormat5.getHourSuffix();
        boolean boolean7 = relativeDateFormat5.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat12 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int13 = logFormat12.getMaximumFractionDigits();
        logFormat12.setGroupingUsed(true);
        logFormat12.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition19 = null;
        java.lang.Object obj20 = logFormat12.parseObject("", parsePosition19);
        org.jfree.chart.util.LogFormat logFormat25 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat25.setMinimumIntegerDigits(1);
        boolean boolean28 = logFormat25.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat34 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer36 = null;
        java.text.FieldPosition fieldPosition37 = null;
        java.lang.StringBuffer stringBuffer38 = logFormat34.format((-1L), stringBuffer36, fieldPosition37);
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat25.format((long) (short) 10, stringBuffer36, fieldPosition39);
        org.jfree.chart.util.LogFormat logFormat45 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int46 = logFormat45.getMaximumFractionDigits();
        logFormat45.setGroupingUsed(true);
        logFormat45.setGroupingUsed(false);
        logFormat45.setMaximumIntegerDigits((-1));
        logFormat25.setExponentFormat((java.text.NumberFormat) logFormat45);
        boolean boolean54 = logFormat12.equals((java.lang.Object) logFormat25);
        relativeDateFormat5.setMinuteFormatter((java.text.NumberFormat) logFormat12);
        org.jfree.chart.util.LogFormat logFormat60 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat60.setMinimumIntegerDigits(1);
        boolean boolean63 = logFormat60.isGroupingUsed();
        boolean boolean64 = logFormat60.isGroupingUsed();
        boolean boolean65 = logFormat12.equals((java.lang.Object) logFormat60);
        int int66 = objectList2.indexOf((java.lang.Object) logFormat12);
        // The following exception was thrown during execution in test generation
        try {
            objectList2.set(64, (java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 64 out of bounds for length 64");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuffer38);
        org.junit.Assert.assertEquals(stringBuffer38.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.STANDARD;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (short) 0, (float) 4);
        boolean boolean4 = legendRenderingOrder0.equals((java.lang.Object) 4);
        java.lang.String str5 = legendRenderingOrder0.toString();
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat10.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone14 = dateFormat13.getTimeZone();
        boolean boolean15 = logFormat10.equals((java.lang.Object) timeZone14);
        boolean boolean16 = legendRenderingOrder0.equals((java.lang.Object) boolean15);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat17 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str18 = relativeDateFormat17.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat23.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat26 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone27 = dateFormat26.getTimeZone();
        boolean boolean28 = logFormat23.equals((java.lang.Object) timeZone27);
        relativeDateFormat17.setHourFormatter((java.text.NumberFormat) logFormat23);
        java.text.ParsePosition parsePosition31 = null;
        java.util.Date date32 = relativeDateFormat17.parse("hi!", parsePosition31);
        org.jfree.chart.util.LogFormat logFormat37 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int38 = logFormat37.getMaximumFractionDigits();
        logFormat37.setGroupingUsed(true);
        logFormat37.setGroupingUsed(false);
        logFormat37.setMaximumIntegerDigits((-1));
        relativeDateFormat17.setNumberFormat((java.text.NumberFormat) logFormat37);
        boolean boolean46 = legendRenderingOrder0.equals((java.lang.Object) relativeDateFormat17);
        java.lang.String str47 = legendRenderingOrder0.toString();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat48 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str49 = relativeDateFormat48.getHourSuffix();
        boolean boolean50 = relativeDateFormat48.getShowZeroHours();
        java.lang.String str51 = relativeDateFormat48.getMinuteSuffix();
        long long52 = relativeDateFormat48.getBaseMillis();
        java.lang.String str53 = relativeDateFormat48.getHourSuffix();
        relativeDateFormat48.setPositivePrefix("");
        java.lang.Object obj56 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat48);
        relativeDateFormat48.setBaseMillis((long) 4);
        relativeDateFormat48.setShowZeroDays(false);
        relativeDateFormat48.setHourSuffix("14");
        boolean boolean63 = relativeDateFormat48.getShowZeroHours();
        boolean boolean64 = relativeDateFormat48.isLenient();
        boolean boolean65 = legendRenderingOrder0.equals((java.lang.Object) boolean64);
        org.jfree.chart.util.LogFormat logFormat70 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int71 = logFormat70.getMaximumFractionDigits();
        logFormat70.setGroupingUsed(true);
        boolean boolean75 = logFormat70.equals((java.lang.Object) (short) -1);
        boolean boolean76 = legendRenderingOrder0.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat77 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str78 = relativeDateFormat77.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat83 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat83.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat86 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone87 = dateFormat86.getTimeZone();
        boolean boolean88 = logFormat83.equals((java.lang.Object) timeZone87);
        relativeDateFormat77.setHourFormatter((java.text.NumberFormat) logFormat83);
        java.text.ParsePosition parsePosition91 = null;
        java.util.Date date92 = relativeDateFormat77.parse("hi!", parsePosition91);
        java.text.ParsePosition parsePosition94 = null;
        java.lang.Object obj95 = relativeDateFormat77.parseObject("\24415.00", parsePosition94);
        java.lang.String str96 = relativeDateFormat77.getPositivePrefix();
        java.lang.String str97 = relativeDateFormat77.getHourSuffix();
        java.lang.String str98 = relativeDateFormat77.getHourSuffix();
        boolean boolean99 = legendRenderingOrder0.equals((java.lang.Object) str98);
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str5, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str47, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "h" + "'", str49, "h");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "m" + "'", str51, "m");
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "h" + "'", str53, "h");
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "h" + "'", str78, "h");
        org.junit.Assert.assertNotNull(dateFormat86);
        org.junit.Assert.assertNotNull(timeZone87);
        org.junit.Assert.assertEquals(timeZone87.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(date92);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "h" + "'", str97, "h");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "h" + "'", str98, "h");
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(8, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        logFormat4.setGroupingUsed(false);
        java.lang.Class<?> wildcardClass9 = logFormat4.getClass();
        boolean boolean10 = org.jfree.chart.util.SerialUtils.isSerializable((java.lang.Class) wildcardClass9);
        boolean boolean11 = org.jfree.chart.util.SerialUtils.isSerializable((java.lang.Class) wildcardClass9);
        boolean boolean12 = org.jfree.chart.util.SerialUtils.isSerializable((java.lang.Class) wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        boolean boolean3 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat8.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        boolean boolean13 = logFormat8.equals((java.lang.Object) timeZone12);
        org.jfree.chart.util.LogFormat logFormat18 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat18.setMinimumIntegerDigits(1);
        boolean boolean21 = logFormat18.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat27 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer29 = null;
        java.text.FieldPosition fieldPosition30 = null;
        java.lang.StringBuffer stringBuffer31 = logFormat27.format((-1L), stringBuffer29, fieldPosition30);
        java.text.FieldPosition fieldPosition32 = null;
        java.lang.StringBuffer stringBuffer33 = logFormat18.format((long) (short) 10, stringBuffer29, fieldPosition32);
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int39 = logFormat38.getMaximumFractionDigits();
        logFormat38.setGroupingUsed(true);
        logFormat38.setGroupingUsed(false);
        logFormat38.setMaximumIntegerDigits((-1));
        logFormat18.setExponentFormat((java.text.NumberFormat) logFormat38);
        logFormat8.setExponentFormat((java.text.NumberFormat) logFormat38);
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat38);
        long long49 = relativeDateFormat0.getBaseMillis();
        java.util.Date date50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = relativeDateFormat0.format(date50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer33);
        org.junit.Assert.assertEquals(stringBuffer33.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat0.setPositivePrefix("\u221e");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat6 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str7 = relativeDateFormat6.getHourSuffix();
        boolean boolean8 = relativeDateFormat6.getShowZeroHours();
        relativeDateFormat6.setHourSuffix("h");
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 12, "", true);
        relativeDateFormat6.setHourFormatter((java.text.NumberFormat) logFormat14);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat14);
        java.util.Date date17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = relativeDateFormat0.format(date17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 65");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, (double) (byte) 10, (double) 10.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.rotateShape(shape7, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtils.clone(shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtils.equal(shape2, shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, (double) 9, (-1.0d));
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 128, (double) 6, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList2 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean3 = legendRenderingOrder0.equals((java.lang.Object) objectList2);
        java.lang.String str4 = legendRenderingOrder0.toString();
        java.lang.String str5 = legendRenderingOrder0.toString();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat6 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str7 = relativeDateFormat6.getHourSuffix();
        boolean boolean8 = relativeDateFormat6.getShowZeroHours();
        java.lang.String str9 = relativeDateFormat6.getMinuteSuffix();
        long long10 = relativeDateFormat6.getBaseMillis();
        java.lang.String str11 = relativeDateFormat6.getHourSuffix();
        relativeDateFormat6.setShowZeroHours(false);
        long long14 = relativeDateFormat6.getBaseMillis();
        java.lang.String str15 = relativeDateFormat6.getMinuteSuffix();
        long long16 = relativeDateFormat6.getBaseMillis();
        boolean boolean17 = legendRenderingOrder0.equals((java.lang.Object) relativeDateFormat6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat18 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean19 = relativeDateFormat18.isLenient();
        java.text.ParsePosition parsePosition21 = null;
        java.util.Date date22 = relativeDateFormat18.parse("m", parsePosition21);
        relativeDateFormat18.setBaseMillis((long) 8);
        java.text.NumberFormat numberFormat25 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat25.setParseIntegerOnly(false);
        java.lang.String str29 = numberFormat25.format((long) 15);
        relativeDateFormat18.setHourFormatter(numberFormat25);
        java.text.NumberFormat numberFormat31 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean32 = numberFormat31.isGroupingUsed();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat33 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str34 = relativeDateFormat33.getHourSuffix();
        boolean boolean35 = relativeDateFormat33.getShowZeroHours();
        java.lang.String str36 = relativeDateFormat33.getMinuteSuffix();
        long long37 = relativeDateFormat33.getBaseMillis();
        java.lang.String str38 = relativeDateFormat33.getHourSuffix();
        relativeDateFormat33.setPositivePrefix("");
        java.lang.Object obj41 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat33);
        relativeDateFormat33.setBaseMillis((long) 4);
        java.lang.String str44 = numberFormat31.format((java.lang.Object) 4);
        numberFormat31.setMinimumFractionDigits(17);
        java.util.Currency currency47 = numberFormat31.getCurrency();
        numberFormat25.setCurrency(currency47);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat49 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str50 = relativeDateFormat49.getHourSuffix();
        relativeDateFormat49.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat57 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat49.setSecondFormatter((java.text.NumberFormat) logFormat57);
        logFormat57.setMaximumFractionDigits(2);
        boolean boolean61 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) numberFormat25, (java.lang.Object) logFormat57);
        relativeDateFormat6.setMinuteFormatter((java.text.NumberFormat) logFormat57);
        relativeDateFormat6.setDaySuffix("d");
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendRenderingOrder.REVERSE" + "'", str4, "LegendRenderingOrder.REVERSE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LegendRenderingOrder.REVERSE" + "'", str5, "LegendRenderingOrder.REVERSE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "m" + "'", str9, "m");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "m" + "'", str15, "m");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\24415.00" + "'", str29, "\24415.00");
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "h" + "'", str34, "h");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "m" + "'", str36, "m");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "4" + "'", str44, "4");
        org.junit.Assert.assertNotNull(currency47);
        org.junit.Assert.assertEquals(currency47.toString(), "XXX");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "h" + "'", str50, "h");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        org.jfree.chart.PaintMap paintMap4 = new org.jfree.chart.PaintMap();
        java.lang.Object obj5 = paintMap4.clone();
        java.awt.Paint paint7 = null;
        paintMap4.put((java.lang.Comparable) '4', paint7);
        org.jfree.chart.util.ObjectList objectList10 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat11 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str12 = relativeDateFormat11.getHourSuffix();
        boolean boolean13 = relativeDateFormat11.getShowZeroHours();
        java.lang.String str14 = relativeDateFormat11.getMinuteSuffix();
        long long15 = relativeDateFormat11.getBaseMillis();
        java.lang.String str16 = relativeDateFormat11.getHourSuffix();
        relativeDateFormat11.setPositivePrefix("");
        java.lang.Object obj19 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat11);
        boolean boolean20 = objectList10.equals((java.lang.Object) relativeDateFormat11);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat21 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str22 = relativeDateFormat21.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat27 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat27.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone31 = dateFormat30.getTimeZone();
        boolean boolean32 = logFormat27.equals((java.lang.Object) timeZone31);
        relativeDateFormat21.setHourFormatter((java.text.NumberFormat) logFormat27);
        java.text.ParsePosition parsePosition35 = null;
        java.util.Date date36 = relativeDateFormat21.parse("hi!", parsePosition35);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat37 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str38 = relativeDateFormat37.getHourSuffix();
        java.lang.String str39 = relativeDateFormat37.getDaySuffix();
        boolean boolean40 = relativeDateFormat37.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat45 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer47 = null;
        java.text.FieldPosition fieldPosition48 = null;
        java.lang.StringBuffer stringBuffer49 = logFormat45.format((-1L), stringBuffer47, fieldPosition48);
        logFormat45.setParseIntegerOnly(true);
        relativeDateFormat37.setDayFormatter((java.text.NumberFormat) logFormat45);
        relativeDateFormat21.setSecondFormatter((java.text.NumberFormat) logFormat45);
        relativeDateFormat11.setHourFormatter((java.text.NumberFormat) logFormat45);
        boolean boolean55 = paintMap4.equals((java.lang.Object) logFormat45);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat45);
        org.jfree.chart.util.LogFormat logFormat61 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int62 = logFormat61.getMaximumFractionDigits();
        logFormat61.setGroupingUsed(true);
        logFormat61.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer68 = null;
        java.text.FieldPosition fieldPosition69 = null;
        java.lang.StringBuffer stringBuffer70 = logFormat61.format((java.lang.Object) 10, stringBuffer68, fieldPosition69);
        org.jfree.chart.util.LogFormat logFormat75 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat75.setMinimumIntegerDigits(1);
        logFormat75.setGroupingUsed(false);
        logFormat61.setExponentFormat((java.text.NumberFormat) logFormat75);
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat75);
        java.lang.String str83 = logFormat75.format((double) 10L);
        logFormat75.setMaximumFractionDigits(64);
        java.text.NumberFormat numberFormat86 = logFormat75.getExponentFormat();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "m" + "'", str14, "m");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "d" + "'", str39, "d");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stringBuffer49);
        org.junit.Assert.assertEquals(stringBuffer49.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(stringBuffer70);
        org.junit.Assert.assertEquals(stringBuffer70.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "3.32" + "'", str83, "3.32");
        org.junit.Assert.assertNotNull(numberFormat86);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        long long8 = relativeDateFormat0.getBaseMillis();
        java.lang.String str9 = relativeDateFormat0.getMinuteSuffix();
        long long10 = relativeDateFormat0.getBaseMillis();
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat11.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean14 = numberFormat11.isParseIntegerOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator15 = relativeDateFormat0.formatToCharacterIterator((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "m" + "'", str9, "m");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat4 = java.text.DateFormat.getDateInstance();
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat9.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        boolean boolean14 = logFormat9.equals((java.lang.Object) timeZone13);
        dateFormat4.setTimeZone(timeZone13);
        dateFormat3.setTimeZone(timeZone13);
        relativeDateFormat0.setTimeZone(timeZone13);
        java.lang.String str18 = relativeDateFormat0.getDaySuffix();
        boolean boolean19 = relativeDateFormat0.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date21 = relativeDateFormat0.parse("LegendRenderingOrder.REVERSE");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"LegendRenderingOrder.REVERSE\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat6 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat6.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone10 = dateFormat9.getTimeZone();
        boolean boolean11 = logFormat6.equals((java.lang.Object) timeZone10);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat6);
        java.text.ParsePosition parsePosition14 = null;
        java.util.Date date15 = relativeDateFormat0.parse("hi!", parsePosition14);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat16 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str17 = relativeDateFormat16.getHourSuffix();
        java.lang.String str18 = relativeDateFormat16.getDaySuffix();
        boolean boolean19 = relativeDateFormat16.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer26 = null;
        java.text.FieldPosition fieldPosition27 = null;
        java.lang.StringBuffer stringBuffer28 = logFormat24.format((-1L), stringBuffer26, fieldPosition27);
        logFormat24.setParseIntegerOnly(true);
        relativeDateFormat16.setDayFormatter((java.text.NumberFormat) logFormat24);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat24);
        relativeDateFormat0.setSecondSuffix("SortOrder.ASCENDING");
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) (-1.0f), "5.7", true);
        java.text.ParsePosition parsePosition40 = null;
        java.lang.Object obj41 = logFormat38.parseObject("3.05", parsePosition40);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat38);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuffer28);
        org.junit.Assert.assertEquals(stringBuffer28.toString(), "NaN");
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (short) 10);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        relativeDateFormat0.setHourSuffix("h");
        relativeDateFormat0.setHourSuffix("\24414.00");
        org.jfree.chart.util.LogFormat logFormat11 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int12 = logFormat11.getMaximumFractionDigits();
        logFormat11.setGroupingUsed(true);
        logFormat11.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition18 = null;
        java.lang.Object obj19 = logFormat11.parseObject("", parsePosition18);
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat24.setMinimumIntegerDigits(1);
        boolean boolean27 = logFormat24.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat33 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer35 = null;
        java.text.FieldPosition fieldPosition36 = null;
        java.lang.StringBuffer stringBuffer37 = logFormat33.format((-1L), stringBuffer35, fieldPosition36);
        java.text.FieldPosition fieldPosition38 = null;
        java.lang.StringBuffer stringBuffer39 = logFormat24.format((long) (short) 10, stringBuffer35, fieldPosition38);
        org.jfree.chart.util.LogFormat logFormat44 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int45 = logFormat44.getMaximumFractionDigits();
        logFormat44.setGroupingUsed(true);
        logFormat44.setGroupingUsed(false);
        logFormat44.setMaximumIntegerDigits((-1));
        logFormat24.setExponentFormat((java.text.NumberFormat) logFormat44);
        boolean boolean53 = logFormat11.equals((java.lang.Object) logFormat24);
        org.jfree.chart.util.LogFormat logFormat58 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat58.setMinimumIntegerDigits(1);
        boolean boolean61 = logFormat58.isGroupingUsed();
        logFormat58.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat64 = logFormat58.getExponentFormat();
        logFormat11.setExponentFormat((java.text.NumberFormat) logFormat58);
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat58);
        long long67 = relativeDateFormat0.getBaseMillis();
        java.util.Date date68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str69 = relativeDateFormat0.format(date68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stringBuffer37);
        org.junit.Assert.assertEquals(stringBuffer37.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer39);
        org.junit.Assert.assertEquals(stringBuffer39.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(numberFormat64);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 40);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        dateFormat0.setTimeZone(timeZone2);
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int9 = logFormat8.getMaximumFractionDigits();
        logFormat8.setGroupingUsed(true);
        logFormat8.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        java.lang.StringBuffer stringBuffer17 = logFormat8.format((java.lang.Object) 10, stringBuffer15, fieldPosition16);
        dateFormat0.setNumberFormat((java.text.NumberFormat) logFormat8);
        boolean boolean19 = logFormat8.isParseIntegerOnly();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat20 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str21 = relativeDateFormat20.getHourSuffix();
        boolean boolean22 = relativeDateFormat20.getShowZeroHours();
        boolean boolean23 = relativeDateFormat20.getShowZeroHours();
        java.util.TimeZone timeZone24 = relativeDateFormat20.getTimeZone();
        relativeDateFormat20.setHourSuffix("NaN");
        boolean boolean27 = logFormat8.equals((java.lang.Object) relativeDateFormat20);
        relativeDateFormat20.setHourSuffix("LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat9.format((-1L), stringBuffer11, fieldPosition12);
        boolean boolean14 = paintMap0.containsKey((java.lang.Comparable) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        java.lang.String str15 = logFormat4.format(0L);
        java.lang.Object obj16 = logFormat4.clone();
        int int17 = logFormat4.getMinimumFractionDigits();
        org.jfree.chart.util.ObjectList objectList19 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj21 = objectList19.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation23 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList19.set((int) (short) 1, (java.lang.Object) rotation23);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat25 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str26 = relativeDateFormat25.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat31.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat34 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone35 = dateFormat34.getTimeZone();
        boolean boolean36 = logFormat31.equals((java.lang.Object) timeZone35);
        relativeDateFormat25.setHourFormatter((java.text.NumberFormat) logFormat31);
        java.text.ParsePosition parsePosition39 = null;
        java.util.Date date40 = relativeDateFormat25.parse("hi!", parsePosition39);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat41 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str42 = relativeDateFormat41.getHourSuffix();
        java.lang.String str43 = relativeDateFormat41.getDaySuffix();
        boolean boolean44 = relativeDateFormat41.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat49 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer51 = null;
        java.text.FieldPosition fieldPosition52 = null;
        java.lang.StringBuffer stringBuffer53 = logFormat49.format((-1L), stringBuffer51, fieldPosition52);
        logFormat49.setParseIntegerOnly(true);
        relativeDateFormat41.setDayFormatter((java.text.NumberFormat) logFormat49);
        relativeDateFormat25.setSecondFormatter((java.text.NumberFormat) logFormat49);
        int int58 = objectList19.indexOf((java.lang.Object) relativeDateFormat25);
        java.text.ParsePosition parsePosition60 = null;
        java.lang.Object obj61 = relativeDateFormat25.parseObject("\2440.00", parsePosition60);
        relativeDateFormat25.setBaseMillis((long) 'a');
        boolean boolean64 = logFormat4.equals((java.lang.Object) 'a');
        int int65 = logFormat4.getMinimumIntegerDigits();
        logFormat4.setMaximumIntegerDigits(14);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "15) test2090(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + rotation23 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation23.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertNotNull(dateFormat34);
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(date40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "h" + "'", str42, "h");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "d" + "'", str43, "d");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(stringBuffer53);
        org.junit.Assert.assertEquals(stringBuffer53.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        org.jfree.chart.PaintMap paintMap4 = new org.jfree.chart.PaintMap();
        java.lang.Object obj5 = paintMap4.clone();
        java.awt.Paint paint7 = null;
        paintMap4.put((java.lang.Comparable) '4', paint7);
        org.jfree.chart.util.ObjectList objectList10 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat11 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str12 = relativeDateFormat11.getHourSuffix();
        boolean boolean13 = relativeDateFormat11.getShowZeroHours();
        java.lang.String str14 = relativeDateFormat11.getMinuteSuffix();
        long long15 = relativeDateFormat11.getBaseMillis();
        java.lang.String str16 = relativeDateFormat11.getHourSuffix();
        relativeDateFormat11.setPositivePrefix("");
        java.lang.Object obj19 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat11);
        boolean boolean20 = objectList10.equals((java.lang.Object) relativeDateFormat11);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat21 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str22 = relativeDateFormat21.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat27 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat27.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone31 = dateFormat30.getTimeZone();
        boolean boolean32 = logFormat27.equals((java.lang.Object) timeZone31);
        relativeDateFormat21.setHourFormatter((java.text.NumberFormat) logFormat27);
        java.text.ParsePosition parsePosition35 = null;
        java.util.Date date36 = relativeDateFormat21.parse("hi!", parsePosition35);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat37 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str38 = relativeDateFormat37.getHourSuffix();
        java.lang.String str39 = relativeDateFormat37.getDaySuffix();
        boolean boolean40 = relativeDateFormat37.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat45 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer47 = null;
        java.text.FieldPosition fieldPosition48 = null;
        java.lang.StringBuffer stringBuffer49 = logFormat45.format((-1L), stringBuffer47, fieldPosition48);
        logFormat45.setParseIntegerOnly(true);
        relativeDateFormat37.setDayFormatter((java.text.NumberFormat) logFormat45);
        relativeDateFormat21.setSecondFormatter((java.text.NumberFormat) logFormat45);
        relativeDateFormat11.setHourFormatter((java.text.NumberFormat) logFormat45);
        boolean boolean55 = paintMap4.equals((java.lang.Object) logFormat45);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat45);
        org.jfree.chart.util.LogFormat logFormat61 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int62 = logFormat61.getMaximumFractionDigits();
        logFormat61.setGroupingUsed(true);
        logFormat61.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer68 = null;
        java.text.FieldPosition fieldPosition69 = null;
        java.lang.StringBuffer stringBuffer70 = logFormat61.format((java.lang.Object) 10, stringBuffer68, fieldPosition69);
        org.jfree.chart.util.LogFormat logFormat75 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat75.setMinimumIntegerDigits(1);
        logFormat75.setGroupingUsed(false);
        logFormat61.setExponentFormat((java.text.NumberFormat) logFormat75);
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat75);
        boolean boolean82 = relativeDateFormat0.getShowZeroDays();
        relativeDateFormat0.setShowZeroDays(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date86 = relativeDateFormat0.parse("1");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"1\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "m" + "'", str14, "m");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "d" + "'", str39, "d");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stringBuffer49);
        org.junit.Assert.assertEquals(stringBuffer49.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 3 + "'", int62 == 3);
        org.junit.Assert.assertNotNull(stringBuffer70);
        org.junit.Assert.assertEquals(stringBuffer70.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("4.0");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        boolean boolean3 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        java.lang.StringBuffer stringBuffer12 = logFormat8.format((-1L), stringBuffer10, fieldPosition11);
        logFormat8.setParseIntegerOnly(true);
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat8);
        logFormat8.setMaximumFractionDigits(0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency18 = logFormat8.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuffer12);
        org.junit.Assert.assertEquals(stringBuffer12.toString(), "NaN");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        long long2 = relativeDateFormat1.getBaseMillis();
        java.lang.String str3 = relativeDateFormat1.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat(100.0d, "", false);
        relativeDateFormat1.setMinuteFormatter((java.text.NumberFormat) logFormat7);
        int int9 = logFormat7.getMaximumIntegerDigits();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double) '4', "\u221em0.004s", false);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        java.lang.String str6 = relativeDateFormat4.getDaySuffix();
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateInstance();
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat13.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        boolean boolean18 = logFormat13.equals((java.lang.Object) timeZone17);
        dateFormat8.setTimeZone(timeZone17);
        dateFormat7.setTimeZone(timeZone17);
        relativeDateFormat4.setTimeZone(timeZone17);
        java.lang.String str22 = relativeDateFormat4.getDaySuffix();
        relativeDateFormat4.setShowZeroHours(true);
        org.jfree.chart.util.LogFormat logFormat28 = new org.jfree.chart.util.LogFormat((double) 40, "31.0", false);
        org.jfree.chart.util.LogFormat logFormat34 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat34.setMinimumIntegerDigits(1);
        boolean boolean37 = logFormat34.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat43 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer45 = null;
        java.text.FieldPosition fieldPosition46 = null;
        java.lang.StringBuffer stringBuffer47 = logFormat43.format((-1L), stringBuffer45, fieldPosition46);
        java.text.FieldPosition fieldPosition48 = null;
        java.lang.StringBuffer stringBuffer49 = logFormat34.format((long) (short) 10, stringBuffer45, fieldPosition48);
        java.text.FieldPosition fieldPosition50 = null;
        java.lang.StringBuffer stringBuffer51 = logFormat28.format((double) 64, stringBuffer49, fieldPosition50);
        java.text.FieldPosition fieldPosition52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer53 = logFormat3.format((java.lang.Object) true, stringBuffer51, fieldPosition52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "d" + "'", str22, "d");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(stringBuffer47);
        org.junit.Assert.assertEquals(stringBuffer47.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer49);
        org.junit.Assert.assertEquals(stringBuffer49.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer51);
        org.junit.Assert.assertEquals(stringBuffer51.toString(), "1.13");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int8 = logFormat7.getMaximumFractionDigits();
        logFormat7.setGroupingUsed(true);
        logFormat7.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition14 = null;
        java.lang.Object obj15 = logFormat7.parseObject("", parsePosition14);
        org.jfree.chart.util.LogFormat logFormat20 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat20.setMinimumIntegerDigits(1);
        boolean boolean23 = logFormat20.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer31 = null;
        java.text.FieldPosition fieldPosition32 = null;
        java.lang.StringBuffer stringBuffer33 = logFormat29.format((-1L), stringBuffer31, fieldPosition32);
        java.text.FieldPosition fieldPosition34 = null;
        java.lang.StringBuffer stringBuffer35 = logFormat20.format((long) (short) 10, stringBuffer31, fieldPosition34);
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int41 = logFormat40.getMaximumFractionDigits();
        logFormat40.setGroupingUsed(true);
        logFormat40.setGroupingUsed(false);
        logFormat40.setMaximumIntegerDigits((-1));
        logFormat20.setExponentFormat((java.text.NumberFormat) logFormat40);
        boolean boolean49 = logFormat7.equals((java.lang.Object) logFormat20);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat7);
        boolean boolean51 = relativeDateFormat0.getShowZeroHours();
        relativeDateFormat0.setBaseMillis((long) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stringBuffer33);
        org.junit.Assert.assertEquals(stringBuffer33.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer35);
        org.junit.Assert.assertEquals(stringBuffer35.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        boolean boolean5 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat6 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str7 = relativeDateFormat6.getHourSuffix();
        boolean boolean8 = relativeDateFormat6.getShowZeroHours();
        java.text.NumberFormat numberFormat9 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat6.setNumberFormat(numberFormat9);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        dateFormat11.setLenient(true);
        java.util.Calendar calendar15 = dateFormat11.getCalendar();
        relativeDateFormat6.setCalendar(calendar15);
        relativeDateFormat0.setCalendar(calendar15);
        org.jfree.chart.util.LogFormat logFormat22 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int23 = logFormat22.getMaximumFractionDigits();
        logFormat22.setGroupingUsed(true);
        logFormat22.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer29 = null;
        java.text.FieldPosition fieldPosition30 = null;
        java.lang.StringBuffer stringBuffer31 = logFormat22.format((java.lang.Object) 10, stringBuffer29, fieldPosition30);
        java.lang.String str33 = logFormat22.format(0L);
        java.lang.Object obj34 = logFormat22.clone();
        java.lang.String str36 = logFormat22.format((double) (byte) 0);
        boolean boolean37 = logFormat22.isParseIntegerOnly();
        org.jfree.chart.util.LogFormat logFormat42 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int43 = logFormat42.getMaximumFractionDigits();
        logFormat22.setExponentFormat((java.text.NumberFormat) logFormat42);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat22);
        java.lang.String str47 = logFormat22.format((double) 15);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(numberFormat9);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar15);
// flaky "16) test2097(RegressionTest4)":         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-765948452414,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=27,MILLISECOND=586,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "3.32");
// flaky "3) test2097(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u221e" + "'", str33, "\u221e");
        org.junit.Assert.assertNotNull(obj34);
// flaky "2) test2097(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u221e" + "'", str36, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1.97" + "'", str47, "1.97");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, (int) (short) 10, 3, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        long long8 = relativeDateFormat0.getBaseMillis();
        java.lang.String str9 = relativeDateFormat0.getSecondSuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "s" + "'", str9, "s");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        org.jfree.chart.PaintMap paintMap4 = new org.jfree.chart.PaintMap();
        java.lang.Object obj5 = paintMap4.clone();
        java.awt.Paint paint7 = null;
        paintMap4.put((java.lang.Comparable) '4', paint7);
        org.jfree.chart.util.ObjectList objectList10 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat11 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str12 = relativeDateFormat11.getHourSuffix();
        boolean boolean13 = relativeDateFormat11.getShowZeroHours();
        java.lang.String str14 = relativeDateFormat11.getMinuteSuffix();
        long long15 = relativeDateFormat11.getBaseMillis();
        java.lang.String str16 = relativeDateFormat11.getHourSuffix();
        relativeDateFormat11.setPositivePrefix("");
        java.lang.Object obj19 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat11);
        boolean boolean20 = objectList10.equals((java.lang.Object) relativeDateFormat11);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat21 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str22 = relativeDateFormat21.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat27 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat27.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat30 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone31 = dateFormat30.getTimeZone();
        boolean boolean32 = logFormat27.equals((java.lang.Object) timeZone31);
        relativeDateFormat21.setHourFormatter((java.text.NumberFormat) logFormat27);
        java.text.ParsePosition parsePosition35 = null;
        java.util.Date date36 = relativeDateFormat21.parse("hi!", parsePosition35);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat37 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str38 = relativeDateFormat37.getHourSuffix();
        java.lang.String str39 = relativeDateFormat37.getDaySuffix();
        boolean boolean40 = relativeDateFormat37.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat45 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer47 = null;
        java.text.FieldPosition fieldPosition48 = null;
        java.lang.StringBuffer stringBuffer49 = logFormat45.format((-1L), stringBuffer47, fieldPosition48);
        logFormat45.setParseIntegerOnly(true);
        relativeDateFormat37.setDayFormatter((java.text.NumberFormat) logFormat45);
        relativeDateFormat21.setSecondFormatter((java.text.NumberFormat) logFormat45);
        relativeDateFormat11.setHourFormatter((java.text.NumberFormat) logFormat45);
        boolean boolean55 = paintMap4.equals((java.lang.Object) logFormat45);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat45);
        java.util.TimeZone timeZone57 = relativeDateFormat0.getTimeZone();
        java.lang.String str58 = relativeDateFormat0.getDaySuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "m" + "'", str14, "m");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertNotNull(dateFormat30);
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(date36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "h" + "'", str38, "h");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "d" + "'", str39, "d");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(stringBuffer49);
        org.junit.Assert.assertEquals(stringBuffer49.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(timeZone57);
        org.junit.Assert.assertEquals(timeZone57.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "d" + "'", str58, "d");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        long long2 = relativeDateFormat1.getBaseMillis();
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat7.setMinimumIntegerDigits(1);
        logFormat7.setGroupingUsed(false);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        boolean boolean14 = logFormat7.equals((java.lang.Object) dateFormat12);
        relativeDateFormat1.setDayFormatter((java.text.NumberFormat) logFormat7);
        java.lang.String str16 = relativeDateFormat1.getDaySuffix();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat17 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str18 = relativeDateFormat17.getHourSuffix();
        boolean boolean19 = relativeDateFormat17.getShowZeroHours();
        java.lang.String str20 = relativeDateFormat17.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat25 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat25.setMinimumIntegerDigits(1);
        boolean boolean28 = logFormat25.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat34 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer36 = null;
        java.text.FieldPosition fieldPosition37 = null;
        java.lang.StringBuffer stringBuffer38 = logFormat34.format((-1L), stringBuffer36, fieldPosition37);
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat25.format((long) (short) 10, stringBuffer36, fieldPosition39);
        relativeDateFormat17.setHourFormatter((java.text.NumberFormat) logFormat25);
        relativeDateFormat17.setPositivePrefix("Rotation.CLOCKWISE");
        java.text.NumberFormat numberFormat44 = relativeDateFormat17.getNumberFormat();
        relativeDateFormat1.setMinuteFormatter(numberFormat44);
        relativeDateFormat1.setDaySuffix("");
        boolean boolean48 = relativeDateFormat1.getShowZeroHours();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d" + "'", str16, "d");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "m" + "'", str20, "m");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuffer38);
        org.junit.Assert.assertEquals(stringBuffer38.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "3.32");
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 36, 64, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        boolean boolean10 = logFormat5.equals((java.lang.Object) timeZone9);
        boolean boolean11 = paintList0.equals((java.lang.Object) logFormat5);
        java.awt.Paint paint13 = null;
        paintList0.setPaint(9, paint13);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) '#', (float) 100);
        boolean boolean18 = paintList0.equals((java.lang.Object) shape17);
        int int19 = paintList0.size();
        java.awt.Paint paint21 = null;
        // The following exception was thrown during execution in test generation
        try {
            paintList0.setPaint(2147483647, paint21);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483641");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat8.setMinimumIntegerDigits(1);
        boolean boolean11 = logFormat8.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        java.lang.StringBuffer stringBuffer21 = logFormat17.format((-1L), stringBuffer19, fieldPosition20);
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat8.format((long) (short) 10, stringBuffer19, fieldPosition22);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat8);
        java.util.TimeZone timeZone25 = relativeDateFormat0.getTimeZone();
        relativeDateFormat0.setMinuteSuffix("Rotation.CLOCKWISE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        long long8 = relativeDateFormat0.getBaseMillis();
        java.lang.String str9 = relativeDateFormat0.getMinuteSuffix();
        long long10 = relativeDateFormat0.getBaseMillis();
        java.util.Calendar calendar11 = relativeDateFormat0.getCalendar();
        relativeDateFormat0.setHourSuffix("NaN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "m" + "'", str9, "m");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(calendar11);
// flaky "17) test2105(RegressionTest4)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1758659547766,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=27,MILLISECOND=766,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) 8L, 0.5f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape6, (double) 16, (double) 2);
        boolean boolean10 = org.jfree.chart.util.ShapeUtils.equal(shape4, shape9);
        boolean boolean11 = org.jfree.chart.util.ShapeUtils.equal(shape2, shape9);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat12 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str13 = relativeDateFormat12.getHourSuffix();
        boolean boolean14 = relativeDateFormat12.getShowZeroHours();
        java.text.NumberFormat numberFormat15 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat12.setNumberFormat(numberFormat15);
        java.text.DateFormat dateFormat17 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone18 = dateFormat17.getTimeZone();
        dateFormat17.setLenient(true);
        java.util.Calendar calendar21 = dateFormat17.getCalendar();
        relativeDateFormat12.setCalendar(calendar21);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat23 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str24 = relativeDateFormat23.getHourSuffix();
        relativeDateFormat23.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat23.setSecondFormatter((java.text.NumberFormat) logFormat31);
        java.text.NumberFormat numberFormat33 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat33.setMinimumFractionDigits((int) '4');
        int int36 = numberFormat33.getMinimumIntegerDigits();
        numberFormat33.setMaximumFractionDigits(6);
        logFormat31.setExponentFormat(numberFormat33);
        relativeDateFormat12.setHourFormatter((java.text.NumberFormat) logFormat31);
        java.lang.String str42 = logFormat31.format((double) 64);
        java.text.NumberFormat numberFormat43 = logFormat31.getExponentFormat();
        boolean boolean44 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) shape2, (java.lang.Object) logFormat31);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat45 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str46 = relativeDateFormat45.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat51 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat51.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone55 = dateFormat54.getTimeZone();
        boolean boolean56 = logFormat51.equals((java.lang.Object) timeZone55);
        relativeDateFormat45.setHourFormatter((java.text.NumberFormat) logFormat51);
        java.text.ParsePosition parsePosition59 = null;
        java.util.Date date60 = relativeDateFormat45.parse("hi!", parsePosition59);
        org.jfree.chart.util.LogFormat logFormat65 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int66 = logFormat65.getMaximumFractionDigits();
        logFormat65.setGroupingUsed(true);
        logFormat65.setGroupingUsed(false);
        logFormat65.setMaximumIntegerDigits((-1));
        relativeDateFormat45.setNumberFormat((java.text.NumberFormat) logFormat65);
        org.jfree.chart.util.SortOrder sortOrder74 = org.jfree.chart.util.SortOrder.ASCENDING;
        java.lang.String str75 = sortOrder74.toString();
        boolean boolean76 = logFormat65.equals((java.lang.Object) sortOrder74);
        logFormat31.setExponentFormat((java.text.NumberFormat) logFormat65);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertNotNull(dateFormat17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar21);
// flaky "18) test2106(RegressionTest4)":         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=-765948452218,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=27,MILLISECOND=782,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2" + "'", str42, "2");
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "h" + "'", str46, "h");
        org.junit.Assert.assertNotNull(dateFormat54);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(date60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 3 + "'", int66 == 3);
        org.junit.Assert.assertTrue("'" + sortOrder74 + "' != '" + org.jfree.chart.util.SortOrder.ASCENDING + "'", sortOrder74.equals(org.jfree.chart.util.SortOrder.ASCENDING));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "SortOrder.ASCENDING" + "'", str75, "SortOrder.ASCENDING");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, (int) (byte) 100, 9, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) 10L, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat9.setMinimumIntegerDigits(1);
        boolean boolean12 = logFormat9.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat18 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int19 = logFormat18.getMaximumFractionDigits();
        logFormat18.setGroupingUsed(true);
        logFormat18.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer25 = null;
        java.text.FieldPosition fieldPosition26 = null;
        java.lang.StringBuffer stringBuffer27 = logFormat18.format((java.lang.Object) 10, stringBuffer25, fieldPosition26);
        java.text.FieldPosition fieldPosition28 = null;
        java.lang.StringBuffer stringBuffer29 = logFormat9.format((double) 2, stringBuffer25, fieldPosition28);
        java.lang.Object obj30 = logFormat9.clone();
        boolean boolean31 = paintMap0.equals(obj30);
        org.jfree.chart.util.ObjectList objectList33 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj35 = objectList33.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation37 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList33.set((int) (short) 1, (java.lang.Object) rotation37);
        double double39 = rotation37.getFactor();
        java.lang.String str40 = rotation37.toString();
        java.awt.Paint paint41 = null;
        paintMap0.put((java.lang.Comparable) rotation37, paint41);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer29);
        org.junit.Assert.assertEquals(stringBuffer29.toString(), "1.0");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + rotation37 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation37.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Rotation.CLOCKWISE" + "'", str40, "Rotation.CLOCKWISE");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        java.lang.String str15 = logFormat4.format(0L);
        java.lang.Object obj16 = logFormat4.clone();
        java.lang.String str18 = logFormat4.format((double) (byte) 0);
        boolean boolean19 = logFormat4.isParseIntegerOnly();
        java.text.NumberFormat numberFormat20 = logFormat4.getExponentFormat();
        java.lang.String str22 = logFormat4.format((long) (byte) 1);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat23 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str24 = relativeDateFormat23.getHourSuffix();
        boolean boolean25 = relativeDateFormat23.getShowZeroHours();
        java.lang.String str26 = relativeDateFormat23.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat31.setMinimumIntegerDigits(1);
        boolean boolean34 = logFormat31.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer42 = null;
        java.text.FieldPosition fieldPosition43 = null;
        java.lang.StringBuffer stringBuffer44 = logFormat40.format((-1L), stringBuffer42, fieldPosition43);
        java.text.FieldPosition fieldPosition45 = null;
        java.lang.StringBuffer stringBuffer46 = logFormat31.format((long) (short) 10, stringBuffer42, fieldPosition45);
        relativeDateFormat23.setHourFormatter((java.text.NumberFormat) logFormat31);
        relativeDateFormat23.setPositivePrefix("Rotation.CLOCKWISE");
        java.text.NumberFormat numberFormat50 = relativeDateFormat23.getNumberFormat();
        java.text.NumberFormat numberFormat51 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat51.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean54 = numberFormat51.isParseIntegerOnly();
        java.math.RoundingMode roundingMode55 = numberFormat51.getRoundingMode();
        numberFormat50.setRoundingMode(roundingMode55);
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setRoundingMode(roundingMode55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "19) test2110(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "4) test2110(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0.0" + "'", str22, "0.0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "m" + "'", str26, "m");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer46);
        org.junit.Assert.assertEquals(stringBuffer46.toString(), "3.32");
        org.junit.Assert.assertNotNull(numberFormat50);
        org.junit.Assert.assertNotNull(numberFormat51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + roundingMode55 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode55.equals(java.math.RoundingMode.HALF_EVEN));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        boolean boolean3 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat8.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        boolean boolean13 = logFormat8.equals((java.lang.Object) timeZone12);
        org.jfree.chart.util.LogFormat logFormat18 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat18.setMinimumIntegerDigits(1);
        boolean boolean21 = logFormat18.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat27 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer29 = null;
        java.text.FieldPosition fieldPosition30 = null;
        java.lang.StringBuffer stringBuffer31 = logFormat27.format((-1L), stringBuffer29, fieldPosition30);
        java.text.FieldPosition fieldPosition32 = null;
        java.lang.StringBuffer stringBuffer33 = logFormat18.format((long) (short) 10, stringBuffer29, fieldPosition32);
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int39 = logFormat38.getMaximumFractionDigits();
        logFormat38.setGroupingUsed(true);
        logFormat38.setGroupingUsed(false);
        logFormat38.setMaximumIntegerDigits((-1));
        logFormat18.setExponentFormat((java.text.NumberFormat) logFormat38);
        logFormat8.setExponentFormat((java.text.NumberFormat) logFormat38);
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat38);
        boolean boolean49 = logFormat38.isParseIntegerOnly();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer33);
        org.junit.Assert.assertEquals(stringBuffer33.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        logFormat4.setParseIntegerOnly(true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 4);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, (double) 4L, (double) 0.5f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape6, (double) 16, (double) 2);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtils.rotateShape(shape6, (double) 10L, (float) '#', (float) 32);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape6, (double) (short) 0, (double) (byte) 0);
        boolean boolean17 = org.jfree.chart.util.ShapeUtils.equal(shape4, shape6);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        java.lang.String str15 = logFormat4.format(0L);
        java.lang.Object obj16 = logFormat4.clone();
        java.lang.String str18 = logFormat4.format((double) (byte) 0);
        boolean boolean19 = logFormat4.isParseIntegerOnly();
        java.text.NumberFormat numberFormat20 = logFormat4.getExponentFormat();
        java.lang.String str22 = logFormat4.format((long) (byte) 1);
        logFormat4.setMaximumFractionDigits(0);
        logFormat4.setGroupingUsed(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "20) test2114(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "5) test2114(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0.0" + "'", str22, "0.0");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(12);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) 5, paint3);
        org.jfree.chart.util.Rotation rotation5 = org.jfree.chart.util.Rotation.CLOCKWISE;
        java.awt.Paint paint6 = null;
        paintMap0.put((java.lang.Comparable) rotation5, paint6);
        java.awt.Paint paint9 = null;
        paintMap0.put((java.lang.Comparable) 11, paint9);
        java.awt.Paint paint12 = null;
        paintMap0.put((java.lang.Comparable) (short) 1, paint12);
        paintMap0.clear();
        org.junit.Assert.assertTrue("'" + rotation5 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation5.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat12 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int13 = logFormat12.getMaximumFractionDigits();
        logFormat12.setGroupingUsed(true);
        logFormat12.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        java.lang.StringBuffer stringBuffer21 = logFormat12.format((java.lang.Object) 10, stringBuffer19, fieldPosition20);
        java.lang.String str23 = logFormat12.format(0L);
        java.lang.Object obj24 = logFormat12.clone();
        java.lang.String str26 = logFormat12.format((java.lang.Object) (byte) -1);
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat12);
        java.lang.Object obj28 = relativeDateFormat0.clone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "3.32");
// flaky "21) test2117(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u221e" + "'", str23, "\u221e");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NaN" + "'", str26, "NaN");
        org.junit.Assert.assertNotNull(obj28);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 11);
        java.lang.String str2 = relativeDateFormat1.getMinuteSuffix();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond(1.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.clone(shape3);
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int10 = logFormat9.getMaximumFractionDigits();
        logFormat9.setGroupingUsed(true);
        logFormat9.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        java.lang.StringBuffer stringBuffer18 = logFormat9.format((java.lang.Object) 10, stringBuffer16, fieldPosition17);
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat23.setMinimumIntegerDigits(1);
        logFormat23.setGroupingUsed(false);
        logFormat9.setExponentFormat((java.text.NumberFormat) logFormat23);
        boolean boolean29 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) shape3, (java.lang.Object) logFormat9);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) (short) 0, (float) 11);
        boolean boolean33 = org.jfree.chart.util.ShapeUtils.equal(shape3, shape32);
        boolean boolean34 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape3);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape3, (double) (short) 100, (double) 1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(stringBuffer18);
        org.junit.Assert.assertEquals(stringBuffer18.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(shape37);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        java.lang.StringBuffer stringBuffer17 = logFormat13.format((-1L), stringBuffer15, fieldPosition16);
        java.text.FieldPosition fieldPosition18 = null;
        java.lang.StringBuffer stringBuffer19 = logFormat4.format((long) (short) 10, stringBuffer15, fieldPosition18);
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int25 = logFormat24.getMaximumFractionDigits();
        logFormat24.setGroupingUsed(true);
        logFormat24.setGroupingUsed(false);
        logFormat24.setMaximumIntegerDigits((-1));
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat24);
        java.text.ParsePosition parsePosition34 = null;
        java.lang.Number number35 = logFormat4.parse("hi!", parsePosition34);
        logFormat4.setMinimumFractionDigits((int) (short) 1);
        java.lang.Object obj38 = logFormat4.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency39 = logFormat4.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(number35);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setGroupingUsed(false);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat11 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        long long12 = relativeDateFormat11.getBaseMillis();
        java.lang.String str13 = logFormat4.format((java.lang.Object) long12);
        logFormat4.setMinimumIntegerDigits(0);
        java.lang.String str17 = logFormat4.format((long) 64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3.32" + "'", str13, "3.32");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "6.0" + "'", str17, "6.0");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat8.setMinimumIntegerDigits(1);
        boolean boolean11 = logFormat8.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        java.lang.StringBuffer stringBuffer21 = logFormat17.format((-1L), stringBuffer19, fieldPosition20);
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat8.format((long) (short) 10, stringBuffer19, fieldPosition22);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat8);
        relativeDateFormat0.setPositivePrefix("Rotation.CLOCKWISE");
        java.text.NumberFormat numberFormat27 = relativeDateFormat0.getNumberFormat();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat28 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str29 = relativeDateFormat28.getHourSuffix();
        boolean boolean30 = relativeDateFormat28.getShowZeroHours();
        java.text.NumberFormat numberFormat31 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat28.setNumberFormat(numberFormat31);
        java.text.DateFormat dateFormat33 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone34 = dateFormat33.getTimeZone();
        dateFormat33.setLenient(true);
        java.util.Calendar calendar37 = dateFormat33.getCalendar();
        relativeDateFormat28.setCalendar(calendar37);
        relativeDateFormat0.setCalendar(calendar37);
        relativeDateFormat0.setShowZeroDays(false);
        relativeDateFormat0.setLenient(true);
        java.lang.String str44 = relativeDateFormat0.getMinuteSuffix();
        java.lang.Object obj45 = relativeDateFormat0.clone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertNotNull(dateFormat33);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar37);
// flaky "22) test2122(RegressionTest4)":         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=-765948451893,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=28,MILLISECOND=107,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "m" + "'", str44, "m");
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.text.ParsePosition parsePosition6 = null;
        java.util.Date date7 = relativeDateFormat0.parse("", parsePosition6);
        org.jfree.chart.util.LogFormat logFormat12 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat12.setMinimumIntegerDigits(1);
        logFormat12.setGroupingUsed(false);
        java.lang.String str18 = logFormat12.format((double) 0);
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat12);
        java.lang.Object obj20 = relativeDateFormat0.clone();
        long long21 = relativeDateFormat0.getBaseMillis();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(date7);
// flaky "23) test2123(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat10.setMinimumIntegerDigits(1);
        boolean boolean13 = logFormat10.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat19.format((-1L), stringBuffer21, fieldPosition22);
        java.text.FieldPosition fieldPosition24 = null;
        java.lang.StringBuffer stringBuffer25 = logFormat10.format((long) (short) 10, stringBuffer21, fieldPosition24);
        relativeDateFormat2.setHourFormatter((java.text.NumberFormat) logFormat10);
        java.lang.String str27 = relativeDateFormat2.getHourSuffix();
        boolean boolean28 = objectList1.equals((java.lang.Object) relativeDateFormat2);
        org.jfree.chart.util.LogFormat logFormat33 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat33.setMinimumIntegerDigits(1);
        logFormat33.setGroupingUsed(false);
        relativeDateFormat2.setMinuteFormatter((java.text.NumberFormat) logFormat33);
        java.lang.String str39 = relativeDateFormat2.getDaySuffix();
        java.lang.String str40 = relativeDateFormat2.getMinuteSuffix();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "d" + "'", str39, "d");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "m" + "'", str40, "m");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation5 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList1.set((int) (short) 1, (java.lang.Object) rotation5);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat7 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str8 = relativeDateFormat7.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat13.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        boolean boolean18 = logFormat13.equals((java.lang.Object) timeZone17);
        relativeDateFormat7.setHourFormatter((java.text.NumberFormat) logFormat13);
        java.text.ParsePosition parsePosition21 = null;
        java.util.Date date22 = relativeDateFormat7.parse("hi!", parsePosition21);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat23 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str24 = relativeDateFormat23.getHourSuffix();
        java.lang.String str25 = relativeDateFormat23.getDaySuffix();
        boolean boolean26 = relativeDateFormat23.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer33 = null;
        java.text.FieldPosition fieldPosition34 = null;
        java.lang.StringBuffer stringBuffer35 = logFormat31.format((-1L), stringBuffer33, fieldPosition34);
        logFormat31.setParseIntegerOnly(true);
        relativeDateFormat23.setDayFormatter((java.text.NumberFormat) logFormat31);
        relativeDateFormat7.setSecondFormatter((java.text.NumberFormat) logFormat31);
        int int40 = objectList1.indexOf((java.lang.Object) relativeDateFormat7);
        relativeDateFormat7.setMinuteSuffix("5.0");
        java.text.ParsePosition parsePosition44 = null;
        java.util.Date date45 = relativeDateFormat7.parse("-0.0", parsePosition44);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + rotation5 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation5.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(stringBuffer35);
        org.junit.Assert.assertEquals(stringBuffer35.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(date45);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 309);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition11 = null;
        java.lang.Object obj12 = logFormat4.parseObject("", parsePosition11);
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat17.setMinimumIntegerDigits(1);
        boolean boolean20 = logFormat17.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer28 = null;
        java.text.FieldPosition fieldPosition29 = null;
        java.lang.StringBuffer stringBuffer30 = logFormat26.format((-1L), stringBuffer28, fieldPosition29);
        java.text.FieldPosition fieldPosition31 = null;
        java.lang.StringBuffer stringBuffer32 = logFormat17.format((long) (short) 10, stringBuffer28, fieldPosition31);
        org.jfree.chart.util.LogFormat logFormat37 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int38 = logFormat37.getMaximumFractionDigits();
        logFormat37.setGroupingUsed(true);
        logFormat37.setGroupingUsed(false);
        logFormat37.setMaximumIntegerDigits((-1));
        logFormat17.setExponentFormat((java.text.NumberFormat) logFormat37);
        boolean boolean46 = logFormat4.equals((java.lang.Object) logFormat17);
        java.text.ParsePosition parsePosition48 = null;
        java.lang.Object obj49 = logFormat4.parseObject("1.58", parsePosition48);
        java.text.ParsePosition parsePosition51 = null;
        java.lang.Number number52 = logFormat4.parse("d", parsePosition51);
        int int53 = logFormat4.getMinimumIntegerDigits();
        int int54 = logFormat4.getMinimumFractionDigits();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(number52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(52, (int) (short) 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat10.setMinimumIntegerDigits(1);
        boolean boolean13 = logFormat10.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat19.format((-1L), stringBuffer21, fieldPosition22);
        java.text.FieldPosition fieldPosition24 = null;
        java.lang.StringBuffer stringBuffer25 = logFormat10.format((long) (short) 10, stringBuffer21, fieldPosition24);
        relativeDateFormat2.setHourFormatter((java.text.NumberFormat) logFormat10);
        java.lang.String str27 = relativeDateFormat2.getHourSuffix();
        boolean boolean28 = objectList1.equals((java.lang.Object) relativeDateFormat2);
        org.jfree.chart.util.LogFormat logFormat33 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat33.setMinimumIntegerDigits(1);
        logFormat33.setGroupingUsed(false);
        relativeDateFormat2.setMinuteFormatter((java.text.NumberFormat) logFormat33);
        java.text.ParsePosition parsePosition40 = null;
        java.util.Date date41 = relativeDateFormat2.parse("3.91", parsePosition40);
        relativeDateFormat2.setDaySuffix("2.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(date41);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        dateFormat0.setLenient(true);
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateFormat0.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 10, 309, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 309");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) 3, (float) 9);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation5 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList1.set((int) (short) 1, (java.lang.Object) rotation5);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat7 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str8 = relativeDateFormat7.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat13.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat16 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone17 = dateFormat16.getTimeZone();
        boolean boolean18 = logFormat13.equals((java.lang.Object) timeZone17);
        relativeDateFormat7.setHourFormatter((java.text.NumberFormat) logFormat13);
        java.text.ParsePosition parsePosition21 = null;
        java.util.Date date22 = relativeDateFormat7.parse("hi!", parsePosition21);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat23 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str24 = relativeDateFormat23.getHourSuffix();
        java.lang.String str25 = relativeDateFormat23.getDaySuffix();
        boolean boolean26 = relativeDateFormat23.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer33 = null;
        java.text.FieldPosition fieldPosition34 = null;
        java.lang.StringBuffer stringBuffer35 = logFormat31.format((-1L), stringBuffer33, fieldPosition34);
        logFormat31.setParseIntegerOnly(true);
        relativeDateFormat23.setDayFormatter((java.text.NumberFormat) logFormat31);
        relativeDateFormat7.setSecondFormatter((java.text.NumberFormat) logFormat31);
        int int40 = objectList1.indexOf((java.lang.Object) relativeDateFormat7);
        org.jfree.chart.PaintMap paintMap41 = new org.jfree.chart.PaintMap();
        paintMap41.clear();
        java.awt.Paint paint44 = paintMap41.getPaint((java.lang.Comparable) true);
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder45 = org.jfree.chart.LegendRenderingOrder.STANDARD;
        java.awt.Shape shape48 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (short) 0, (float) 4);
        boolean boolean49 = legendRenderingOrder45.equals((java.lang.Object) 4);
        java.lang.String str50 = legendRenderingOrder45.toString();
        java.awt.Shape shape52 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape53 = org.jfree.chart.util.ShapeUtils.clone(shape52);
        java.awt.Shape shape56 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape53, (double) (byte) 10, (double) 10.0f);
        java.awt.Shape shape58 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape62 = org.jfree.chart.util.ShapeUtils.rotateShape(shape58, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape63 = org.jfree.chart.util.ShapeUtils.clone(shape62);
        boolean boolean64 = org.jfree.chart.util.ShapeUtils.equal(shape53, shape62);
        boolean boolean65 = legendRenderingOrder45.equals((java.lang.Object) shape62);
        java.lang.String str66 = legendRenderingOrder45.toString();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat67 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str68 = relativeDateFormat67.getHourSuffix();
        boolean boolean69 = relativeDateFormat67.getShowZeroHours();
        java.text.NumberFormat numberFormat70 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat67.setNumberFormat(numberFormat70);
        boolean boolean72 = legendRenderingOrder45.equals((java.lang.Object) relativeDateFormat67);
        java.lang.String str73 = relativeDateFormat67.getSecondSuffix();
        boolean boolean74 = paintMap41.equals((java.lang.Object) str73);
        int int75 = objectList1.indexOf((java.lang.Object) str73);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + rotation5 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation5.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertNotNull(dateFormat16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "h" + "'", str24, "h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(stringBuffer35);
        org.junit.Assert.assertEquals(stringBuffer35.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(paint44);
        org.junit.Assert.assertNotNull(legendRenderingOrder45);
        org.junit.Assert.assertNotNull(shape48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str50, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertNotNull(shape52);
        org.junit.Assert.assertNotNull(shape53);
        org.junit.Assert.assertNotNull(shape56);
        org.junit.Assert.assertNotNull(shape58);
        org.junit.Assert.assertNotNull(shape62);
        org.junit.Assert.assertNotNull(shape63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str66, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "h" + "'", str68, "h");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(numberFormat70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "s" + "'", str73, "s");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 5, "-0h0Rotation.CLOCKWISE0.001s", "LegendRenderingOrder.REVERSE", false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 4);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, (double) 4L, (double) 0.5f);
        java.io.ObjectOutputStream objectOutputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape4, objectOutputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        java.lang.String str15 = logFormat4.format(0L);
        java.lang.Object obj16 = logFormat4.clone();
        java.lang.String str18 = logFormat4.format((java.lang.Object) (byte) -1);
        int int19 = logFormat4.getMinimumFractionDigits();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "24) test2136(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NaN" + "'", str18, "NaN");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat0.setPositivePrefix("\u221e");
        java.lang.String str6 = relativeDateFormat0.getPositivePrefix();
        relativeDateFormat0.setDaySuffix("0.66");
        org.jfree.chart.util.PaintList paintList9 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getIntegerInstance();
        int int11 = numberFormat10.getMaximumIntegerDigits();
        boolean boolean12 = paintList9.equals((java.lang.Object) int11);
        java.awt.Paint paint14 = null;
        paintList9.setPaint(11, paint14);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat16 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str17 = relativeDateFormat16.getHourSuffix();
        java.lang.String str18 = relativeDateFormat16.getDaySuffix();
        relativeDateFormat16.setDaySuffix("");
        relativeDateFormat16.setMinuteSuffix("Rotation.CLOCKWISE");
        java.util.TimeZone timeZone23 = relativeDateFormat16.getTimeZone();
        java.lang.Object obj24 = relativeDateFormat16.clone();
        boolean boolean25 = relativeDateFormat16.getShowZeroHours();
        boolean boolean26 = paintList9.equals((java.lang.Object) boolean25);
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int32 = logFormat31.getMaximumFractionDigits();
        logFormat31.setGroupingUsed(true);
        logFormat31.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer38 = null;
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat31.format((java.lang.Object) 10, stringBuffer38, fieldPosition39);
        java.lang.String str42 = logFormat31.format(0L);
        logFormat31.setMinimumIntegerDigits((int) ' ');
        java.lang.String str46 = logFormat31.format((double) (byte) 1);
        logFormat31.setMinimumIntegerDigits(100);
        boolean boolean49 = paintList9.equals((java.lang.Object) logFormat31);
        java.awt.Paint paint51 = paintList9.getPaint(5);
        boolean boolean52 = relativeDateFormat0.equals((java.lang.Object) paintList9);
        java.awt.Paint paint54 = paintList9.getPaint(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u221e" + "'", str6, "\u221e");
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "3.32");
// flaky "25) test2137(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u221e" + "'", str42, "\u221e");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "0.0" + "'", str46, "0.0");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(paint51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(paint54);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        long long6 = relativeDateFormat2.getBaseMillis();
        java.lang.String str7 = relativeDateFormat2.getHourSuffix();
        relativeDateFormat2.setPositivePrefix("");
        java.lang.Object obj10 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat2);
        boolean boolean11 = objectList1.equals((java.lang.Object) relativeDateFormat2);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat12 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str13 = relativeDateFormat12.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat18 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat18.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        boolean boolean23 = logFormat18.equals((java.lang.Object) timeZone22);
        relativeDateFormat12.setHourFormatter((java.text.NumberFormat) logFormat18);
        java.text.ParsePosition parsePosition26 = null;
        java.util.Date date27 = relativeDateFormat12.parse("hi!", parsePosition26);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat28 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str29 = relativeDateFormat28.getHourSuffix();
        java.lang.String str30 = relativeDateFormat28.getDaySuffix();
        boolean boolean31 = relativeDateFormat28.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer38 = null;
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat36.format((-1L), stringBuffer38, fieldPosition39);
        logFormat36.setParseIntegerOnly(true);
        relativeDateFormat28.setDayFormatter((java.text.NumberFormat) logFormat36);
        relativeDateFormat12.setSecondFormatter((java.text.NumberFormat) logFormat36);
        relativeDateFormat2.setHourFormatter((java.text.NumberFormat) logFormat36);
        boolean boolean46 = relativeDateFormat2.getShowZeroDays();
        relativeDateFormat2.setPositivePrefix("\24415.00");
        relativeDateFormat2.setDaySuffix("4.0");
        relativeDateFormat2.setBaseMillis((long) 13);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat53 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str54 = relativeDateFormat53.getHourSuffix();
        boolean boolean55 = relativeDateFormat53.getShowZeroHours();
        java.lang.String str56 = relativeDateFormat53.getMinuteSuffix();
        long long57 = relativeDateFormat53.getBaseMillis();
        java.lang.String str58 = relativeDateFormat53.getHourSuffix();
        relativeDateFormat53.setPositivePrefix("");
        java.text.ParsePosition parsePosition62 = null;
        java.util.Date date63 = relativeDateFormat53.parse("LegendRenderingOrder.STANDARD", parsePosition62);
        java.lang.String str64 = relativeDateFormat53.getMinuteSuffix();
        java.text.NumberFormat numberFormat65 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat65.setMinimumFractionDigits((int) '4');
        int int68 = numberFormat65.getMinimumIntegerDigits();
        relativeDateFormat53.setHourFormatter(numberFormat65);
        org.jfree.chart.util.LogFormat logFormat74 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        boolean boolean75 = logFormat74.isParseIntegerOnly();
        logFormat74.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition79 = null;
        java.lang.Object obj80 = logFormat74.parseObject("LegendRenderingOrder.REVERSE", parsePosition79);
        relativeDateFormat53.setHourFormatter((java.text.NumberFormat) logFormat74);
        relativeDateFormat2.setHourFormatter((java.text.NumberFormat) logFormat74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "d" + "'", str30, "d");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "h" + "'", str54, "h");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "m" + "'", str56, "m");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "h" + "'", str58, "h");
        org.junit.Assert.assertNull(date63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "m" + "'", str64, "m");
        org.junit.Assert.assertNotNull(numberFormat65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 10, (int) 'a', locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        org.jfree.chart.PaintMap paintMap3 = new org.jfree.chart.PaintMap();
        java.lang.Object obj4 = paintMap3.clone();
        java.awt.Paint paint6 = null;
        paintMap3.put((java.lang.Comparable) '4', paint6);
        org.jfree.chart.util.ObjectList objectList9 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat10 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str11 = relativeDateFormat10.getHourSuffix();
        boolean boolean12 = relativeDateFormat10.getShowZeroHours();
        java.lang.String str13 = relativeDateFormat10.getMinuteSuffix();
        long long14 = relativeDateFormat10.getBaseMillis();
        java.lang.String str15 = relativeDateFormat10.getHourSuffix();
        relativeDateFormat10.setPositivePrefix("");
        java.lang.Object obj18 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat10);
        boolean boolean19 = objectList9.equals((java.lang.Object) relativeDateFormat10);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat20 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str21 = relativeDateFormat20.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat26.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone30 = dateFormat29.getTimeZone();
        boolean boolean31 = logFormat26.equals((java.lang.Object) timeZone30);
        relativeDateFormat20.setHourFormatter((java.text.NumberFormat) logFormat26);
        java.text.ParsePosition parsePosition34 = null;
        java.util.Date date35 = relativeDateFormat20.parse("hi!", parsePosition34);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat36 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str37 = relativeDateFormat36.getHourSuffix();
        java.lang.String str38 = relativeDateFormat36.getDaySuffix();
        boolean boolean39 = relativeDateFormat36.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat44 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer46 = null;
        java.text.FieldPosition fieldPosition47 = null;
        java.lang.StringBuffer stringBuffer48 = logFormat44.format((-1L), stringBuffer46, fieldPosition47);
        logFormat44.setParseIntegerOnly(true);
        relativeDateFormat36.setDayFormatter((java.text.NumberFormat) logFormat44);
        relativeDateFormat20.setSecondFormatter((java.text.NumberFormat) logFormat44);
        relativeDateFormat10.setHourFormatter((java.text.NumberFormat) logFormat44);
        boolean boolean54 = paintMap3.equals((java.lang.Object) logFormat44);
        boolean boolean55 = relativeDateFormat0.equals((java.lang.Object) paintMap3);
        java.util.Calendar calendar56 = relativeDateFormat0.getCalendar();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "m" + "'", str13, "m");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "h" + "'", str37, "h");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "d" + "'", str38, "d");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(stringBuffer48);
        org.junit.Assert.assertEquals(stringBuffer48.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(calendar56);
// flaky "26) test2140(RegressionTest4)":         org.junit.Assert.assertEquals(calendar56.toString(), "java.util.GregorianCalendar[time=1758659548531,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=28,MILLISECOND=531,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        int int1 = paintList0.size();
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape4, (double) (byte) 10, (double) 10.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtils.rotateShape(shape9, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtils.clone(shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtils.equal(shape4, shape13);
        boolean boolean16 = paintList0.equals((java.lang.Object) boolean15);
        java.awt.Paint paint18 = null;
        paintList0.setPaint(15, paint18);
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int25 = logFormat24.getMaximumFractionDigits();
        logFormat24.setGroupingUsed(true);
        logFormat24.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer31 = null;
        java.text.FieldPosition fieldPosition32 = null;
        java.lang.StringBuffer stringBuffer33 = logFormat24.format((java.lang.Object) 10, stringBuffer31, fieldPosition32);
        java.lang.String str35 = logFormat24.format(0L);
        java.lang.Object obj36 = logFormat24.clone();
        java.lang.String str38 = logFormat24.format((double) (byte) 0);
        boolean boolean39 = logFormat24.isParseIntegerOnly();
        org.jfree.chart.util.LogFormat logFormat44 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int45 = logFormat44.getMaximumFractionDigits();
        logFormat24.setExponentFormat((java.text.NumberFormat) logFormat44);
        boolean boolean47 = paintList0.equals((java.lang.Object) logFormat44);
        org.jfree.chart.util.LogFormat logFormat52 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat52.setMinimumIntegerDigits(1);
        boolean boolean55 = logFormat52.isGroupingUsed();
        int int56 = logFormat52.getMaximumFractionDigits();
        boolean boolean57 = logFormat52.isGroupingUsed();
        logFormat44.setExponentFormat((java.text.NumberFormat) logFormat52);
        logFormat52.setMinimumIntegerDigits((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(stringBuffer33);
        org.junit.Assert.assertEquals(stringBuffer33.toString(), "3.32");
// flaky "27) test2141(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u221e" + "'", str35, "\u221e");
        org.junit.Assert.assertNotNull(obj36);
// flaky "6) test2141(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u221e" + "'", str38, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat0.setPositivePrefix("\u221e");
        java.lang.String str6 = relativeDateFormat0.getPositivePrefix();
        org.jfree.chart.util.LogFormat logFormat11 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat11.setMinimumIntegerDigits(1);
        boolean boolean14 = logFormat11.isGroupingUsed();
        logFormat11.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat17 = logFormat11.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int24 = logFormat23.getMaximumFractionDigits();
        logFormat23.setGroupingUsed(true);
        logFormat23.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer30 = null;
        java.text.FieldPosition fieldPosition31 = null;
        java.lang.StringBuffer stringBuffer32 = logFormat23.format((java.lang.Object) 10, stringBuffer30, fieldPosition31);
        java.text.FieldPosition fieldPosition33 = null;
        java.lang.StringBuffer stringBuffer34 = logFormat11.format(0.0d, stringBuffer32, fieldPosition33);
        int int35 = logFormat11.getMinimumIntegerDigits();
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat11);
        int int37 = logFormat11.getMaximumIntegerDigits();
        java.lang.String str39 = logFormat11.format(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency40 = logFormat11.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u221e" + "'", str6, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer34);
// flaky "28) test2142(RegressionTest4)":         org.junit.Assert.assertEquals(stringBuffer34.toString(), "\u221e");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
// flaky "7) test2142(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u221e" + "'", str39, "\u221e");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        org.jfree.chart.util.LogFormat logFormat18 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat18.setMinimumIntegerDigits(1);
        logFormat18.setGroupingUsed(false);
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat18);
        logFormat18.setMaximumFractionDigits(4);
        logFormat18.setMaximumFractionDigits(64);
        logFormat18.setMaximumIntegerDigits(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean1 = relativeDateFormat0.isLenient();
        java.text.ParsePosition parsePosition3 = null;
        java.util.Date date4 = relativeDateFormat0.parse("m", parsePosition3);
        relativeDateFormat0.setBaseMillis((long) 8);
        java.text.NumberFormat numberFormat7 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat7.setParseIntegerOnly(false);
        java.lang.String str11 = numberFormat7.format((long) 15);
        relativeDateFormat0.setHourFormatter(numberFormat7);
        relativeDateFormat0.setMinuteSuffix("");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat15 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str16 = relativeDateFormat15.getHourSuffix();
        java.lang.String str17 = relativeDateFormat15.getDaySuffix();
        boolean boolean18 = relativeDateFormat15.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer25 = null;
        java.text.FieldPosition fieldPosition26 = null;
        java.lang.StringBuffer stringBuffer27 = logFormat23.format((-1L), stringBuffer25, fieldPosition26);
        logFormat23.setParseIntegerOnly(true);
        relativeDateFormat15.setDayFormatter((java.text.NumberFormat) logFormat23);
        java.util.TimeZone timeZone31 = relativeDateFormat15.getTimeZone();
        relativeDateFormat0.setTimeZone(timeZone31);
        relativeDateFormat0.setMinuteSuffix("NaN");
        java.util.Calendar calendar35 = relativeDateFormat0.getCalendar();
        java.text.NumberFormat numberFormat36 = relativeDateFormat0.getNumberFormat();
        numberFormat36.setMinimumFractionDigits(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\24415.00" + "'", str11, "\24415.00");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "NaN");
        org.junit.Assert.assertNotNull(timeZone31);
        org.junit.Assert.assertEquals(timeZone31.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar35);
// flaky "29) test2144(RegressionTest4)":         org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=1758659548645,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=28,MILLISECOND=645,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat36);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        long long2 = relativeDateFormat1.getBaseMillis();
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat7.setMinimumIntegerDigits(1);
        logFormat7.setGroupingUsed(false);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        boolean boolean14 = logFormat7.equals((java.lang.Object) dateFormat12);
        relativeDateFormat1.setDayFormatter((java.text.NumberFormat) logFormat7);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat16 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str17 = relativeDateFormat16.getHourSuffix();
        relativeDateFormat16.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat16.setSecondFormatter((java.text.NumberFormat) logFormat24);
        java.text.NumberFormat numberFormat26 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat26.setMinimumFractionDigits((int) '4');
        int int29 = numberFormat26.getMinimumIntegerDigits();
        numberFormat26.setMaximumFractionDigits(6);
        logFormat24.setExponentFormat(numberFormat26);
        boolean boolean34 = logFormat24.equals((java.lang.Object) "LegendRenderingOrder.STANDARD");
        relativeDateFormat1.setMinuteFormatter((java.text.NumberFormat) logFormat24);
        relativeDateFormat1.setShowZeroDays(true);
        boolean boolean38 = relativeDateFormat1.isLenient();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("-1", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 64, (double) 7, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 5, (int) (short) 100, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.text.ParsePosition parsePosition6 = null;
        java.util.Date date7 = relativeDateFormat0.parse("", parsePosition6);
        org.jfree.chart.util.LogFormat logFormat12 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat12.setMinimumIntegerDigits(1);
        logFormat12.setGroupingUsed(false);
        java.lang.String str18 = logFormat12.format((double) 0);
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat12);
        java.text.ParsePosition parsePosition21 = null;
        java.lang.Object obj22 = relativeDateFormat0.parseObject("0.66", parsePosition21);
        org.jfree.chart.util.LogFormat logFormat27 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat27.setMinimumIntegerDigits(1);
        logFormat27.setGroupingUsed(false);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat27);
        boolean boolean33 = relativeDateFormat0.getShowZeroDays();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(date7);
// flaky "30) test2149(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat10.setMinimumIntegerDigits(1);
        boolean boolean13 = logFormat10.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat19.format((-1L), stringBuffer21, fieldPosition22);
        java.text.FieldPosition fieldPosition24 = null;
        java.lang.StringBuffer stringBuffer25 = logFormat10.format((long) (short) 10, stringBuffer21, fieldPosition24);
        relativeDateFormat2.setHourFormatter((java.text.NumberFormat) logFormat10);
        java.lang.String str27 = relativeDateFormat2.getHourSuffix();
        boolean boolean28 = objectList1.equals((java.lang.Object) relativeDateFormat2);
        objectList1.clear();
        objectList1.clear();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat0.setNumberFormat(numberFormat3);
        java.text.NumberFormat numberFormat5 = relativeDateFormat0.getNumberFormat();
        relativeDateFormat0.setDaySuffix("\24415.00");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder8 = org.jfree.chart.LegendRenderingOrder.STANDARD;
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (short) 0, (float) 4);
        boolean boolean12 = legendRenderingOrder8.equals((java.lang.Object) 4);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat13 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str14 = relativeDateFormat13.getHourSuffix();
        boolean boolean15 = relativeDateFormat13.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat20 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int21 = logFormat20.getMaximumFractionDigits();
        logFormat20.setGroupingUsed(true);
        logFormat20.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition27 = null;
        java.lang.Object obj28 = logFormat20.parseObject("", parsePosition27);
        org.jfree.chart.util.LogFormat logFormat33 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat33.setMinimumIntegerDigits(1);
        boolean boolean36 = logFormat33.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat42 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer44 = null;
        java.text.FieldPosition fieldPosition45 = null;
        java.lang.StringBuffer stringBuffer46 = logFormat42.format((-1L), stringBuffer44, fieldPosition45);
        java.text.FieldPosition fieldPosition47 = null;
        java.lang.StringBuffer stringBuffer48 = logFormat33.format((long) (short) 10, stringBuffer44, fieldPosition47);
        org.jfree.chart.util.LogFormat logFormat53 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int54 = logFormat53.getMaximumFractionDigits();
        logFormat53.setGroupingUsed(true);
        logFormat53.setGroupingUsed(false);
        logFormat53.setMaximumIntegerDigits((-1));
        logFormat33.setExponentFormat((java.text.NumberFormat) logFormat53);
        boolean boolean62 = logFormat20.equals((java.lang.Object) logFormat33);
        relativeDateFormat13.setMinuteFormatter((java.text.NumberFormat) logFormat20);
        org.jfree.chart.util.LogFormat logFormat68 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat68.setMinimumIntegerDigits(1);
        boolean boolean71 = logFormat68.isGroupingUsed();
        boolean boolean72 = logFormat68.isGroupingUsed();
        boolean boolean73 = logFormat20.equals((java.lang.Object) logFormat68);
        boolean boolean74 = legendRenderingOrder8.equals((java.lang.Object) logFormat68);
        logFormat68.setParseIntegerOnly(false);
        boolean boolean77 = relativeDateFormat0.equals((java.lang.Object) false);
        boolean boolean78 = relativeDateFormat0.getShowZeroHours();
        java.lang.Object obj79 = relativeDateFormat0.clone();
        java.lang.String str80 = relativeDateFormat0.getDaySuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(legendRenderingOrder8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(stringBuffer46);
        org.junit.Assert.assertEquals(stringBuffer46.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer48);
        org.junit.Assert.assertEquals(stringBuffer48.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\24415.00" + "'", str80, "\24415.00");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape3, (double) (byte) 10, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape3, (double) 13, (float) 15, (float) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.STANDARD;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (short) 0, (float) 4);
        boolean boolean4 = legendRenderingOrder0.equals((java.lang.Object) 4);
        java.lang.String str5 = legendRenderingOrder0.toString();
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat10.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone14 = dateFormat13.getTimeZone();
        boolean boolean15 = logFormat10.equals((java.lang.Object) timeZone14);
        boolean boolean16 = legendRenderingOrder0.equals((java.lang.Object) boolean15);
        java.lang.String str17 = legendRenderingOrder0.toString();
        java.lang.String str18 = legendRenderingOrder0.toString();
        java.lang.String str19 = legendRenderingOrder0.toString();
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str5, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str17, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str18, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str19, "LegendRenderingOrder.STANDARD");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat0.setPositivePrefix("\u221e");
        java.lang.String str6 = relativeDateFormat0.getPositivePrefix();
        boolean boolean7 = relativeDateFormat0.getShowZeroHours();
        boolean boolean8 = relativeDateFormat0.isLenient();
        relativeDateFormat0.setPositivePrefix("4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u221e" + "'", str6, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int8 = logFormat7.getMaximumFractionDigits();
        logFormat7.setGroupingUsed(true);
        logFormat7.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition14 = null;
        java.lang.Object obj15 = logFormat7.parseObject("", parsePosition14);
        org.jfree.chart.util.LogFormat logFormat20 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat20.setMinimumIntegerDigits(1);
        boolean boolean23 = logFormat20.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer31 = null;
        java.text.FieldPosition fieldPosition32 = null;
        java.lang.StringBuffer stringBuffer33 = logFormat29.format((-1L), stringBuffer31, fieldPosition32);
        java.text.FieldPosition fieldPosition34 = null;
        java.lang.StringBuffer stringBuffer35 = logFormat20.format((long) (short) 10, stringBuffer31, fieldPosition34);
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int41 = logFormat40.getMaximumFractionDigits();
        logFormat40.setGroupingUsed(true);
        logFormat40.setGroupingUsed(false);
        logFormat40.setMaximumIntegerDigits((-1));
        logFormat20.setExponentFormat((java.text.NumberFormat) logFormat40);
        boolean boolean49 = logFormat7.equals((java.lang.Object) logFormat20);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat7);
        relativeDateFormat0.setShowZeroHours(false);
        relativeDateFormat0.setSecondSuffix("3.46");
        java.text.ParsePosition parsePosition56 = null;
        java.lang.Object obj57 = relativeDateFormat0.parseObject("3.91", parsePosition56);
        long long58 = relativeDateFormat0.getBaseMillis();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat59 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str60 = relativeDateFormat59.getHourSuffix();
        java.lang.String str61 = relativeDateFormat59.getMinuteSuffix();
        java.lang.Object obj62 = relativeDateFormat59.clone();
        java.util.Calendar calendar63 = relativeDateFormat59.getCalendar();
        org.jfree.chart.PaintMap paintMap64 = new org.jfree.chart.PaintMap();
        java.lang.Object obj65 = paintMap64.clone();
        java.awt.Paint paint67 = null;
        paintMap64.put((java.lang.Comparable) '4', paint67);
        java.awt.Paint paint70 = paintMap64.getPaint((java.lang.Comparable) "NaN");
        java.awt.Paint paint72 = null;
        paintMap64.put((java.lang.Comparable) ' ', paint72);
        org.jfree.chart.util.LogFormat logFormat74 = new org.jfree.chart.util.LogFormat();
        logFormat74.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition78 = null;
        java.lang.Number number79 = logFormat74.parse("6.64", parsePosition78);
        java.text.ParsePosition parsePosition81 = null;
        java.lang.Number number82 = logFormat74.parse("", parsePosition81);
        boolean boolean83 = paintMap64.equals((java.lang.Object) logFormat74);
        relativeDateFormat59.setDayFormatter((java.text.NumberFormat) logFormat74);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat74);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stringBuffer33);
        org.junit.Assert.assertEquals(stringBuffer33.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer35);
        org.junit.Assert.assertEquals(stringBuffer35.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "h" + "'", str60, "h");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "m" + "'", str61, "m");
        org.junit.Assert.assertNotNull(obj62);
        org.junit.Assert.assertNotNull(calendar63);
// flaky "31) test2155(RegressionTest4)":         org.junit.Assert.assertEquals(calendar63.toString(), "java.util.GregorianCalendar[time=1758659548932,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=32,SECOND=28,MILLISECOND=932,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj65);
        org.junit.Assert.assertNull(paint70);
        org.junit.Assert.assertNull(number79);
        org.junit.Assert.assertNull(number82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 7, "2", "64", false);
        java.lang.Object obj5 = null;
        org.jfree.chart.util.PaintList paintList6 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat7 = java.text.NumberFormat.getIntegerInstance();
        int int8 = numberFormat7.getMaximumIntegerDigits();
        boolean boolean9 = paintList6.equals((java.lang.Object) int8);
        java.awt.Paint paint11 = null;
        paintList6.setPaint(11, paint11);
        java.lang.Object obj13 = paintList6.clone();
        java.lang.Object obj14 = null;
        boolean boolean15 = paintList6.equals(obj14);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat16 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str17 = relativeDateFormat16.getHourSuffix();
        boolean boolean18 = relativeDateFormat16.getShowZeroHours();
        boolean boolean19 = relativeDateFormat16.getShowZeroHours();
        java.util.TimeZone timeZone20 = relativeDateFormat16.getTimeZone();
        boolean boolean21 = paintList6.equals((java.lang.Object) relativeDateFormat16);
        java.lang.String str22 = relativeDateFormat16.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat27 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int28 = logFormat27.getMaximumFractionDigits();
        logFormat27.setGroupingUsed(true);
        logFormat27.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition34 = null;
        java.lang.Object obj35 = logFormat27.parseObject("", parsePosition34);
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat40.setMinimumIntegerDigits(1);
        boolean boolean43 = logFormat40.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat49 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer51 = null;
        java.text.FieldPosition fieldPosition52 = null;
        java.lang.StringBuffer stringBuffer53 = logFormat49.format((-1L), stringBuffer51, fieldPosition52);
        java.text.FieldPosition fieldPosition54 = null;
        java.lang.StringBuffer stringBuffer55 = logFormat40.format((long) (short) 10, stringBuffer51, fieldPosition54);
        org.jfree.chart.util.LogFormat logFormat60 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int61 = logFormat60.getMaximumFractionDigits();
        logFormat60.setGroupingUsed(true);
        logFormat60.setGroupingUsed(false);
        logFormat60.setMaximumIntegerDigits((-1));
        logFormat40.setExponentFormat((java.text.NumberFormat) logFormat60);
        boolean boolean69 = logFormat27.equals((java.lang.Object) logFormat40);
        logFormat27.setMinimumFractionDigits((int) (short) 1);
        relativeDateFormat16.setSecondFormatter((java.text.NumberFormat) logFormat27);
        boolean boolean73 = org.jfree.chart.util.ObjectUtils.equal(obj5, (java.lang.Object) logFormat27);
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat27);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "m" + "'", str22, "m");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(stringBuffer53);
        org.junit.Assert.assertEquals(stringBuffer53.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        long long6 = relativeDateFormat2.getBaseMillis();
        java.lang.String str7 = relativeDateFormat2.getHourSuffix();
        relativeDateFormat2.setPositivePrefix("");
        java.lang.Object obj10 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat2);
        boolean boolean11 = objectList1.equals((java.lang.Object) relativeDateFormat2);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat12 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str13 = relativeDateFormat12.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat18 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat18.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat21 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone22 = dateFormat21.getTimeZone();
        boolean boolean23 = logFormat18.equals((java.lang.Object) timeZone22);
        relativeDateFormat12.setHourFormatter((java.text.NumberFormat) logFormat18);
        java.text.ParsePosition parsePosition26 = null;
        java.util.Date date27 = relativeDateFormat12.parse("hi!", parsePosition26);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat28 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str29 = relativeDateFormat28.getHourSuffix();
        java.lang.String str30 = relativeDateFormat28.getDaySuffix();
        boolean boolean31 = relativeDateFormat28.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer38 = null;
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat36.format((-1L), stringBuffer38, fieldPosition39);
        logFormat36.setParseIntegerOnly(true);
        relativeDateFormat28.setDayFormatter((java.text.NumberFormat) logFormat36);
        relativeDateFormat12.setSecondFormatter((java.text.NumberFormat) logFormat36);
        relativeDateFormat2.setHourFormatter((java.text.NumberFormat) logFormat36);
        java.lang.String str46 = relativeDateFormat2.getPositivePrefix();
        java.lang.String str47 = relativeDateFormat2.getDaySuffix();
        relativeDateFormat2.setDaySuffix("3.05");
        java.util.TimeZone timeZone50 = relativeDateFormat2.getTimeZone();
        relativeDateFormat2.setShowZeroHours(true);
        org.jfree.chart.util.LogFormat logFormat57 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int58 = logFormat57.getMaximumFractionDigits();
        logFormat57.setGroupingUsed(true);
        logFormat57.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer64 = null;
        java.text.FieldPosition fieldPosition65 = null;
        java.lang.StringBuffer stringBuffer66 = logFormat57.format((java.lang.Object) 10, stringBuffer64, fieldPosition65);
        java.lang.String str68 = logFormat57.format(0L);
        java.lang.Object obj69 = logFormat57.clone();
        java.lang.String str71 = logFormat57.format((double) (byte) 0);
        boolean boolean72 = logFormat57.isParseIntegerOnly();
        java.text.NumberFormat numberFormat73 = logFormat57.getExponentFormat();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat74 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean75 = relativeDateFormat74.isLenient();
        java.text.ParsePosition parsePosition77 = null;
        java.util.Date date78 = relativeDateFormat74.parse("m", parsePosition77);
        relativeDateFormat74.setBaseMillis((long) 8);
        java.text.NumberFormat numberFormat81 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat81.setParseIntegerOnly(false);
        java.lang.String str85 = numberFormat81.format((long) 15);
        relativeDateFormat74.setHourFormatter(numberFormat81);
        java.text.NumberFormat numberFormat87 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat87.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean90 = numberFormat87.isParseIntegerOnly();
        java.math.RoundingMode roundingMode91 = numberFormat87.getRoundingMode();
        numberFormat81.setRoundingMode(roundingMode91);
        numberFormat73.setRoundingMode(roundingMode91);
        relativeDateFormat2.setNumberFormat(numberFormat73);
        relativeDateFormat2.setMinuteSuffix("\2447.00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertNotNull(dateFormat21);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(date27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "h" + "'", str29, "h");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "d" + "'", str30, "d");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "NaN");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "d" + "'", str47, "d");
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNotNull(stringBuffer66);
        org.junit.Assert.assertEquals(stringBuffer66.toString(), "3.32");
// flaky "32) test2157(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\u221e" + "'", str68, "\u221e");
        org.junit.Assert.assertNotNull(obj69);
// flaky "8) test2157(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\u221e" + "'", str71, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(numberFormat73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNull(date78);
        org.junit.Assert.assertNotNull(numberFormat81);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "\24415.00" + "'", str85, "\24415.00");
        org.junit.Assert.assertNotNull(numberFormat87);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + roundingMode91 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode91.equals(java.math.RoundingMode.HALF_EVEN));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        java.awt.Paint paint5 = null;
        paintList0.setPaint(11, paint5);
        java.lang.Object obj7 = paintList0.clone();
        java.lang.Object obj8 = null;
        boolean boolean9 = paintList0.equals(obj8);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat10 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str11 = relativeDateFormat10.getHourSuffix();
        boolean boolean12 = relativeDateFormat10.getShowZeroHours();
        boolean boolean13 = relativeDateFormat10.getShowZeroHours();
        java.util.TimeZone timeZone14 = relativeDateFormat10.getTimeZone();
        boolean boolean15 = paintList0.equals((java.lang.Object) relativeDateFormat10);
        java.lang.String str16 = relativeDateFormat10.getMinuteSuffix();
        boolean boolean18 = relativeDateFormat10.equals((java.lang.Object) 36);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "m" + "'", str16, "m");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat6 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat6.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone10 = dateFormat9.getTimeZone();
        boolean boolean11 = logFormat6.equals((java.lang.Object) timeZone10);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat6);
        java.text.ParsePosition parsePosition14 = null;
        java.util.Date date15 = relativeDateFormat0.parse("hi!", parsePosition14);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat16 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str17 = relativeDateFormat16.getHourSuffix();
        java.lang.String str18 = relativeDateFormat16.getDaySuffix();
        boolean boolean19 = relativeDateFormat16.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer26 = null;
        java.text.FieldPosition fieldPosition27 = null;
        java.lang.StringBuffer stringBuffer28 = logFormat24.format((-1L), stringBuffer26, fieldPosition27);
        logFormat24.setParseIntegerOnly(true);
        relativeDateFormat16.setDayFormatter((java.text.NumberFormat) logFormat24);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat24);
        relativeDateFormat0.setDaySuffix("SortOrder.DESCENDING");
        java.text.NumberFormat numberFormat35 = relativeDateFormat0.getNumberFormat();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d" + "'", str18, "d");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(stringBuffer28);
        org.junit.Assert.assertEquals(stringBuffer28.toString(), "NaN");
        org.junit.Assert.assertNotNull(numberFormat35);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        boolean boolean3 = paintMap0.containsKey((java.lang.Comparable) 0L);
        java.awt.Paint paint5 = null;
        paintMap0.put((java.lang.Comparable) "0.0", paint5);
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat();
        logFormat7.setParseIntegerOnly(true);
        logFormat7.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat17.setMinimumIntegerDigits(1);
        boolean boolean20 = logFormat17.isGroupingUsed();
        logFormat17.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat23 = logFormat17.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int30 = logFormat29.getMaximumFractionDigits();
        logFormat29.setGroupingUsed(true);
        logFormat29.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer36 = null;
        java.text.FieldPosition fieldPosition37 = null;
        java.lang.StringBuffer stringBuffer38 = logFormat29.format((java.lang.Object) 10, stringBuffer36, fieldPosition37);
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat17.format(0.0d, stringBuffer38, fieldPosition39);
        java.text.FieldPosition fieldPosition41 = null;
        java.lang.StringBuffer stringBuffer42 = logFormat7.format((double) ' ', stringBuffer38, fieldPosition41);
        boolean boolean43 = paintMap0.containsKey((java.lang.Comparable) stringBuffer42);
        org.jfree.chart.util.ObjectList objectList45 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj47 = objectList45.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation49 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList45.set((int) (short) 1, (java.lang.Object) rotation49);
        java.lang.String str51 = rotation49.toString();
        double double52 = rotation49.getFactor();
        double double53 = rotation49.getFactor();
        double double54 = rotation49.getFactor();
        double double55 = rotation49.getFactor();
        java.awt.Paint paint56 = paintMap0.getPaint((java.lang.Comparable) rotation49);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(numberFormat23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(stringBuffer38);
        org.junit.Assert.assertEquals(stringBuffer38.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer40);
// flaky "33) test2160(RegressionTest4)":         org.junit.Assert.assertEquals(stringBuffer40.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer42);
        org.junit.Assert.assertEquals(stringBuffer42.toString(), "10^1.51");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + rotation49 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation49.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Rotation.CLOCKWISE" + "'", str51, "Rotation.CLOCKWISE");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNull(paint56);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList2 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean3 = legendRenderingOrder0.equals((java.lang.Object) objectList2);
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        java.lang.StringBuffer stringBuffer12 = logFormat8.format((-1L), stringBuffer10, fieldPosition11);
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        logFormat8.setExponentFormat((java.text.NumberFormat) logFormat17);
        boolean boolean19 = legendRenderingOrder0.equals((java.lang.Object) logFormat17);
        java.text.NumberFormat numberFormat20 = logFormat17.getExponentFormat();
        int int21 = numberFormat20.getMinimumIntegerDigits();
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuffer12);
        org.junit.Assert.assertEquals(stringBuffer12.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 100);
        objectList1.clear();
        objectList1.clear();
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        java.lang.StringBuffer stringBuffer17 = logFormat13.format((-1L), stringBuffer15, fieldPosition16);
        java.text.FieldPosition fieldPosition18 = null;
        java.lang.StringBuffer stringBuffer19 = logFormat4.format((long) (short) 10, stringBuffer15, fieldPosition18);
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int25 = logFormat24.getMaximumFractionDigits();
        logFormat24.setGroupingUsed(true);
        logFormat24.setGroupingUsed(false);
        logFormat24.setMaximumIntegerDigits((-1));
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat24);
        boolean boolean33 = logFormat24.isGroupingUsed();
        java.text.NumberFormat numberFormat34 = java.text.NumberFormat.getInstance();
        int int35 = numberFormat34.getMaximumFractionDigits();
        int int36 = numberFormat34.getMaximumIntegerDigits();
        numberFormat34.setParseIntegerOnly(false);
        int int39 = numberFormat34.getMinimumIntegerDigits();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat40 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean41 = relativeDateFormat40.isLenient();
        java.text.ParsePosition parsePosition43 = null;
        java.util.Date date44 = relativeDateFormat40.parse("m", parsePosition43);
        relativeDateFormat40.setBaseMillis((long) 8);
        java.text.NumberFormat numberFormat47 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat47.setParseIntegerOnly(false);
        java.lang.String str51 = numberFormat47.format((long) 15);
        relativeDateFormat40.setHourFormatter(numberFormat47);
        java.text.NumberFormat numberFormat53 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean54 = numberFormat53.isGroupingUsed();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat55 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str56 = relativeDateFormat55.getHourSuffix();
        boolean boolean57 = relativeDateFormat55.getShowZeroHours();
        java.lang.String str58 = relativeDateFormat55.getMinuteSuffix();
        long long59 = relativeDateFormat55.getBaseMillis();
        java.lang.String str60 = relativeDateFormat55.getHourSuffix();
        relativeDateFormat55.setPositivePrefix("");
        java.lang.Object obj63 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat55);
        relativeDateFormat55.setBaseMillis((long) 4);
        java.lang.String str66 = numberFormat53.format((java.lang.Object) 4);
        numberFormat53.setMinimumFractionDigits(17);
        java.util.Currency currency69 = numberFormat53.getCurrency();
        numberFormat47.setCurrency(currency69);
        numberFormat34.setCurrency(currency69);
        // The following exception was thrown during execution in test generation
        try {
            logFormat24.setCurrency(currency69);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(date44);
        org.junit.Assert.assertNotNull(numberFormat47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\24415.00" + "'", str51, "\24415.00");
        org.junit.Assert.assertNotNull(numberFormat53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "h" + "'", str56, "h");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "m" + "'", str58, "m");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "h" + "'", str60, "h");
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "4" + "'", str66, "4");
        org.junit.Assert.assertNotNull(currency69);
        org.junit.Assert.assertEquals(currency69.toString(), "XXX");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int8 = logFormat7.getMaximumFractionDigits();
        logFormat7.setGroupingUsed(true);
        logFormat7.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition14 = null;
        java.lang.Object obj15 = logFormat7.parseObject("", parsePosition14);
        org.jfree.chart.util.LogFormat logFormat20 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat20.setMinimumIntegerDigits(1);
        boolean boolean23 = logFormat20.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer31 = null;
        java.text.FieldPosition fieldPosition32 = null;
        java.lang.StringBuffer stringBuffer33 = logFormat29.format((-1L), stringBuffer31, fieldPosition32);
        java.text.FieldPosition fieldPosition34 = null;
        java.lang.StringBuffer stringBuffer35 = logFormat20.format((long) (short) 10, stringBuffer31, fieldPosition34);
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int41 = logFormat40.getMaximumFractionDigits();
        logFormat40.setGroupingUsed(true);
        logFormat40.setGroupingUsed(false);
        logFormat40.setMaximumIntegerDigits((-1));
        logFormat20.setExponentFormat((java.text.NumberFormat) logFormat40);
        boolean boolean49 = logFormat7.equals((java.lang.Object) logFormat20);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat7);
        java.lang.String str51 = relativeDateFormat0.getDaySuffix();
        java.util.TimeZone timeZone52 = relativeDateFormat0.getTimeZone();
        relativeDateFormat0.setMinuteSuffix("2.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stringBuffer33);
        org.junit.Assert.assertEquals(stringBuffer33.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer35);
        org.junit.Assert.assertEquals(stringBuffer35.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "d" + "'", str51, "d");
        org.junit.Assert.assertNotNull(timeZone52);
        org.junit.Assert.assertEquals(timeZone52.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        boolean boolean2 = dateFormat0.isLenient();
        java.text.NumberFormat numberFormat3 = dateFormat0.getNumberFormat();
        dateFormat0.setLenient(true);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(numberFormat3);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat10.setMinimumIntegerDigits(1);
        boolean boolean13 = logFormat10.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat19.format((-1L), stringBuffer21, fieldPosition22);
        java.text.FieldPosition fieldPosition24 = null;
        java.lang.StringBuffer stringBuffer25 = logFormat10.format((long) (short) 10, stringBuffer21, fieldPosition24);
        relativeDateFormat2.setHourFormatter((java.text.NumberFormat) logFormat10);
        java.lang.String str27 = relativeDateFormat2.getHourSuffix();
        boolean boolean28 = objectList1.equals((java.lang.Object) relativeDateFormat2);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat30 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        relativeDateFormat30.setShowZeroDays(false);
        relativeDateFormat30.setMinuteSuffix("0.0");
        relativeDateFormat30.setMinuteSuffix("0.66");
        java.text.ParsePosition parsePosition38 = null;
        java.lang.Object obj39 = relativeDateFormat30.parseObject("d", parsePosition38);
        relativeDateFormat30.setDaySuffix("\u221e");
        java.lang.String str42 = relativeDateFormat30.getSecondSuffix();
        java.lang.String str43 = relativeDateFormat30.getPositivePrefix();
        relativeDateFormat30.setMinuteSuffix("\u221e");
        int int46 = objectList1.indexOf((java.lang.Object) relativeDateFormat30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "s" + "'", str42, "s");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(128);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        boolean boolean3 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        java.lang.StringBuffer stringBuffer12 = logFormat8.format((-1L), stringBuffer10, fieldPosition11);
        logFormat8.setParseIntegerOnly(true);
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat8);
        java.util.TimeZone timeZone16 = relativeDateFormat0.getTimeZone();
        java.text.ParsePosition parsePosition18 = null;
        java.util.Date date19 = relativeDateFormat0.parse("LegendRenderingOrder.REVERSE", parsePosition18);
        boolean boolean20 = relativeDateFormat0.getShowZeroHours();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuffer12);
        org.junit.Assert.assertEquals(stringBuffer12.toString(), "NaN");
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNull(date19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        int int1 = objectList0.size();
        int int2 = objectList0.size();
        java.lang.Class<?> wildcardClass3 = objectList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        long long6 = relativeDateFormat2.getBaseMillis();
        java.lang.String str7 = relativeDateFormat2.getHourSuffix();
        relativeDateFormat2.setPositivePrefix("");
        java.lang.Object obj10 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat2);
        boolean boolean11 = objectList1.equals((java.lang.Object) relativeDateFormat2);
        relativeDateFormat2.setHourSuffix("h");
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat(10.0d, "", false);
        relativeDateFormat2.setSecondFormatter((java.text.NumberFormat) logFormat17);
        java.text.ParsePosition parsePosition20 = null;
        java.lang.Object obj21 = logFormat17.parseObject("1", parsePosition20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat10.setMinimumIntegerDigits(1);
        boolean boolean13 = logFormat10.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat19.format((-1L), stringBuffer21, fieldPosition22);
        java.text.FieldPosition fieldPosition24 = null;
        java.lang.StringBuffer stringBuffer25 = logFormat10.format((long) (short) 10, stringBuffer21, fieldPosition24);
        relativeDateFormat2.setHourFormatter((java.text.NumberFormat) logFormat10);
        java.lang.String str27 = relativeDateFormat2.getHourSuffix();
        boolean boolean28 = objectList1.equals((java.lang.Object) relativeDateFormat2);
        java.lang.Object obj29 = objectList1.clone();
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) 2147483647, (float) 'a');
        boolean boolean33 = objectList1.equals((java.lang.Object) 2147483647);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat10.setMinimumIntegerDigits(1);
        boolean boolean13 = logFormat10.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat19.format((-1L), stringBuffer21, fieldPosition22);
        java.text.FieldPosition fieldPosition24 = null;
        java.lang.StringBuffer stringBuffer25 = logFormat10.format((long) (short) 10, stringBuffer21, fieldPosition24);
        relativeDateFormat2.setHourFormatter((java.text.NumberFormat) logFormat10);
        java.lang.String str27 = relativeDateFormat2.getHourSuffix();
        boolean boolean28 = objectList1.equals((java.lang.Object) relativeDateFormat2);
        org.jfree.chart.util.PaintList paintList30 = new org.jfree.chart.util.PaintList();
        java.awt.Paint paint32 = null;
        paintList30.setPaint(16, paint32);
        java.awt.Paint paint35 = null;
        paintList30.setPaint((int) '#', paint35);
        java.awt.Paint paint38 = paintList30.getPaint((-1));
        objectList1.set(32, (java.lang.Object) (-1));
        int int40 = objectList1.size();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 33 + "'", int40 == 33);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 16, Double.NaN, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        java.lang.String str15 = logFormat4.format(0L);
        java.lang.Object obj16 = logFormat4.clone();
        java.lang.String str18 = logFormat4.format((java.lang.Object) (byte) -1);
        java.text.ParsePosition parsePosition20 = null;
        java.lang.Number number21 = logFormat4.parse("1.58", parsePosition20);
        logFormat4.setMaximumIntegerDigits(6);
        int int24 = logFormat4.getMinimumFractionDigits();
        java.lang.String str26 = logFormat4.format((double) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "34) test2174(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NaN" + "'", str18, "NaN");
        org.junit.Assert.assertNull(number21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0.0" + "'", str26, "0.0");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int9 = logFormat8.getMaximumFractionDigits();
        logFormat8.setGroupingUsed(true);
        logFormat8.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        java.lang.StringBuffer stringBuffer17 = logFormat8.format((java.lang.Object) 10, stringBuffer15, fieldPosition16);
        org.jfree.chart.util.LogFormat logFormat22 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat22.setMinimumIntegerDigits(1);
        logFormat22.setGroupingUsed(false);
        logFormat8.setExponentFormat((java.text.NumberFormat) logFormat22);
        java.lang.String str29 = logFormat8.format((double) 3);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat8);
        java.text.ParsePosition parsePosition32 = null;
        java.lang.Object obj33 = relativeDateFormat0.parseObject("-1", parsePosition32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0.66" + "'", str29, "0.66");
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.lang.Object obj8 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        relativeDateFormat0.setBaseMillis((long) 4);
        relativeDateFormat0.setShowZeroDays(false);
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        java.lang.StringBuffer stringBuffer21 = logFormat17.format((-1L), stringBuffer19, fieldPosition20);
        logFormat17.setParseIntegerOnly(true);
        boolean boolean24 = logFormat17.isGroupingUsed();
        org.jfree.chart.util.ObjectList objectList26 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj28 = objectList26.get((int) (short) 1);
        boolean boolean29 = logFormat17.equals((java.lang.Object) (short) 1);
        logFormat17.setMinimumIntegerDigits((int) (short) -1);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat17);
        relativeDateFormat0.setSecondSuffix("\24415.000000");
        java.lang.Object obj35 = relativeDateFormat0.clone();
        java.lang.String str36 = relativeDateFormat0.getHourSuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "h" + "'", str36, "h");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        java.awt.Paint paint6 = paintMap0.getPaint((java.lang.Comparable) "NaN");
        java.awt.Paint paint8 = null;
        paintMap0.put((java.lang.Comparable) ' ', paint8);
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat();
        logFormat10.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition14 = null;
        java.lang.Number number15 = logFormat10.parse("6.64", parsePosition14);
        java.text.ParsePosition parsePosition17 = null;
        java.lang.Number number18 = logFormat10.parse("", parsePosition17);
        boolean boolean19 = paintMap0.equals((java.lang.Object) logFormat10);
        java.text.NumberFormat numberFormat20 = logFormat10.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat25 = new org.jfree.chart.util.LogFormat((double) 0, "d", false);
        org.jfree.chart.PaintMap paintMap27 = new org.jfree.chart.PaintMap();
        paintMap27.clear();
        boolean boolean30 = paintMap27.containsKey((java.lang.Comparable) 0L);
        java.awt.Paint paint32 = null;
        paintMap27.put((java.lang.Comparable) "0.0", paint32);
        org.jfree.chart.util.LogFormat logFormat34 = new org.jfree.chart.util.LogFormat();
        logFormat34.setParseIntegerOnly(true);
        logFormat34.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat44 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat44.setMinimumIntegerDigits(1);
        boolean boolean47 = logFormat44.isGroupingUsed();
        logFormat44.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat50 = logFormat44.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat56 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int57 = logFormat56.getMaximumFractionDigits();
        logFormat56.setGroupingUsed(true);
        logFormat56.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer63 = null;
        java.text.FieldPosition fieldPosition64 = null;
        java.lang.StringBuffer stringBuffer65 = logFormat56.format((java.lang.Object) 10, stringBuffer63, fieldPosition64);
        java.text.FieldPosition fieldPosition66 = null;
        java.lang.StringBuffer stringBuffer67 = logFormat44.format(0.0d, stringBuffer65, fieldPosition66);
        java.text.FieldPosition fieldPosition68 = null;
        java.lang.StringBuffer stringBuffer69 = logFormat34.format((double) ' ', stringBuffer65, fieldPosition68);
        boolean boolean70 = paintMap27.containsKey((java.lang.Comparable) stringBuffer69);
        java.text.FieldPosition fieldPosition71 = null;
        java.lang.StringBuffer stringBuffer72 = logFormat25.format((long) 5, stringBuffer69, fieldPosition71);
        java.text.FieldPosition fieldPosition73 = null;
        java.lang.StringBuffer stringBuffer74 = logFormat10.format((double) 0.5f, stringBuffer72, fieldPosition73);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(numberFormat50);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(stringBuffer65);
        org.junit.Assert.assertEquals(stringBuffer65.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer67);
// flaky "35) test2177(RegressionTest4)":         org.junit.Assert.assertEquals(stringBuffer67.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer69);
        org.junit.Assert.assertEquals(stringBuffer69.toString(), "10^1.51");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(stringBuffer72);
        org.junit.Assert.assertEquals(stringBuffer72.toString(), "-0.0");
        org.junit.Assert.assertNotNull(stringBuffer74);
        org.junit.Assert.assertEquals(stringBuffer74.toString(), "10^-0.3");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat0.setShowZeroHours(false);
        relativeDateFormat0.setBaseMillis((long) 128);
        boolean boolean8 = relativeDateFormat0.getShowZeroHours();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        logFormat4.setGroupingUsed(false);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone10 = dateFormat9.getTimeZone();
        boolean boolean11 = logFormat4.equals((java.lang.Object) dateFormat9);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat13 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        long long14 = relativeDateFormat13.getBaseMillis();
        boolean boolean15 = relativeDateFormat13.getShowZeroDays();
        org.jfree.chart.util.LogFormat logFormat20 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat20.setMinimumIntegerDigits(1);
        boolean boolean23 = logFormat20.isGroupingUsed();
        logFormat20.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat26 = logFormat20.getExponentFormat();
        relativeDateFormat13.setDayFormatter(numberFormat26);
        boolean boolean28 = logFormat4.equals((java.lang.Object) relativeDateFormat13);
        java.text.NumberFormat numberFormat29 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean30 = numberFormat29.isParseIntegerOnly();
        boolean boolean31 = logFormat4.equals((java.lang.Object) boolean30);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        logFormat4.setGroupingUsed(false);
        java.lang.String str10 = logFormat4.format((double) 0);
        org.jfree.chart.util.ObjectList objectList12 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj14 = objectList12.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation16 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList12.set((int) (short) 1, (java.lang.Object) rotation16);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat18 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str19 = relativeDateFormat18.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat24.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat27 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone28 = dateFormat27.getTimeZone();
        boolean boolean29 = logFormat24.equals((java.lang.Object) timeZone28);
        relativeDateFormat18.setHourFormatter((java.text.NumberFormat) logFormat24);
        java.text.ParsePosition parsePosition32 = null;
        java.util.Date date33 = relativeDateFormat18.parse("hi!", parsePosition32);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat34 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str35 = relativeDateFormat34.getHourSuffix();
        java.lang.String str36 = relativeDateFormat34.getDaySuffix();
        boolean boolean37 = relativeDateFormat34.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat42 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer44 = null;
        java.text.FieldPosition fieldPosition45 = null;
        java.lang.StringBuffer stringBuffer46 = logFormat42.format((-1L), stringBuffer44, fieldPosition45);
        logFormat42.setParseIntegerOnly(true);
        relativeDateFormat34.setDayFormatter((java.text.NumberFormat) logFormat42);
        relativeDateFormat18.setSecondFormatter((java.text.NumberFormat) logFormat42);
        int int51 = objectList12.indexOf((java.lang.Object) relativeDateFormat18);
        java.lang.String str52 = logFormat4.format((java.lang.Object) int51);
        logFormat4.setMaximumFractionDigits(4);
        java.text.NumberFormat numberFormat55 = logFormat4.getExponentFormat();
        numberFormat55.setMaximumFractionDigits(0);
// flaky "36) test2180(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u221e" + "'", str10, "\u221e");
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + rotation16 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation16.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertNotNull(dateFormat27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(date33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "h" + "'", str35, "h");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "d" + "'", str36, "d");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(stringBuffer46);
        org.junit.Assert.assertEquals(stringBuffer46.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "NaN" + "'", str52, "NaN");
        org.junit.Assert.assertNotNull(numberFormat55);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        org.jfree.chart.PaintMap paintMap3 = new org.jfree.chart.PaintMap();
        java.lang.Object obj4 = paintMap3.clone();
        java.awt.Paint paint6 = null;
        paintMap3.put((java.lang.Comparable) '4', paint6);
        org.jfree.chart.util.ObjectList objectList9 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat10 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str11 = relativeDateFormat10.getHourSuffix();
        boolean boolean12 = relativeDateFormat10.getShowZeroHours();
        java.lang.String str13 = relativeDateFormat10.getMinuteSuffix();
        long long14 = relativeDateFormat10.getBaseMillis();
        java.lang.String str15 = relativeDateFormat10.getHourSuffix();
        relativeDateFormat10.setPositivePrefix("");
        java.lang.Object obj18 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat10);
        boolean boolean19 = objectList9.equals((java.lang.Object) relativeDateFormat10);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat20 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str21 = relativeDateFormat20.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat26.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat29 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone30 = dateFormat29.getTimeZone();
        boolean boolean31 = logFormat26.equals((java.lang.Object) timeZone30);
        relativeDateFormat20.setHourFormatter((java.text.NumberFormat) logFormat26);
        java.text.ParsePosition parsePosition34 = null;
        java.util.Date date35 = relativeDateFormat20.parse("hi!", parsePosition34);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat36 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str37 = relativeDateFormat36.getHourSuffix();
        java.lang.String str38 = relativeDateFormat36.getDaySuffix();
        boolean boolean39 = relativeDateFormat36.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat44 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer46 = null;
        java.text.FieldPosition fieldPosition47 = null;
        java.lang.StringBuffer stringBuffer48 = logFormat44.format((-1L), stringBuffer46, fieldPosition47);
        logFormat44.setParseIntegerOnly(true);
        relativeDateFormat36.setDayFormatter((java.text.NumberFormat) logFormat44);
        relativeDateFormat20.setSecondFormatter((java.text.NumberFormat) logFormat44);
        relativeDateFormat10.setHourFormatter((java.text.NumberFormat) logFormat44);
        boolean boolean54 = paintMap3.equals((java.lang.Object) logFormat44);
        boolean boolean55 = relativeDateFormat0.equals((java.lang.Object) paintMap3);
        boolean boolean56 = relativeDateFormat0.isLenient();
        relativeDateFormat0.setSecondSuffix("-0h0Rotation.CLOCKWISE0.001s");
        relativeDateFormat0.setBaseMillis(10L);
        java.util.TimeZone timeZone61 = relativeDateFormat0.getTimeZone();
        java.lang.String str62 = relativeDateFormat0.getPositivePrefix();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat63 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str64 = relativeDateFormat63.getHourSuffix();
        boolean boolean65 = relativeDateFormat63.getShowZeroHours();
        java.lang.String str66 = relativeDateFormat63.getMinuteSuffix();
        long long67 = relativeDateFormat63.getBaseMillis();
        java.lang.String str68 = relativeDateFormat63.getHourSuffix();
        relativeDateFormat63.setPositivePrefix("");
        java.text.ParsePosition parsePosition72 = null;
        java.util.Date date73 = relativeDateFormat63.parse("LegendRenderingOrder.STANDARD", parsePosition72);
        java.lang.String str74 = relativeDateFormat63.getMinuteSuffix();
        java.text.NumberFormat numberFormat75 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat75.setMinimumFractionDigits((int) '4');
        int int78 = numberFormat75.getMinimumIntegerDigits();
        relativeDateFormat63.setHourFormatter(numberFormat75);
        relativeDateFormat0.setMinuteFormatter(numberFormat75);
        java.text.NumberFormat numberFormat81 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean82 = numberFormat81.isGroupingUsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = relativeDateFormat0.format((java.lang.Object) numberFormat81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "m" + "'", str13, "m");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertNotNull(dateFormat29);
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(date35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "h" + "'", str37, "h");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "d" + "'", str38, "d");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(stringBuffer48);
        org.junit.Assert.assertEquals(stringBuffer48.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "h" + "'", str64, "h");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "m" + "'", str66, "m");
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "h" + "'", str68, "h");
        org.junit.Assert.assertNull(date73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "m" + "'", str74, "m");
        org.junit.Assert.assertNotNull(numberFormat75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNotNull(numberFormat81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) 36, (float) 4);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, rectangleAnchor3, (double) (byte) -1, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat8.setMinimumIntegerDigits(1);
        boolean boolean11 = logFormat8.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        java.lang.StringBuffer stringBuffer21 = logFormat17.format((-1L), stringBuffer19, fieldPosition20);
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat8.format((long) (short) 10, stringBuffer19, fieldPosition22);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat8);
        java.text.ParsePosition parsePosition26 = null;
        java.lang.Object obj27 = relativeDateFormat0.parseObject("Rotation.CLOCKWISE", parsePosition26);
        relativeDateFormat0.setSecondSuffix("SortOrder.DESCENDING");
        boolean boolean30 = relativeDateFormat0.isLenient();
        java.lang.String str31 = relativeDateFormat0.getDaySuffix();
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int37 = logFormat36.getMaximumFractionDigits();
        logFormat36.setGroupingUsed(true);
        logFormat36.setParseIntegerOnly(true);
        java.lang.String str43 = logFormat36.format((double) 0L);
        java.lang.String str45 = logFormat36.format((double) 32);
        java.lang.String str47 = logFormat36.format((long) 36);
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat36);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "d" + "'", str31, "d");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
// flaky "37) test2183(RegressionTest4)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u221e" + "'", str43, "\u221e");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "5.0" + "'", str45, "5.0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "5.17" + "'", str47, "5.17");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) 5, paint3);
        org.jfree.chart.util.ObjectList objectList6 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj8 = objectList6.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation10 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList6.set((int) (short) 1, (java.lang.Object) rotation10);
        java.lang.String str12 = rotation10.toString();
        java.awt.Paint paint13 = null;
        paintMap0.put((java.lang.Comparable) str12, paint13);
        java.awt.Paint paint16 = paintMap0.getPaint((java.lang.Comparable) "hi!");
        org.jfree.chart.util.ObjectList objectList18 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj20 = objectList18.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation22 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList18.set((int) (short) 1, (java.lang.Object) rotation22);
        java.lang.String str24 = rotation22.toString();
        java.awt.Paint paint25 = paintMap0.getPaint((java.lang.Comparable) str24);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + rotation10 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation10.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Rotation.CLOCKWISE" + "'", str12, "Rotation.CLOCKWISE");
        org.junit.Assert.assertNull(paint16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + rotation22 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation22.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Rotation.CLOCKWISE" + "'", str24, "Rotation.CLOCKWISE");
        org.junit.Assert.assertNull(paint25);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        logFormat4.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat10 = logFormat4.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat16 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int17 = logFormat16.getMaximumFractionDigits();
        logFormat16.setGroupingUsed(true);
        logFormat16.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        java.lang.StringBuffer stringBuffer25 = logFormat16.format((java.lang.Object) 10, stringBuffer23, fieldPosition24);
        java.text.FieldPosition fieldPosition26 = null;
        java.lang.StringBuffer stringBuffer27 = logFormat4.format(0.0d, stringBuffer25, fieldPosition26);
        int int28 = logFormat4.getMinimumIntegerDigits();
        logFormat4.setMaximumFractionDigits(40);
        java.text.ParsePosition parsePosition32 = null;
        java.lang.Object obj33 = logFormat4.parseObject("Rotation.CLOCKWISE", parsePosition32);
        int int34 = logFormat4.getMinimumIntegerDigits();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer27);
// flaky "38) test2185(RegressionTest4)":         org.junit.Assert.assertEquals(stringBuffer27.toString(), "\u221e");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, (double) 16, (double) 2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.rotateShape(shape1, (double) 10L, (float) '#', (float) 32);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, (double) (short) 0, (double) (byte) 0);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (short) -1, (float) (-1L));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) 2147483647, (float) (short) 1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.STANDARD;
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList();
        java.lang.Object obj2 = objectList1.clone();
        boolean boolean3 = legendRenderingOrder0.equals(obj2);
        java.lang.String str4 = legendRenderingOrder0.toString();
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int10 = logFormat9.getMaximumFractionDigits();
        logFormat9.setGroupingUsed(true);
        logFormat9.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        java.lang.StringBuffer stringBuffer18 = logFormat9.format((java.lang.Object) 10, stringBuffer16, fieldPosition17);
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat23.setMinimumIntegerDigits(1);
        logFormat23.setGroupingUsed(false);
        logFormat9.setExponentFormat((java.text.NumberFormat) logFormat23);
        logFormat23.setMaximumFractionDigits(4);
        java.text.AttributedCharacterIterator attributedCharacterIterator32 = logFormat23.formatToCharacterIterator((java.lang.Object) 10L);
        java.text.ParsePosition parsePosition34 = null;
        java.lang.Object obj35 = logFormat23.parseObject("Rotation.ANTICLOCKWISE", parsePosition34);
        boolean boolean36 = legendRenderingOrder0.equals((java.lang.Object) logFormat23);
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str4, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(stringBuffer18);
        org.junit.Assert.assertEquals(stringBuffer18.toString(), "3.32");
        org.junit.Assert.assertNotNull(attributedCharacterIterator32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat(8L);
    }
}
