import org.junit.FixMethodOrder;
// import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTestZero {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList2 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean3 = legendRenderingOrder0.equals((java.lang.Object) objectList2);
        org.jfree.chart.util.ObjectList objectList5 = new org.jfree.chart.util.ObjectList(6);
        boolean boolean6 = objectList2.equals((java.lang.Object) objectList5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on objectList2 and objectList5", objectList2.equals(objectList5) ? objectList2.hashCode() == objectList5.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
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
        org.jfree.chart.util.LogFormat logFormat57 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat57.setMinimumIntegerDigits(1);
        boolean boolean60 = logFormat57.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat66 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer68 = null;
        java.text.FieldPosition fieldPosition69 = null;
        java.lang.StringBuffer stringBuffer70 = logFormat66.format((-1L), stringBuffer68, fieldPosition69);
        java.text.FieldPosition fieldPosition71 = null;
        java.lang.StringBuffer stringBuffer72 = logFormat57.format((long) (short) 10, stringBuffer68, fieldPosition71);
        org.jfree.chart.util.LogFormat logFormat77 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int78 = logFormat77.getMaximumFractionDigits();
        logFormat77.setGroupingUsed(true);
        logFormat77.setGroupingUsed(false);
        logFormat77.setMaximumIntegerDigits((-1));
        logFormat57.setExponentFormat((java.text.NumberFormat) logFormat77);
        java.text.NumberFormat numberFormat86 = logFormat57.getExponentFormat();
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat57);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer33 and stringBuffer70", (stringBuffer33.compareTo(stringBuffer70) == 0) == stringBuffer33.equals(stringBuffer70));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
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
        java.lang.String str25 = relativeDateFormat0.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat30 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat30.setMinimumIntegerDigits(1);
        boolean boolean33 = logFormat30.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat39 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer41 = null;
        java.text.FieldPosition fieldPosition42 = null;
        java.lang.StringBuffer stringBuffer43 = logFormat39.format((-1L), stringBuffer41, fieldPosition42);
        java.text.FieldPosition fieldPosition44 = null;
        java.lang.StringBuffer stringBuffer45 = logFormat30.format((long) (short) 10, stringBuffer41, fieldPosition44);
        org.jfree.chart.util.LogFormat logFormat50 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int51 = logFormat50.getMaximumFractionDigits();
        logFormat50.setGroupingUsed(true);
        logFormat50.setGroupingUsed(false);
        logFormat50.setMaximumIntegerDigits((-1));
        logFormat30.setExponentFormat((java.text.NumberFormat) logFormat50);
        java.text.NumberFormat numberFormat59 = logFormat30.getExponentFormat();
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer21 and stringBuffer43", (stringBuffer21.compareTo(stringBuffer43) == 0) == stringBuffer21.equals(stringBuffer43));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
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
        org.jfree.chart.util.LogFormat logFormat30 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat30.setMinimumIntegerDigits(1);
        boolean boolean33 = logFormat30.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat39 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer41 = null;
        java.text.FieldPosition fieldPosition42 = null;
        java.lang.StringBuffer stringBuffer43 = logFormat39.format((-1L), stringBuffer41, fieldPosition42);
        java.text.FieldPosition fieldPosition44 = null;
        java.lang.StringBuffer stringBuffer45 = logFormat30.format((long) (short) 10, stringBuffer41, fieldPosition44);
        org.jfree.chart.util.LogFormat logFormat50 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int51 = logFormat50.getMaximumFractionDigits();
        logFormat50.setGroupingUsed(true);
        logFormat50.setGroupingUsed(false);
        logFormat50.setMaximumIntegerDigits((-1));
        logFormat30.setExponentFormat((java.text.NumberFormat) logFormat50);
        java.text.ParsePosition parsePosition60 = null;
        java.lang.Number number61 = logFormat30.parse("hi!", parsePosition60);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat30);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer21 and stringBuffer43", (stringBuffer21.compareTo(stringBuffer43) == 0) == stringBuffer21.equals(stringBuffer43));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat40.setMinimumIntegerDigits(1);
        boolean boolean43 = logFormat40.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat49 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int50 = logFormat49.getMaximumFractionDigits();
        logFormat49.setGroupingUsed(true);
        logFormat49.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer56 = null;
        java.text.FieldPosition fieldPosition57 = null;
        java.lang.StringBuffer stringBuffer58 = logFormat49.format((java.lang.Object) 10, stringBuffer56, fieldPosition57);
        java.text.FieldPosition fieldPosition59 = null;
        java.lang.StringBuffer stringBuffer60 = logFormat40.format((double) 2, stringBuffer56, fieldPosition59);
        boolean boolean61 = logFormat4.equals((java.lang.Object) stringBuffer60);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer19 and stringBuffer58", (stringBuffer19.compareTo(stringBuffer58) == 0) == stringBuffer19.equals(stringBuffer58));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
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
        org.jfree.chart.util.LogFormat logFormat33 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat33.setMinimumIntegerDigits(1);
        boolean boolean36 = logFormat33.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat42 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer44 = null;
        java.text.FieldPosition fieldPosition45 = null;
        java.lang.StringBuffer stringBuffer46 = logFormat42.format((-1L), stringBuffer44, fieldPosition45);
        java.text.FieldPosition fieldPosition47 = null;
        java.lang.StringBuffer stringBuffer48 = logFormat33.format((long) (short) 10, stringBuffer44, fieldPosition47);
        java.text.FieldPosition fieldPosition49 = null;
        java.lang.StringBuffer stringBuffer50 = logFormat12.format((double) 1L, stringBuffer44, fieldPosition49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer21 and stringBuffer48", (stringBuffer21.compareTo(stringBuffer48) == 0) == stringBuffer21.equals(stringBuffer48));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        org.jfree.chart.util.ObjectList objectList6 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat7 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str8 = relativeDateFormat7.getHourSuffix();
        boolean boolean9 = relativeDateFormat7.getShowZeroHours();
        java.lang.String str10 = relativeDateFormat7.getMinuteSuffix();
        long long11 = relativeDateFormat7.getBaseMillis();
        java.lang.String str12 = relativeDateFormat7.getHourSuffix();
        relativeDateFormat7.setPositivePrefix("");
        java.lang.Object obj15 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat7);
        boolean boolean16 = objectList6.equals((java.lang.Object) relativeDateFormat7);
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat33 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str34 = relativeDateFormat33.getHourSuffix();
        java.lang.String str35 = relativeDateFormat33.getDaySuffix();
        boolean boolean36 = relativeDateFormat33.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat41 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer43 = null;
        java.text.FieldPosition fieldPosition44 = null;
        java.lang.StringBuffer stringBuffer45 = logFormat41.format((-1L), stringBuffer43, fieldPosition44);
        logFormat41.setParseIntegerOnly(true);
        relativeDateFormat33.setDayFormatter((java.text.NumberFormat) logFormat41);
        relativeDateFormat17.setSecondFormatter((java.text.NumberFormat) logFormat41);
        relativeDateFormat7.setHourFormatter((java.text.NumberFormat) logFormat41);
        boolean boolean51 = paintMap0.equals((java.lang.Object) logFormat41);
        org.jfree.chart.PaintMap paintMap52 = new org.jfree.chart.PaintMap();
        java.lang.Object obj53 = paintMap52.clone();
        java.awt.Paint paint55 = null;
        paintMap52.put((java.lang.Comparable) '4', paint55);
        java.awt.Paint paint58 = paintMap52.getPaint((java.lang.Comparable) "NaN");
        boolean boolean59 = paintMap0.equals((java.lang.Object) paint58);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and paintMap52", paintMap0.equals(paintMap52) ? paintMap0.hashCode() == paintMap52.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
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
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int25 = logFormat24.getMaximumFractionDigits();
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat24);
        org.jfree.chart.util.LogFormat logFormat32 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat32.setMinimumIntegerDigits(1);
        boolean boolean35 = logFormat32.isGroupingUsed();
        logFormat32.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat38 = logFormat32.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat44 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int45 = logFormat44.getMaximumFractionDigits();
        logFormat44.setGroupingUsed(true);
        logFormat44.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer51 = null;
        java.text.FieldPosition fieldPosition52 = null;
        java.lang.StringBuffer stringBuffer53 = logFormat44.format((java.lang.Object) 10, stringBuffer51, fieldPosition52);
        java.text.FieldPosition fieldPosition54 = null;
        java.lang.StringBuffer stringBuffer55 = logFormat32.format(0.0d, stringBuffer53, fieldPosition54);
        java.text.FieldPosition fieldPosition56 = null;
        java.lang.StringBuffer stringBuffer57 = logFormat24.format((long) 12, stringBuffer55, fieldPosition56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer13 and stringBuffer53", (stringBuffer13.compareTo(stringBuffer53) == 0) == stringBuffer13.equals(stringBuffer53));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
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
        logFormat8.setGroupingUsed(false);
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat26.setMinimumIntegerDigits(1);
        boolean boolean29 = logFormat26.isGroupingUsed();
        logFormat26.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat32 = logFormat26.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int39 = logFormat38.getMaximumFractionDigits();
        logFormat38.setGroupingUsed(true);
        logFormat38.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer45 = null;
        java.text.FieldPosition fieldPosition46 = null;
        java.lang.StringBuffer stringBuffer47 = logFormat38.format((java.lang.Object) 10, stringBuffer45, fieldPosition46);
        java.text.FieldPosition fieldPosition48 = null;
        java.lang.StringBuffer stringBuffer49 = logFormat26.format(0.0d, stringBuffer47, fieldPosition48);
        java.text.FieldPosition fieldPosition50 = null;
        java.lang.StringBuffer stringBuffer51 = logFormat8.format((double) (byte) 10, stringBuffer49, fieldPosition50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer17 and stringBuffer47", (stringBuffer17.compareTo(stringBuffer47) == 0) == stringBuffer17.equals(stringBuffer47));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat9.format((-1L), stringBuffer11, fieldPosition12);
        boolean boolean14 = paintMap0.containsKey((java.lang.Comparable) (-1L));
        paintMap0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        java.lang.Object obj1 = objectList0.clone();
        java.lang.Object obj3 = objectList0.get(3);
        int int4 = objectList0.size();
        objectList0.set(16, (java.lang.Object) 13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList0 and obj1.", objectList0.equals(obj1) == obj1.equals(objectList0));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) (byte) 10);
        boolean boolean3 = paintMap0.equals((java.lang.Object) (byte) 10);
        org.jfree.chart.PaintMap paintMap4 = new org.jfree.chart.PaintMap();
        java.lang.Object obj5 = paintMap4.clone();
        java.awt.Paint paint7 = null;
        paintMap4.put((java.lang.Comparable) '4', paint7);
        boolean boolean9 = paintMap0.equals((java.lang.Object) paintMap4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj5", paintMap0.equals(obj5) ? paintMap0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
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
        logFormat8.setMaximumFractionDigits(13);
        org.jfree.chart.util.LogFormat logFormat27 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat27.setMinimumIntegerDigits(1);
        boolean boolean30 = logFormat27.isGroupingUsed();
        logFormat27.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat33 = logFormat27.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat39 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int40 = logFormat39.getMaximumFractionDigits();
        logFormat39.setGroupingUsed(true);
        logFormat39.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer46 = null;
        java.text.FieldPosition fieldPosition47 = null;
        java.lang.StringBuffer stringBuffer48 = logFormat39.format((java.lang.Object) 10, stringBuffer46, fieldPosition47);
        java.text.FieldPosition fieldPosition49 = null;
        java.lang.StringBuffer stringBuffer50 = logFormat27.format(0.0d, stringBuffer48, fieldPosition49);
        java.text.FieldPosition fieldPosition51 = null;
        java.lang.StringBuffer stringBuffer52 = logFormat8.format((long) 'a', stringBuffer50, fieldPosition51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer17 and stringBuffer48", (stringBuffer17.compareTo(stringBuffer48) == 0) == stringBuffer17.equals(stringBuffer48));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        org.jfree.chart.util.LogFormat logFormat62 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer64 = null;
        java.text.FieldPosition fieldPosition65 = null;
        java.lang.StringBuffer stringBuffer66 = logFormat62.format((-1L), stringBuffer64, fieldPosition65);
        java.text.FieldPosition fieldPosition67 = null;
        java.lang.StringBuffer stringBuffer68 = logFormat45.format(100L, stringBuffer64, fieldPosition67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer49 and stringBuffer66", (stringBuffer49.compareTo(stringBuffer66) == 0) == stringBuffer49.equals(stringBuffer66));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        paintMap0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
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
        boolean boolean52 = relativeDateFormat0.getShowZeroHours();
        relativeDateFormat0.setHourSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat59 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int60 = logFormat59.getMaximumFractionDigits();
        logFormat59.setGroupingUsed(true);
        logFormat59.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer66 = null;
        java.text.FieldPosition fieldPosition67 = null;
        java.lang.StringBuffer stringBuffer68 = logFormat59.format((java.lang.Object) 10, stringBuffer66, fieldPosition67);
        java.lang.String str70 = logFormat59.format(0L);
        logFormat59.setMinimumIntegerDigits((int) ' ');
        java.lang.String str74 = logFormat59.format((double) (byte) 1);
        java.text.ParsePosition parsePosition76 = null;
        java.lang.Number number77 = logFormat59.parse("LegendRenderingOrder.REVERSE", parsePosition76);
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat59);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer35 and stringBuffer68", (stringBuffer35.compareTo(stringBuffer68) == 0) == stringBuffer35.equals(stringBuffer68));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        org.jfree.chart.util.LogFormat logFormat55 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat55.setMinimumIntegerDigits(1);
        boolean boolean58 = logFormat55.isGroupingUsed();
        boolean boolean59 = logFormat55.isGroupingUsed();
        boolean boolean60 = logFormat7.equals((java.lang.Object) logFormat55);
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder61 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList63 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean64 = legendRenderingOrder61.equals((java.lang.Object) objectList63);
        org.jfree.chart.util.LogFormat logFormat69 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer71 = null;
        java.text.FieldPosition fieldPosition72 = null;
        java.lang.StringBuffer stringBuffer73 = logFormat69.format((-1L), stringBuffer71, fieldPosition72);
        org.jfree.chart.util.LogFormat logFormat78 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        logFormat69.setExponentFormat((java.text.NumberFormat) logFormat78);
        boolean boolean80 = legendRenderingOrder61.equals((java.lang.Object) logFormat78);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat81 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str82 = relativeDateFormat81.getHourSuffix();
        boolean boolean83 = relativeDateFormat81.getShowZeroHours();
        boolean boolean84 = relativeDateFormat81.getShowZeroHours();
        java.util.TimeZone timeZone85 = relativeDateFormat81.getTimeZone();
        boolean boolean86 = legendRenderingOrder61.equals((java.lang.Object) relativeDateFormat81);
        boolean boolean87 = logFormat7.equals((java.lang.Object) legendRenderingOrder61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer33 and stringBuffer73", (stringBuffer33.compareTo(stringBuffer73) == 0) == stringBuffer33.equals(stringBuffer73));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        java.lang.String str15 = logFormat4.format(0L);
        logFormat4.setMinimumIntegerDigits((int) ' ');
        java.lang.String str19 = logFormat4.format((double) (byte) 1);
        java.text.ParsePosition parsePosition21 = null;
        java.lang.Number number22 = logFormat4.parse("LegendRenderingOrder.REVERSE", parsePosition21);
        org.jfree.chart.util.ObjectList objectList25 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj26 = objectList25.clone();
        java.lang.Object obj27 = objectList25.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat28 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str29 = relativeDateFormat28.getHourSuffix();
        boolean boolean30 = relativeDateFormat28.getShowZeroHours();
        java.lang.String str31 = relativeDateFormat28.getMinuteSuffix();
        long long32 = relativeDateFormat28.getBaseMillis();
        java.lang.String str33 = relativeDateFormat28.getHourSuffix();
        relativeDateFormat28.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int41 = logFormat40.getMaximumFractionDigits();
        logFormat40.setGroupingUsed(true);
        logFormat40.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer47 = null;
        java.text.FieldPosition fieldPosition48 = null;
        java.lang.StringBuffer stringBuffer49 = logFormat40.format((java.lang.Object) 10, stringBuffer47, fieldPosition48);
        java.lang.String str51 = logFormat40.format(0L);
        java.lang.Object obj52 = logFormat40.clone();
        java.lang.String str54 = logFormat40.format((java.lang.Object) (byte) -1);
        relativeDateFormat28.setNumberFormat((java.text.NumberFormat) logFormat40);
        int int56 = objectList25.indexOf((java.lang.Object) logFormat40);
        java.lang.StringBuffer stringBuffer58 = null;
        java.text.FieldPosition fieldPosition59 = null;
        java.lang.StringBuffer stringBuffer60 = logFormat40.format((java.lang.Object) (short) -1, stringBuffer58, fieldPosition59);
        java.text.FieldPosition fieldPosition61 = null;
        java.lang.StringBuffer stringBuffer62 = logFormat4.format((double) 7, stringBuffer58, fieldPosition61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer13 and stringBuffer49", (stringBuffer13.compareTo(stringBuffer49) == 0) == stringBuffer13.equals(stringBuffer49));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        org.jfree.chart.util.LogFormat logFormat54 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int55 = logFormat54.getMaximumFractionDigits();
        logFormat54.setGroupingUsed(true);
        logFormat54.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer61 = null;
        java.text.FieldPosition fieldPosition62 = null;
        java.lang.StringBuffer stringBuffer63 = logFormat54.format((java.lang.Object) 10, stringBuffer61, fieldPosition62);
        java.lang.String str65 = logFormat54.format(0L);
        java.lang.StringBuffer stringBuffer67 = null;
        java.text.FieldPosition fieldPosition68 = null;
        java.lang.StringBuffer stringBuffer69 = logFormat54.format(1L, stringBuffer67, fieldPosition68);
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer32 and stringBuffer63", (stringBuffer32.compareTo(stringBuffer63) == 0) == stringBuffer32.equals(stringBuffer63));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        org.jfree.chart.util.LogFormat logFormat55 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat55.setMinimumIntegerDigits(1);
        boolean boolean58 = logFormat55.isGroupingUsed();
        logFormat55.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat61 = logFormat55.getExponentFormat();
        relativeDateFormat0.setDayFormatter(numberFormat61);
        org.jfree.chart.util.LogFormat logFormat67 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int68 = logFormat67.getMaximumFractionDigits();
        logFormat67.setGroupingUsed(true);
        logFormat67.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer74 = null;
        java.text.FieldPosition fieldPosition75 = null;
        java.lang.StringBuffer stringBuffer76 = logFormat67.format((java.lang.Object) 10, stringBuffer74, fieldPosition75);
        java.lang.String str78 = logFormat67.format(0L);
        java.lang.Object obj79 = logFormat67.clone();
        java.lang.String str81 = logFormat67.format((double) (byte) 0);
        boolean boolean82 = logFormat67.isParseIntegerOnly();
        logFormat67.setParseIntegerOnly(true);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer35 and stringBuffer76", (stringBuffer35.compareTo(stringBuffer76) == 0) == stringBuffer35.equals(stringBuffer76));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
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
        int int30 = objectList1.size();
        java.lang.Object obj32 = objectList1.get(4);
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat38.setMinimumIntegerDigits(1);
        boolean boolean41 = logFormat38.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat47 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int48 = logFormat47.getMaximumFractionDigits();
        logFormat47.setGroupingUsed(true);
        logFormat47.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer54 = null;
        java.text.FieldPosition fieldPosition55 = null;
        java.lang.StringBuffer stringBuffer56 = logFormat47.format((java.lang.Object) 10, stringBuffer54, fieldPosition55);
        java.text.FieldPosition fieldPosition57 = null;
        java.lang.StringBuffer stringBuffer58 = logFormat38.format((double) 2, stringBuffer54, fieldPosition57);
        objectList1.set(3, (java.lang.Object) stringBuffer54);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer25 and stringBuffer56", (stringBuffer25.compareTo(stringBuffer56) == 0) == stringBuffer25.equals(stringBuffer56));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        int int30 = objectList1.size();
        java.lang.Object obj32 = objectList1.get(4);
        org.jfree.chart.PaintMap paintMap34 = new org.jfree.chart.PaintMap();
        java.lang.Object obj35 = paintMap34.clone();
        java.awt.Paint paint37 = null;
        paintMap34.put((java.lang.Comparable) (byte) 1, paint37);
        objectList1.set(100, (java.lang.Object) paintMap34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and obj29.", objectList1.equals(obj29) == obj29.equals(objectList1));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        java.awt.Paint paint6 = paintMap0.getPaint((java.lang.Comparable) "NaN");
        org.jfree.chart.PaintMap paintMap7 = new org.jfree.chart.PaintMap();
        paintMap7.clear();
        java.awt.Paint paint10 = paintMap7.getPaint((java.lang.Comparable) true);
        org.jfree.chart.util.LogFormat logFormat11 = new org.jfree.chart.util.LogFormat();
        logFormat11.setParseIntegerOnly(true);
        logFormat11.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat21 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat21.setMinimumIntegerDigits(1);
        boolean boolean24 = logFormat21.isGroupingUsed();
        logFormat21.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat27 = logFormat21.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat33 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int34 = logFormat33.getMaximumFractionDigits();
        logFormat33.setGroupingUsed(true);
        logFormat33.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer40 = null;
        java.text.FieldPosition fieldPosition41 = null;
        java.lang.StringBuffer stringBuffer42 = logFormat33.format((java.lang.Object) 10, stringBuffer40, fieldPosition41);
        java.text.FieldPosition fieldPosition43 = null;
        java.lang.StringBuffer stringBuffer44 = logFormat21.format(0.0d, stringBuffer42, fieldPosition43);
        java.text.FieldPosition fieldPosition45 = null;
        java.lang.StringBuffer stringBuffer46 = logFormat11.format((double) ' ', stringBuffer42, fieldPosition45);
        java.awt.Paint paint47 = paintMap7.getPaint((java.lang.Comparable) stringBuffer42);
        boolean boolean48 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) paint6, (java.lang.Object) paint47);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and paintMap7", obj1.equals(paintMap7) ? obj1.hashCode() == paintMap7.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int25 = logFormat24.getMaximumFractionDigits();
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat24);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat28 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        relativeDateFormat28.setShowZeroDays(false);
        relativeDateFormat28.setMinuteSuffix("6.64");
        org.jfree.chart.util.LogFormat logFormat37 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat37.setMinimumIntegerDigits(1);
        boolean boolean40 = logFormat37.isGroupingUsed();
        logFormat37.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat43 = logFormat37.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat49 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int50 = logFormat49.getMaximumFractionDigits();
        logFormat49.setGroupingUsed(true);
        logFormat49.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer56 = null;
        java.text.FieldPosition fieldPosition57 = null;
        java.lang.StringBuffer stringBuffer58 = logFormat49.format((java.lang.Object) 10, stringBuffer56, fieldPosition57);
        java.text.FieldPosition fieldPosition59 = null;
        java.lang.StringBuffer stringBuffer60 = logFormat37.format(0.0d, stringBuffer58, fieldPosition59);
        int int61 = logFormat37.getMinimumFractionDigits();
        relativeDateFormat28.setNumberFormat((java.text.NumberFormat) logFormat37);
        boolean boolean63 = logFormat24.equals((java.lang.Object) logFormat37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer13 and stringBuffer58", (stringBuffer13.compareTo(stringBuffer58) == 0) == stringBuffer13.equals(stringBuffer58));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        boolean boolean3 = paintMap0.containsKey((java.lang.Comparable) 16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        logFormat4.setGroupingUsed(false);
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat28 = new org.jfree.chart.util.LogFormat();
        logFormat28.setParseIntegerOnly(true);
        logFormat28.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat38.setMinimumIntegerDigits(1);
        boolean boolean41 = logFormat38.isGroupingUsed();
        logFormat38.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat44 = logFormat38.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat50 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int51 = logFormat50.getMaximumFractionDigits();
        logFormat50.setGroupingUsed(true);
        logFormat50.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer57 = null;
        java.text.FieldPosition fieldPosition58 = null;
        java.lang.StringBuffer stringBuffer59 = logFormat50.format((java.lang.Object) 10, stringBuffer57, fieldPosition58);
        java.text.FieldPosition fieldPosition60 = null;
        java.lang.StringBuffer stringBuffer61 = logFormat38.format(0.0d, stringBuffer59, fieldPosition60);
        java.text.FieldPosition fieldPosition62 = null;
        java.lang.StringBuffer stringBuffer63 = logFormat28.format((double) ' ', stringBuffer59, fieldPosition62);
        java.text.FieldPosition fieldPosition64 = null;
        java.lang.StringBuffer stringBuffer65 = logFormat26.format((-1.0d), stringBuffer59, fieldPosition64);
        java.text.FieldPosition fieldPosition66 = null;
        java.lang.StringBuffer stringBuffer67 = logFormat4.format((double) 11, stringBuffer65, fieldPosition66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer13 and stringBuffer59", (stringBuffer13.compareTo(stringBuffer59) == 0) == stringBuffer13.equals(stringBuffer59));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        int int1 = paintList0.size();
        java.awt.Paint paint3 = null;
        paintList0.setPaint((int) (short) 0, paint3);
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int10 = logFormat9.getMaximumFractionDigits();
        logFormat9.setGroupingUsed(true);
        logFormat9.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        java.lang.StringBuffer stringBuffer18 = logFormat9.format((java.lang.Object) 10, stringBuffer16, fieldPosition17);
        java.lang.String str20 = logFormat9.format(0L);
        java.lang.Object obj21 = logFormat9.clone();
        java.lang.String str23 = logFormat9.format((java.lang.Object) (byte) -1);
        logFormat9.setGroupingUsed(false);
        boolean boolean26 = paintList0.equals((java.lang.Object) false);
        java.lang.Object obj27 = paintList0.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat28 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str29 = relativeDateFormat28.getHourSuffix();
        boolean boolean30 = relativeDateFormat28.getShowZeroHours();
        java.lang.String str31 = relativeDateFormat28.getMinuteSuffix();
        long long32 = relativeDateFormat28.getBaseMillis();
        java.lang.String str33 = relativeDateFormat28.getHourSuffix();
        relativeDateFormat28.setPositivePrefix("");
        java.lang.Object obj36 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat28);
        relativeDateFormat28.setSecondSuffix("\u221e");
        org.jfree.chart.util.LogFormat logFormat43 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int44 = logFormat43.getMaximumFractionDigits();
        logFormat43.setGroupingUsed(true);
        logFormat43.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer50 = null;
        java.text.FieldPosition fieldPosition51 = null;
        java.lang.StringBuffer stringBuffer52 = logFormat43.format((java.lang.Object) 10, stringBuffer50, fieldPosition51);
        org.jfree.chart.util.LogFormat logFormat57 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat57.setMinimumIntegerDigits(1);
        logFormat57.setGroupingUsed(false);
        logFormat43.setExponentFormat((java.text.NumberFormat) logFormat57);
        int int63 = logFormat57.getMinimumIntegerDigits();
        relativeDateFormat28.setMinuteFormatter((java.text.NumberFormat) logFormat57);
        boolean boolean65 = paintList0.equals((java.lang.Object) relativeDateFormat28);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer18 and stringBuffer52", (stringBuffer18.compareTo(stringBuffer52) == 0) == stringBuffer18.equals(stringBuffer52));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        org.jfree.chart.util.PaintList paintList12 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.PaintMap paintMap13 = new org.jfree.chart.PaintMap();
        paintMap13.clear();
        java.awt.Paint paint16 = paintMap13.getPaint((java.lang.Comparable) true);
        boolean boolean17 = paintList12.equals((java.lang.Object) paintMap13);
        java.awt.Paint paint19 = paintList12.getPaint((int) 'a');
        int int20 = objectList1.indexOf((java.lang.Object) paint19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and paintList12.", objectList1.equals(paintList12) == paintList12.equals(objectList1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat9.format((-1L), stringBuffer11, fieldPosition12);
        boolean boolean14 = paintMap0.containsKey((java.lang.Comparable) (-1L));
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat19.setMinimumIntegerDigits(1);
        boolean boolean22 = logFormat19.isGroupingUsed();
        logFormat19.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat25 = logFormat19.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int32 = logFormat31.getMaximumFractionDigits();
        logFormat31.setGroupingUsed(true);
        logFormat31.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer38 = null;
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat31.format((java.lang.Object) 10, stringBuffer38, fieldPosition39);
        java.text.FieldPosition fieldPosition41 = null;
        java.lang.StringBuffer stringBuffer42 = logFormat19.format(0.0d, stringBuffer40, fieldPosition41);
        java.awt.Paint paint43 = null;
        paintMap0.put((java.lang.Comparable) stringBuffer42, paint43);
        paintMap0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        org.jfree.chart.util.LogFormat logFormat44 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat44.setMinimumIntegerDigits(1);
        boolean boolean47 = logFormat44.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat53 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer55 = null;
        java.text.FieldPosition fieldPosition56 = null;
        java.lang.StringBuffer stringBuffer57 = logFormat53.format((-1L), stringBuffer55, fieldPosition56);
        java.text.FieldPosition fieldPosition58 = null;
        java.lang.StringBuffer stringBuffer59 = logFormat44.format((long) (short) 10, stringBuffer55, fieldPosition58);
        org.jfree.chart.util.LogFormat logFormat64 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int65 = logFormat64.getMaximumFractionDigits();
        logFormat64.setGroupingUsed(true);
        logFormat64.setGroupingUsed(false);
        logFormat64.setMaximumIntegerDigits((-1));
        logFormat44.setExponentFormat((java.text.NumberFormat) logFormat64);
        java.text.NumberFormat numberFormat73 = logFormat44.getExponentFormat();
        relativeDateFormat2.setHourFormatter(numberFormat73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer23 and stringBuffer57", (stringBuffer23.compareTo(stringBuffer57) == 0) == stringBuffer23.equals(stringBuffer57));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
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
        org.jfree.chart.util.LogFormat logFormat55 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat55.setMinimumIntegerDigits(1);
        boolean boolean58 = logFormat55.isGroupingUsed();
        boolean boolean59 = logFormat55.isGroupingUsed();
        boolean boolean60 = logFormat7.equals((java.lang.Object) logFormat55);
        logFormat55.setMinimumFractionDigits((int) (byte) 100);
        int int63 = logFormat55.getMaximumFractionDigits();
        org.jfree.chart.util.LogFormat logFormat69 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat69.setMinimumIntegerDigits(1);
        boolean boolean72 = logFormat69.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat78 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer80 = null;
        java.text.FieldPosition fieldPosition81 = null;
        java.lang.StringBuffer stringBuffer82 = logFormat78.format((-1L), stringBuffer80, fieldPosition81);
        java.text.FieldPosition fieldPosition83 = null;
        java.lang.StringBuffer stringBuffer84 = logFormat69.format((long) (short) 10, stringBuffer80, fieldPosition83);
        java.text.FieldPosition fieldPosition85 = null;
        java.lang.StringBuffer stringBuffer86 = logFormat55.format((long) 11, stringBuffer80, fieldPosition85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer33 and stringBuffer82", (stringBuffer33.compareTo(stringBuffer82) == 0) == stringBuffer33.equals(stringBuffer82));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean1 = relativeDateFormat0.isLenient();
        org.jfree.chart.util.LogFormat logFormat6 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int7 = logFormat6.getMaximumFractionDigits();
        logFormat6.setGroupingUsed(true);
        logFormat6.setParseIntegerOnly(true);
        java.lang.String str13 = logFormat6.format((double) 0L);
        org.jfree.chart.util.LogFormat logFormat18 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat20 = new org.jfree.chart.util.LogFormat();
        logFormat20.setParseIntegerOnly(true);
        logFormat20.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat30 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat30.setMinimumIntegerDigits(1);
        boolean boolean33 = logFormat30.isGroupingUsed();
        logFormat30.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat36 = logFormat30.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat42 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int43 = logFormat42.getMaximumFractionDigits();
        logFormat42.setGroupingUsed(true);
        logFormat42.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer49 = null;
        java.text.FieldPosition fieldPosition50 = null;
        java.lang.StringBuffer stringBuffer51 = logFormat42.format((java.lang.Object) 10, stringBuffer49, fieldPosition50);
        java.text.FieldPosition fieldPosition52 = null;
        java.lang.StringBuffer stringBuffer53 = logFormat30.format(0.0d, stringBuffer51, fieldPosition52);
        java.text.FieldPosition fieldPosition54 = null;
        java.lang.StringBuffer stringBuffer55 = logFormat20.format((double) ' ', stringBuffer51, fieldPosition54);
        java.text.FieldPosition fieldPosition56 = null;
        java.lang.StringBuffer stringBuffer57 = logFormat18.format((-1.0d), stringBuffer51, fieldPosition56);
        java.text.FieldPosition fieldPosition58 = null;
        java.lang.StringBuffer stringBuffer59 = relativeDateFormat0.format((java.lang.Object) 0L, stringBuffer57, fieldPosition58);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat60 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str61 = relativeDateFormat60.getHourSuffix();
        boolean boolean62 = relativeDateFormat60.getShowZeroHours();
        java.lang.String str63 = relativeDateFormat60.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat68 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat68.setMinimumIntegerDigits(1);
        boolean boolean71 = logFormat68.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat77 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer79 = null;
        java.text.FieldPosition fieldPosition80 = null;
        java.lang.StringBuffer stringBuffer81 = logFormat77.format((-1L), stringBuffer79, fieldPosition80);
        java.text.FieldPosition fieldPosition82 = null;
        java.lang.StringBuffer stringBuffer83 = logFormat68.format((long) (short) 10, stringBuffer79, fieldPosition82);
        relativeDateFormat60.setHourFormatter((java.text.NumberFormat) logFormat68);
        relativeDateFormat60.setPositivePrefix("Rotation.CLOCKWISE");
        java.util.Calendar calendar87 = relativeDateFormat60.getCalendar();
        relativeDateFormat0.setCalendar(calendar87);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer51 and stringBuffer83", (stringBuffer51.compareTo(stringBuffer83) == 0) == stringBuffer51.equals(stringBuffer83));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        logFormat24.setMinimumIntegerDigits((int) (short) 100);
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat();
        logFormat36.setParseIntegerOnly(true);
        logFormat36.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat46 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat46.setMinimumIntegerDigits(1);
        boolean boolean49 = logFormat46.isGroupingUsed();
        logFormat46.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat52 = logFormat46.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat58 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int59 = logFormat58.getMaximumFractionDigits();
        logFormat58.setGroupingUsed(true);
        logFormat58.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer65 = null;
        java.text.FieldPosition fieldPosition66 = null;
        java.lang.StringBuffer stringBuffer67 = logFormat58.format((java.lang.Object) 10, stringBuffer65, fieldPosition66);
        java.text.FieldPosition fieldPosition68 = null;
        java.lang.StringBuffer stringBuffer69 = logFormat46.format(0.0d, stringBuffer67, fieldPosition68);
        java.text.FieldPosition fieldPosition70 = null;
        java.lang.StringBuffer stringBuffer71 = logFormat36.format((double) ' ', stringBuffer67, fieldPosition70);
        java.text.FieldPosition fieldPosition72 = null;
        java.lang.StringBuffer stringBuffer73 = logFormat24.format(10.0d, stringBuffer71, fieldPosition72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer19 and stringBuffer67", (stringBuffer19.compareTo(stringBuffer67) == 0) == stringBuffer19.equals(stringBuffer67));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat9.format((-1L), stringBuffer11, fieldPosition12);
        boolean boolean14 = paintMap0.containsKey((java.lang.Comparable) (-1L));
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat19.setMinimumIntegerDigits(1);
        boolean boolean22 = logFormat19.isGroupingUsed();
        logFormat19.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat25 = logFormat19.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int32 = logFormat31.getMaximumFractionDigits();
        logFormat31.setGroupingUsed(true);
        logFormat31.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer38 = null;
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat31.format((java.lang.Object) 10, stringBuffer38, fieldPosition39);
        java.text.FieldPosition fieldPosition41 = null;
        java.lang.StringBuffer stringBuffer42 = logFormat19.format(0.0d, stringBuffer40, fieldPosition41);
        java.awt.Paint paint43 = null;
        paintMap0.put((java.lang.Comparable) stringBuffer42, paint43);
        java.awt.Paint paint46 = paintMap0.getPaint((java.lang.Comparable) "m");
        boolean boolean48 = paintMap0.containsKey((java.lang.Comparable) 16);
        paintMap0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        int int1 = paintList0.size();
        java.awt.Paint paint3 = null;
        paintList0.setPaint((int) (short) 0, paint3);
        boolean boolean6 = paintList0.equals((java.lang.Object) 100.0d);
        org.jfree.chart.util.ObjectList objectList8 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat9 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str10 = relativeDateFormat9.getHourSuffix();
        boolean boolean11 = relativeDateFormat9.getShowZeroHours();
        java.lang.String str12 = relativeDateFormat9.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat17.setMinimumIntegerDigits(1);
        boolean boolean20 = logFormat17.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer28 = null;
        java.text.FieldPosition fieldPosition29 = null;
        java.lang.StringBuffer stringBuffer30 = logFormat26.format((-1L), stringBuffer28, fieldPosition29);
        java.text.FieldPosition fieldPosition31 = null;
        java.lang.StringBuffer stringBuffer32 = logFormat17.format((long) (short) 10, stringBuffer28, fieldPosition31);
        relativeDateFormat9.setHourFormatter((java.text.NumberFormat) logFormat17);
        java.lang.String str34 = relativeDateFormat9.getHourSuffix();
        boolean boolean35 = objectList8.equals((java.lang.Object) relativeDateFormat9);
        java.lang.Object obj36 = objectList8.clone();
        int int37 = objectList8.size();
        java.lang.Object obj38 = objectList8.clone();
        boolean boolean39 = paintList0.equals(obj38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on paintList0 and objectList8.", paintList0.equals(objectList8) == objectList8.equals(paintList0));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        org.jfree.chart.PaintMap paintMap27 = new org.jfree.chart.PaintMap();
        java.lang.Object obj28 = paintMap27.clone();
        java.awt.Paint paint30 = null;
        paintMap27.put((java.lang.Comparable) '4', paint30);
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer38 = null;
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat36.format((-1L), stringBuffer38, fieldPosition39);
        boolean boolean41 = paintMap27.containsKey((java.lang.Comparable) (-1L));
        org.jfree.chart.util.LogFormat logFormat46 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat46.setMinimumIntegerDigits(1);
        boolean boolean49 = logFormat46.isGroupingUsed();
        logFormat46.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat52 = logFormat46.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat58 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int59 = logFormat58.getMaximumFractionDigits();
        logFormat58.setGroupingUsed(true);
        logFormat58.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer65 = null;
        java.text.FieldPosition fieldPosition66 = null;
        java.lang.StringBuffer stringBuffer67 = logFormat58.format((java.lang.Object) 10, stringBuffer65, fieldPosition66);
        java.text.FieldPosition fieldPosition68 = null;
        java.lang.StringBuffer stringBuffer69 = logFormat46.format(0.0d, stringBuffer67, fieldPosition68);
        java.awt.Paint paint70 = null;
        paintMap27.put((java.lang.Comparable) stringBuffer69, paint70);
        java.text.FieldPosition fieldPosition72 = null;
        java.lang.StringBuffer stringBuffer73 = logFormat18.format((double) 14, stringBuffer69, fieldPosition72);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer13 and stringBuffer67", (stringBuffer13.compareTo(stringBuffer67) == 0) == stringBuffer13.equals(stringBuffer67));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat29.setMinimumIntegerDigits(1);
        boolean boolean32 = logFormat29.isGroupingUsed();
        logFormat29.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat35 = logFormat29.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat41 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int42 = logFormat41.getMaximumFractionDigits();
        logFormat41.setGroupingUsed(true);
        logFormat41.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer48 = null;
        java.text.FieldPosition fieldPosition49 = null;
        java.lang.StringBuffer stringBuffer50 = logFormat41.format((java.lang.Object) 10, stringBuffer48, fieldPosition49);
        java.text.FieldPosition fieldPosition51 = null;
        java.lang.StringBuffer stringBuffer52 = logFormat29.format(0.0d, stringBuffer50, fieldPosition51);
        java.text.AttributedCharacterIterator attributedCharacterIterator53 = relativeDateFormat0.formatToCharacterIterator((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer23 and stringBuffer50", (stringBuffer23.compareTo(stringBuffer50) == 0) == stringBuffer23.equals(stringBuffer50));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        boolean boolean10 = logFormat5.equals((java.lang.Object) timeZone9);
        boolean boolean11 = paintList0.equals((java.lang.Object) logFormat5);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat12 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str13 = relativeDateFormat12.getHourSuffix();
        boolean boolean14 = relativeDateFormat12.getShowZeroHours();
        java.lang.String str15 = relativeDateFormat12.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat20 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat20.setMinimumIntegerDigits(1);
        boolean boolean23 = logFormat20.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer31 = null;
        java.text.FieldPosition fieldPosition32 = null;
        java.lang.StringBuffer stringBuffer33 = logFormat29.format((-1L), stringBuffer31, fieldPosition32);
        java.text.FieldPosition fieldPosition34 = null;
        java.lang.StringBuffer stringBuffer35 = logFormat20.format((long) (short) 10, stringBuffer31, fieldPosition34);
        relativeDateFormat12.setHourFormatter((java.text.NumberFormat) logFormat20);
        boolean boolean37 = paintList0.equals((java.lang.Object) logFormat20);
        org.jfree.chart.util.ObjectList objectList38 = new org.jfree.chart.util.ObjectList();
        java.lang.Object obj39 = objectList38.clone();
        objectList38.clear();
        org.jfree.chart.util.LogFormat logFormat45 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int46 = logFormat45.getMaximumFractionDigits();
        logFormat45.setGroupingUsed(true);
        logFormat45.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer52 = null;
        java.text.FieldPosition fieldPosition53 = null;
        java.lang.StringBuffer stringBuffer54 = logFormat45.format((java.lang.Object) 10, stringBuffer52, fieldPosition53);
        java.lang.String str56 = logFormat45.format(0L);
        java.lang.StringBuffer stringBuffer58 = null;
        java.text.FieldPosition fieldPosition59 = null;
        java.lang.StringBuffer stringBuffer60 = logFormat45.format(1L, stringBuffer58, fieldPosition59);
        int int61 = objectList38.indexOf((java.lang.Object) logFormat45);
        boolean boolean62 = logFormat20.equals((java.lang.Object) logFormat45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on paintList0 and objectList38.", paintList0.equals(objectList38) == objectList38.equals(paintList0));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
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
        boolean boolean33 = relativeDateFormat32.isLenient();
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int39 = logFormat38.getMaximumFractionDigits();
        logFormat38.setGroupingUsed(true);
        logFormat38.setParseIntegerOnly(true);
        java.lang.String str45 = logFormat38.format((double) 0L);
        org.jfree.chart.util.LogFormat logFormat50 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat52 = new org.jfree.chart.util.LogFormat();
        logFormat52.setParseIntegerOnly(true);
        logFormat52.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat62 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat62.setMinimumIntegerDigits(1);
        boolean boolean65 = logFormat62.isGroupingUsed();
        logFormat62.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat68 = logFormat62.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat74 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int75 = logFormat74.getMaximumFractionDigits();
        logFormat74.setGroupingUsed(true);
        logFormat74.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer81 = null;
        java.text.FieldPosition fieldPosition82 = null;
        java.lang.StringBuffer stringBuffer83 = logFormat74.format((java.lang.Object) 10, stringBuffer81, fieldPosition82);
        java.text.FieldPosition fieldPosition84 = null;
        java.lang.StringBuffer stringBuffer85 = logFormat62.format(0.0d, stringBuffer83, fieldPosition84);
        java.text.FieldPosition fieldPosition86 = null;
        java.lang.StringBuffer stringBuffer87 = logFormat52.format((double) ' ', stringBuffer83, fieldPosition86);
        java.text.FieldPosition fieldPosition88 = null;
        java.lang.StringBuffer stringBuffer89 = logFormat50.format((-1.0d), stringBuffer83, fieldPosition88);
        java.text.FieldPosition fieldPosition90 = null;
        java.lang.StringBuffer stringBuffer91 = relativeDateFormat32.format((java.lang.Object) 0L, stringBuffer89, fieldPosition90);
        java.awt.Paint paint92 = paintMap0.getPaint((java.lang.Comparable) stringBuffer89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer24 and stringBuffer83", (stringBuffer24.compareTo(stringBuffer83) == 0) == stringBuffer24.equals(stringBuffer83));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
        int int34 = logFormat33.getMaximumFractionDigits();
        logFormat33.setGroupingUsed(true);
        logFormat33.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition40 = null;
        java.lang.Object obj41 = logFormat33.parseObject("", parsePosition40);
        org.jfree.chart.util.LogFormat logFormat46 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat46.setMinimumIntegerDigits(1);
        boolean boolean49 = logFormat46.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat55 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer57 = null;
        java.text.FieldPosition fieldPosition58 = null;
        java.lang.StringBuffer stringBuffer59 = logFormat55.format((-1L), stringBuffer57, fieldPosition58);
        java.text.FieldPosition fieldPosition60 = null;
        java.lang.StringBuffer stringBuffer61 = logFormat46.format((long) (short) 10, stringBuffer57, fieldPosition60);
        org.jfree.chart.util.LogFormat logFormat66 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int67 = logFormat66.getMaximumFractionDigits();
        logFormat66.setGroupingUsed(true);
        logFormat66.setGroupingUsed(false);
        logFormat66.setMaximumIntegerDigits((-1));
        logFormat46.setExponentFormat((java.text.NumberFormat) logFormat66);
        boolean boolean75 = logFormat33.equals((java.lang.Object) logFormat46);
        java.text.ParsePosition parsePosition77 = null;
        java.lang.Object obj78 = logFormat33.parseObject("1.58", parsePosition77);
        int int79 = logFormat33.getMaximumFractionDigits();
        relativeDateFormat2.setSecondFormatter((java.text.NumberFormat) logFormat33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer23 and stringBuffer59", (stringBuffer23.compareTo(stringBuffer59) == 0) == stringBuffer23.equals(stringBuffer59));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        org.jfree.chart.util.LogFormat logFormat6 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int7 = logFormat6.getMaximumFractionDigits();
        logFormat6.setGroupingUsed(true);
        logFormat6.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        java.lang.StringBuffer stringBuffer15 = logFormat6.format((java.lang.Object) 10, stringBuffer13, fieldPosition14);
        java.lang.String str17 = logFormat6.format(0L);
        java.lang.Object obj18 = logFormat6.clone();
        java.lang.String str20 = logFormat6.format((java.lang.Object) (byte) -1);
        java.text.ParsePosition parsePosition22 = null;
        java.lang.Number number23 = logFormat6.parse("1.58", parsePosition22);
        logFormat6.setMaximumIntegerDigits(6);
        boolean boolean26 = paintMap0.equals((java.lang.Object) logFormat6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        org.jfree.chart.util.ObjectList objectList29 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat30 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str31 = relativeDateFormat30.getHourSuffix();
        boolean boolean32 = relativeDateFormat30.getShowZeroHours();
        java.lang.String str33 = relativeDateFormat30.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat38.setMinimumIntegerDigits(1);
        boolean boolean41 = logFormat38.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat47 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer49 = null;
        java.text.FieldPosition fieldPosition50 = null;
        java.lang.StringBuffer stringBuffer51 = logFormat47.format((-1L), stringBuffer49, fieldPosition50);
        java.text.FieldPosition fieldPosition52 = null;
        java.lang.StringBuffer stringBuffer53 = logFormat38.format((long) (short) 10, stringBuffer49, fieldPosition52);
        relativeDateFormat30.setHourFormatter((java.text.NumberFormat) logFormat38);
        java.lang.String str55 = relativeDateFormat30.getHourSuffix();
        boolean boolean56 = objectList29.equals((java.lang.Object) relativeDateFormat30);
        org.jfree.chart.util.LogFormat logFormat61 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat61.setMinimumIntegerDigits(1);
        logFormat61.setGroupingUsed(false);
        relativeDateFormat30.setMinuteFormatter((java.text.NumberFormat) logFormat61);
        java.lang.String str67 = relativeDateFormat30.getDaySuffix();
        java.text.NumberFormat numberFormat68 = relativeDateFormat30.getNumberFormat();
        logFormat7.setExponentFormat(numberFormat68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer16 and stringBuffer53", (stringBuffer16.compareTo(stringBuffer53) == 0) == stringBuffer16.equals(stringBuffer53));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        org.jfree.chart.util.LogFormat logFormat25 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int26 = logFormat25.getMaximumFractionDigits();
        logFormat25.setGroupingUsed(true);
        logFormat25.setGroupingUsed(false);
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat();
        logFormat38.setParseIntegerOnly(true);
        logFormat38.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat48 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat48.setMinimumIntegerDigits(1);
        boolean boolean51 = logFormat48.isGroupingUsed();
        logFormat48.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat54 = logFormat48.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat60 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int61 = logFormat60.getMaximumFractionDigits();
        logFormat60.setGroupingUsed(true);
        logFormat60.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer67 = null;
        java.text.FieldPosition fieldPosition68 = null;
        java.lang.StringBuffer stringBuffer69 = logFormat60.format((java.lang.Object) 10, stringBuffer67, fieldPosition68);
        java.text.FieldPosition fieldPosition70 = null;
        java.lang.StringBuffer stringBuffer71 = logFormat48.format(0.0d, stringBuffer69, fieldPosition70);
        java.text.FieldPosition fieldPosition72 = null;
        java.lang.StringBuffer stringBuffer73 = logFormat38.format((double) ' ', stringBuffer69, fieldPosition72);
        java.text.FieldPosition fieldPosition74 = null;
        java.lang.StringBuffer stringBuffer75 = logFormat36.format((-1.0d), stringBuffer69, fieldPosition74);
        java.text.FieldPosition fieldPosition76 = null;
        java.lang.StringBuffer stringBuffer77 = logFormat25.format((double) (-1.0f), stringBuffer75, fieldPosition76);
        java.text.FieldPosition fieldPosition78 = null;
        java.lang.StringBuffer stringBuffer79 = logFormat4.format((double) (short) 1, stringBuffer77, fieldPosition78);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer13 and stringBuffer69", (stringBuffer13.compareTo(stringBuffer69) == 0) == stringBuffer13.equals(stringBuffer69));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        int int29 = logFormat4.getMaximumFractionDigits();
        int int30 = logFormat4.getMinimumIntegerDigits();
        org.jfree.chart.util.LogFormat logFormat35 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int36 = logFormat35.getMaximumFractionDigits();
        logFormat35.setGroupingUsed(true);
        logFormat35.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer42 = null;
        java.text.FieldPosition fieldPosition43 = null;
        java.lang.StringBuffer stringBuffer44 = logFormat35.format((java.lang.Object) 10, stringBuffer42, fieldPosition43);
        org.jfree.chart.util.LogFormat logFormat49 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat49.setMinimumIntegerDigits(1);
        logFormat49.setGroupingUsed(false);
        logFormat35.setExponentFormat((java.text.NumberFormat) logFormat49);
        java.text.NumberFormat numberFormat55 = java.text.NumberFormat.getCompactNumberInstance();
        logFormat49.setExponentFormat(numberFormat55);
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat49);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer25 and stringBuffer44", (stringBuffer25.compareTo(stringBuffer44) == 0) == stringBuffer25.equals(stringBuffer44));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        java.awt.Paint paint5 = null;
        paintList0.setPaint(11, paint5);
        java.lang.Object obj7 = paintList0.clone();
        java.lang.Object obj8 = null;
        boolean boolean9 = paintList0.equals(obj8);
        java.awt.Paint paint11 = paintList0.getPaint(1);
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder12 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList14 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean15 = legendRenderingOrder12.equals((java.lang.Object) objectList14);
        org.jfree.chart.util.LogFormat logFormat20 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        java.lang.StringBuffer stringBuffer24 = logFormat20.format((-1L), stringBuffer22, fieldPosition23);
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        logFormat20.setExponentFormat((java.text.NumberFormat) logFormat29);
        boolean boolean31 = legendRenderingOrder12.equals((java.lang.Object) logFormat29);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat32 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str33 = relativeDateFormat32.getHourSuffix();
        boolean boolean34 = relativeDateFormat32.getShowZeroHours();
        boolean boolean35 = relativeDateFormat32.getShowZeroHours();
        java.util.TimeZone timeZone36 = relativeDateFormat32.getTimeZone();
        boolean boolean37 = legendRenderingOrder12.equals((java.lang.Object) relativeDateFormat32);
        relativeDateFormat32.setDaySuffix("\24414.00");
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
        relativeDateFormat32.setNumberFormat((java.text.NumberFormat) logFormat44);
        boolean boolean69 = paintList0.equals((java.lang.Object) logFormat44);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on paintList0 and objectList14.", paintList0.equals(objectList14) == objectList14.equals(paintList0));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
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
        org.jfree.chart.PaintMap paintMap20 = new org.jfree.chart.PaintMap();
        boolean boolean22 = paintMap20.containsKey((java.lang.Comparable) (short) 10);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat23 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str24 = relativeDateFormat23.getHourSuffix();
        boolean boolean25 = relativeDateFormat23.getShowZeroHours();
        java.lang.String str26 = relativeDateFormat23.getMinuteSuffix();
        long long27 = relativeDateFormat23.getBaseMillis();
        java.lang.String str28 = relativeDateFormat23.getHourSuffix();
        relativeDateFormat23.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat35 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int36 = logFormat35.getMaximumFractionDigits();
        logFormat35.setGroupingUsed(true);
        logFormat35.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer42 = null;
        java.text.FieldPosition fieldPosition43 = null;
        java.lang.StringBuffer stringBuffer44 = logFormat35.format((java.lang.Object) 10, stringBuffer42, fieldPosition43);
        java.lang.String str46 = logFormat35.format(0L);
        java.lang.Object obj47 = logFormat35.clone();
        java.lang.String str49 = logFormat35.format((java.lang.Object) (byte) -1);
        relativeDateFormat23.setNumberFormat((java.text.NumberFormat) logFormat35);
        boolean boolean51 = paintMap20.equals((java.lang.Object) relativeDateFormat23);
        boolean boolean52 = paintMap0.equals((java.lang.Object) relativeDateFormat23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on obj1 and paintMap20", obj1.equals(paintMap20) ? obj1.hashCode() == paintMap20.hashCode() : true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        logFormat4.setMinimumFractionDigits((int) (short) 1);
        boolean boolean50 = logFormat4.equals((java.lang.Object) 6);
        org.jfree.chart.PaintMap paintMap52 = new org.jfree.chart.PaintMap();
        java.lang.Object obj53 = paintMap52.clone();
        java.awt.Paint paint55 = null;
        paintMap52.put((java.lang.Comparable) '4', paint55);
        org.jfree.chart.util.LogFormat logFormat61 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer63 = null;
        java.text.FieldPosition fieldPosition64 = null;
        java.lang.StringBuffer stringBuffer65 = logFormat61.format((-1L), stringBuffer63, fieldPosition64);
        boolean boolean66 = paintMap52.containsKey((java.lang.Comparable) (-1L));
        org.jfree.chart.util.LogFormat logFormat71 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat71.setMinimumIntegerDigits(1);
        boolean boolean74 = logFormat71.isGroupingUsed();
        logFormat71.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat77 = logFormat71.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat83 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int84 = logFormat83.getMaximumFractionDigits();
        logFormat83.setGroupingUsed(true);
        logFormat83.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer90 = null;
        java.text.FieldPosition fieldPosition91 = null;
        java.lang.StringBuffer stringBuffer92 = logFormat83.format((java.lang.Object) 10, stringBuffer90, fieldPosition91);
        java.text.FieldPosition fieldPosition93 = null;
        java.lang.StringBuffer stringBuffer94 = logFormat71.format(0.0d, stringBuffer92, fieldPosition93);
        java.awt.Paint paint95 = null;
        paintMap52.put((java.lang.Comparable) stringBuffer94, paint95);
        java.text.FieldPosition fieldPosition97 = null;
        java.lang.StringBuffer stringBuffer98 = logFormat4.format((double) 100, stringBuffer94, fieldPosition97);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer30 and stringBuffer65", (stringBuffer30.compareTo(stringBuffer65) == 0) == stringBuffer30.equals(stringBuffer65));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        java.awt.Paint paint6 = paintMap0.getPaint((java.lang.Comparable) "NaN");
        java.awt.Paint paint8 = null;
        paintMap0.put((java.lang.Comparable) ' ', paint8);
        boolean boolean11 = paintMap0.containsKey((java.lang.Comparable) 4);
        paintMap0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        java.lang.Object obj4 = objectList1.clone();
        java.lang.Object obj6 = objectList1.get(100);
        org.jfree.chart.util.LogFormat logFormat11 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int12 = logFormat11.getMaximumFractionDigits();
        logFormat11.setGroupingUsed(true);
        logFormat11.setGroupingUsed(false);
        org.jfree.chart.util.LogFormat logFormat22 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat();
        logFormat24.setParseIntegerOnly(true);
        logFormat24.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat34 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat34.setMinimumIntegerDigits(1);
        boolean boolean37 = logFormat34.isGroupingUsed();
        logFormat34.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat40 = logFormat34.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat46 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int47 = logFormat46.getMaximumFractionDigits();
        logFormat46.setGroupingUsed(true);
        logFormat46.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer53 = null;
        java.text.FieldPosition fieldPosition54 = null;
        java.lang.StringBuffer stringBuffer55 = logFormat46.format((java.lang.Object) 10, stringBuffer53, fieldPosition54);
        java.text.FieldPosition fieldPosition56 = null;
        java.lang.StringBuffer stringBuffer57 = logFormat34.format(0.0d, stringBuffer55, fieldPosition56);
        java.text.FieldPosition fieldPosition58 = null;
        java.lang.StringBuffer stringBuffer59 = logFormat24.format((double) ' ', stringBuffer55, fieldPosition58);
        java.text.FieldPosition fieldPosition60 = null;
        java.lang.StringBuffer stringBuffer61 = logFormat22.format((-1.0d), stringBuffer55, fieldPosition60);
        java.text.FieldPosition fieldPosition62 = null;
        java.lang.StringBuffer stringBuffer63 = logFormat11.format((double) (-1.0f), stringBuffer61, fieldPosition62);
        boolean boolean64 = objectList1.equals((java.lang.Object) stringBuffer63);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer61 and stringBuffer63", (stringBuffer61.compareTo(stringBuffer63) == 0) == stringBuffer61.equals(stringBuffer63));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtils.createUpTriangle(1.0f);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtils.clone(shape34);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape35, (double) 100, (double) (short) 1);
        org.jfree.chart.util.ObjectList objectList40 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj41 = objectList40.clone();
        java.lang.Object obj42 = objectList40.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat43 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str44 = relativeDateFormat43.getHourSuffix();
        boolean boolean45 = relativeDateFormat43.getShowZeroHours();
        java.lang.String str46 = relativeDateFormat43.getMinuteSuffix();
        long long47 = relativeDateFormat43.getBaseMillis();
        java.lang.String str48 = relativeDateFormat43.getHourSuffix();
        relativeDateFormat43.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat55 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int56 = logFormat55.getMaximumFractionDigits();
        logFormat55.setGroupingUsed(true);
        logFormat55.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer62 = null;
        java.text.FieldPosition fieldPosition63 = null;
        java.lang.StringBuffer stringBuffer64 = logFormat55.format((java.lang.Object) 10, stringBuffer62, fieldPosition63);
        java.lang.String str66 = logFormat55.format(0L);
        java.lang.Object obj67 = logFormat55.clone();
        java.lang.String str69 = logFormat55.format((java.lang.Object) (byte) -1);
        relativeDateFormat43.setNumberFormat((java.text.NumberFormat) logFormat55);
        int int71 = objectList40.indexOf((java.lang.Object) logFormat55);
        java.lang.StringBuffer stringBuffer73 = null;
        java.text.FieldPosition fieldPosition74 = null;
        java.lang.StringBuffer stringBuffer75 = logFormat55.format((java.lang.Object) (short) -1, stringBuffer73, fieldPosition74);
        java.text.FieldPosition fieldPosition76 = null;
        java.lang.StringBuffer stringBuffer77 = logFormat4.format((java.lang.Object) 100, stringBuffer73, fieldPosition76);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer17 and stringBuffer75", (stringBuffer17.compareTo(stringBuffer75) == 0) == stringBuffer17.equals(stringBuffer75));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        java.lang.String str51 = relativeDateFormat0.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat56 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int57 = logFormat56.getMaximumFractionDigits();
        logFormat56.setGroupingUsed(true);
        logFormat56.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer63 = null;
        java.text.FieldPosition fieldPosition64 = null;
        java.lang.StringBuffer stringBuffer65 = logFormat56.format((java.lang.Object) 10, stringBuffer63, fieldPosition64);
        java.lang.String str67 = logFormat56.format(0L);
        logFormat56.setMinimumIntegerDigits((int) ' ');
        java.lang.String str71 = logFormat56.format((double) (byte) 1);
        java.text.ParsePosition parsePosition73 = null;
        java.lang.Number number74 = logFormat56.parse("LegendRenderingOrder.REVERSE", parsePosition73);
        java.text.ParsePosition parsePosition76 = null;
        java.lang.Number number77 = logFormat56.parse("", parsePosition76);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat56);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer35 and stringBuffer65", (stringBuffer35.compareTo(stringBuffer65) == 0) == stringBuffer35.equals(stringBuffer65));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj2 = objectList1.clone();
        java.lang.Object obj3 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) objectList1);
        org.jfree.chart.util.PaintList paintList4 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat9.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        boolean boolean14 = logFormat9.equals((java.lang.Object) timeZone13);
        boolean boolean15 = paintList4.equals((java.lang.Object) logFormat9);
        boolean boolean16 = objectList1.equals((java.lang.Object) logFormat9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and paintList4.", objectList1.equals(paintList4) == paintList4.equals(objectList1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        java.text.ParsePosition parsePosition21 = null;
        java.lang.Object obj22 = logFormat4.parseObject("1.58", parsePosition21);
        java.lang.String str24 = logFormat4.format((long) 16);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat26 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean27 = relativeDateFormat26.isLenient();
        org.jfree.chart.util.LogFormat logFormat32 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int33 = logFormat32.getMaximumFractionDigits();
        logFormat32.setGroupingUsed(true);
        logFormat32.setParseIntegerOnly(true);
        java.lang.String str39 = logFormat32.format((double) 0L);
        org.jfree.chart.util.LogFormat logFormat44 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat46 = new org.jfree.chart.util.LogFormat();
        logFormat46.setParseIntegerOnly(true);
        logFormat46.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat56 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat56.setMinimumIntegerDigits(1);
        boolean boolean59 = logFormat56.isGroupingUsed();
        logFormat56.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat62 = logFormat56.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat68 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int69 = logFormat68.getMaximumFractionDigits();
        logFormat68.setGroupingUsed(true);
        logFormat68.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer75 = null;
        java.text.FieldPosition fieldPosition76 = null;
        java.lang.StringBuffer stringBuffer77 = logFormat68.format((java.lang.Object) 10, stringBuffer75, fieldPosition76);
        java.text.FieldPosition fieldPosition78 = null;
        java.lang.StringBuffer stringBuffer79 = logFormat56.format(0.0d, stringBuffer77, fieldPosition78);
        java.text.FieldPosition fieldPosition80 = null;
        java.lang.StringBuffer stringBuffer81 = logFormat46.format((double) ' ', stringBuffer77, fieldPosition80);
        java.text.FieldPosition fieldPosition82 = null;
        java.lang.StringBuffer stringBuffer83 = logFormat44.format((-1.0d), stringBuffer77, fieldPosition82);
        java.text.FieldPosition fieldPosition84 = null;
        java.lang.StringBuffer stringBuffer85 = relativeDateFormat26.format((java.lang.Object) 0L, stringBuffer83, fieldPosition84);
        java.text.FieldPosition fieldPosition86 = null;
        java.lang.StringBuffer stringBuffer87 = logFormat4.format((double) (byte) 100, stringBuffer85, fieldPosition86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer13 and stringBuffer77", (stringBuffer13.compareTo(stringBuffer77) == 0) == stringBuffer13.equals(stringBuffer77));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        java.awt.Paint paint6 = paintMap0.getPaint((java.lang.Comparable) "NaN");
        boolean boolean8 = paintMap0.containsKey((java.lang.Comparable) 2);
        paintMap0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        java.lang.Object obj1 = objectList0.clone();
        java.lang.Object obj3 = objectList0.get(3);
        int int4 = objectList0.size();
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder6 = org.jfree.chart.LegendRenderingOrder.STANDARD;
        java.lang.String str7 = legendRenderingOrder6.toString();
        org.jfree.chart.PaintMap paintMap8 = new org.jfree.chart.PaintMap();
        java.lang.Object obj9 = paintMap8.clone();
        java.awt.Paint paint11 = null;
        paintMap8.put((java.lang.Comparable) '4', paint11);
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        java.lang.StringBuffer stringBuffer21 = logFormat17.format((-1L), stringBuffer19, fieldPosition20);
        boolean boolean22 = paintMap8.containsKey((java.lang.Comparable) (-1L));
        org.jfree.chart.util.LogFormat logFormat27 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat27.setMinimumIntegerDigits(1);
        boolean boolean30 = logFormat27.isGroupingUsed();
        logFormat27.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat33 = logFormat27.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat39 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int40 = logFormat39.getMaximumFractionDigits();
        logFormat39.setGroupingUsed(true);
        logFormat39.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer46 = null;
        java.text.FieldPosition fieldPosition47 = null;
        java.lang.StringBuffer stringBuffer48 = logFormat39.format((java.lang.Object) 10, stringBuffer46, fieldPosition47);
        java.text.FieldPosition fieldPosition49 = null;
        java.lang.StringBuffer stringBuffer50 = logFormat27.format(0.0d, stringBuffer48, fieldPosition49);
        java.awt.Paint paint51 = null;
        paintMap8.put((java.lang.Comparable) stringBuffer50, paint51);
        java.awt.Paint paint54 = paintMap8.getPaint((java.lang.Comparable) "m");
        boolean boolean55 = legendRenderingOrder6.equals((java.lang.Object) paintMap8);
        objectList0.set((int) '#', (java.lang.Object) paintMap8);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList0 and obj1.", objectList0.equals(obj1) == obj1.equals(objectList0));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj2 = objectList1.clone();
        java.lang.Object obj3 = objectList1.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat4.setPositivePrefix("\u221e");
        int int10 = objectList1.indexOf((java.lang.Object) relativeDateFormat4);
        org.jfree.chart.util.PaintList paintList11 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat12 = java.text.NumberFormat.getIntegerInstance();
        int int13 = numberFormat12.getMaximumIntegerDigits();
        boolean boolean14 = paintList11.equals((java.lang.Object) int13);
        java.awt.Paint paint16 = null;
        paintList11.setPaint(11, paint16);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat18 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str19 = relativeDateFormat18.getHourSuffix();
        java.lang.String str20 = relativeDateFormat18.getDaySuffix();
        relativeDateFormat18.setDaySuffix("");
        relativeDateFormat18.setMinuteSuffix("Rotation.CLOCKWISE");
        java.util.TimeZone timeZone25 = relativeDateFormat18.getTimeZone();
        java.lang.Object obj26 = relativeDateFormat18.clone();
        boolean boolean27 = relativeDateFormat18.getShowZeroHours();
        boolean boolean28 = paintList11.equals((java.lang.Object) boolean27);
        org.jfree.chart.util.LogFormat logFormat33 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int34 = logFormat33.getMaximumFractionDigits();
        logFormat33.setGroupingUsed(true);
        logFormat33.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer40 = null;
        java.text.FieldPosition fieldPosition41 = null;
        java.lang.StringBuffer stringBuffer42 = logFormat33.format((java.lang.Object) 10, stringBuffer40, fieldPosition41);
        java.lang.String str44 = logFormat33.format(0L);
        logFormat33.setMinimumIntegerDigits((int) ' ');
        java.lang.String str48 = logFormat33.format((double) (byte) 1);
        logFormat33.setMinimumIntegerDigits(100);
        boolean boolean51 = paintList11.equals((java.lang.Object) logFormat33);
        java.lang.Object obj52 = logFormat33.clone();
        java.text.NumberFormat numberFormat53 = logFormat33.getExponentFormat();
        int int54 = objectList1.indexOf((java.lang.Object) numberFormat53);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and paintList11.", objectList1.equals(paintList11) == paintList11.equals(objectList1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        java.lang.String str15 = logFormat4.format(0L);
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        java.lang.StringBuffer stringBuffer19 = logFormat4.format(1L, stringBuffer17, fieldPosition18);
        java.lang.String str21 = logFormat4.format((long) 16);
        org.jfree.chart.util.LogFormat logFormat27 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat();
        logFormat29.setParseIntegerOnly(true);
        logFormat29.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat39 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat39.setMinimumIntegerDigits(1);
        boolean boolean42 = logFormat39.isGroupingUsed();
        logFormat39.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat45 = logFormat39.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat51 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int52 = logFormat51.getMaximumFractionDigits();
        logFormat51.setGroupingUsed(true);
        logFormat51.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer58 = null;
        java.text.FieldPosition fieldPosition59 = null;
        java.lang.StringBuffer stringBuffer60 = logFormat51.format((java.lang.Object) 10, stringBuffer58, fieldPosition59);
        java.text.FieldPosition fieldPosition61 = null;
        java.lang.StringBuffer stringBuffer62 = logFormat39.format(0.0d, stringBuffer60, fieldPosition61);
        java.text.FieldPosition fieldPosition63 = null;
        java.lang.StringBuffer stringBuffer64 = logFormat29.format((double) ' ', stringBuffer60, fieldPosition63);
        java.text.FieldPosition fieldPosition65 = null;
        java.lang.StringBuffer stringBuffer66 = logFormat27.format((-1.0d), stringBuffer60, fieldPosition65);
        java.text.FieldPosition fieldPosition67 = null;
        java.lang.StringBuffer stringBuffer68 = logFormat4.format((double) 8, stringBuffer66, fieldPosition67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer13 and stringBuffer60", (stringBuffer13.compareTo(stringBuffer60) == 0) == stringBuffer13.equals(stringBuffer60));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        java.awt.Paint paint5 = null;
        paintList0.setPaint(11, paint5);
        java.lang.Object obj7 = paintList0.clone();
        java.awt.Paint paint9 = null;
        paintList0.setPaint(65, paint9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintList0 and obj7", paintList0.equals(obj7) ? paintList0.hashCode() == obj7.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        org.jfree.chart.util.ObjectList objectList6 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat7 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str8 = relativeDateFormat7.getHourSuffix();
        boolean boolean9 = relativeDateFormat7.getShowZeroHours();
        java.lang.String str10 = relativeDateFormat7.getMinuteSuffix();
        long long11 = relativeDateFormat7.getBaseMillis();
        java.lang.String str12 = relativeDateFormat7.getHourSuffix();
        relativeDateFormat7.setPositivePrefix("");
        java.lang.Object obj15 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat7);
        boolean boolean16 = objectList6.equals((java.lang.Object) relativeDateFormat7);
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat33 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str34 = relativeDateFormat33.getHourSuffix();
        java.lang.String str35 = relativeDateFormat33.getDaySuffix();
        boolean boolean36 = relativeDateFormat33.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat41 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer43 = null;
        java.text.FieldPosition fieldPosition44 = null;
        java.lang.StringBuffer stringBuffer45 = logFormat41.format((-1L), stringBuffer43, fieldPosition44);
        logFormat41.setParseIntegerOnly(true);
        relativeDateFormat33.setDayFormatter((java.text.NumberFormat) logFormat41);
        relativeDateFormat17.setSecondFormatter((java.text.NumberFormat) logFormat41);
        relativeDateFormat7.setHourFormatter((java.text.NumberFormat) logFormat41);
        boolean boolean51 = paintMap0.equals((java.lang.Object) logFormat41);
        java.text.DateFormat dateFormat52 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone54 = dateFormat53.getTimeZone();
        dateFormat52.setTimeZone(timeZone54);
        org.jfree.chart.util.LogFormat logFormat60 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int61 = logFormat60.getMaximumFractionDigits();
        logFormat60.setGroupingUsed(true);
        logFormat60.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer67 = null;
        java.text.FieldPosition fieldPosition68 = null;
        java.lang.StringBuffer stringBuffer69 = logFormat60.format((java.lang.Object) 10, stringBuffer67, fieldPosition68);
        dateFormat52.setNumberFormat((java.text.NumberFormat) logFormat60);
        boolean boolean71 = paintMap0.equals((java.lang.Object) logFormat60);
        org.jfree.chart.PaintMap paintMap72 = new org.jfree.chart.PaintMap();
        paintMap72.clear();
        java.awt.Paint paint75 = null;
        paintMap72.put((java.lang.Comparable) 5, paint75);
        org.jfree.chart.util.Rotation rotation77 = org.jfree.chart.util.Rotation.CLOCKWISE;
        java.awt.Paint paint78 = null;
        paintMap72.put((java.lang.Comparable) rotation77, paint78);
        java.awt.Paint paint80 = null;
        paintMap0.put((java.lang.Comparable) rotation77, paint80);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and paintMap72", paintMap0.equals(paintMap72) ? paintMap0.hashCode() == paintMap72.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        org.jfree.chart.util.ObjectList objectList6 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat7 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str8 = relativeDateFormat7.getHourSuffix();
        boolean boolean9 = relativeDateFormat7.getShowZeroHours();
        java.lang.String str10 = relativeDateFormat7.getMinuteSuffix();
        long long11 = relativeDateFormat7.getBaseMillis();
        java.lang.String str12 = relativeDateFormat7.getHourSuffix();
        relativeDateFormat7.setPositivePrefix("");
        java.lang.Object obj15 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat7);
        boolean boolean16 = objectList6.equals((java.lang.Object) relativeDateFormat7);
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat33 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str34 = relativeDateFormat33.getHourSuffix();
        java.lang.String str35 = relativeDateFormat33.getDaySuffix();
        boolean boolean36 = relativeDateFormat33.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat41 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer43 = null;
        java.text.FieldPosition fieldPosition44 = null;
        java.lang.StringBuffer stringBuffer45 = logFormat41.format((-1L), stringBuffer43, fieldPosition44);
        logFormat41.setParseIntegerOnly(true);
        relativeDateFormat33.setDayFormatter((java.text.NumberFormat) logFormat41);
        relativeDateFormat17.setSecondFormatter((java.text.NumberFormat) logFormat41);
        relativeDateFormat7.setHourFormatter((java.text.NumberFormat) logFormat41);
        boolean boolean51 = paintMap0.equals((java.lang.Object) logFormat41);
        paintMap0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        int int30 = objectList1.size();
        objectList1.clear();
        int int32 = objectList1.size();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat33 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str34 = relativeDateFormat33.getHourSuffix();
        java.lang.String str35 = relativeDateFormat33.getDaySuffix();
        relativeDateFormat33.setDaySuffix("");
        org.jfree.chart.util.LogFormat logFormat42 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int43 = logFormat42.getMaximumFractionDigits();
        logFormat42.setGroupingUsed(true);
        logFormat42.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer49 = null;
        java.text.FieldPosition fieldPosition50 = null;
        java.lang.StringBuffer stringBuffer51 = logFormat42.format((java.lang.Object) 10, stringBuffer49, fieldPosition50);
        java.lang.String str53 = logFormat42.format(0L);
        java.lang.Object obj54 = logFormat42.clone();
        java.lang.String str56 = logFormat42.format((java.lang.Object) (byte) -1);
        relativeDateFormat33.setHourFormatter((java.text.NumberFormat) logFormat42);
        relativeDateFormat33.setDaySuffix("LegendRenderingOrder.REVERSE");
        relativeDateFormat33.setSecondSuffix("");
        int int62 = objectList1.indexOf((java.lang.Object) relativeDateFormat33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer25 and stringBuffer51", (stringBuffer25.compareTo(stringBuffer51) == 0) == stringBuffer25.equals(stringBuffer51));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat9.format((-1L), stringBuffer11, fieldPosition12);
        boolean boolean14 = paintMap0.containsKey((java.lang.Comparable) (-1L));
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat19.setMinimumIntegerDigits(1);
        boolean boolean22 = logFormat19.isGroupingUsed();
        logFormat19.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat25 = logFormat19.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int32 = logFormat31.getMaximumFractionDigits();
        logFormat31.setGroupingUsed(true);
        logFormat31.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer38 = null;
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat31.format((java.lang.Object) 10, stringBuffer38, fieldPosition39);
        java.text.FieldPosition fieldPosition41 = null;
        java.lang.StringBuffer stringBuffer42 = logFormat19.format(0.0d, stringBuffer40, fieldPosition41);
        java.awt.Paint paint43 = null;
        paintMap0.put((java.lang.Comparable) stringBuffer42, paint43);
        java.awt.Paint paint46 = paintMap0.getPaint((java.lang.Comparable) "m");
        boolean boolean48 = paintMap0.containsKey((java.lang.Comparable) 16);
        java.lang.Object obj49 = paintMap0.clone();
        org.jfree.chart.util.LogFormat logFormat54 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat54.setMinimumIntegerDigits(1);
        boolean boolean57 = logFormat54.isGroupingUsed();
        logFormat54.setGroupingUsed(false);
        boolean boolean60 = paintMap0.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj49", paintMap0.equals(obj49) ? paintMap0.hashCode() == obj49.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.lang.Object obj2 = null;
        boolean boolean3 = paintMap0.equals(obj2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        org.jfree.chart.util.LogFormat logFormat55 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat55.setMinimumIntegerDigits(1);
        boolean boolean58 = logFormat55.isGroupingUsed();
        boolean boolean59 = logFormat55.isGroupingUsed();
        boolean boolean60 = logFormat7.equals((java.lang.Object) logFormat55);
        logFormat55.setMinimumFractionDigits((int) (byte) 100);
        org.jfree.chart.util.ObjectList objectList64 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj65 = objectList64.clone();
        java.lang.Object obj66 = objectList64.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat67 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str68 = relativeDateFormat67.getHourSuffix();
        boolean boolean69 = relativeDateFormat67.getShowZeroHours();
        java.lang.String str70 = relativeDateFormat67.getMinuteSuffix();
        long long71 = relativeDateFormat67.getBaseMillis();
        java.lang.String str72 = relativeDateFormat67.getHourSuffix();
        relativeDateFormat67.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat79 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int80 = logFormat79.getMaximumFractionDigits();
        logFormat79.setGroupingUsed(true);
        logFormat79.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer86 = null;
        java.text.FieldPosition fieldPosition87 = null;
        java.lang.StringBuffer stringBuffer88 = logFormat79.format((java.lang.Object) 10, stringBuffer86, fieldPosition87);
        java.lang.String str90 = logFormat79.format(0L);
        java.lang.Object obj91 = logFormat79.clone();
        java.lang.String str93 = logFormat79.format((java.lang.Object) (byte) -1);
        relativeDateFormat67.setNumberFormat((java.text.NumberFormat) logFormat79);
        int int95 = objectList64.indexOf((java.lang.Object) logFormat79);
        boolean boolean96 = logFormat55.equals((java.lang.Object) logFormat79);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer35 and stringBuffer88", (stringBuffer35.compareTo(stringBuffer88) == 0) == stringBuffer35.equals(stringBuffer88));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        boolean boolean3 = paintMap0.containsKey((java.lang.Comparable) 0L);
        java.lang.Object obj4 = paintMap0.clone();
        org.jfree.chart.util.SortOrder sortOrder5 = org.jfree.chart.util.SortOrder.ASCENDING;
        java.lang.String str6 = sortOrder5.toString();
        java.lang.String str7 = sortOrder5.toString();
        java.lang.String str8 = sortOrder5.toString();
        java.awt.Paint paint9 = paintMap0.getPaint((java.lang.Comparable) str8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj4", paintMap0.equals(obj4) ? paintMap0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        org.jfree.chart.util.PaintList paintList31 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat36.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat39 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone40 = dateFormat39.getTimeZone();
        boolean boolean41 = logFormat36.equals((java.lang.Object) timeZone40);
        boolean boolean42 = paintList31.equals((java.lang.Object) logFormat36);
        objectList1.set(11, (java.lang.Object) logFormat36);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and obj29.", objectList1.equals(obj29) == obj29.equals(objectList1));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        boolean boolean10 = logFormat5.equals((java.lang.Object) timeZone9);
        boolean boolean11 = paintList0.equals((java.lang.Object) logFormat5);
        java.lang.Object obj12 = null;
        boolean boolean13 = paintList0.equals(obj12);
        java.lang.Object obj14 = paintList0.clone();
        java.awt.Paint paint16 = null;
        paintList0.setPaint(16, paint16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintList0 and obj14", paintList0.equals(obj14) ? paintList0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        java.util.TimeZone timeZone29 = relativeDateFormat2.getTimeZone();
        java.text.ParsePosition parsePosition31 = null;
        java.util.Date date32 = relativeDateFormat2.parse("", parsePosition31);
        org.jfree.chart.util.LogFormat logFormat37 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int38 = logFormat37.getMaximumFractionDigits();
        logFormat37.setGroupingUsed(true);
        logFormat37.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer44 = null;
        java.text.FieldPosition fieldPosition45 = null;
        java.lang.StringBuffer stringBuffer46 = logFormat37.format((java.lang.Object) 10, stringBuffer44, fieldPosition45);
        java.lang.String str48 = logFormat37.format(0L);
        java.lang.Object obj49 = logFormat37.clone();
        java.lang.String str51 = logFormat37.format((java.lang.Object) (byte) -1);
        relativeDateFormat2.setDayFormatter((java.text.NumberFormat) logFormat37);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer25 and stringBuffer46", (stringBuffer25.compareTo(stringBuffer46) == 0) == stringBuffer25.equals(stringBuffer46));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        java.lang.StringBuffer stringBuffer35 = null;
        java.text.FieldPosition fieldPosition36 = null;
        java.lang.StringBuffer stringBuffer37 = logFormat33.format((-1L), stringBuffer35, fieldPosition36);
        org.jfree.chart.util.LogFormat logFormat42 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        logFormat33.setExponentFormat((java.text.NumberFormat) logFormat42);
        org.jfree.chart.PaintMap paintMap44 = new org.jfree.chart.PaintMap();
        java.lang.Object obj45 = paintMap44.clone();
        java.awt.Paint paint47 = null;
        paintMap44.put((java.lang.Comparable) '4', paint47);
        java.awt.Paint paint50 = paintMap44.getPaint((java.lang.Comparable) "NaN");
        boolean boolean51 = logFormat33.equals((java.lang.Object) paintMap44);
        int int52 = objectList1.indexOf((java.lang.Object) boolean51);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer23 and stringBuffer37", (stringBuffer23.compareTo(stringBuffer37) == 0) == stringBuffer23.equals(stringBuffer37));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        org.jfree.chart.util.LogFormat logFormat51 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat51.setMinimumIntegerDigits(1);
        boolean boolean54 = logFormat51.isGroupingUsed();
        logFormat51.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat57 = logFormat51.getExponentFormat();
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat51);
        java.text.NumberFormat numberFormat59 = logFormat4.getExponentFormat();
        java.text.ParsePosition parsePosition61 = null;
        java.lang.Number number62 = logFormat4.parse("\2440.00", parsePosition61);
        org.jfree.chart.util.LogFormat logFormat68 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat68.setMinimumIntegerDigits(1);
        boolean boolean71 = logFormat68.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat77 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int78 = logFormat77.getMaximumFractionDigits();
        logFormat77.setGroupingUsed(true);
        logFormat77.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer84 = null;
        java.text.FieldPosition fieldPosition85 = null;
        java.lang.StringBuffer stringBuffer86 = logFormat77.format((java.lang.Object) 10, stringBuffer84, fieldPosition85);
        java.text.FieldPosition fieldPosition87 = null;
        java.lang.StringBuffer stringBuffer88 = logFormat68.format((double) 2, stringBuffer84, fieldPosition87);
        java.text.FieldPosition fieldPosition89 = null;
        java.lang.StringBuffer stringBuffer90 = logFormat4.format((long) (short) 1, stringBuffer84, fieldPosition89);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer32 and stringBuffer86", (stringBuffer32.compareTo(stringBuffer86) == 0) == stringBuffer32.equals(stringBuffer86));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(4);
        java.lang.Object obj3 = objectList1.get((-1));
        org.jfree.chart.util.PaintList paintList4 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.PaintMap paintMap5 = new org.jfree.chart.PaintMap();
        paintMap5.clear();
        java.awt.Paint paint8 = paintMap5.getPaint((java.lang.Comparable) true);
        boolean boolean9 = paintList4.equals((java.lang.Object) paintMap5);
        java.lang.Object obj10 = paintList4.clone();
        int int11 = objectList1.indexOf((java.lang.Object) paintList4);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and paintList4.", objectList1.equals(paintList4) == paintList4.equals(objectList1));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat46 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str47 = relativeDateFormat46.getHourSuffix();
        boolean boolean48 = relativeDateFormat46.getShowZeroHours();
        java.lang.String str49 = relativeDateFormat46.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat54 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat54.setMinimumIntegerDigits(1);
        boolean boolean57 = logFormat54.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat63 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer65 = null;
        java.text.FieldPosition fieldPosition66 = null;
        java.lang.StringBuffer stringBuffer67 = logFormat63.format((-1L), stringBuffer65, fieldPosition66);
        java.text.FieldPosition fieldPosition68 = null;
        java.lang.StringBuffer stringBuffer69 = logFormat54.format((long) (short) 10, stringBuffer65, fieldPosition68);
        relativeDateFormat46.setHourFormatter((java.text.NumberFormat) logFormat54);
        relativeDateFormat46.setPositivePrefix("Rotation.CLOCKWISE");
        java.text.NumberFormat numberFormat73 = relativeDateFormat46.getNumberFormat();
        java.text.NumberFormat numberFormat74 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat74.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean77 = numberFormat74.isParseIntegerOnly();
        java.math.RoundingMode roundingMode78 = numberFormat74.getRoundingMode();
        numberFormat73.setRoundingMode(roundingMode78);
        logFormat36.setExponentFormat(numberFormat73);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer40 and stringBuffer67", (stringBuffer40.compareTo(stringBuffer67) == 0) == stringBuffer40.equals(stringBuffer67));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        java.text.NumberFormat numberFormat40 = relativeDateFormat2.getNumberFormat();
        org.jfree.chart.util.PaintList paintList41 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat42 = java.text.NumberFormat.getIntegerInstance();
        int int43 = numberFormat42.getMaximumIntegerDigits();
        boolean boolean44 = paintList41.equals((java.lang.Object) int43);
        java.awt.Paint paint46 = null;
        paintList41.setPaint(11, paint46);
        java.lang.Object obj48 = paintList41.clone();
        java.lang.Object obj49 = null;
        boolean boolean50 = paintList41.equals(obj49);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat51 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str52 = relativeDateFormat51.getHourSuffix();
        boolean boolean53 = relativeDateFormat51.getShowZeroHours();
        boolean boolean54 = relativeDateFormat51.getShowZeroHours();
        java.util.TimeZone timeZone55 = relativeDateFormat51.getTimeZone();
        boolean boolean56 = paintList41.equals((java.lang.Object) relativeDateFormat51);
        java.lang.String str57 = relativeDateFormat51.getMinuteSuffix();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat58 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str59 = relativeDateFormat58.getHourSuffix();
        java.lang.String str60 = relativeDateFormat58.getDaySuffix();
        java.util.Calendar calendar61 = relativeDateFormat58.getCalendar();
        relativeDateFormat51.setCalendar(calendar61);
        relativeDateFormat2.setCalendar(calendar61);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and paintList41.", objectList1.equals(paintList41) == paintList41.equals(objectList1));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        boolean boolean2 = paintMap0.containsKey((java.lang.Comparable) (short) 10);
        paintMap0.clear();
        java.lang.Object obj4 = paintMap0.clone();
        java.lang.Object obj5 = paintMap0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj4", paintMap0.equals(obj4) ? paintMap0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        relativeDateFormat0.setSecondSuffix("m");
        boolean boolean29 = relativeDateFormat0.getShowZeroDays();
        relativeDateFormat0.setShowZeroHours(false);
        java.util.TimeZone timeZone32 = relativeDateFormat0.getTimeZone();
        org.jfree.chart.util.LogFormat logFormat37 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat37.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat40 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone41 = dateFormat40.getTimeZone();
        boolean boolean42 = logFormat37.equals((java.lang.Object) timeZone41);
        org.jfree.chart.util.LogFormat logFormat47 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat47.setMinimumIntegerDigits(1);
        boolean boolean50 = logFormat47.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat56 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer58 = null;
        java.text.FieldPosition fieldPosition59 = null;
        java.lang.StringBuffer stringBuffer60 = logFormat56.format((-1L), stringBuffer58, fieldPosition59);
        java.text.FieldPosition fieldPosition61 = null;
        java.lang.StringBuffer stringBuffer62 = logFormat47.format((long) (short) 10, stringBuffer58, fieldPosition61);
        org.jfree.chart.util.LogFormat logFormat67 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int68 = logFormat67.getMaximumFractionDigits();
        logFormat67.setGroupingUsed(true);
        logFormat67.setGroupingUsed(false);
        logFormat67.setMaximumIntegerDigits((-1));
        logFormat47.setExponentFormat((java.text.NumberFormat) logFormat67);
        logFormat37.setExponentFormat((java.text.NumberFormat) logFormat67);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer21 and stringBuffer60", (stringBuffer21.compareTo(stringBuffer60) == 0) == stringBuffer21.equals(stringBuffer60));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        java.lang.Object obj73 = objectList1.get(309);
        java.lang.Object obj74 = objectList1.clone();
        objectList1.clear();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and obj74.", objectList1.equals(obj74) == obj74.equals(objectList1));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        paintList0.clear();
        java.lang.Object obj5 = paintList0.clone();
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int11 = logFormat10.getMaximumFractionDigits();
        logFormat10.setGroupingUsed(true);
        logFormat10.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        java.lang.StringBuffer stringBuffer19 = logFormat10.format((java.lang.Object) 10, stringBuffer17, fieldPosition18);
        java.lang.String str21 = logFormat10.format(0L);
        java.lang.Object obj22 = logFormat10.clone();
        java.lang.String str24 = logFormat10.format((java.lang.Object) (byte) -1);
        logFormat10.setGroupingUsed(false);
        boolean boolean27 = paintList0.equals((java.lang.Object) false);
        java.awt.Paint paint29 = null;
        paintList0.setPaint(309, paint29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintList0 and obj5", paintList0.equals(obj5) ? paintList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        paintList0.clear();
        java.lang.Object obj5 = paintList0.clone();
        org.jfree.chart.util.PaintList paintList6 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat11 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat11.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        boolean boolean16 = logFormat11.equals((java.lang.Object) timeZone15);
        boolean boolean17 = paintList6.equals((java.lang.Object) logFormat11);
        java.lang.Object obj18 = null;
        boolean boolean19 = paintList6.equals(obj18);
        java.awt.Paint paint21 = paintList6.getPaint(5);
        java.awt.Paint paint23 = null;
        paintList6.setPaint((int) '4', paint23);
        java.lang.Object obj25 = paintList6.clone();
        boolean boolean26 = paintList0.equals((java.lang.Object) paintList6);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintList0 and paintList6", paintList0.equals(paintList6) ? paintList0.hashCode() == paintList6.hashCode() : true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        boolean boolean2 = paintMap0.containsKey((java.lang.Comparable) (short) 10);
        paintMap0.clear();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        relativeDateFormat4.setMinuteSuffix("\u221e");
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone8 = dateFormat7.getTimeZone();
        dateFormat7.setLenient(true);
        java.util.Calendar calendar11 = dateFormat7.getCalendar();
        relativeDateFormat4.setCalendar(calendar11);
        boolean boolean13 = paintMap0.containsKey((java.lang.Comparable) calendar11);
        java.lang.Object obj14 = paintMap0.clone();
        org.jfree.chart.util.LogFormat logFormat18 = new org.jfree.chart.util.LogFormat(10.0d, "", false);
        boolean boolean19 = paintMap0.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj14", paintMap0.equals(obj14) ? paintMap0.hashCode() == obj14.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        int int1 = paintList0.size();
        java.awt.Paint paint3 = null;
        paintList0.setPaint((int) (short) 0, paint3);
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int10 = logFormat9.getMaximumFractionDigits();
        logFormat9.setGroupingUsed(true);
        logFormat9.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        java.lang.StringBuffer stringBuffer18 = logFormat9.format((java.lang.Object) 10, stringBuffer16, fieldPosition17);
        java.lang.String str20 = logFormat9.format(0L);
        java.lang.Object obj21 = logFormat9.clone();
        java.lang.String str23 = logFormat9.format((java.lang.Object) (byte) -1);
        logFormat9.setGroupingUsed(false);
        boolean boolean26 = paintList0.equals((java.lang.Object) false);
        java.lang.Object obj27 = paintList0.clone();
        java.awt.Paint paint29 = null;
        paintList0.setPaint((int) (short) 0, paint29);
        java.awt.Paint paint32 = null;
        paintList0.setPaint(10, paint32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintList0 and obj27", paintList0.equals(obj27) ? paintList0.hashCode() == obj27.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        boolean boolean14 = logFormat4.isParseIntegerOnly();
        org.jfree.chart.PaintMap paintMap16 = new org.jfree.chart.PaintMap();
        java.lang.Object obj17 = paintMap16.clone();
        java.awt.Paint paint19 = null;
        paintMap16.put((java.lang.Comparable) '4', paint19);
        org.jfree.chart.util.LogFormat logFormat25 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer27 = null;
        java.text.FieldPosition fieldPosition28 = null;
        java.lang.StringBuffer stringBuffer29 = logFormat25.format((-1L), stringBuffer27, fieldPosition28);
        boolean boolean30 = paintMap16.containsKey((java.lang.Comparable) (-1L));
        org.jfree.chart.util.LogFormat logFormat35 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat35.setMinimumIntegerDigits(1);
        boolean boolean38 = logFormat35.isGroupingUsed();
        logFormat35.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat41 = logFormat35.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat47 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int48 = logFormat47.getMaximumFractionDigits();
        logFormat47.setGroupingUsed(true);
        logFormat47.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer54 = null;
        java.text.FieldPosition fieldPosition55 = null;
        java.lang.StringBuffer stringBuffer56 = logFormat47.format((java.lang.Object) 10, stringBuffer54, fieldPosition55);
        java.text.FieldPosition fieldPosition57 = null;
        java.lang.StringBuffer stringBuffer58 = logFormat35.format(0.0d, stringBuffer56, fieldPosition57);
        java.awt.Paint paint59 = null;
        paintMap16.put((java.lang.Comparable) stringBuffer58, paint59);
        java.text.FieldPosition fieldPosition61 = null;
        java.lang.StringBuffer stringBuffer62 = logFormat4.format((double) 32, stringBuffer58, fieldPosition61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer13 and stringBuffer56", (stringBuffer13.compareTo(stringBuffer56) == 0) == stringBuffer13.equals(stringBuffer56));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        java.awt.Paint paint6 = paintMap0.getPaint((java.lang.Comparable) "NaN");
        paintMap0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        java.awt.Paint paint3 = paintMap0.getPaint((java.lang.Comparable) true);
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat();
        logFormat4.setParseIntegerOnly(true);
        logFormat4.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat14.setMinimumIntegerDigits(1);
        boolean boolean17 = logFormat14.isGroupingUsed();
        logFormat14.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat20 = logFormat14.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int27 = logFormat26.getMaximumFractionDigits();
        logFormat26.setGroupingUsed(true);
        logFormat26.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer33 = null;
        java.text.FieldPosition fieldPosition34 = null;
        java.lang.StringBuffer stringBuffer35 = logFormat26.format((java.lang.Object) 10, stringBuffer33, fieldPosition34);
        java.text.FieldPosition fieldPosition36 = null;
        java.lang.StringBuffer stringBuffer37 = logFormat14.format(0.0d, stringBuffer35, fieldPosition36);
        java.text.FieldPosition fieldPosition38 = null;
        java.lang.StringBuffer stringBuffer39 = logFormat4.format((double) ' ', stringBuffer35, fieldPosition38);
        java.awt.Paint paint40 = paintMap0.getPaint((java.lang.Comparable) stringBuffer35);
        org.jfree.chart.util.ObjectList objectList42 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj44 = objectList42.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation46 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList42.set((int) (short) 1, (java.lang.Object) rotation46);
        java.awt.Paint paint48 = paintMap0.getPaint((java.lang.Comparable) (short) 1);
        java.lang.Object obj49 = paintMap0.clone();
        java.awt.Paint paint51 = paintMap0.getPaint((java.lang.Comparable) 8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj49", paintMap0.equals(obj49) ? paintMap0.hashCode() == obj49.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        java.util.TimeZone timeZone29 = relativeDateFormat2.getTimeZone();
        relativeDateFormat2.setSecondSuffix("\24415.00");
        relativeDateFormat2.setHourSuffix("4.09");
        relativeDateFormat2.setLenient(true);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat36 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean37 = relativeDateFormat36.isLenient();
        java.text.ParsePosition parsePosition39 = null;
        java.util.Date date40 = relativeDateFormat36.parse("m", parsePosition39);
        relativeDateFormat36.setBaseMillis((long) 8);
        java.text.NumberFormat numberFormat43 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat43.setParseIntegerOnly(false);
        java.lang.String str47 = numberFormat43.format((long) 15);
        relativeDateFormat36.setHourFormatter(numberFormat43);
        relativeDateFormat36.setMinuteSuffix("");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat51 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str52 = relativeDateFormat51.getHourSuffix();
        java.lang.String str53 = relativeDateFormat51.getDaySuffix();
        boolean boolean54 = relativeDateFormat51.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat59 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer61 = null;
        java.text.FieldPosition fieldPosition62 = null;
        java.lang.StringBuffer stringBuffer63 = logFormat59.format((-1L), stringBuffer61, fieldPosition62);
        logFormat59.setParseIntegerOnly(true);
        relativeDateFormat51.setDayFormatter((java.text.NumberFormat) logFormat59);
        java.util.TimeZone timeZone67 = relativeDateFormat51.getTimeZone();
        relativeDateFormat36.setTimeZone(timeZone67);
        relativeDateFormat2.setTimeZone(timeZone67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer23 and stringBuffer63", (stringBuffer23.compareTo(stringBuffer63) == 0) == stringBuffer23.equals(stringBuffer63));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        java.awt.Paint paint6 = paintMap0.getPaint((java.lang.Comparable) "NaN");
        java.lang.Comparable comparable7 = null;
        boolean boolean8 = paintMap0.containsKey(comparable7);
        paintMap0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        logFormat4.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat10 = logFormat4.getExponentFormat();
        boolean boolean12 = logFormat4.equals((java.lang.Object) 0.0f);
        int int13 = logFormat4.getMaximumIntegerDigits();
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat21 = new org.jfree.chart.util.LogFormat();
        logFormat21.setParseIntegerOnly(true);
        logFormat21.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat31.setMinimumIntegerDigits(1);
        boolean boolean34 = logFormat31.isGroupingUsed();
        logFormat31.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat37 = logFormat31.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat43 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int44 = logFormat43.getMaximumFractionDigits();
        logFormat43.setGroupingUsed(true);
        logFormat43.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer50 = null;
        java.text.FieldPosition fieldPosition51 = null;
        java.lang.StringBuffer stringBuffer52 = logFormat43.format((java.lang.Object) 10, stringBuffer50, fieldPosition51);
        java.text.FieldPosition fieldPosition53 = null;
        java.lang.StringBuffer stringBuffer54 = logFormat31.format(0.0d, stringBuffer52, fieldPosition53);
        java.text.FieldPosition fieldPosition55 = null;
        java.lang.StringBuffer stringBuffer56 = logFormat21.format((double) ' ', stringBuffer52, fieldPosition55);
        java.text.FieldPosition fieldPosition57 = null;
        java.lang.StringBuffer stringBuffer58 = logFormat19.format((-1.0d), stringBuffer52, fieldPosition57);
        java.text.FieldPosition fieldPosition59 = null;
        java.lang.StringBuffer stringBuffer60 = logFormat4.format((long) 17, stringBuffer58, fieldPosition59);
        org.jfree.chart.util.LogFormat logFormat65 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int66 = logFormat65.getMaximumFractionDigits();
        logFormat65.setGroupingUsed(true);
        logFormat65.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer72 = null;
        java.text.FieldPosition fieldPosition73 = null;
        java.lang.StringBuffer stringBuffer74 = logFormat65.format((java.lang.Object) 10, stringBuffer72, fieldPosition73);
        java.lang.String str76 = logFormat65.format(0L);
        java.lang.StringBuffer stringBuffer78 = null;
        java.text.FieldPosition fieldPosition79 = null;
        java.lang.StringBuffer stringBuffer80 = logFormat65.format(1L, stringBuffer78, fieldPosition79);
        java.lang.String str82 = logFormat65.format((long) 16);
        logFormat65.setGroupingUsed(true);
        java.lang.Object obj85 = logFormat65.clone();
        boolean boolean86 = logFormat4.equals(obj85);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer52 and stringBuffer74", (stringBuffer52.compareTo(stringBuffer74) == 0) == stringBuffer52.equals(stringBuffer74));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.PaintMap paintMap1 = new org.jfree.chart.PaintMap();
        paintMap1.clear();
        java.awt.Paint paint4 = paintMap1.getPaint((java.lang.Comparable) true);
        boolean boolean5 = paintList0.equals((java.lang.Object) paintMap1);
        java.lang.Object obj6 = paintList0.clone();
        java.awt.Paint paint8 = null;
        paintList0.setPaint(12, paint8);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintList0 and obj6", paintList0.equals(obj6) ? paintList0.hashCode() == obj6.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.text.ParsePosition parsePosition6 = null;
        java.util.Date date7 = relativeDateFormat0.parse("", parsePosition6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat8 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str9 = relativeDateFormat8.getHourSuffix();
        boolean boolean10 = relativeDateFormat8.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat15 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int16 = logFormat15.getMaximumFractionDigits();
        logFormat15.setGroupingUsed(true);
        logFormat15.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition22 = null;
        java.lang.Object obj23 = logFormat15.parseObject("", parsePosition22);
        org.jfree.chart.util.LogFormat logFormat28 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat28.setMinimumIntegerDigits(1);
        boolean boolean31 = logFormat28.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat37 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer39 = null;
        java.text.FieldPosition fieldPosition40 = null;
        java.lang.StringBuffer stringBuffer41 = logFormat37.format((-1L), stringBuffer39, fieldPosition40);
        java.text.FieldPosition fieldPosition42 = null;
        java.lang.StringBuffer stringBuffer43 = logFormat28.format((long) (short) 10, stringBuffer39, fieldPosition42);
        org.jfree.chart.util.LogFormat logFormat48 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int49 = logFormat48.getMaximumFractionDigits();
        logFormat48.setGroupingUsed(true);
        logFormat48.setGroupingUsed(false);
        logFormat48.setMaximumIntegerDigits((-1));
        logFormat28.setExponentFormat((java.text.NumberFormat) logFormat48);
        boolean boolean57 = logFormat15.equals((java.lang.Object) logFormat28);
        relativeDateFormat8.setMinuteFormatter((java.text.NumberFormat) logFormat15);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat15);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat60 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str61 = relativeDateFormat60.getHourSuffix();
        boolean boolean62 = relativeDateFormat60.getShowZeroHours();
        java.lang.String str63 = relativeDateFormat60.getMinuteSuffix();
        long long64 = relativeDateFormat60.getBaseMillis();
        java.lang.String str65 = relativeDateFormat60.getHourSuffix();
        relativeDateFormat60.setShowZeroHours(false);
        long long68 = relativeDateFormat60.getBaseMillis();
        java.lang.String str69 = relativeDateFormat60.getMinuteSuffix();
        long long70 = relativeDateFormat60.getBaseMillis();
        org.jfree.chart.util.LogFormat logFormat75 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer77 = null;
        java.text.FieldPosition fieldPosition78 = null;
        java.lang.StringBuffer stringBuffer79 = logFormat75.format((-1L), stringBuffer77, fieldPosition78);
        org.jfree.chart.util.LogFormat logFormat84 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        logFormat75.setExponentFormat((java.text.NumberFormat) logFormat84);
        logFormat84.setMaximumIntegerDigits((int) (byte) 100);
        relativeDateFormat60.setNumberFormat((java.text.NumberFormat) logFormat84);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat84);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer41 and stringBuffer79", (stringBuffer41.compareTo(stringBuffer79) == 0) == stringBuffer41.equals(stringBuffer79));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
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
        java.text.NumberFormat numberFormat37 = relativeDateFormat0.getNumberFormat();
        org.jfree.chart.util.LogFormat logFormat42 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int43 = logFormat42.getMaximumFractionDigits();
        logFormat42.setGroupingUsed(true);
        logFormat42.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer49 = null;
        java.text.FieldPosition fieldPosition50 = null;
        java.lang.StringBuffer stringBuffer51 = logFormat42.format((java.lang.Object) 10, stringBuffer49, fieldPosition50);
        java.lang.String str53 = logFormat42.format(0L);
        java.lang.Object obj54 = logFormat42.clone();
        java.lang.String str56 = logFormat42.format((double) (byte) 0);
        boolean boolean57 = logFormat42.isParseIntegerOnly();
        org.jfree.chart.util.LogFormat logFormat62 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int63 = logFormat62.getMaximumFractionDigits();
        logFormat42.setExponentFormat((java.text.NumberFormat) logFormat62);
        boolean boolean65 = logFormat62.isParseIntegerOnly();
        java.lang.String str67 = logFormat62.format((double) 0L);
        logFormat62.setMinimumFractionDigits((int) (short) -1);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer32 and stringBuffer51", (stringBuffer32.compareTo(stringBuffer51) == 0) == stringBuffer32.equals(stringBuffer51));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        boolean boolean42 = objectList1.equals((java.lang.Object) '4');
        org.jfree.chart.util.LogFormat logFormat48 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat48.setMinimumIntegerDigits(1);
        boolean boolean51 = logFormat48.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat57 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer59 = null;
        java.text.FieldPosition fieldPosition60 = null;
        java.lang.StringBuffer stringBuffer61 = logFormat57.format((-1L), stringBuffer59, fieldPosition60);
        java.text.FieldPosition fieldPosition62 = null;
        java.lang.StringBuffer stringBuffer63 = logFormat48.format((long) (short) 10, stringBuffer59, fieldPosition62);
        org.jfree.chart.util.LogFormat logFormat68 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int69 = logFormat68.getMaximumFractionDigits();
        logFormat68.setGroupingUsed(true);
        logFormat68.setGroupingUsed(false);
        logFormat68.setMaximumIntegerDigits((-1));
        logFormat48.setExponentFormat((java.text.NumberFormat) logFormat68);
        objectList1.set(7, (java.lang.Object) logFormat48);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer35 and stringBuffer61", (stringBuffer35.compareTo(stringBuffer61) == 0) == stringBuffer35.equals(stringBuffer61));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        relativeDateFormat0.setHourSuffix("h");
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 12, "", true);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat8);
        org.jfree.chart.util.LogFormat logFormat15 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int16 = logFormat15.getMaximumFractionDigits();
        logFormat15.setGroupingUsed(true);
        logFormat15.setGroupingUsed(false);
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat28 = new org.jfree.chart.util.LogFormat();
        logFormat28.setParseIntegerOnly(true);
        logFormat28.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat38.setMinimumIntegerDigits(1);
        boolean boolean41 = logFormat38.isGroupingUsed();
        logFormat38.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat44 = logFormat38.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat50 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int51 = logFormat50.getMaximumFractionDigits();
        logFormat50.setGroupingUsed(true);
        logFormat50.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer57 = null;
        java.text.FieldPosition fieldPosition58 = null;
        java.lang.StringBuffer stringBuffer59 = logFormat50.format((java.lang.Object) 10, stringBuffer57, fieldPosition58);
        java.text.FieldPosition fieldPosition60 = null;
        java.lang.StringBuffer stringBuffer61 = logFormat38.format(0.0d, stringBuffer59, fieldPosition60);
        java.text.FieldPosition fieldPosition62 = null;
        java.lang.StringBuffer stringBuffer63 = logFormat28.format((double) ' ', stringBuffer59, fieldPosition62);
        java.text.FieldPosition fieldPosition64 = null;
        java.lang.StringBuffer stringBuffer65 = logFormat26.format((-1.0d), stringBuffer59, fieldPosition64);
        java.text.FieldPosition fieldPosition66 = null;
        java.lang.StringBuffer stringBuffer67 = logFormat15.format((double) (-1.0f), stringBuffer65, fieldPosition66);
        java.text.FieldPosition fieldPosition68 = null;
        java.lang.StringBuffer stringBuffer69 = logFormat8.format(0.0d, stringBuffer65, fieldPosition68);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer65 and stringBuffer67", (stringBuffer65.compareTo(stringBuffer67) == 0) == stringBuffer65.equals(stringBuffer67));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        java.text.NumberFormat numberFormat19 = dateFormat0.getNumberFormat();
        numberFormat19.setParseIntegerOnly(false);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtils.createDownTriangle(1.0f);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtils.rotateShape(shape23, (double) 16, (float) (short) 100, (float) 1L);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtils.rotateShape(shape27, (double) 100, (float) 3, (float) 2147483647);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat32 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str33 = relativeDateFormat32.getHourSuffix();
        relativeDateFormat32.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat32.setSecondFormatter((java.text.NumberFormat) logFormat40);
        boolean boolean42 = logFormat40.isGroupingUsed();
        int int43 = logFormat40.getMinimumFractionDigits();
        org.jfree.chart.util.LogFormat logFormat49 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int50 = logFormat49.getMaximumFractionDigits();
        logFormat49.setGroupingUsed(true);
        logFormat49.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer56 = null;
        java.text.FieldPosition fieldPosition57 = null;
        java.lang.StringBuffer stringBuffer58 = logFormat49.format((java.lang.Object) 10, stringBuffer56, fieldPosition57);
        java.text.FieldPosition fieldPosition59 = null;
        java.lang.StringBuffer stringBuffer60 = logFormat40.format((double) 9, stringBuffer56, fieldPosition59);
        java.text.FieldPosition fieldPosition61 = null;
        java.lang.StringBuffer stringBuffer62 = numberFormat19.format((java.lang.Object) 3, stringBuffer60, fieldPosition61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer17 and stringBuffer58", (stringBuffer17.compareTo(stringBuffer58) == 0) == stringBuffer17.equals(stringBuffer58));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        java.lang.String str25 = relativeDateFormat0.getHourSuffix();
        long long26 = relativeDateFormat0.getBaseMillis();
        relativeDateFormat0.setPositivePrefix("h");
        org.jfree.chart.util.LogFormat logFormat33 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat33.setMinimumIntegerDigits(1);
        logFormat33.setGroupingUsed(false);
        java.lang.String str39 = logFormat33.format((double) 0);
        org.jfree.chart.util.ObjectList objectList41 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj43 = objectList41.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation45 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList41.set((int) (short) 1, (java.lang.Object) rotation45);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat47 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str48 = relativeDateFormat47.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat53 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat53.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat56 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone57 = dateFormat56.getTimeZone();
        boolean boolean58 = logFormat53.equals((java.lang.Object) timeZone57);
        relativeDateFormat47.setHourFormatter((java.text.NumberFormat) logFormat53);
        java.text.ParsePosition parsePosition61 = null;
        java.util.Date date62 = relativeDateFormat47.parse("hi!", parsePosition61);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat63 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str64 = relativeDateFormat63.getHourSuffix();
        java.lang.String str65 = relativeDateFormat63.getDaySuffix();
        boolean boolean66 = relativeDateFormat63.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat71 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer73 = null;
        java.text.FieldPosition fieldPosition74 = null;
        java.lang.StringBuffer stringBuffer75 = logFormat71.format((-1L), stringBuffer73, fieldPosition74);
        logFormat71.setParseIntegerOnly(true);
        relativeDateFormat63.setDayFormatter((java.text.NumberFormat) logFormat71);
        relativeDateFormat47.setSecondFormatter((java.text.NumberFormat) logFormat71);
        int int80 = objectList41.indexOf((java.lang.Object) relativeDateFormat47);
        java.lang.String str81 = logFormat33.format((java.lang.Object) int80);
        java.text.ParsePosition parsePosition83 = null;
        java.lang.Object obj84 = logFormat33.parseObject("4.09", parsePosition83);
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat33);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer21 and stringBuffer75", (stringBuffer21.compareTo(stringBuffer75) == 0) == stringBuffer21.equals(stringBuffer75));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        relativeDateFormat1.setBaseMillis((long) (byte) -1);
        org.jfree.chart.util.ObjectList objectList49 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj50 = objectList49.clone();
        java.lang.Object obj51 = objectList49.clone();
        boolean boolean52 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) true, (java.lang.Object) objectList49);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat53 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str54 = relativeDateFormat53.getHourSuffix();
        boolean boolean55 = relativeDateFormat53.getShowZeroHours();
        java.text.NumberFormat numberFormat56 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat53.setNumberFormat(numberFormat56);
        java.text.DateFormat dateFormat58 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone59 = dateFormat58.getTimeZone();
        dateFormat58.setLenient(true);
        java.util.Calendar calendar62 = dateFormat58.getCalendar();
        relativeDateFormat53.setCalendar(calendar62);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat64 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str65 = relativeDateFormat64.getHourSuffix();
        relativeDateFormat64.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat72 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat64.setSecondFormatter((java.text.NumberFormat) logFormat72);
        java.text.NumberFormat numberFormat74 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat74.setMinimumFractionDigits((int) '4');
        int int77 = numberFormat74.getMinimumIntegerDigits();
        numberFormat74.setMaximumFractionDigits(6);
        logFormat72.setExponentFormat(numberFormat74);
        relativeDateFormat53.setHourFormatter((java.text.NumberFormat) logFormat72);
        boolean boolean82 = objectList49.equals((java.lang.Object) logFormat72);
        relativeDateFormat1.setMinuteFormatter((java.text.NumberFormat) logFormat72);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on objectList35 and objectList49", objectList35.equals(objectList49) ? objectList35.hashCode() == objectList49.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        int int30 = objectList1.size();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat32 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        relativeDateFormat32.setShowZeroDays(false);
        relativeDateFormat32.setMinuteSuffix("0.0");
        relativeDateFormat32.setMinuteSuffix("0.66");
        java.text.ParsePosition parsePosition40 = null;
        java.lang.Object obj41 = relativeDateFormat32.parseObject("d", parsePosition40);
        relativeDateFormat32.setDaySuffix("\u221e");
        org.jfree.chart.util.ObjectList objectList45 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat46 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str47 = relativeDateFormat46.getHourSuffix();
        boolean boolean48 = relativeDateFormat46.getShowZeroHours();
        java.lang.String str49 = relativeDateFormat46.getMinuteSuffix();
        long long50 = relativeDateFormat46.getBaseMillis();
        java.lang.String str51 = relativeDateFormat46.getHourSuffix();
        relativeDateFormat46.setPositivePrefix("");
        java.lang.Object obj54 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat46);
        boolean boolean55 = objectList45.equals((java.lang.Object) relativeDateFormat46);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat56 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str57 = relativeDateFormat56.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat62 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat62.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat65 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone66 = dateFormat65.getTimeZone();
        boolean boolean67 = logFormat62.equals((java.lang.Object) timeZone66);
        relativeDateFormat56.setHourFormatter((java.text.NumberFormat) logFormat62);
        java.text.ParsePosition parsePosition70 = null;
        java.util.Date date71 = relativeDateFormat56.parse("hi!", parsePosition70);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat72 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str73 = relativeDateFormat72.getHourSuffix();
        java.lang.String str74 = relativeDateFormat72.getDaySuffix();
        boolean boolean75 = relativeDateFormat72.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat80 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer82 = null;
        java.text.FieldPosition fieldPosition83 = null;
        java.lang.StringBuffer stringBuffer84 = logFormat80.format((-1L), stringBuffer82, fieldPosition83);
        logFormat80.setParseIntegerOnly(true);
        relativeDateFormat72.setDayFormatter((java.text.NumberFormat) logFormat80);
        relativeDateFormat56.setSecondFormatter((java.text.NumberFormat) logFormat80);
        relativeDateFormat46.setHourFormatter((java.text.NumberFormat) logFormat80);
        java.text.NumberFormat numberFormat90 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat90.setMinimumFractionDigits((int) '4');
        relativeDateFormat46.setMinuteFormatter(numberFormat90);
        relativeDateFormat32.setMinuteFormatter(numberFormat90);
        boolean boolean95 = objectList1.equals((java.lang.Object) numberFormat90);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on objectList1 and objectList45", objectList1.equals(objectList45) ? objectList1.hashCode() == objectList45.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        java.lang.Object obj4 = objectList1.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat6 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str7 = relativeDateFormat6.getHourSuffix();
        java.lang.String str8 = relativeDateFormat6.getDaySuffix();
        relativeDateFormat6.setDaySuffix("");
        relativeDateFormat6.setMinuteSuffix("Rotation.CLOCKWISE");
        java.util.TimeZone timeZone13 = relativeDateFormat6.getTimeZone();
        java.lang.String str15 = relativeDateFormat6.format((java.lang.Object) (-1.0d));
        boolean boolean16 = relativeDateFormat6.getShowZeroHours();
        objectList1.set(309, (java.lang.Object) relativeDateFormat6);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and obj4.", objectList1.equals(obj4) == obj4.equals(objectList1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        org.jfree.chart.util.LogFormat logFormat51 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat53 = new org.jfree.chart.util.LogFormat();
        logFormat53.setParseIntegerOnly(true);
        logFormat53.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat63 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat63.setMinimumIntegerDigits(1);
        boolean boolean66 = logFormat63.isGroupingUsed();
        logFormat63.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat69 = logFormat63.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat75 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int76 = logFormat75.getMaximumFractionDigits();
        logFormat75.setGroupingUsed(true);
        logFormat75.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer82 = null;
        java.text.FieldPosition fieldPosition83 = null;
        java.lang.StringBuffer stringBuffer84 = logFormat75.format((java.lang.Object) 10, stringBuffer82, fieldPosition83);
        java.text.FieldPosition fieldPosition85 = null;
        java.lang.StringBuffer stringBuffer86 = logFormat63.format(0.0d, stringBuffer84, fieldPosition85);
        java.text.FieldPosition fieldPosition87 = null;
        java.lang.StringBuffer stringBuffer88 = logFormat53.format((double) ' ', stringBuffer84, fieldPosition87);
        java.text.FieldPosition fieldPosition89 = null;
        java.lang.StringBuffer stringBuffer90 = logFormat51.format((-1.0d), stringBuffer84, fieldPosition89);
        java.text.FieldPosition fieldPosition91 = null;
        java.lang.StringBuffer stringBuffer92 = logFormat36.format((long) 2147483647, stringBuffer84, fieldPosition91);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer40 and stringBuffer90", (stringBuffer40.compareTo(stringBuffer90) == 0) == stringBuffer40.equals(stringBuffer90));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        org.jfree.chart.util.PaintList paintList63 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat68 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat68.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat71 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone72 = dateFormat71.getTimeZone();
        boolean boolean73 = logFormat68.equals((java.lang.Object) timeZone72);
        boolean boolean74 = paintList63.equals((java.lang.Object) logFormat68);
        boolean boolean75 = logFormat68.isParseIntegerOnly();
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat68);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList9 and paintList63.", objectList9.equals(paintList63) == paintList63.equals(objectList9));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat9.format((-1L), stringBuffer11, fieldPosition12);
        boolean boolean14 = paintMap0.containsKey((java.lang.Comparable) (-1L));
        java.lang.Object obj15 = paintMap0.clone();
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtils.clone(shape17);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape18, (double) (byte) 10, (double) 10.0f);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtils.createDownTriangle((-1.0f));
        boolean boolean24 = org.jfree.chart.util.ShapeUtils.equal(shape18, shape23);
        java.awt.Shape shape28 = org.jfree.chart.util.ShapeUtils.rotateShape(shape23, (double) ' ', 10.0f, (float) (short) 1);
        boolean boolean29 = paintMap0.equals((java.lang.Object) shape28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj15", paintMap0.equals(obj15) ? paintMap0.hashCode() == obj15.hashCode() : true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        java.awt.Paint paint6 = paintMap0.getPaint((java.lang.Comparable) "NaN");
        java.awt.Paint paint8 = null;
        paintMap0.put((java.lang.Comparable) ' ', paint8);
        java.awt.Paint paint11 = null;
        paintMap0.put((java.lang.Comparable) 8L, paint11);
        paintMap0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        java.lang.String str29 = relativeDateFormat2.getHourSuffix();
        java.lang.String str30 = relativeDateFormat2.getPositivePrefix();
        boolean boolean31 = relativeDateFormat2.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer38 = null;
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat36.format((-1L), stringBuffer38, fieldPosition39);
        logFormat36.setParseIntegerOnly(true);
        boolean boolean43 = logFormat36.isGroupingUsed();
        org.jfree.chart.util.ObjectList objectList45 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj47 = objectList45.get((int) (short) 1);
        boolean boolean48 = logFormat36.equals((java.lang.Object) (short) 1);
        logFormat36.setMinimumIntegerDigits((int) (short) -1);
        relativeDateFormat2.setNumberFormat((java.text.NumberFormat) logFormat36);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer23 and stringBuffer40", (stringBuffer23.compareTo(stringBuffer40) == 0) == stringBuffer23.equals(stringBuffer40));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) (byte) 1, paint3);
        org.jfree.chart.util.ObjectList objectList6 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj8 = objectList6.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation10 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList6.set((int) (short) 1, (java.lang.Object) rotation10);
        java.lang.String str12 = rotation10.toString();
        double double13 = rotation10.getFactor();
        java.awt.Paint paint14 = paintMap0.getPaint((java.lang.Comparable) double13);
        org.jfree.chart.util.ObjectList objectList16 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat17 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str18 = relativeDateFormat17.getHourSuffix();
        boolean boolean19 = relativeDateFormat17.getShowZeroHours();
        java.lang.String str20 = relativeDateFormat17.getMinuteSuffix();
        long long21 = relativeDateFormat17.getBaseMillis();
        java.lang.String str22 = relativeDateFormat17.getHourSuffix();
        relativeDateFormat17.setPositivePrefix("");
        java.lang.Object obj25 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat17);
        boolean boolean26 = objectList16.equals((java.lang.Object) relativeDateFormat17);
        relativeDateFormat17.setHourSuffix("h");
        relativeDateFormat17.setShowZeroDays(true);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat32 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        java.lang.String str33 = relativeDateFormat32.getDaySuffix();
        relativeDateFormat32.setLenient(false);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat36 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str37 = relativeDateFormat36.getHourSuffix();
        boolean boolean38 = relativeDateFormat36.getShowZeroHours();
        java.lang.String str39 = relativeDateFormat36.getMinuteSuffix();
        long long40 = relativeDateFormat36.getBaseMillis();
        java.lang.String str41 = relativeDateFormat36.getHourSuffix();
        relativeDateFormat36.setShowZeroHours(false);
        long long44 = relativeDateFormat36.getBaseMillis();
        java.lang.String str45 = relativeDateFormat36.getMinuteSuffix();
        long long46 = relativeDateFormat36.getBaseMillis();
        java.util.Calendar calendar47 = relativeDateFormat36.getCalendar();
        relativeDateFormat32.setCalendar(calendar47);
        boolean boolean49 = relativeDateFormat17.equals((java.lang.Object) calendar47);
        boolean boolean50 = paintMap0.containsKey((java.lang.Comparable) boolean49);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList6 and objectList16.", objectList6.equals(objectList16) == objectList16.equals(objectList6));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(9);
        java.lang.Object obj2 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) objectList1);
        java.lang.Object obj4 = objectList1.get(52);
        org.jfree.chart.PaintMap paintMap6 = new org.jfree.chart.PaintMap();
        paintMap6.clear();
        boolean boolean9 = paintMap6.containsKey((java.lang.Comparable) 0L);
        java.awt.Paint paint11 = null;
        paintMap6.put((java.lang.Comparable) "0.0", paint11);
        java.awt.Paint paint14 = paintMap6.getPaint((java.lang.Comparable) "h");
        objectList1.set(13, (java.lang.Object) paintMap6);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and obj2.", objectList1.equals(obj2) == obj2.equals(objectList1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        java.lang.StringBuffer stringBuffer8 = logFormat4.format((-1L), stringBuffer6, fieldPosition7);
        logFormat4.setMaximumIntegerDigits((int) (byte) 10);
        java.lang.Object obj11 = logFormat4.clone();
        java.text.NumberFormat numberFormat12 = logFormat4.getExponentFormat();
        java.text.ParsePosition parsePosition14 = null;
        java.lang.Number number15 = logFormat4.parse("6.64", parsePosition14);
        org.jfree.chart.util.LogFormat logFormat21 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat();
        logFormat23.setParseIntegerOnly(true);
        logFormat23.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat33 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat33.setMinimumIntegerDigits(1);
        boolean boolean36 = logFormat33.isGroupingUsed();
        logFormat33.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat39 = logFormat33.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat45 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int46 = logFormat45.getMaximumFractionDigits();
        logFormat45.setGroupingUsed(true);
        logFormat45.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer52 = null;
        java.text.FieldPosition fieldPosition53 = null;
        java.lang.StringBuffer stringBuffer54 = logFormat45.format((java.lang.Object) 10, stringBuffer52, fieldPosition53);
        java.text.FieldPosition fieldPosition55 = null;
        java.lang.StringBuffer stringBuffer56 = logFormat33.format(0.0d, stringBuffer54, fieldPosition55);
        java.text.FieldPosition fieldPosition57 = null;
        java.lang.StringBuffer stringBuffer58 = logFormat23.format((double) ' ', stringBuffer54, fieldPosition57);
        java.text.FieldPosition fieldPosition59 = null;
        java.lang.StringBuffer stringBuffer60 = logFormat21.format((-1.0d), stringBuffer54, fieldPosition59);
        java.text.FieldPosition fieldPosition61 = null;
        java.lang.StringBuffer stringBuffer62 = logFormat4.format(Double.NaN, stringBuffer60, fieldPosition61);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer8 and stringBuffer60", (stringBuffer8.compareTo(stringBuffer60) == 0) == stringBuffer8.equals(stringBuffer60));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        objectList1.clear();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat5 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str6 = relativeDateFormat5.getHourSuffix();
        boolean boolean7 = relativeDateFormat5.getShowZeroHours();
        java.lang.String str8 = relativeDateFormat5.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat13.setMinimumIntegerDigits(1);
        boolean boolean16 = logFormat13.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat22 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition25 = null;
        java.lang.StringBuffer stringBuffer26 = logFormat22.format((-1L), stringBuffer24, fieldPosition25);
        java.text.FieldPosition fieldPosition27 = null;
        java.lang.StringBuffer stringBuffer28 = logFormat13.format((long) (short) 10, stringBuffer24, fieldPosition27);
        relativeDateFormat5.setHourFormatter((java.text.NumberFormat) logFormat13);
        relativeDateFormat5.setSecondSuffix("");
        boolean boolean32 = objectList1.equals((java.lang.Object) "");
        org.jfree.chart.util.ObjectList objectList35 = new org.jfree.chart.util.ObjectList(32);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat36 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str37 = relativeDateFormat36.getHourSuffix();
        boolean boolean38 = relativeDateFormat36.getShowZeroHours();
        java.text.NumberFormat numberFormat39 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat36.setNumberFormat(numberFormat39);
        java.text.NumberFormat numberFormat41 = relativeDateFormat36.getNumberFormat();
        int int42 = numberFormat41.getMaximumIntegerDigits();
        int int43 = objectList35.indexOf((java.lang.Object) numberFormat41);
        objectList1.set(65, (java.lang.Object) int43);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and objectList35.", objectList1.equals(objectList35) == objectList35.equals(objectList1));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
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
        java.lang.Object obj73 = objectList1.get(309);
        org.jfree.chart.PaintMap paintMap74 = new org.jfree.chart.PaintMap();
        java.lang.Object obj75 = paintMap74.clone();
        java.awt.Paint paint77 = null;
        paintMap74.put((java.lang.Comparable) '4', paint77);
        org.jfree.chart.util.LogFormat logFormat83 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer85 = null;
        java.text.FieldPosition fieldPosition86 = null;
        java.lang.StringBuffer stringBuffer87 = logFormat83.format((-1L), stringBuffer85, fieldPosition86);
        boolean boolean88 = paintMap74.containsKey((java.lang.Comparable) (-1L));
        boolean boolean89 = objectList1.equals((java.lang.Object) paintMap74);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer40 and stringBuffer87", (stringBuffer40.compareTo(stringBuffer87) == 0) == stringBuffer40.equals(stringBuffer87));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        java.lang.Object obj4 = objectList1.clone();
        java.lang.Object obj5 = objectList1.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat7 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean8 = relativeDateFormat7.isLenient();
        java.text.ParsePosition parsePosition10 = null;
        java.util.Date date11 = relativeDateFormat7.parse("m", parsePosition10);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat12 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str13 = relativeDateFormat12.getHourSuffix();
        boolean boolean14 = relativeDateFormat12.getShowZeroHours();
        java.lang.String str15 = relativeDateFormat12.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat20 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat20.setMinimumIntegerDigits(1);
        boolean boolean23 = logFormat20.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer31 = null;
        java.text.FieldPosition fieldPosition32 = null;
        java.lang.StringBuffer stringBuffer33 = logFormat29.format((-1L), stringBuffer31, fieldPosition32);
        java.text.FieldPosition fieldPosition34 = null;
        java.lang.StringBuffer stringBuffer35 = logFormat20.format((long) (short) 10, stringBuffer31, fieldPosition34);
        relativeDateFormat12.setHourFormatter((java.text.NumberFormat) logFormat20);
        relativeDateFormat7.setMinuteFormatter((java.text.NumberFormat) logFormat20);
        java.lang.String str38 = relativeDateFormat7.getDaySuffix();
        long long39 = relativeDateFormat7.getBaseMillis();
        objectList1.set(7, (java.lang.Object) relativeDateFormat7);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and obj4.", objectList1.equals(obj4) == obj4.equals(objectList1));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.lang.Object obj8 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        relativeDateFormat0.setBaseMillis((long) 4);
        java.util.TimeZone timeZone11 = relativeDateFormat0.getTimeZone();
        org.jfree.chart.util.ObjectList objectList13 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat14 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str15 = relativeDateFormat14.getHourSuffix();
        boolean boolean16 = relativeDateFormat14.getShowZeroHours();
        java.lang.String str17 = relativeDateFormat14.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat22 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat22.setMinimumIntegerDigits(1);
        boolean boolean25 = logFormat22.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer33 = null;
        java.text.FieldPosition fieldPosition34 = null;
        java.lang.StringBuffer stringBuffer35 = logFormat31.format((-1L), stringBuffer33, fieldPosition34);
        java.text.FieldPosition fieldPosition36 = null;
        java.lang.StringBuffer stringBuffer37 = logFormat22.format((long) (short) 10, stringBuffer33, fieldPosition36);
        relativeDateFormat14.setHourFormatter((java.text.NumberFormat) logFormat22);
        java.lang.String str39 = relativeDateFormat14.getHourSuffix();
        boolean boolean40 = objectList13.equals((java.lang.Object) relativeDateFormat14);
        java.lang.Object obj41 = objectList13.clone();
        int int42 = objectList13.size();
        java.lang.Object obj43 = objectList13.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat44 = new org.jfree.chart.util.RelativeDateFormat();
        relativeDateFormat44.setMinuteSuffix("\u221e");
        int int47 = objectList13.indexOf((java.lang.Object) relativeDateFormat44);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat48 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str49 = relativeDateFormat48.getHourSuffix();
        boolean boolean50 = relativeDateFormat48.getShowZeroHours();
        java.text.NumberFormat numberFormat51 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat48.setNumberFormat(numberFormat51);
        java.text.DateFormat dateFormat53 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone54 = dateFormat53.getTimeZone();
        dateFormat53.setLenient(true);
        java.util.Calendar calendar57 = dateFormat53.getCalendar();
        relativeDateFormat48.setCalendar(calendar57);
        relativeDateFormat44.setCalendar(calendar57);
        relativeDateFormat0.setCalendar(calendar57);
        org.jfree.chart.util.ObjectList objectList62 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat63 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str64 = relativeDateFormat63.getHourSuffix();
        boolean boolean65 = relativeDateFormat63.getShowZeroHours();
        java.lang.String str66 = relativeDateFormat63.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat71 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat71.setMinimumIntegerDigits(1);
        boolean boolean74 = logFormat71.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat80 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer82 = null;
        java.text.FieldPosition fieldPosition83 = null;
        java.lang.StringBuffer stringBuffer84 = logFormat80.format((-1L), stringBuffer82, fieldPosition83);
        java.text.FieldPosition fieldPosition85 = null;
        java.lang.StringBuffer stringBuffer86 = logFormat71.format((long) (short) 10, stringBuffer82, fieldPosition85);
        relativeDateFormat63.setHourFormatter((java.text.NumberFormat) logFormat71);
        java.lang.String str88 = relativeDateFormat63.getHourSuffix();
        boolean boolean89 = objectList62.equals((java.lang.Object) relativeDateFormat63);
        java.util.TimeZone timeZone90 = relativeDateFormat63.getTimeZone();
        relativeDateFormat0.setTimeZone(timeZone90);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer35 and stringBuffer84", (stringBuffer35.compareTo(stringBuffer84) == 0) == stringBuffer35.equals(stringBuffer84));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        boolean boolean2 = paintMap0.containsKey((java.lang.Comparable) (short) 10);
        paintMap0.clear();
        java.lang.Object obj4 = paintMap0.clone();
        org.jfree.chart.util.ObjectList objectList6 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj8 = objectList6.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation10 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList6.set((int) (short) 1, (java.lang.Object) rotation10);
        java.lang.String str12 = rotation10.toString();
        double double13 = rotation10.getFactor();
        double double14 = rotation10.getFactor();
        double double15 = rotation10.getFactor();
        java.awt.Paint paint16 = paintMap0.getPaint((java.lang.Comparable) double15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj4", paintMap0.equals(obj4) ? paintMap0.hashCode() == obj4.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        java.lang.String str41 = relativeDateFormat7.getSecondSuffix();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat43 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        long long44 = relativeDateFormat43.getBaseMillis();
        org.jfree.chart.util.LogFormat logFormat49 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat49.setMinimumIntegerDigits(1);
        logFormat49.setGroupingUsed(false);
        java.text.DateFormat dateFormat54 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone55 = dateFormat54.getTimeZone();
        boolean boolean56 = logFormat49.equals((java.lang.Object) dateFormat54);
        relativeDateFormat43.setDayFormatter((java.text.NumberFormat) logFormat49);
        java.lang.String str58 = relativeDateFormat43.getDaySuffix();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat59 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str60 = relativeDateFormat59.getHourSuffix();
        boolean boolean61 = relativeDateFormat59.getShowZeroHours();
        java.lang.String str62 = relativeDateFormat59.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat67 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat67.setMinimumIntegerDigits(1);
        boolean boolean70 = logFormat67.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat76 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer78 = null;
        java.text.FieldPosition fieldPosition79 = null;
        java.lang.StringBuffer stringBuffer80 = logFormat76.format((-1L), stringBuffer78, fieldPosition79);
        java.text.FieldPosition fieldPosition81 = null;
        java.lang.StringBuffer stringBuffer82 = logFormat67.format((long) (short) 10, stringBuffer78, fieldPosition81);
        relativeDateFormat59.setHourFormatter((java.text.NumberFormat) logFormat67);
        relativeDateFormat59.setPositivePrefix("Rotation.CLOCKWISE");
        java.text.NumberFormat numberFormat86 = relativeDateFormat59.getNumberFormat();
        relativeDateFormat43.setMinuteFormatter(numberFormat86);
        relativeDateFormat7.setMinuteFormatter(numberFormat86);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer35 and stringBuffer80", (stringBuffer35.compareTo(stringBuffer80) == 0) == stringBuffer35.equals(stringBuffer80));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.text.ParsePosition parsePosition6 = null;
        java.util.Date date7 = relativeDateFormat0.parse("", parsePosition6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat8 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str9 = relativeDateFormat8.getHourSuffix();
        boolean boolean10 = relativeDateFormat8.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat15 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int16 = logFormat15.getMaximumFractionDigits();
        logFormat15.setGroupingUsed(true);
        logFormat15.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition22 = null;
        java.lang.Object obj23 = logFormat15.parseObject("", parsePosition22);
        org.jfree.chart.util.LogFormat logFormat28 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat28.setMinimumIntegerDigits(1);
        boolean boolean31 = logFormat28.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat37 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer39 = null;
        java.text.FieldPosition fieldPosition40 = null;
        java.lang.StringBuffer stringBuffer41 = logFormat37.format((-1L), stringBuffer39, fieldPosition40);
        java.text.FieldPosition fieldPosition42 = null;
        java.lang.StringBuffer stringBuffer43 = logFormat28.format((long) (short) 10, stringBuffer39, fieldPosition42);
        org.jfree.chart.util.LogFormat logFormat48 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int49 = logFormat48.getMaximumFractionDigits();
        logFormat48.setGroupingUsed(true);
        logFormat48.setGroupingUsed(false);
        logFormat48.setMaximumIntegerDigits((-1));
        logFormat28.setExponentFormat((java.text.NumberFormat) logFormat48);
        boolean boolean57 = logFormat15.equals((java.lang.Object) logFormat28);
        relativeDateFormat8.setMinuteFormatter((java.text.NumberFormat) logFormat15);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat15);
        relativeDateFormat0.setBaseMillis((long) 8);
        java.text.NumberFormat numberFormat62 = relativeDateFormat0.getNumberFormat();
        org.jfree.chart.util.LogFormat logFormat67 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat67.setMinimumIntegerDigits(1);
        boolean boolean70 = logFormat67.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat76 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer78 = null;
        java.text.FieldPosition fieldPosition79 = null;
        java.lang.StringBuffer stringBuffer80 = logFormat76.format((-1L), stringBuffer78, fieldPosition79);
        java.text.FieldPosition fieldPosition81 = null;
        java.lang.StringBuffer stringBuffer82 = logFormat67.format((long) (short) 10, stringBuffer78, fieldPosition81);
        org.jfree.chart.util.LogFormat logFormat87 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int88 = logFormat87.getMaximumFractionDigits();
        logFormat87.setGroupingUsed(true);
        logFormat87.setGroupingUsed(false);
        logFormat87.setMaximumIntegerDigits((-1));
        logFormat67.setExponentFormat((java.text.NumberFormat) logFormat87);
        java.text.NumberFormat numberFormat96 = logFormat67.getExponentFormat();
        boolean boolean97 = logFormat67.isParseIntegerOnly();
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat67);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer41 and stringBuffer80", (stringBuffer41.compareTo(stringBuffer80) == 0) == stringBuffer41.equals(stringBuffer80));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int10 = logFormat9.getMaximumFractionDigits();
        logFormat9.setGroupingUsed(true);
        logFormat9.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        java.lang.StringBuffer stringBuffer18 = logFormat9.format((java.lang.Object) 10, stringBuffer16, fieldPosition17);
        java.lang.String str20 = logFormat9.format(0L);
        java.lang.Object obj21 = logFormat9.clone();
        java.lang.String str23 = logFormat9.format((java.lang.Object) (byte) -1);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat9);
        relativeDateFormat0.setDaySuffix("LegendRenderingOrder.REVERSE");
        java.util.Calendar calendar27 = relativeDateFormat0.getCalendar();
        org.jfree.chart.util.ObjectList objectList29 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj30 = objectList29.clone();
        java.lang.Object obj31 = objectList29.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat32 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str33 = relativeDateFormat32.getHourSuffix();
        boolean boolean34 = relativeDateFormat32.getShowZeroHours();
        java.lang.String str35 = relativeDateFormat32.getMinuteSuffix();
        long long36 = relativeDateFormat32.getBaseMillis();
        java.lang.String str37 = relativeDateFormat32.getHourSuffix();
        relativeDateFormat32.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat44 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int45 = logFormat44.getMaximumFractionDigits();
        logFormat44.setGroupingUsed(true);
        logFormat44.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer51 = null;
        java.text.FieldPosition fieldPosition52 = null;
        java.lang.StringBuffer stringBuffer53 = logFormat44.format((java.lang.Object) 10, stringBuffer51, fieldPosition52);
        java.lang.String str55 = logFormat44.format(0L);
        java.lang.Object obj56 = logFormat44.clone();
        java.lang.String str58 = logFormat44.format((java.lang.Object) (byte) -1);
        relativeDateFormat32.setNumberFormat((java.text.NumberFormat) logFormat44);
        int int60 = objectList29.indexOf((java.lang.Object) logFormat44);
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat44);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer18 and stringBuffer53", (stringBuffer18.compareTo(stringBuffer53) == 0) == stringBuffer18.equals(stringBuffer53));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        java.lang.Object obj1 = objectList0.clone();
        objectList0.clear();
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int8 = logFormat7.getMaximumFractionDigits();
        logFormat7.setGroupingUsed(true);
        logFormat7.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer14 = null;
        java.text.FieldPosition fieldPosition15 = null;
        java.lang.StringBuffer stringBuffer16 = logFormat7.format((java.lang.Object) 10, stringBuffer14, fieldPosition15);
        java.lang.String str18 = logFormat7.format(0L);
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        java.lang.StringBuffer stringBuffer22 = logFormat7.format(1L, stringBuffer20, fieldPosition21);
        int int23 = objectList0.indexOf((java.lang.Object) logFormat7);
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat29.setMinimumIntegerDigits(1);
        boolean boolean32 = logFormat29.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int39 = logFormat38.getMaximumFractionDigits();
        logFormat38.setGroupingUsed(true);
        logFormat38.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer45 = null;
        java.text.FieldPosition fieldPosition46 = null;
        java.lang.StringBuffer stringBuffer47 = logFormat38.format((java.lang.Object) 10, stringBuffer45, fieldPosition46);
        java.text.FieldPosition fieldPosition48 = null;
        java.lang.StringBuffer stringBuffer49 = logFormat29.format((double) 2, stringBuffer45, fieldPosition48);
        java.text.FieldPosition fieldPosition50 = null;
        java.lang.StringBuffer stringBuffer51 = logFormat7.format((-1L), stringBuffer49, fieldPosition50);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer16 and stringBuffer47", (stringBuffer16.compareTo(stringBuffer47) == 0) == stringBuffer16.equals(stringBuffer47));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        paintList0.clear();
        java.lang.Object obj5 = paintList0.clone();
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int11 = logFormat10.getMaximumFractionDigits();
        logFormat10.setGroupingUsed(true);
        logFormat10.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        java.lang.StringBuffer stringBuffer19 = logFormat10.format((java.lang.Object) 10, stringBuffer17, fieldPosition18);
        java.lang.String str21 = logFormat10.format(0L);
        java.lang.Object obj22 = logFormat10.clone();
        java.lang.String str24 = logFormat10.format((java.lang.Object) (byte) -1);
        logFormat10.setGroupingUsed(false);
        boolean boolean27 = paintList0.equals((java.lang.Object) false);
        java.lang.Object obj28 = null;
        boolean boolean29 = paintList0.equals(obj28);
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder30 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList32 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean33 = legendRenderingOrder30.equals((java.lang.Object) objectList32);
        java.lang.Object obj34 = objectList32.clone();
        boolean boolean35 = paintList0.equals((java.lang.Object) objectList32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on paintList0 and objectList32.", paintList0.equals(objectList32) == objectList32.equals(paintList0));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = paintMap0.getPaint((java.lang.Comparable) 128);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        java.awt.Paint paint6 = paintMap0.getPaint((java.lang.Comparable) "NaN");
        java.awt.Paint paint8 = null;
        paintMap0.put((java.lang.Comparable) ' ', paint8);
        boolean boolean11 = paintMap0.containsKey((java.lang.Comparable) 4);
        org.jfree.chart.util.LogFormat logFormat15 = new org.jfree.chart.util.LogFormat(10.0d, "", false);
        org.jfree.chart.util.LogFormat logFormat21 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat21.setMinimumIntegerDigits(1);
        boolean boolean24 = logFormat21.isGroupingUsed();
        boolean boolean25 = logFormat21.isGroupingUsed();
        java.lang.String str27 = logFormat21.format((long) (short) 100);
        org.jfree.chart.util.LogFormat logFormat33 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat35 = new org.jfree.chart.util.LogFormat();
        logFormat35.setParseIntegerOnly(true);
        logFormat35.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat45 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat45.setMinimumIntegerDigits(1);
        boolean boolean48 = logFormat45.isGroupingUsed();
        logFormat45.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat51 = logFormat45.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat57 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int58 = logFormat57.getMaximumFractionDigits();
        logFormat57.setGroupingUsed(true);
        logFormat57.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer64 = null;
        java.text.FieldPosition fieldPosition65 = null;
        java.lang.StringBuffer stringBuffer66 = logFormat57.format((java.lang.Object) 10, stringBuffer64, fieldPosition65);
        java.text.FieldPosition fieldPosition67 = null;
        java.lang.StringBuffer stringBuffer68 = logFormat45.format(0.0d, stringBuffer66, fieldPosition67);
        java.text.FieldPosition fieldPosition69 = null;
        java.lang.StringBuffer stringBuffer70 = logFormat35.format((double) ' ', stringBuffer66, fieldPosition69);
        java.text.FieldPosition fieldPosition71 = null;
        java.lang.StringBuffer stringBuffer72 = logFormat33.format((-1.0d), stringBuffer66, fieldPosition71);
        java.text.FieldPosition fieldPosition73 = null;
        java.lang.StringBuffer stringBuffer74 = logFormat21.format((long) (short) 100, stringBuffer66, fieldPosition73);
        java.text.FieldPosition fieldPosition75 = null;
        java.lang.StringBuffer stringBuffer76 = logFormat15.format((double) 309, stringBuffer74, fieldPosition75);
        java.awt.Paint paint77 = paintMap0.getPaint((java.lang.Comparable) stringBuffer74);
        paintMap0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        boolean boolean35 = relativeDateFormat0.isLenient();
        java.lang.String str36 = relativeDateFormat0.getPositivePrefix();
        java.lang.String str37 = relativeDateFormat0.getPositivePrefix();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat38 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str39 = relativeDateFormat38.getHourSuffix();
        boolean boolean40 = relativeDateFormat38.getShowZeroHours();
        java.lang.String str41 = relativeDateFormat38.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat46 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat46.setMinimumIntegerDigits(1);
        boolean boolean49 = logFormat46.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat55 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer57 = null;
        java.text.FieldPosition fieldPosition58 = null;
        java.lang.StringBuffer stringBuffer59 = logFormat55.format((-1L), stringBuffer57, fieldPosition58);
        java.text.FieldPosition fieldPosition60 = null;
        java.lang.StringBuffer stringBuffer61 = logFormat46.format((long) (short) 10, stringBuffer57, fieldPosition60);
        relativeDateFormat38.setHourFormatter((java.text.NumberFormat) logFormat46);
        java.text.ParsePosition parsePosition64 = null;
        java.lang.Object obj65 = relativeDateFormat38.parseObject("Rotation.CLOCKWISE", parsePosition64);
        boolean boolean66 = relativeDateFormat38.getShowZeroDays();
        boolean boolean67 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) relativeDateFormat0, (java.lang.Object) boolean66);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer28 and stringBuffer59", (stringBuffer28.compareTo(stringBuffer59) == 0) == stringBuffer28.equals(stringBuffer59));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        java.lang.String str25 = relativeDateFormat0.getHourSuffix();
        long long26 = relativeDateFormat0.getBaseMillis();
        long long27 = relativeDateFormat0.getBaseMillis();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat28 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str29 = relativeDateFormat28.getHourSuffix();
        boolean boolean30 = relativeDateFormat28.getShowZeroHours();
        java.lang.String str31 = relativeDateFormat28.getMinuteSuffix();
        long long32 = relativeDateFormat28.getBaseMillis();
        java.lang.String str33 = relativeDateFormat28.getHourSuffix();
        relativeDateFormat28.setPositivePrefix("");
        java.lang.Object obj36 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat28);
        relativeDateFormat28.setBaseMillis((long) 4);
        relativeDateFormat28.setShowZeroDays(false);
        org.jfree.chart.util.LogFormat logFormat45 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer47 = null;
        java.text.FieldPosition fieldPosition48 = null;
        java.lang.StringBuffer stringBuffer49 = logFormat45.format((-1L), stringBuffer47, fieldPosition48);
        logFormat45.setParseIntegerOnly(true);
        boolean boolean52 = logFormat45.isGroupingUsed();
        org.jfree.chart.util.ObjectList objectList54 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj56 = objectList54.get((int) (short) 1);
        boolean boolean57 = logFormat45.equals((java.lang.Object) (short) 1);
        logFormat45.setMinimumIntegerDigits((int) (short) -1);
        relativeDateFormat28.setHourFormatter((java.text.NumberFormat) logFormat45);
        logFormat45.setMaximumIntegerDigits((int) (short) 1);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat45);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer21 and stringBuffer49", (stringBuffer21.compareTo(stringBuffer49) == 0) == stringBuffer21.equals(stringBuffer49));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        int int30 = objectList1.size();
        java.lang.Object obj31 = objectList1.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat32 = new org.jfree.chart.util.RelativeDateFormat();
        relativeDateFormat32.setMinuteSuffix("\u221e");
        int int35 = objectList1.indexOf((java.lang.Object) relativeDateFormat32);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat36 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str37 = relativeDateFormat36.getHourSuffix();
        boolean boolean38 = relativeDateFormat36.getShowZeroHours();
        java.text.NumberFormat numberFormat39 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat36.setNumberFormat(numberFormat39);
        java.text.DateFormat dateFormat41 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone42 = dateFormat41.getTimeZone();
        dateFormat41.setLenient(true);
        java.util.Calendar calendar45 = dateFormat41.getCalendar();
        relativeDateFormat36.setCalendar(calendar45);
        relativeDateFormat32.setCalendar(calendar45);
        relativeDateFormat32.setBaseMillis((long) 4);
        org.jfree.chart.util.ObjectList objectList51 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj53 = objectList51.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation55 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList51.set((int) (short) 1, (java.lang.Object) rotation55);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat57 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str58 = relativeDateFormat57.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat63 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat63.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat66 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone67 = dateFormat66.getTimeZone();
        boolean boolean68 = logFormat63.equals((java.lang.Object) timeZone67);
        relativeDateFormat57.setHourFormatter((java.text.NumberFormat) logFormat63);
        java.text.ParsePosition parsePosition71 = null;
        java.util.Date date72 = relativeDateFormat57.parse("hi!", parsePosition71);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat73 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str74 = relativeDateFormat73.getHourSuffix();
        java.lang.String str75 = relativeDateFormat73.getDaySuffix();
        boolean boolean76 = relativeDateFormat73.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat81 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer83 = null;
        java.text.FieldPosition fieldPosition84 = null;
        java.lang.StringBuffer stringBuffer85 = logFormat81.format((-1L), stringBuffer83, fieldPosition84);
        logFormat81.setParseIntegerOnly(true);
        relativeDateFormat73.setDayFormatter((java.text.NumberFormat) logFormat81);
        relativeDateFormat57.setSecondFormatter((java.text.NumberFormat) logFormat81);
        int int90 = objectList51.indexOf((java.lang.Object) relativeDateFormat57);
        relativeDateFormat57.setMinuteSuffix("5.0");
        java.text.NumberFormat numberFormat93 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat93.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean96 = numberFormat93.isParseIntegerOnly();
        int int97 = numberFormat93.getMaximumIntegerDigits();
        relativeDateFormat57.setHourFormatter(numberFormat93);
        relativeDateFormat32.setDayFormatter(numberFormat93);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList1 and objectList51.", objectList1.equals(objectList51) == objectList51.equals(objectList1));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        objectList1.clear();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat5 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str6 = relativeDateFormat5.getHourSuffix();
        boolean boolean7 = relativeDateFormat5.getShowZeroHours();
        java.lang.String str8 = relativeDateFormat5.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat13.setMinimumIntegerDigits(1);
        boolean boolean16 = logFormat13.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat22 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition25 = null;
        java.lang.StringBuffer stringBuffer26 = logFormat22.format((-1L), stringBuffer24, fieldPosition25);
        java.text.FieldPosition fieldPosition27 = null;
        java.lang.StringBuffer stringBuffer28 = logFormat13.format((long) (short) 10, stringBuffer24, fieldPosition27);
        relativeDateFormat5.setHourFormatter((java.text.NumberFormat) logFormat13);
        relativeDateFormat5.setSecondSuffix("");
        boolean boolean32 = objectList1.equals((java.lang.Object) "");
        org.jfree.chart.util.ObjectList objectList33 = new org.jfree.chart.util.ObjectList();
        java.lang.Object obj34 = objectList33.clone();
        objectList33.clear();
        java.lang.Object obj37 = objectList33.get(0);
        int int38 = objectList1.indexOf((java.lang.Object) objectList33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on objectList1 and objectList33", objectList1.equals(objectList33) ? objectList1.hashCode() == objectList33.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat46 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str47 = relativeDateFormat46.getHourSuffix();
        boolean boolean48 = relativeDateFormat46.getShowZeroHours();
        java.lang.String str49 = relativeDateFormat46.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat54 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat54.setMinimumIntegerDigits(1);
        boolean boolean57 = logFormat54.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat63 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer65 = null;
        java.text.FieldPosition fieldPosition66 = null;
        java.lang.StringBuffer stringBuffer67 = logFormat63.format((-1L), stringBuffer65, fieldPosition66);
        java.text.FieldPosition fieldPosition68 = null;
        java.lang.StringBuffer stringBuffer69 = logFormat54.format((long) (short) 10, stringBuffer65, fieldPosition68);
        relativeDateFormat46.setHourFormatter((java.text.NumberFormat) logFormat54);
        java.util.TimeZone timeZone71 = relativeDateFormat46.getTimeZone();
        long long72 = relativeDateFormat46.getBaseMillis();
        relativeDateFormat46.setSecondSuffix("m");
        boolean boolean75 = relativeDateFormat46.getShowZeroDays();
        relativeDateFormat46.setShowZeroHours(false);
        java.util.TimeZone timeZone78 = relativeDateFormat46.getTimeZone();
        boolean boolean79 = relativeDateFormat0.equals((java.lang.Object) relativeDateFormat46);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer31 and stringBuffer69", (stringBuffer31.compareTo(stringBuffer69) == 0) == stringBuffer31.equals(stringBuffer69));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        int int1 = objectList0.size();
        int int2 = objectList0.size();
        org.jfree.chart.util.ObjectList objectList4 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj6 = objectList4.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation8 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList4.set((int) (short) 1, (java.lang.Object) rotation8);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat10 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str11 = relativeDateFormat10.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat16 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat16.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat19 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone20 = dateFormat19.getTimeZone();
        boolean boolean21 = logFormat16.equals((java.lang.Object) timeZone20);
        relativeDateFormat10.setHourFormatter((java.text.NumberFormat) logFormat16);
        java.text.ParsePosition parsePosition24 = null;
        java.util.Date date25 = relativeDateFormat10.parse("hi!", parsePosition24);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat26 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str27 = relativeDateFormat26.getHourSuffix();
        java.lang.String str28 = relativeDateFormat26.getDaySuffix();
        boolean boolean29 = relativeDateFormat26.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat34 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer36 = null;
        java.text.FieldPosition fieldPosition37 = null;
        java.lang.StringBuffer stringBuffer38 = logFormat34.format((-1L), stringBuffer36, fieldPosition37);
        logFormat34.setParseIntegerOnly(true);
        relativeDateFormat26.setDayFormatter((java.text.NumberFormat) logFormat34);
        relativeDateFormat10.setSecondFormatter((java.text.NumberFormat) logFormat34);
        int int43 = objectList4.indexOf((java.lang.Object) relativeDateFormat10);
        org.jfree.chart.util.LogFormat logFormat49 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat49.setMinimumIntegerDigits(1);
        boolean boolean52 = logFormat49.isGroupingUsed();
        logFormat49.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat55 = logFormat49.getExponentFormat();
        numberFormat55.setGroupingUsed(true);
        objectList4.set((int) (short) 10, (java.lang.Object) numberFormat55);
        boolean boolean59 = objectList0.equals((java.lang.Object) numberFormat55);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on objectList0 and objectList4.", objectList0.equals(objectList4) == objectList4.equals(objectList0));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.awt.Paint paint2 = null;
        paintList0.setPaint(16, paint2);
        int int4 = paintList0.size();
        paintList0.clear();
        paintList0.clear();
        org.jfree.chart.util.PaintList paintList7 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat12 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat12.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat15 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone16 = dateFormat15.getTimeZone();
        boolean boolean17 = logFormat12.equals((java.lang.Object) timeZone16);
        boolean boolean18 = paintList7.equals((java.lang.Object) logFormat12);
        java.lang.Object obj19 = null;
        boolean boolean20 = paintList7.equals(obj19);
        java.awt.Paint paint22 = paintList7.getPaint(5);
        java.awt.Paint paint24 = null;
        paintList7.setPaint((int) '4', paint24);
        boolean boolean26 = paintList0.equals((java.lang.Object) '4');
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintList0 and paintList7", paintList0.equals(paintList7) ? paintList0.hashCode() == paintList7.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        org.jfree.chart.util.LogFormat logFormat30 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        boolean boolean31 = logFormat30.isParseIntegerOnly();
        org.jfree.chart.util.LogFormat logFormat37 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat37.setMinimumIntegerDigits(1);
        boolean boolean40 = logFormat37.isGroupingUsed();
        logFormat37.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat43 = logFormat37.getExponentFormat();
        boolean boolean45 = logFormat37.equals((java.lang.Object) 0.0f);
        int int46 = logFormat37.getMaximumIntegerDigits();
        org.jfree.chart.util.LogFormat logFormat52 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat54 = new org.jfree.chart.util.LogFormat();
        logFormat54.setParseIntegerOnly(true);
        logFormat54.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat64 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat64.setMinimumIntegerDigits(1);
        boolean boolean67 = logFormat64.isGroupingUsed();
        logFormat64.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat70 = logFormat64.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat76 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int77 = logFormat76.getMaximumFractionDigits();
        logFormat76.setGroupingUsed(true);
        logFormat76.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer83 = null;
        java.text.FieldPosition fieldPosition84 = null;
        java.lang.StringBuffer stringBuffer85 = logFormat76.format((java.lang.Object) 10, stringBuffer83, fieldPosition84);
        java.text.FieldPosition fieldPosition86 = null;
        java.lang.StringBuffer stringBuffer87 = logFormat64.format(0.0d, stringBuffer85, fieldPosition86);
        java.text.FieldPosition fieldPosition88 = null;
        java.lang.StringBuffer stringBuffer89 = logFormat54.format((double) ' ', stringBuffer85, fieldPosition88);
        java.text.FieldPosition fieldPosition90 = null;
        java.lang.StringBuffer stringBuffer91 = logFormat52.format((-1.0d), stringBuffer85, fieldPosition90);
        java.text.FieldPosition fieldPosition92 = null;
        java.lang.StringBuffer stringBuffer93 = logFormat37.format((long) 17, stringBuffer91, fieldPosition92);
        java.text.FieldPosition fieldPosition94 = null;
        java.lang.StringBuffer stringBuffer95 = logFormat30.format((long) 10, stringBuffer91, fieldPosition94);
        java.text.FieldPosition fieldPosition96 = null;
        java.lang.StringBuffer stringBuffer97 = logFormat4.format((long) 8, stringBuffer91, fieldPosition96);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer13 and stringBuffer85", (stringBuffer13.compareTo(stringBuffer85) == 0) == stringBuffer13.equals(stringBuffer85));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        relativeDateFormat0.setMinuteSuffix("Rotation.CLOCKWISE");
        java.util.TimeZone timeZone7 = relativeDateFormat0.getTimeZone();
        java.lang.Object obj8 = relativeDateFormat0.clone();
        boolean boolean9 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat10 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str11 = relativeDateFormat10.getHourSuffix();
        boolean boolean12 = relativeDateFormat10.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int18 = logFormat17.getMaximumFractionDigits();
        logFormat17.setGroupingUsed(true);
        logFormat17.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition24 = null;
        java.lang.Object obj25 = logFormat17.parseObject("", parsePosition24);
        org.jfree.chart.util.LogFormat logFormat30 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat30.setMinimumIntegerDigits(1);
        boolean boolean33 = logFormat30.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat39 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer41 = null;
        java.text.FieldPosition fieldPosition42 = null;
        java.lang.StringBuffer stringBuffer43 = logFormat39.format((-1L), stringBuffer41, fieldPosition42);
        java.text.FieldPosition fieldPosition44 = null;
        java.lang.StringBuffer stringBuffer45 = logFormat30.format((long) (short) 10, stringBuffer41, fieldPosition44);
        org.jfree.chart.util.LogFormat logFormat50 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int51 = logFormat50.getMaximumFractionDigits();
        logFormat50.setGroupingUsed(true);
        logFormat50.setGroupingUsed(false);
        logFormat50.setMaximumIntegerDigits((-1));
        logFormat30.setExponentFormat((java.text.NumberFormat) logFormat50);
        boolean boolean59 = logFormat17.equals((java.lang.Object) logFormat30);
        relativeDateFormat10.setMinuteFormatter((java.text.NumberFormat) logFormat17);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat17);
        org.jfree.chart.util.PaintList paintList62 = new org.jfree.chart.util.PaintList();
        int int63 = paintList62.size();
        java.awt.Paint paint65 = null;
        paintList62.setPaint((int) (short) 0, paint65);
        org.jfree.chart.util.LogFormat logFormat71 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int72 = logFormat71.getMaximumFractionDigits();
        logFormat71.setGroupingUsed(true);
        logFormat71.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer78 = null;
        java.text.FieldPosition fieldPosition79 = null;
        java.lang.StringBuffer stringBuffer80 = logFormat71.format((java.lang.Object) 10, stringBuffer78, fieldPosition79);
        java.lang.String str82 = logFormat71.format(0L);
        java.lang.Object obj83 = logFormat71.clone();
        java.lang.String str85 = logFormat71.format((java.lang.Object) (byte) -1);
        logFormat71.setGroupingUsed(false);
        boolean boolean88 = paintList62.equals((java.lang.Object) false);
        java.lang.Object obj89 = paintList62.clone();
        java.lang.Object obj90 = paintList62.clone();
        boolean boolean91 = logFormat17.equals((java.lang.Object) paintList62);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer45 and stringBuffer80", (stringBuffer45.compareTo(stringBuffer80) == 0) == stringBuffer45.equals(stringBuffer80));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        java.util.Calendar calendar27 = relativeDateFormat0.getCalendar();
        org.jfree.chart.util.LogFormat logFormat32 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int33 = logFormat32.getMaximumFractionDigits();
        logFormat32.setGroupingUsed(true);
        logFormat32.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer39 = null;
        java.text.FieldPosition fieldPosition40 = null;
        java.lang.StringBuffer stringBuffer41 = logFormat32.format((java.lang.Object) 10, stringBuffer39, fieldPosition40);
        java.lang.String str43 = logFormat32.format(0L);
        java.lang.Object obj44 = logFormat32.clone();
        java.lang.String str46 = logFormat32.format((double) (byte) 0);
        boolean boolean47 = logFormat32.isParseIntegerOnly();
        java.text.ParsePosition parsePosition49 = null;
        java.lang.Number number50 = logFormat32.parse("Rotation.CLOCKWISE", parsePosition49);
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat32);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer23 and stringBuffer41", (stringBuffer23.compareTo(stringBuffer41) == 0) == stringBuffer23.equals(stringBuffer41));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) 5, paint3);
        paintMap0.clear();
        java.awt.Paint paint7 = paintMap0.getPaint((java.lang.Comparable) 1.0d);
        java.lang.Object obj8 = paintMap0.clone();
        java.lang.Object obj9 = paintMap0.clone();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj8", paintMap0.equals(obj8) ? paintMap0.hashCode() == obj8.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        java.awt.Paint paint6 = paintMap0.getPaint((java.lang.Comparable) "NaN");
        java.awt.Paint paint8 = null;
        paintMap0.put((java.lang.Comparable) ' ', paint8);
        paintMap0.clear();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj1", paintMap0.equals(obj1) ? paintMap0.hashCode() == obj1.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        java.awt.Paint paint3 = paintMap0.getPaint((java.lang.Comparable) true);
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat();
        logFormat4.setParseIntegerOnly(true);
        logFormat4.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat14.setMinimumIntegerDigits(1);
        boolean boolean17 = logFormat14.isGroupingUsed();
        logFormat14.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat20 = logFormat14.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int27 = logFormat26.getMaximumFractionDigits();
        logFormat26.setGroupingUsed(true);
        logFormat26.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer33 = null;
        java.text.FieldPosition fieldPosition34 = null;
        java.lang.StringBuffer stringBuffer35 = logFormat26.format((java.lang.Object) 10, stringBuffer33, fieldPosition34);
        java.text.FieldPosition fieldPosition36 = null;
        java.lang.StringBuffer stringBuffer37 = logFormat14.format(0.0d, stringBuffer35, fieldPosition36);
        java.text.FieldPosition fieldPosition38 = null;
        java.lang.StringBuffer stringBuffer39 = logFormat4.format((double) ' ', stringBuffer35, fieldPosition38);
        java.awt.Paint paint40 = paintMap0.getPaint((java.lang.Comparable) stringBuffer35);
        org.jfree.chart.util.ObjectList objectList42 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj44 = objectList42.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation46 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList42.set((int) (short) 1, (java.lang.Object) rotation46);
        java.awt.Paint paint48 = paintMap0.getPaint((java.lang.Comparable) (short) 1);
        java.lang.Object obj49 = null;
        boolean boolean50 = paintMap0.equals(obj49);
        java.lang.Object obj51 = paintMap0.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat53 = new org.jfree.chart.util.RelativeDateFormat((long) 16);
        java.text.ParsePosition parsePosition55 = null;
        java.util.Date date56 = relativeDateFormat53.parse("\24415.000000", parsePosition55);
        relativeDateFormat53.setSecondSuffix("3.05");
        java.util.Calendar calendar59 = relativeDateFormat53.getCalendar();
        java.awt.Paint paint60 = paintMap0.getPaint((java.lang.Comparable) calendar59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintMap0 and obj51", paintMap0.equals(obj51) ? paintMap0.hashCode() == obj51.hashCode() : true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        org.jfree.chart.util.LogFormat logFormat46 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat46.setMinimumIntegerDigits(1);
        boolean boolean49 = logFormat46.isGroupingUsed();
        logFormat46.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat52 = logFormat46.getExponentFormat();
        numberFormat52.setGroupingUsed(true);
        objectList1.set((int) (short) 10, (java.lang.Object) numberFormat52);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat57 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str58 = relativeDateFormat57.getHourSuffix();
        boolean boolean59 = relativeDateFormat57.getShowZeroHours();
        java.lang.String str60 = relativeDateFormat57.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat65 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat65.setMinimumIntegerDigits(1);
        boolean boolean68 = logFormat65.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat74 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer76 = null;
        java.text.FieldPosition fieldPosition77 = null;
        java.lang.StringBuffer stringBuffer78 = logFormat74.format((-1L), stringBuffer76, fieldPosition77);
        java.text.FieldPosition fieldPosition79 = null;
        java.lang.StringBuffer stringBuffer80 = logFormat65.format((long) (short) 10, stringBuffer76, fieldPosition79);
        relativeDateFormat57.setHourFormatter((java.text.NumberFormat) logFormat65);
        relativeDateFormat57.setPositivePrefix("Rotation.CLOCKWISE");
        java.text.NumberFormat numberFormat84 = relativeDateFormat57.getNumberFormat();
        java.text.NumberFormat numberFormat85 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat85.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean88 = numberFormat85.isParseIntegerOnly();
        java.math.RoundingMode roundingMode89 = numberFormat85.getRoundingMode();
        numberFormat84.setRoundingMode(roundingMode89);
        java.math.RoundingMode roundingMode91 = numberFormat84.getRoundingMode();
        java.text.NumberFormat numberFormat92 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean93 = numberFormat92.isGroupingUsed();
        int int94 = numberFormat92.getMinimumIntegerDigits();
        java.util.Currency currency95 = numberFormat92.getCurrency();
        numberFormat84.setCurrency(currency95);
        objectList1.set(52, (java.lang.Object) currency95);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer35 and stringBuffer78", (stringBuffer35.compareTo(stringBuffer78) == 0) == stringBuffer35.equals(stringBuffer78));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        paintList0.clear();
        java.lang.Object obj5 = paintList0.clone();
        org.jfree.chart.util.LogFormat logFormat10 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int11 = logFormat10.getMaximumFractionDigits();
        logFormat10.setGroupingUsed(true);
        logFormat10.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer17 = null;
        java.text.FieldPosition fieldPosition18 = null;
        java.lang.StringBuffer stringBuffer19 = logFormat10.format((java.lang.Object) 10, stringBuffer17, fieldPosition18);
        java.lang.String str21 = logFormat10.format(0L);
        java.lang.Object obj22 = logFormat10.clone();
        java.lang.String str24 = logFormat10.format((java.lang.Object) (byte) -1);
        logFormat10.setGroupingUsed(false);
        boolean boolean27 = paintList0.equals((java.lang.Object) false);
        java.lang.Object obj28 = null;
        boolean boolean29 = paintList0.equals(obj28);
        java.awt.Paint paint31 = paintList0.getPaint(2147483647);
        java.awt.Paint paint33 = null;
        paintList0.setPaint(100, paint33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on paintList0 and obj5", paintList0.equals(obj5) ? paintList0.hashCode() == obj5.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.STANDARD;
        java.lang.String str1 = legendRenderingOrder0.toString();
        org.jfree.chart.PaintMap paintMap2 = new org.jfree.chart.PaintMap();
        java.lang.Object obj3 = paintMap2.clone();
        java.awt.Paint paint5 = null;
        paintMap2.put((java.lang.Comparable) '4', paint5);
        org.jfree.chart.util.LogFormat logFormat11 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        java.lang.StringBuffer stringBuffer15 = logFormat11.format((-1L), stringBuffer13, fieldPosition14);
        boolean boolean16 = paintMap2.containsKey((java.lang.Comparable) (-1L));
        org.jfree.chart.util.LogFormat logFormat21 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat21.setMinimumIntegerDigits(1);
        boolean boolean24 = logFormat21.isGroupingUsed();
        logFormat21.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat27 = logFormat21.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat33 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int34 = logFormat33.getMaximumFractionDigits();
        logFormat33.setGroupingUsed(true);
        logFormat33.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer40 = null;
        java.text.FieldPosition fieldPosition41 = null;
        java.lang.StringBuffer stringBuffer42 = logFormat33.format((java.lang.Object) 10, stringBuffer40, fieldPosition41);
        java.text.FieldPosition fieldPosition43 = null;
        java.lang.StringBuffer stringBuffer44 = logFormat21.format(0.0d, stringBuffer42, fieldPosition43);
        java.awt.Paint paint45 = null;
        paintMap2.put((java.lang.Comparable) stringBuffer44, paint45);
        java.awt.Paint paint48 = paintMap2.getPaint((java.lang.Comparable) "m");
        boolean boolean49 = legendRenderingOrder0.equals((java.lang.Object) paintMap2);
        org.jfree.chart.util.LogFormat logFormat54 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int55 = logFormat54.getMaximumFractionDigits();
        logFormat54.setGroupingUsed(true);
        logFormat54.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer61 = null;
        java.text.FieldPosition fieldPosition62 = null;
        java.lang.StringBuffer stringBuffer63 = logFormat54.format((java.lang.Object) 10, stringBuffer61, fieldPosition62);
        java.awt.Paint paint64 = null;
        paintMap2.put((java.lang.Comparable) 10, paint64);
        org.junit.Assert.assertTrue("Contract failed: compareTo-equals on stringBuffer42 and stringBuffer63", (stringBuffer42.compareTo(stringBuffer63) == 0) == stringBuffer42.equals(stringBuffer63));
    }
}

