import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(32, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) 1, 0.0f);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, (double) 4, (double) 0L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 13, (int) (short) 100, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        relativeDateFormat0.setMinuteSuffix("Rotation.CLOCKWISE");
        relativeDateFormat0.setMinuteSuffix("SortOrder.ASCENDING");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat9 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str10 = relativeDateFormat9.getHourSuffix();
        java.lang.String str11 = relativeDateFormat9.getDaySuffix();
        java.util.Calendar calendar12 = relativeDateFormat9.getCalendar();
        relativeDateFormat0.setCalendar(calendar12);
        relativeDateFormat0.setLenient(false);
        java.lang.String str16 = relativeDateFormat0.getDaySuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertNotNull(calendar12);
// flaky "1) test0504(RegressionTest1)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1758659488423,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=28,MILLISECOND=423,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency38 = logFormat20.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "m" + "'", str15, "m");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(stringBuffer33);
        org.junit.Assert.assertEquals(stringBuffer33.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer35);
        org.junit.Assert.assertEquals(stringBuffer35.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        java.text.NumberFormat numberFormat18 = logFormat4.getExponentFormat();
        java.lang.String str20 = numberFormat18.format((long) 64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = numberFormat18.parseObject("d");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "2) test0506(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "64.0" + "'", str20, "64.0");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.text.ParsePosition parsePosition4 = null;
        java.util.Date date5 = relativeDateFormat0.parse("5.0", parsePosition4);
        java.text.ParsePosition parsePosition7 = null;
        java.util.Date date8 = relativeDateFormat0.parse("\24414.00", parsePosition7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(40, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        boolean boolean45 = relativeDateFormat1.isLenient();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(date9);
// flaky "3) test0509(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u221e" + "'", str20, "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(number41);
        org.junit.Assert.assertNotNull(numberFormat42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.jfree.chart.util.Rotation rotation0 = org.jfree.chart.util.Rotation.CLOCKWISE;
        double double1 = rotation0.getFactor();
        org.junit.Assert.assertTrue("'" + rotation0 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation0.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 1, 6, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) (short) 1, (double) 4L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("2.03", jFreeChart1, true);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(0.0d, "", "h", false);
        java.text.NumberFormat numberFormat5 = logFormat4.getExponentFormat();
        java.lang.Object obj6 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) numberFormat5);
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 3);
        java.text.NumberFormat numberFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            relativeDateFormat1.setDayFormatter(numberFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'formatter' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.awt.Shape shape0 = null;
        java.io.ObjectOutputStream objectOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape0, objectOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.awt.Shape shape0 = null;
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape0, rectangleAnchor1, (double) (byte) 100, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, (int) (byte) 10, 100, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int20 = logFormat19.getMaximumFractionDigits();
        logFormat19.setGroupingUsed(true);
        logFormat19.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition26 = null;
        java.lang.Object obj27 = logFormat19.parseObject("", parsePosition26);
        org.jfree.chart.util.LogFormat logFormat32 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat32.setMinimumIntegerDigits(1);
        boolean boolean35 = logFormat32.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat41 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer43 = null;
        java.text.FieldPosition fieldPosition44 = null;
        java.lang.StringBuffer stringBuffer45 = logFormat41.format((-1L), stringBuffer43, fieldPosition44);
        java.text.FieldPosition fieldPosition46 = null;
        java.lang.StringBuffer stringBuffer47 = logFormat32.format((long) (short) 10, stringBuffer43, fieldPosition46);
        org.jfree.chart.util.LogFormat logFormat52 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int53 = logFormat52.getMaximumFractionDigits();
        logFormat52.setGroupingUsed(true);
        logFormat52.setGroupingUsed(false);
        logFormat52.setMaximumIntegerDigits((-1));
        logFormat32.setExponentFormat((java.text.NumberFormat) logFormat52);
        boolean boolean61 = logFormat19.equals((java.lang.Object) logFormat32);
        logFormat32.setMaximumIntegerDigits((int) (short) 1);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat32);
        boolean boolean65 = relativeDateFormat0.getShowZeroDays();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\24415.00" + "'", str11, "\24415.00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer47);
        org.junit.Assert.assertEquals(stringBuffer47.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        int int1 = objectList0.size();
        objectList0.clear();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setMinuteSuffix("SortOrder.DESCENDING");
        long long8 = relativeDateFormat4.getBaseMillis();
        objectList0.set(64, (java.lang.Object) relativeDateFormat4);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        objectList0.set((int) '4', (java.lang.Object) numberFormat11);
        int int13 = objectList0.size();
        int int14 = objectList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 65 + "'", int13 == 65);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 65 + "'", int14 == 65);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition11 = null;
        java.lang.Object obj12 = logFormat4.parseObject("", parsePosition11);
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
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat17);
        java.text.NumberFormat numberFormat61 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setExponentFormat(numberFormat61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'format' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        java.lang.StringBuffer stringBuffer8 = logFormat4.format((-1L), stringBuffer6, fieldPosition7);
        logFormat4.setParseIntegerOnly(true);
        boolean boolean11 = logFormat4.isGroupingUsed();
        java.lang.Object obj12 = null;
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat();
        logFormat19.setParseIntegerOnly(true);
        logFormat19.setParseIntegerOnly(false);
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
        java.text.FieldPosition fieldPosition53 = null;
        java.lang.StringBuffer stringBuffer54 = logFormat19.format((double) ' ', stringBuffer50, fieldPosition53);
        java.text.FieldPosition fieldPosition55 = null;
        java.lang.StringBuffer stringBuffer56 = logFormat17.format((-1.0d), stringBuffer50, fieldPosition55);
        java.text.FieldPosition fieldPosition57 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer58 = logFormat4.format(obj12, stringBuffer56, fieldPosition57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuffer8);
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(numberFormat35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(stringBuffer50);
        org.junit.Assert.assertEquals(stringBuffer50.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer52);
// flaky "4) test0523(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer52.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer54);
        org.junit.Assert.assertEquals(stringBuffer54.toString(), "10^1.51");
        org.junit.Assert.assertNotNull(stringBuffer56);
        org.junit.Assert.assertEquals(stringBuffer56.toString(), "NaN");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        java.text.ParsePosition parsePosition16 = null;
        java.util.Date date17 = relativeDateFormat0.parse("NaN", parsePosition16);
        java.util.Calendar calendar18 = relativeDateFormat0.getCalendar();
        java.text.NumberFormat numberFormat19 = null;
        // The following exception was thrown during execution in test generation
        try {
            relativeDateFormat0.setHourFormatter(numberFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'formatter' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\24415.00" + "'", str11, "\24415.00");
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "5) test0524(RegressionTest1)":         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1758659489760,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=29,MILLISECOND=760,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) 10, (float) (-1));
        org.jfree.chart.util.PaintList paintList3 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getIntegerInstance();
        int int5 = numberFormat4.getMaximumIntegerDigits();
        boolean boolean6 = paintList3.equals((java.lang.Object) int5);
        java.awt.Paint paint8 = null;
        paintList3.setPaint(11, paint8);
        java.lang.Object obj10 = paintList3.clone();
        java.lang.Object obj11 = null;
        boolean boolean12 = paintList3.equals(obj11);
        boolean boolean13 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) (-1), obj11);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(numberFormat4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean1 = numberFormat0.isParseIntegerOnly();
        boolean boolean2 = numberFormat0.isParseIntegerOnly();
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 5, (double) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer27);
// flaky "6) test0528(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer27.toString(), "\u221e");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) ' ', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.rotateShape(shape1, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.clone(shape5);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.clone(shape7);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape8, rectangleAnchor9, (double) 0.5f, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        boolean boolean10 = logFormat5.equals((java.lang.Object) timeZone9);
        boolean boolean11 = paintList0.equals((java.lang.Object) logFormat5);
        paintList0.clear();
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 4);
        boolean boolean4 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape3);
        java.io.ObjectOutputStream objectOutputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape3, objectOutputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 15);
        java.lang.String str2 = relativeDateFormat1.getSecondSuffix();
        long long3 = relativeDateFormat1.getBaseMillis();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s" + "'", str2, "s");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 15L + "'", long3 == 15L);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        java.text.NumberFormat numberFormat25 = logFormat9.getExponentFormat();
        java.text.ParsePosition parsePosition27 = null;
        java.lang.Number number28 = logFormat9.parse("LegendRenderingOrder.REVERSE", parsePosition27);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(stringBuffer18);
        org.junit.Assert.assertEquals(stringBuffer18.toString(), "3.32");
// flaky "7) test0534(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u221e" + "'", str20, "\u221e");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NaN" + "'", str23, "NaN");
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNull(number28);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(14, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        logFormat12.setMaximumFractionDigits((int) (byte) 0);
        logFormat12.setGroupingUsed(true);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtils.createDiagonalCross(10.0f, (float) '#');
        boolean boolean27 = logFormat12.equals((java.lang.Object) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(date7);
// flaky "8) test0537(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        java.text.NumberFormat numberFormat16 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean17 = numberFormat16.isGroupingUsed();
        int int18 = numberFormat16.getMinimumIntegerDigits();
        java.util.Currency currency19 = numberFormat16.getCurrency();
        // The following exception was thrown during execution in test generation
        try {
            logFormat8.setCurrency(currency19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuffer12);
        org.junit.Assert.assertEquals(stringBuffer12.toString(), "NaN");
        org.junit.Assert.assertNotNull(numberFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(currency19);
        org.junit.Assert.assertEquals(currency19.toString(), "XXX");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, (int) (short) 100, (int) (byte) 1, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.awt.Shape shape0 = null;
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.clone(shape0);
        org.junit.Assert.assertNull(shape1);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        java.text.ParsePosition parsePosition16 = null;
        java.util.Date date17 = relativeDateFormat0.parse("NaN", parsePosition16);
        java.util.Calendar calendar18 = relativeDateFormat0.getCalendar();
        relativeDateFormat0.setBaseMillis((long) 0);
        java.util.Date date21 = null;
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat22 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean23 = relativeDateFormat22.isLenient();
        org.jfree.chart.util.LogFormat logFormat28 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int29 = logFormat28.getMaximumFractionDigits();
        logFormat28.setGroupingUsed(true);
        logFormat28.setParseIntegerOnly(true);
        java.lang.String str35 = logFormat28.format((double) 0L);
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat42 = new org.jfree.chart.util.LogFormat();
        logFormat42.setParseIntegerOnly(true);
        logFormat42.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat52 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat52.setMinimumIntegerDigits(1);
        boolean boolean55 = logFormat52.isGroupingUsed();
        logFormat52.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat58 = logFormat52.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat64 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int65 = logFormat64.getMaximumFractionDigits();
        logFormat64.setGroupingUsed(true);
        logFormat64.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer71 = null;
        java.text.FieldPosition fieldPosition72 = null;
        java.lang.StringBuffer stringBuffer73 = logFormat64.format((java.lang.Object) 10, stringBuffer71, fieldPosition72);
        java.text.FieldPosition fieldPosition74 = null;
        java.lang.StringBuffer stringBuffer75 = logFormat52.format(0.0d, stringBuffer73, fieldPosition74);
        java.text.FieldPosition fieldPosition76 = null;
        java.lang.StringBuffer stringBuffer77 = logFormat42.format((double) ' ', stringBuffer73, fieldPosition76);
        java.text.FieldPosition fieldPosition78 = null;
        java.lang.StringBuffer stringBuffer79 = logFormat40.format((-1.0d), stringBuffer73, fieldPosition78);
        java.text.FieldPosition fieldPosition80 = null;
        java.lang.StringBuffer stringBuffer81 = relativeDateFormat22.format((java.lang.Object) 0L, stringBuffer79, fieldPosition80);
        java.text.FieldPosition fieldPosition82 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer83 = relativeDateFormat0.format(date21, stringBuffer81, fieldPosition82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\24415.00" + "'", str11, "\24415.00");
        org.junit.Assert.assertNull(date17);
        org.junit.Assert.assertNotNull(calendar18);
// flaky "9) test0542(RegressionTest1)":         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1758659491239,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=31,MILLISECOND=239,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
// flaky "1) test0542(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u221e" + "'", str35, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(stringBuffer73);
        org.junit.Assert.assertEquals(stringBuffer73.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer75);
// flaky "1) test0542(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer75.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer77);
        org.junit.Assert.assertEquals(stringBuffer77.toString(), "10^1.51");
        org.junit.Assert.assertNotNull(stringBuffer79);
        org.junit.Assert.assertEquals(stringBuffer79.toString(), "NaN0h0m0.000s");
        org.junit.Assert.assertNotNull(stringBuffer81);
        org.junit.Assert.assertEquals(stringBuffer81.toString(), "NaN0h0m0.000s");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(40, 6, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape0, (-1.0d), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        java.lang.String str35 = numberFormat33.format((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "3.32" + "'", str35, "3.32");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        java.awt.Paint paint5 = null;
        paintList0.setPaint(11, paint5);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat7 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str8 = relativeDateFormat7.getHourSuffix();
        java.lang.String str9 = relativeDateFormat7.getDaySuffix();
        relativeDateFormat7.setDaySuffix("");
        relativeDateFormat7.setMinuteSuffix("Rotation.CLOCKWISE");
        java.util.TimeZone timeZone14 = relativeDateFormat7.getTimeZone();
        java.lang.Object obj15 = relativeDateFormat7.clone();
        boolean boolean16 = relativeDateFormat7.getShowZeroHours();
        boolean boolean17 = paintList0.equals((java.lang.Object) boolean16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        java.awt.Shape shape63 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 4);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator64 = logFormat17.formatToCharacterIterator((java.lang.Object) shape63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(shape63);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        boolean boolean8 = relativeDateFormat0.getShowZeroHours();
        long long9 = relativeDateFormat0.getBaseMillis();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) 17, (float) (short) 0);
        java.io.ObjectOutputStream objectOutputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape2, objectOutputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        java.text.ParsePosition parsePosition20 = null;
        java.lang.Object obj21 = logFormat8.parseObject("0.66", parsePosition20);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "3.32");
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat0.setPositivePrefix("\u221e");
        java.lang.String str6 = relativeDateFormat0.getPositivePrefix();
        boolean boolean7 = relativeDateFormat0.getShowZeroHours();
        java.util.TimeZone timeZone8 = relativeDateFormat0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = relativeDateFormat0.parse("\24414.00");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"?14.00\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u221e" + "'", str6, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        boolean boolean10 = logFormat5.equals((java.lang.Object) timeZone9);
        boolean boolean11 = paintList0.equals((java.lang.Object) logFormat5);
        java.awt.Paint paint13 = paintList0.getPaint((int) (byte) -1);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(paint13);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        dateFormat0.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, 17, 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) (short) 1);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        logFormat4.setGroupingUsed(false);
        logFormat4.setMaximumIntegerDigits((int) (byte) 10);
        java.lang.String str12 = logFormat4.format((double) 0L);
// flaky "10) test0556(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u221e" + "'", str12, "\u221e");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        java.lang.Object obj4 = objectList1.clone();
        java.lang.Object obj6 = objectList1.get(100);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.text.ParsePosition parsePosition9 = null;
        java.util.Date date10 = relativeDateFormat0.parse("LegendRenderingOrder.STANDARD", parsePosition9);
        java.lang.String str11 = relativeDateFormat0.getMinuteSuffix();
        java.util.Date date12 = null;
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat();
        logFormat13.setParseIntegerOnly(true);
        logFormat13.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat23.setMinimumIntegerDigits(1);
        boolean boolean26 = logFormat23.isGroupingUsed();
        logFormat23.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat29 = logFormat23.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat35 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int36 = logFormat35.getMaximumFractionDigits();
        logFormat35.setGroupingUsed(true);
        logFormat35.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer42 = null;
        java.text.FieldPosition fieldPosition43 = null;
        java.lang.StringBuffer stringBuffer44 = logFormat35.format((java.lang.Object) 10, stringBuffer42, fieldPosition43);
        java.text.FieldPosition fieldPosition45 = null;
        java.lang.StringBuffer stringBuffer46 = logFormat23.format(0.0d, stringBuffer44, fieldPosition45);
        java.text.FieldPosition fieldPosition47 = null;
        java.lang.StringBuffer stringBuffer48 = logFormat13.format((double) ' ', stringBuffer44, fieldPosition47);
        java.text.FieldPosition fieldPosition49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer50 = relativeDateFormat0.format(date12, stringBuffer44, fieldPosition49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "m" + "'", str11, "m");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer46);
// flaky "11) test0558(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer46.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer48);
        org.junit.Assert.assertEquals(stringBuffer48.toString(), "10^1.51");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 5, 8, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        relativeDateFormat0.setMinuteSuffix("Rotation.CLOCKWISE");
        relativeDateFormat0.setMinuteSuffix("SortOrder.ASCENDING");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat9 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str10 = relativeDateFormat9.getHourSuffix();
        java.lang.String str11 = relativeDateFormat9.getDaySuffix();
        java.util.Calendar calendar12 = relativeDateFormat9.getCalendar();
        relativeDateFormat0.setCalendar(calendar12);
        relativeDateFormat0.setLenient(false);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat16 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str17 = relativeDateFormat16.getHourSuffix();
        boolean boolean18 = relativeDateFormat16.getShowZeroHours();
        java.lang.String str19 = relativeDateFormat16.getMinuteSuffix();
        long long20 = relativeDateFormat16.getBaseMillis();
        java.lang.String str21 = relativeDateFormat16.getHourSuffix();
        relativeDateFormat16.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat28 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int29 = logFormat28.getMaximumFractionDigits();
        logFormat28.setGroupingUsed(true);
        logFormat28.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer35 = null;
        java.text.FieldPosition fieldPosition36 = null;
        java.lang.StringBuffer stringBuffer37 = logFormat28.format((java.lang.Object) 10, stringBuffer35, fieldPosition36);
        java.lang.String str39 = logFormat28.format(0L);
        java.lang.Object obj40 = logFormat28.clone();
        java.lang.String str42 = logFormat28.format((java.lang.Object) (byte) -1);
        relativeDateFormat16.setNumberFormat((java.text.NumberFormat) logFormat28);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat44 = new org.jfree.chart.util.RelativeDateFormat();
        relativeDateFormat44.setMinuteSuffix("\u221e");
        java.text.DateFormat dateFormat47 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone48 = dateFormat47.getTimeZone();
        dateFormat47.setLenient(true);
        java.util.Calendar calendar51 = dateFormat47.getCalendar();
        relativeDateFormat44.setCalendar(calendar51);
        relativeDateFormat16.setCalendar(calendar51);
        relativeDateFormat0.setCalendar(calendar51);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertNotNull(calendar12);
// flaky "12) test0560(RegressionTest1)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1758659492419,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=32,MILLISECOND=419,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "m" + "'", str19, "m");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(stringBuffer37);
        org.junit.Assert.assertEquals(stringBuffer37.toString(), "3.32");
// flaky "2) test0560(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u221e" + "'", str39, "\u221e");
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "NaN" + "'", str42, "NaN");
        org.junit.Assert.assertNotNull(dateFormat47);
        org.junit.Assert.assertNotNull(timeZone48);
        org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar51);
// flaky "2) test0560(RegressionTest1)":         org.junit.Assert.assertEquals(calendar51.toString(), "java.util.GregorianCalendar[time=-765948507581,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=32,MILLISECOND=419,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        boolean boolean3 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str4 = relativeDateFormat0.getMinuteSuffix();
        boolean boolean5 = relativeDateFormat0.isLenient();
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = relativeDateFormat0.format(date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "m" + "'", str4, "m");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        logFormat4.setGroupingUsed(true);
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode24 = logFormat4.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "13) test0562(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "0.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.0" + "'", str21, "4.0");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat8);
        boolean boolean10 = logFormat8.isGroupingUsed();
        logFormat8.setMinimumIntegerDigits(64);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) timeZone31);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object.clone(): unable to call method.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 15, 8, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        long long4 = relativeDateFormat0.getBaseMillis();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = relativeDateFormat0.parseObject("\24415.00");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape3, (double) 16, (double) 2);
        boolean boolean7 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape6);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape11, (double) 16, (double) 2);
        boolean boolean15 = org.jfree.chart.util.ShapeUtils.equal(shape9, shape14);
        boolean boolean16 = org.jfree.chart.util.ShapeUtils.equal(shape6, shape14);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat8);
        java.lang.Object obj10 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        relativeDateFormat0.setDaySuffix("5.7");
        java.lang.String str13 = relativeDateFormat0.getHourSuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
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
        org.jfree.chart.util.ObjectList objectList31 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat32 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str33 = relativeDateFormat32.getHourSuffix();
        boolean boolean34 = relativeDateFormat32.getShowZeroHours();
        java.lang.String str35 = relativeDateFormat32.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat40.setMinimumIntegerDigits(1);
        boolean boolean43 = logFormat40.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat49 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer51 = null;
        java.text.FieldPosition fieldPosition52 = null;
        java.lang.StringBuffer stringBuffer53 = logFormat49.format((-1L), stringBuffer51, fieldPosition52);
        java.text.FieldPosition fieldPosition54 = null;
        java.lang.StringBuffer stringBuffer55 = logFormat40.format((long) (short) 10, stringBuffer51, fieldPosition54);
        relativeDateFormat32.setHourFormatter((java.text.NumberFormat) logFormat40);
        java.lang.String str57 = relativeDateFormat32.getHourSuffix();
        boolean boolean58 = objectList31.equals((java.lang.Object) relativeDateFormat32);
        java.util.TimeZone timeZone59 = relativeDateFormat32.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator60 = logFormat4.formatToCharacterIterator((java.lang.Object) relativeDateFormat32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer27);
// flaky "14) test0569(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer27.toString(), "\u221e");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "h" + "'", str33, "h");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "m" + "'", str35, "m");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(stringBuffer53);
        org.junit.Assert.assertEquals(stringBuffer53.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "h" + "'", str57, "h");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(timeZone59);
        org.junit.Assert.assertEquals(timeZone59.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.awt.Paint paint2 = null;
        paintList0.setPaint(16, paint2);
        java.lang.Object obj4 = paintList0.clone();
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) '#', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.text.ParsePosition parsePosition6 = null;
        java.util.Date date7 = relativeDateFormat0.parse("", parsePosition6);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat9 = dateFormat8.getNumberFormat();
        numberFormat9.setParseIntegerOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator12 = relativeDateFormat0.formatToCharacterIterator((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(numberFormat9);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        java.text.NumberFormat numberFormat4 = relativeDateFormat0.getNumberFormat();
        numberFormat4.setMinimumIntegerDigits((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat0.setParseIntegerOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = numberFormat0.parseObject("0.0");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 100);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        org.jfree.chart.util.LogFormat logFormat20 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int21 = logFormat20.getMaximumFractionDigits();
        logFormat20.setGroupingUsed(true);
        logFormat20.setGroupingUsed(false);
        logFormat20.setMaximumIntegerDigits((-1));
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat20);
        int int29 = logFormat20.getMinimumIntegerDigits();
        java.text.NumberFormat numberFormat30 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat30.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean33 = numberFormat30.isParseIntegerOnly();
        java.math.RoundingMode roundingMode34 = numberFormat30.getRoundingMode();
        // The following exception was thrown during execution in test generation
        try {
            logFormat20.setRoundingMode(roundingMode34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + roundingMode34 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode34.equals(java.math.RoundingMode.HALF_EVEN));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat27 = new org.jfree.chart.util.RelativeDateFormat();
        relativeDateFormat27.setMinuteSuffix("\u221e");
        java.lang.String str30 = relativeDateFormat27.getMinuteSuffix();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = logFormat24.format((java.lang.Object) relativeDateFormat27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "15) test0578(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "3) test0578(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\u221e" + "'", str30, "\u221e");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        logFormat4.setGroupingUsed(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "16) test0579(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "4) test0579(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar11);
// flaky "17) test0581(RegressionTest1)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=-765948505621,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=34,MILLISECOND=379,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, (int) (byte) 0, 4, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (4) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 65, 2147483647, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, (int) (short) 100, 7, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        logFormat4.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat10 = logFormat4.getExponentFormat();
        numberFormat10.setGroupingUsed(true);
        numberFormat10.setMinimumFractionDigits((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.jfree.chart.util.Rotation rotation0 = org.jfree.chart.util.Rotation.CLOCKWISE;
        java.lang.String str1 = rotation0.toString();
        java.lang.String str2 = rotation0.toString();
        java.lang.String str3 = rotation0.toString();
        double double4 = rotation0.getFactor();
        org.junit.Assert.assertTrue("'" + rotation0 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation0.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Rotation.CLOCKWISE" + "'", str1, "Rotation.CLOCKWISE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rotation.CLOCKWISE" + "'", str2, "Rotation.CLOCKWISE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rotation.CLOCKWISE" + "'", str3, "Rotation.CLOCKWISE");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean1 = relativeDateFormat0.isLenient();
        java.text.ParsePosition parsePosition3 = null;
        java.util.Date date4 = relativeDateFormat0.parse("m", parsePosition3);
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
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat13);
        java.lang.String str31 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setPositivePrefix("5.7");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat34 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str35 = relativeDateFormat34.getHourSuffix();
        boolean boolean36 = relativeDateFormat34.getShowZeroHours();
        java.lang.String str37 = relativeDateFormat34.getMinuteSuffix();
        long long38 = relativeDateFormat34.getBaseMillis();
        boolean boolean39 = relativeDateFormat34.getShowZeroHours();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat40 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str41 = relativeDateFormat40.getHourSuffix();
        boolean boolean42 = relativeDateFormat40.getShowZeroHours();
        java.text.NumberFormat numberFormat43 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat40.setNumberFormat(numberFormat43);
        java.text.DateFormat dateFormat45 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone46 = dateFormat45.getTimeZone();
        dateFormat45.setLenient(true);
        java.util.Calendar calendar49 = dateFormat45.getCalendar();
        relativeDateFormat40.setCalendar(calendar49);
        relativeDateFormat34.setCalendar(calendar49);
        relativeDateFormat0.setCalendar(calendar49);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "m" + "'", str8, "m");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(stringBuffer26);
        org.junit.Assert.assertEquals(stringBuffer26.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer28);
        org.junit.Assert.assertEquals(stringBuffer28.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "d" + "'", str31, "d");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "h" + "'", str35, "h");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "m" + "'", str37, "m");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "h" + "'", str41, "h");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertNotNull(dateFormat45);
        org.junit.Assert.assertNotNull(timeZone46);
        org.junit.Assert.assertEquals(timeZone46.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar49);
// flaky "18) test0587(RegressionTest1)":         org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=-765948505030,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=34,MILLISECOND=970,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) 100, (float) 2);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        boolean boolean27 = logFormat24.isParseIntegerOnly();
        java.lang.String str29 = logFormat24.format((double) 0L);
        logFormat24.setMinimumFractionDigits((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "19) test0589(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "5) test0589(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky "3) test0589(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u221e" + "'", str29, "\u221e");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle(1.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.io.ObjectOutputStream objectOutputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape3, objectOutputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 3);
        relativeDateFormat1.setBaseMillis((long) 65);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList2 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean3 = legendRenderingOrder0.equals((java.lang.Object) objectList2);
        java.lang.Object obj4 = objectList2.clone();
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        java.text.NumberFormat numberFormat43 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat43.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean46 = numberFormat43.isParseIntegerOnly();
        int int47 = numberFormat43.getMaximumIntegerDigits();
        relativeDateFormat7.setHourFormatter(numberFormat43);
        java.lang.String str49 = relativeDateFormat7.getHourSuffix();
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
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 309 + "'", int47 == 309);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "h" + "'", str49, "h");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(64, 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 64");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 64);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, (int) (byte) 0, 2, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (2) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        relativeDateFormat0.setMinuteSuffix("Rotation.CLOCKWISE");
        java.lang.String str7 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setSecondSuffix("h");
        java.text.NumberFormat numberFormat10 = relativeDateFormat0.getNumberFormat();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(numberFormat10);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        boolean boolean3 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str4 = relativeDateFormat0.getMinuteSuffix();
        boolean boolean5 = relativeDateFormat0.isLenient();
        relativeDateFormat0.setShowZeroDays(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "m" + "'", str4, "m");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        java.lang.Object obj49 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) logFormat4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.STANDARD;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (short) 0, (float) 4);
        boolean boolean4 = legendRenderingOrder0.equals((java.lang.Object) 4);
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
        boolean boolean66 = legendRenderingOrder0.equals((java.lang.Object) logFormat60);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat68 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        relativeDateFormat68.setShowZeroDays(false);
        org.jfree.chart.util.PaintList paintList71 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat72 = java.text.NumberFormat.getIntegerInstance();
        int int73 = numberFormat72.getMaximumIntegerDigits();
        boolean boolean74 = paintList71.equals((java.lang.Object) int73);
        java.awt.Paint paint76 = paintList71.getPaint((int) (short) -1);
        boolean boolean77 = relativeDateFormat68.equals((java.lang.Object) (short) -1);
        org.jfree.chart.util.LogFormat logFormat82 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat82.setMinimumIntegerDigits(1);
        boolean boolean85 = logFormat82.isGroupingUsed();
        logFormat82.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat88 = logFormat82.getExponentFormat();
        boolean boolean90 = logFormat82.equals((java.lang.Object) 0.0f);
        logFormat82.setMaximumIntegerDigits(17);
        logFormat82.setMaximumIntegerDigits(32);
        relativeDateFormat68.setDayFormatter((java.text.NumberFormat) logFormat82);
        logFormat82.setMaximumFractionDigits(0);
        boolean boolean98 = legendRenderingOrder0.equals((java.lang.Object) logFormat82);
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(numberFormat72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2147483647 + "'", int73 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(paint76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(numberFormat88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        java.lang.Object obj41 = objectList1.clone();
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
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        relativeDateFormat20.setDaySuffix("\24414.00");
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
        relativeDateFormat20.setNumberFormat((java.text.NumberFormat) logFormat32);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertNotNull(stringBuffer53);
        org.junit.Assert.assertEquals(stringBuffer53.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer55);
// flaky "20) test0602(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer55.toString(), "\u221e");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        boolean boolean59 = relativeDateFormat0.equals((java.lang.Object) relativeDateFormat25);
        java.lang.String str60 = relativeDateFormat25.getDaySuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "d" + "'", str60, "d");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj2 = objectList1.clone();
        java.lang.Object obj3 = objectList1.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat4.setPositivePrefix("\u221e");
        int int10 = objectList1.indexOf((java.lang.Object) relativeDateFormat4);
        java.lang.String str11 = relativeDateFormat4.getHourSuffix();
        java.util.Date date12 = null;
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat();
        logFormat13.setParseIntegerOnly(true);
        logFormat13.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat23.setMinimumIntegerDigits(1);
        boolean boolean26 = logFormat23.isGroupingUsed();
        logFormat23.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat29 = logFormat23.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat35 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int36 = logFormat35.getMaximumFractionDigits();
        logFormat35.setGroupingUsed(true);
        logFormat35.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer42 = null;
        java.text.FieldPosition fieldPosition43 = null;
        java.lang.StringBuffer stringBuffer44 = logFormat35.format((java.lang.Object) 10, stringBuffer42, fieldPosition43);
        java.text.FieldPosition fieldPosition45 = null;
        java.lang.StringBuffer stringBuffer46 = logFormat23.format(0.0d, stringBuffer44, fieldPosition45);
        java.text.FieldPosition fieldPosition47 = null;
        java.lang.StringBuffer stringBuffer48 = logFormat13.format((double) ' ', stringBuffer44, fieldPosition47);
        java.text.FieldPosition fieldPosition49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer50 = relativeDateFormat4.format(date12, stringBuffer48, fieldPosition49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(numberFormat29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer46);
// flaky "21) test0605(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer46.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer48);
        org.junit.Assert.assertEquals(stringBuffer48.toString(), "10^1.51");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond((float) 8);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) 10, (float) (-1));
        boolean boolean5 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape4);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 128, (double) 0.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        int int25 = logFormat4.getMaximumFractionDigits();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "22) test0610(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "6) test0610(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4.0" + "'", str24, "4.0");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone8 = dateFormat7.getTimeZone();
        boolean boolean9 = logFormat4.equals((java.lang.Object) timeZone8);
        int int10 = logFormat4.getMinimumIntegerDigits();
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        java.lang.Object obj57 = objectList1.get(3);
        objectList1.clear();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(numberFormat52);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        java.awt.Paint paint5 = paintList0.getPaint((int) (short) -1);
        java.lang.Object obj6 = paintList0.clone();
        java.awt.Paint paint8 = null;
        // The following exception was thrown during execution in test generation
        try {
            paintList0.setPaint(2147483647, paint8);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483641");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer7 = null;
        java.text.FieldPosition fieldPosition8 = null;
        java.lang.StringBuffer stringBuffer9 = logFormat5.format((-1L), stringBuffer7, fieldPosition8);
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        logFormat5.setExponentFormat((java.text.NumberFormat) logFormat14);
        org.jfree.chart.PaintMap paintMap16 = new org.jfree.chart.PaintMap();
        java.lang.Object obj17 = paintMap16.clone();
        java.awt.Paint paint19 = null;
        paintMap16.put((java.lang.Comparable) '4', paint19);
        java.awt.Paint paint22 = paintMap16.getPaint((java.lang.Comparable) "NaN");
        boolean boolean23 = logFormat5.equals((java.lang.Object) paintMap16);
        dateFormat0.setNumberFormat((java.text.NumberFormat) logFormat5);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(stringBuffer9);
        org.junit.Assert.assertEquals(stringBuffer9.toString(), "NaN");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.text.ParsePosition parsePosition63 = null;
        java.lang.Object obj64 = relativeDateFormat0.parseObject("0.66", parsePosition63);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(calendar3);
// flaky "23) test0616(RegressionTest1)":         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1758659496960,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=36,MILLISECOND=960,ZONE_OFFSET=0,DST_OFFSET=0]");
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
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape2, (double) 13, (float) 3, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 15);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(12, (int) (short) 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency33 = logFormat24.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        relativeDateFormat2.setShowZeroDays(true);
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = relativeDateFormat2.format(date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross(100.0f, (float) 10);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        org.jfree.chart.util.ObjectList objectList52 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj53 = objectList52.clone();
        java.lang.Object obj54 = objectList52.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat55 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str56 = relativeDateFormat55.getHourSuffix();
        relativeDateFormat55.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat55.setPositivePrefix("\u221e");
        int int61 = objectList52.indexOf((java.lang.Object) relativeDateFormat55);
        org.jfree.chart.util.LogFormat logFormat66 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat66.setMinimumIntegerDigits(1);
        boolean boolean69 = logFormat66.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat75 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int76 = logFormat75.getMaximumFractionDigits();
        logFormat75.setGroupingUsed(true);
        logFormat75.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer82 = null;
        java.text.FieldPosition fieldPosition83 = null;
        java.lang.StringBuffer stringBuffer84 = logFormat75.format((java.lang.Object) 10, stringBuffer82, fieldPosition83);
        java.text.FieldPosition fieldPosition85 = null;
        java.lang.StringBuffer stringBuffer86 = logFormat66.format((double) 2, stringBuffer82, fieldPosition85);
        java.text.FieldPosition fieldPosition87 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer88 = relativeDateFormat0.format((java.lang.Object) objectList52, stringBuffer82, fieldPosition87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "h" + "'", str56, "h");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 3 + "'", int76 == 3);
        org.junit.Assert.assertNotNull(stringBuffer84);
        org.junit.Assert.assertEquals(stringBuffer84.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer86);
        org.junit.Assert.assertEquals(stringBuffer86.toString(), "1.0");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getInstance();
        java.lang.String str2 = numberFormat0.format((long) 64);
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "64" + "'", str2, "64");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        java.text.NumberFormat numberFormat38 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat38.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean41 = numberFormat38.isParseIntegerOnly();
        java.math.RoundingMode roundingMode42 = numberFormat38.getRoundingMode();
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setRoundingMode(roundingMode42);
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
        org.junit.Assert.assertNotNull(numberFormat38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + roundingMode42 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode42.equals(java.math.RoundingMode.HALF_EVEN));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        logFormat17.setMinimumFractionDigits(5);
        int int49 = logFormat17.getMinimumFractionDigits();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 6);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        boolean boolean2 = numberFormat1.isGroupingUsed();
        int int3 = numberFormat1.getMaximumFractionDigits();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 7, 3, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj2 = objectList1.clone();
        java.lang.Object obj3 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) objectList1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, (int) ' ', 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, 16, (int) '#', file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond((float) 6);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        java.text.DateFormat dateFormat32 = java.text.DateFormat.getTimeInstance(0);
        boolean boolean33 = objectList1.equals((java.lang.Object) 0);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateFormat32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, (int) (byte) 1, 65, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 64, 1, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(32, 309);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 309");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 309, 15, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) (short) 10);
        java.io.ObjectOutputStream objectOutputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape1, objectOutputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.lang.Object obj8 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        relativeDateFormat0.setBaseMillis((long) 4);
        relativeDateFormat0.setSecondSuffix("6.64");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat13 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str14 = relativeDateFormat13.getHourSuffix();
        boolean boolean15 = relativeDateFormat13.getShowZeroHours();
        java.lang.String str16 = relativeDateFormat13.getMinuteSuffix();
        long long17 = relativeDateFormat13.getBaseMillis();
        java.lang.String str18 = relativeDateFormat13.getHourSuffix();
        relativeDateFormat13.setPositivePrefix("");
        java.lang.Object obj21 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat13);
        relativeDateFormat13.setBaseMillis((long) 4);
        relativeDateFormat13.setShowZeroHours(true);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat26 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str27 = relativeDateFormat26.getHourSuffix();
        boolean boolean28 = relativeDateFormat26.getShowZeroHours();
        java.lang.String str29 = relativeDateFormat26.getMinuteSuffix();
        long long30 = relativeDateFormat26.getBaseMillis();
        java.text.ParsePosition parsePosition32 = null;
        java.util.Date date33 = relativeDateFormat26.parse("", parsePosition32);
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat38.setMinimumIntegerDigits(1);
        logFormat38.setGroupingUsed(false);
        java.lang.String str44 = logFormat38.format((double) 0);
        relativeDateFormat26.setNumberFormat((java.text.NumberFormat) logFormat38);
        logFormat38.setMaximumFractionDigits((int) (byte) 0);
        org.jfree.chart.util.LogFormat logFormat52 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat52.setMinimumIntegerDigits(1);
        boolean boolean55 = logFormat52.isGroupingUsed();
        logFormat52.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat58 = logFormat52.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat64 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int65 = logFormat64.getMaximumFractionDigits();
        logFormat64.setGroupingUsed(true);
        logFormat64.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer71 = null;
        java.text.FieldPosition fieldPosition72 = null;
        java.lang.StringBuffer stringBuffer73 = logFormat64.format((java.lang.Object) 10, stringBuffer71, fieldPosition72);
        java.text.FieldPosition fieldPosition74 = null;
        java.lang.StringBuffer stringBuffer75 = logFormat52.format(0.0d, stringBuffer73, fieldPosition74);
        logFormat38.setExponentFormat((java.text.NumberFormat) logFormat52);
        relativeDateFormat13.setHourFormatter((java.text.NumberFormat) logFormat52);
        org.jfree.chart.util.LogFormat logFormat82 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer84 = null;
        java.text.FieldPosition fieldPosition85 = null;
        java.lang.StringBuffer stringBuffer86 = logFormat82.format((-1L), stringBuffer84, fieldPosition85);
        java.text.FieldPosition fieldPosition87 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer88 = relativeDateFormat0.format((java.lang.Object) logFormat52, stringBuffer86, fieldPosition87);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "m" + "'", str16, "m");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "m" + "'", str29, "m");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(date33);
// flaky "24) test0640(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\u221e" + "'", str44, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(numberFormat58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertNotNull(stringBuffer73);
        org.junit.Assert.assertEquals(stringBuffer73.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer75);
// flaky "7) test0640(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer75.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer86);
        org.junit.Assert.assertEquals(stringBuffer86.toString(), "NaN");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        java.lang.Object obj47 = logFormat17.clone();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        boolean boolean5 = logFormat4.isParseIntegerOnly();
        logFormat4.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition9 = null;
        java.lang.Object obj10 = logFormat4.parseObject("LegendRenderingOrder.REVERSE", parsePosition9);
        logFormat4.setMinimumFractionDigits((int) ' ');
        java.lang.Object obj13 = logFormat4.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode14 = logFormat4.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer26 = null;
        java.text.FieldPosition fieldPosition27 = null;
        java.lang.StringBuffer stringBuffer28 = logFormat24.format((-1L), stringBuffer26, fieldPosition27);
        logFormat24.setParseIntegerOnly(true);
        boolean boolean31 = logFormat24.isGroupingUsed();
        org.jfree.chart.util.ObjectList objectList33 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj35 = objectList33.get((int) (short) 1);
        boolean boolean36 = logFormat24.equals((java.lang.Object) (short) 1);
        java.text.ParsePosition parsePosition38 = null;
        java.lang.Number number39 = logFormat24.parse("\u221e", parsePosition38);
        java.text.NumberFormat numberFormat40 = logFormat24.getExponentFormat();
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat24);
        java.text.NumberFormat numberFormat42 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean43 = numberFormat42.isGroupingUsed();
        int int44 = numberFormat42.getMinimumIntegerDigits();
        java.util.Currency currency45 = numberFormat42.getCurrency();
        // The following exception was thrown during execution in test generation
        try {
            logFormat24.setCurrency(currency45);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(date7);
// flaky "25) test0643(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer28);
        org.junit.Assert.assertEquals(stringBuffer28.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(number39);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertNotNull(numberFormat42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(currency45);
        org.junit.Assert.assertEquals(currency45.toString(), "XXX");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("3.46", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 2, 309, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("4.0", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 100, (-1), locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean1 = relativeDateFormat0.isLenient();
        java.text.ParsePosition parsePosition3 = null;
        java.util.Date date4 = relativeDateFormat0.parse("m", parsePosition3);
        relativeDateFormat0.setBaseMillis((long) 8);
        long long7 = relativeDateFormat0.getBaseMillis();
        org.jfree.chart.util.LogFormat logFormat12 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int13 = logFormat12.getMaximumFractionDigits();
        logFormat12.setGroupingUsed(true);
        logFormat12.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        java.lang.StringBuffer stringBuffer21 = logFormat12.format((java.lang.Object) 10, stringBuffer19, fieldPosition20);
        java.lang.String str23 = logFormat12.format(0L);
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat12);
        boolean boolean26 = relativeDateFormat0.equals((java.lang.Object) "NaN");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8L + "'", long7 == 8L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "3.32");
// flaky "26) test0648(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u221e" + "'", str23, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint3 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat0.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        dateFormat5.setLenient(true);
        java.util.Calendar calendar9 = dateFormat5.getCalendar();
        relativeDateFormat0.setCalendar(calendar9);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat11 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str12 = relativeDateFormat11.getHourSuffix();
        relativeDateFormat11.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat11.setSecondFormatter((java.text.NumberFormat) logFormat19);
        java.text.NumberFormat numberFormat21 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat21.setMinimumFractionDigits((int) '4');
        int int24 = numberFormat21.getMinimumIntegerDigits();
        numberFormat21.setMaximumFractionDigits(6);
        logFormat19.setExponentFormat(numberFormat21);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat19);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtils.createDownTriangle(1.0f);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtils.rotateShape(shape30, (double) 16, (float) (short) 100, (float) 1L);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtils.clone(shape36);
        java.awt.Shape shape38 = org.jfree.chart.util.ShapeUtils.clone(shape36);
        boolean boolean39 = org.jfree.chart.util.ShapeUtils.equal(shape30, shape38);
        boolean boolean40 = relativeDateFormat0.equals((java.lang.Object) boolean39);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar9);
// flaky "27) test0650(RegressionTest1)":         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-765948501293,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=38,MILLISECOND=707,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.jfree.chart.util.LogFormat logFormat0 = new org.jfree.chart.util.LogFormat();
        logFormat0.setParseIntegerOnly(true);
        logFormat0.setParseIntegerOnly(false);
        boolean boolean5 = logFormat0.isGroupingUsed();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        java.text.DateFormat dateFormat60 = java.text.DateFormat.getDateInstance();
        dateFormat60.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = logFormat4.format((java.lang.Object) dateFormat60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(numberFormat57);
        org.junit.Assert.assertNotNull(numberFormat59);
        org.junit.Assert.assertNotNull(dateFormat60);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList2 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean3 = legendRenderingOrder0.equals((java.lang.Object) objectList2);
        // The following exception was thrown during execution in test generation
        try {
            objectList2.set(4, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        java.lang.StringBuffer stringBuffer8 = logFormat4.format((-1L), stringBuffer6, fieldPosition7);
        logFormat4.setParseIntegerOnly(true);
        boolean boolean11 = logFormat4.isGroupingUsed();
        logFormat4.setGroupingUsed(true);
        org.junit.Assert.assertNotNull(stringBuffer8);
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.clone(shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.clone(shape3);
        boolean boolean6 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape3);
        java.io.ObjectOutputStream objectOutputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape3, objectOutputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(0.0d, "", "h", false);
        java.text.NumberFormat numberFormat5 = logFormat4.getExponentFormat();
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder6 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList8 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean9 = legendRenderingOrder6.equals((java.lang.Object) objectList8);
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer16 = null;
        java.text.FieldPosition fieldPosition17 = null;
        java.lang.StringBuffer stringBuffer18 = logFormat14.format((-1L), stringBuffer16, fieldPosition17);
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        logFormat14.setExponentFormat((java.text.NumberFormat) logFormat23);
        boolean boolean25 = legendRenderingOrder6.equals((java.lang.Object) logFormat23);
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat();
        logFormat26.setParseIntegerOnly(true);
        logFormat26.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat36.setMinimumIntegerDigits(1);
        boolean boolean39 = logFormat36.isGroupingUsed();
        logFormat36.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat42 = logFormat36.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat48 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int49 = logFormat48.getMaximumFractionDigits();
        logFormat48.setGroupingUsed(true);
        logFormat48.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer55 = null;
        java.text.FieldPosition fieldPosition56 = null;
        java.lang.StringBuffer stringBuffer57 = logFormat48.format((java.lang.Object) 10, stringBuffer55, fieldPosition56);
        java.text.FieldPosition fieldPosition58 = null;
        java.lang.StringBuffer stringBuffer59 = logFormat36.format(0.0d, stringBuffer57, fieldPosition58);
        java.text.FieldPosition fieldPosition60 = null;
        java.lang.StringBuffer stringBuffer61 = logFormat26.format((double) ' ', stringBuffer57, fieldPosition60);
        java.text.FieldPosition fieldPosition62 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer63 = logFormat4.format((java.lang.Object) logFormat23, stringBuffer57, fieldPosition62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertNotNull(legendRenderingOrder6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(stringBuffer18);
        org.junit.Assert.assertEquals(stringBuffer18.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(numberFormat42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(stringBuffer57);
        org.junit.Assert.assertEquals(stringBuffer57.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer59);
// flaky "28) test0657(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer59.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer61);
        org.junit.Assert.assertEquals(stringBuffer61.toString(), "10^1.51");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 65, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(0.0d, "", "h", false);
        java.text.NumberFormat numberFormat5 = logFormat4.getExponentFormat();
        logFormat4.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean8 = logFormat4.isParseIntegerOnly();
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat10 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone11 = dateFormat10.getTimeZone();
        dateFormat9.setTimeZone(timeZone11);
        org.jfree.chart.util.LogFormat logFormat17 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int18 = logFormat17.getMaximumFractionDigits();
        logFormat17.setGroupingUsed(true);
        logFormat17.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer24 = null;
        java.text.FieldPosition fieldPosition25 = null;
        java.lang.StringBuffer stringBuffer26 = logFormat17.format((java.lang.Object) 10, stringBuffer24, fieldPosition25);
        dateFormat9.setNumberFormat((java.text.NumberFormat) logFormat17);
        java.text.NumberFormat numberFormat28 = dateFormat9.getNumberFormat();
        logFormat4.setExponentFormat(numberFormat28);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency30 = numberFormat28.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(dateFormat10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(stringBuffer26);
        org.junit.Assert.assertEquals(stringBuffer26.toString(), "3.32");
        org.junit.Assert.assertNotNull(numberFormat28);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        relativeDateFormat0.setBaseMillis(8L);
        boolean boolean64 = relativeDateFormat0.getShowZeroDays();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(calendar3);
// flaky "29) test0660(RegressionTest1)":         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1758659499360,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=39,MILLISECOND=360,ZONE_OFFSET=0,DST_OFFSET=0]");
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        int int1 = objectList0.size();
        objectList0.clear();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setMinuteSuffix("SortOrder.DESCENDING");
        long long8 = relativeDateFormat4.getBaseMillis();
        objectList0.set(64, (java.lang.Object) relativeDateFormat4);
        java.text.NumberFormat numberFormat11 = java.text.NumberFormat.getPercentInstance();
        objectList0.set((int) '4', (java.lang.Object) numberFormat11);
        int int13 = objectList0.size();
        java.lang.Object obj15 = objectList0.get((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 65 + "'", int13 == 65);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        logFormat17.setMinimumFractionDigits(5);
        java.text.NumberFormat numberFormat49 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat17.setExponentFormat(numberFormat49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'format' argument.");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat27 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str28 = relativeDateFormat27.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat33 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat33.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat36 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone37 = dateFormat36.getTimeZone();
        boolean boolean38 = logFormat33.equals((java.lang.Object) timeZone37);
        relativeDateFormat27.setHourFormatter((java.text.NumberFormat) logFormat33);
        relativeDateFormat27.setLenient(false);
        java.lang.String str42 = relativeDateFormat27.getSecondSuffix();
        org.jfree.chart.util.LogFormat logFormat47 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat47.setMinimumIntegerDigits(1);
        boolean boolean50 = logFormat47.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat56 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer58 = null;
        java.text.FieldPosition fieldPosition59 = null;
        java.lang.StringBuffer stringBuffer60 = logFormat56.format((-1L), stringBuffer58, fieldPosition59);
        java.text.FieldPosition fieldPosition61 = null;
        java.lang.StringBuffer stringBuffer62 = logFormat47.format((long) (short) 10, stringBuffer58, fieldPosition61);
        java.text.FieldPosition fieldPosition63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer64 = relativeDateFormat0.format((java.lang.Object) relativeDateFormat27, stringBuffer62, fieldPosition63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(stringBuffer18);
        org.junit.Assert.assertEquals(stringBuffer18.toString(), "3.32");
// flaky "30) test0663(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u221e" + "'", str20, "\u221e");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NaN" + "'", str23, "NaN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertNotNull(dateFormat36);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "s" + "'", str42, "s");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(stringBuffer60);
        org.junit.Assert.assertEquals(stringBuffer60.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer62);
        org.junit.Assert.assertEquals(stringBuffer62.toString(), "3.32");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("m", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"index\" because \"pos\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        java.lang.String str18 = relativeDateFormat6.getSecondSuffix();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "s" + "'", str18, "s");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 4L, (double) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        relativeDateFormat0.setLenient(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(stringBuffer41);
        org.junit.Assert.assertEquals(stringBuffer41.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 100, (double) 13, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, (float) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond((float) 10);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((-1), locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency72 = logFormat60.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "m" + "'", str10, "m");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "h" + "'", str34, "h");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "d" + "'", str35, "d");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateFormat52);
        org.junit.Assert.assertNotNull(dateFormat53);
        org.junit.Assert.assertNotNull(timeZone54);
        org.junit.Assert.assertEquals(timeZone54.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertNotNull(stringBuffer69);
        org.junit.Assert.assertEquals(stringBuffer69.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(12, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.rotateShape(shape1, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.io.ObjectOutputStream objectOutputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape6, objectOutputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        int int27 = logFormat4.getMaximumFractionDigits();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "31) test0676(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "8) test0676(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
        logFormat4.setMinimumIntegerDigits(7);
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode38 = logFormat4.getRoundingMode();
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
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) 6, (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((-1), locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        boolean boolean8 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat9 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean10 = relativeDateFormat9.isLenient();
        java.text.ParsePosition parsePosition12 = null;
        java.util.Date date13 = relativeDateFormat9.parse("m", parsePosition12);
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
        relativeDateFormat9.setMinuteFormatter((java.text.NumberFormat) logFormat22);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat22);
        java.lang.String str41 = relativeDateFormat0.getDaySuffix();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat42 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str43 = relativeDateFormat42.getHourSuffix();
        java.lang.String str44 = relativeDateFormat42.getDaySuffix();
        relativeDateFormat42.setDaySuffix("");
        relativeDateFormat42.setMinuteSuffix("Rotation.CLOCKWISE");
        java.util.TimeZone timeZone49 = relativeDateFormat42.getTimeZone();
        relativeDateFormat0.setTimeZone(timeZone49);
        java.text.NumberFormat numberFormat51 = relativeDateFormat0.getNumberFormat();
        java.util.Date date52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = relativeDateFormat0.format(date52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "m" + "'", str17, "m");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(stringBuffer35);
        org.junit.Assert.assertEquals(stringBuffer35.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer37);
        org.junit.Assert.assertEquals(stringBuffer37.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "d" + "'", str41, "d");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "h" + "'", str43, "h");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "d" + "'", str44, "d");
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(numberFormat51);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        relativeDateFormat0.setSecondSuffix("");
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int32 = logFormat31.getMaximumFractionDigits();
        logFormat31.setGroupingUsed(true);
        logFormat31.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer38 = null;
        java.text.FieldPosition fieldPosition39 = null;
        java.lang.StringBuffer stringBuffer40 = logFormat31.format((java.lang.Object) 10, stringBuffer38, fieldPosition39);
        java.lang.String str42 = logFormat31.format(0L);
        java.lang.Object obj43 = logFormat31.clone();
        int int44 = logFormat31.getMinimumFractionDigits();
        java.text.NumberFormat numberFormat45 = logFormat31.getExponentFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = relativeDateFormat0.format((java.lang.Object) logFormat31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "3.32");
// flaky "32) test0681(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u221e" + "'", str42, "\u221e");
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(numberFormat45);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(4);
        java.lang.Object obj3 = objectList1.get((-1));
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) "4.09");
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.rotateShape(shape1, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.clone(shape5);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape5, rectangleAnchor7, (double) 14, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        relativeDateFormat0.setMinuteSuffix("Rotation.CLOCKWISE");
        relativeDateFormat0.setMinuteSuffix("SortOrder.ASCENDING");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = relativeDateFormat0.parse("64");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"64\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(16, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency21 = logFormat8.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "3.32");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat6 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat6.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone10 = dateFormat9.getTimeZone();
        boolean boolean11 = logFormat6.equals((java.lang.Object) timeZone10);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat6);
        java.lang.Object obj13 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) logFormat6);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat64 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str65 = relativeDateFormat64.getHourSuffix();
        boolean boolean66 = relativeDateFormat64.getShowZeroHours();
        java.text.NumberFormat numberFormat67 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat64.setNumberFormat(numberFormat67);
        java.text.DateFormat dateFormat69 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone70 = dateFormat69.getTimeZone();
        dateFormat69.setLenient(true);
        java.util.Calendar calendar73 = dateFormat69.getCalendar();
        relativeDateFormat64.setCalendar(calendar73);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat75 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str76 = relativeDateFormat75.getHourSuffix();
        relativeDateFormat75.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat83 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat75.setSecondFormatter((java.text.NumberFormat) logFormat83);
        java.text.NumberFormat numberFormat85 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat85.setMinimumFractionDigits((int) '4');
        int int88 = numberFormat85.getMinimumIntegerDigits();
        numberFormat85.setMaximumFractionDigits(6);
        logFormat83.setExponentFormat(numberFormat85);
        relativeDateFormat64.setHourFormatter((java.text.NumberFormat) logFormat83);
        java.lang.String str94 = logFormat83.format((double) 64);
        relativeDateFormat1.setHourFormatter((java.text.NumberFormat) logFormat83);
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "h" + "'", str65, "h");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(numberFormat67);
        org.junit.Assert.assertNotNull(dateFormat69);
        org.junit.Assert.assertNotNull(timeZone70);
        org.junit.Assert.assertEquals(timeZone70.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar73);
// flaky "33) test0690(RegressionTest1)":         org.junit.Assert.assertEquals(calendar73.toString(), "java.util.GregorianCalendar[time=-765948499332,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=40,MILLISECOND=668,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "h" + "'", str76, "h");
        org.junit.Assert.assertNotNull(numberFormat85);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "2" + "'", str94, "2");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat8);
        java.lang.Object obj10 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        boolean boolean11 = relativeDateFormat0.getShowZeroDays();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.clone(shape3);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape7, (double) 16, (double) 2);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape14, (double) 16, (double) 2);
        boolean boolean18 = org.jfree.chart.util.ShapeUtils.equal(shape12, shape17);
        boolean boolean19 = org.jfree.chart.util.ShapeUtils.equal(shape7, shape12);
        boolean boolean20 = org.jfree.chart.util.ShapeUtils.equal(shape3, shape12);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape3, (double) 40, 0.0d);
        java.awt.Shape shape27 = org.jfree.chart.util.ShapeUtils.rotateShape(shape3, (double) 100L, (float) 4, (float) 17);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtils.rotateShape(shape3, (double) 0.0f, (float) 10, (float) 64);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint32 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(shape31);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        boolean boolean52 = logFormat41.isParseIntegerOnly();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "m" + "'", str10, "m");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "h" + "'", str34, "h");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "d" + "'", str35, "d");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        relativeDateFormat2.setShowZeroHours(false);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat43 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str44 = relativeDateFormat43.getHourSuffix();
        java.lang.String str45 = relativeDateFormat43.getDaySuffix();
        boolean boolean46 = relativeDateFormat43.getShowZeroHours();
        java.lang.String str47 = relativeDateFormat43.getMinuteSuffix();
        java.util.Calendar calendar48 = relativeDateFormat43.getCalendar();
        relativeDateFormat2.setCalendar(calendar48);
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
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "h" + "'", str44, "h");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "d" + "'", str45, "d");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "m" + "'", str47, "m");
        org.junit.Assert.assertNotNull(calendar48);
// flaky "34) test0694(RegressionTest1)":         org.junit.Assert.assertEquals(calendar48.toString(), "java.util.GregorianCalendar[time=1758659500937,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=40,MILLISECOND=937,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) (short) -1, (double) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
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
        java.util.Date date26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = relativeDateFormat0.format(date26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.text.ParsePosition parsePosition9 = null;
        java.util.Date date10 = relativeDateFormat0.parse("LegendRenderingOrder.STANDARD", parsePosition9);
        java.text.ParsePosition parsePosition12 = null;
        java.util.Date date13 = relativeDateFormat0.parse("64", parsePosition12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, 64, (int) (byte) 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) '#', 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean1 = relativeDateFormat0.isLenient();
        java.text.ParsePosition parsePosition3 = null;
        java.util.Date date4 = relativeDateFormat0.parse("m", parsePosition3);
        relativeDateFormat0.setBaseMillis((long) 8);
        org.jfree.chart.util.LogFormat logFormat11 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat11);
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode13 = logFormat11.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        relativeDateFormat2.setMinuteSuffix("SortOrder.ASCENDING");
        java.lang.Class<?> wildcardClass35 = relativeDateFormat2.getClass();
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
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(309, 16, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        logFormat12.setMaximumFractionDigits((int) (byte) 0);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat22 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str23 = relativeDateFormat22.getHourSuffix();
        java.lang.String str24 = relativeDateFormat22.getDaySuffix();
        boolean boolean25 = relativeDateFormat22.getShowZeroHours();
        java.lang.String str26 = relativeDateFormat22.getMinuteSuffix();
        java.util.Calendar calendar27 = relativeDateFormat22.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator28 = logFormat12.formatToCharacterIterator((java.lang.Object) relativeDateFormat22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(date7);
// flaky "35) test0703(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "m" + "'", str26, "m");
        org.junit.Assert.assertNotNull(calendar27);
// flaky "9) test0703(RegressionTest1)":         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1758659501184,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=41,MILLISECOND=184,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency64 = numberFormat59.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        boolean boolean10 = logFormat5.equals((java.lang.Object) timeZone9);
        boolean boolean11 = paintList0.equals((java.lang.Object) logFormat5);
        boolean boolean12 = logFormat5.isParseIntegerOnly();
        java.lang.Object obj13 = logFormat5.clone();
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 12);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape2, (double) 15, 1.0f, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        java.text.NumberFormat numberFormat60 = relativeDateFormat0.getNumberFormat();
        java.util.Calendar calendar61 = relativeDateFormat0.getCalendar();
        java.lang.Class<?> wildcardClass62 = calendar61.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(stringBuffer41);
        org.junit.Assert.assertEquals(stringBuffer41.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(numberFormat60);
        org.junit.Assert.assertNotNull(calendar61);
// flaky "36) test0708(RegressionTest1)":         org.junit.Assert.assertEquals(calendar61.toString(), "java.util.GregorianCalendar[time=1758659501515,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=41,MILLISECOND=515,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, (int) (short) 1, 10, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.util.TimeZone timeZone32 = relativeDateFormat3.getTimeZone();
        java.lang.Class<?> wildcardClass33 = timeZone32.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "m" + "'", str6, "m");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "3.32");
// flaky "37) test0710(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u221e" + "'", str26, "\u221e");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NaN" + "'", str29, "NaN");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        boolean boolean59 = relativeDateFormat0.equals((java.lang.Object) relativeDateFormat25);
        java.text.DateFormat dateFormat60 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat61 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone62 = dateFormat61.getTimeZone();
        dateFormat60.setTimeZone(timeZone62);
        org.jfree.chart.util.LogFormat logFormat68 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int69 = logFormat68.getMaximumFractionDigits();
        logFormat68.setGroupingUsed(true);
        logFormat68.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer75 = null;
        java.text.FieldPosition fieldPosition76 = null;
        java.lang.StringBuffer stringBuffer77 = logFormat68.format((java.lang.Object) 10, stringBuffer75, fieldPosition76);
        dateFormat60.setNumberFormat((java.text.NumberFormat) logFormat68);
        boolean boolean79 = logFormat68.isParseIntegerOnly();
        relativeDateFormat25.setMinuteFormatter((java.text.NumberFormat) logFormat68);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dateFormat60);
        org.junit.Assert.assertNotNull(dateFormat61);
        org.junit.Assert.assertNotNull(timeZone62);
        org.junit.Assert.assertEquals(timeZone62.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertNotNull(stringBuffer77);
        org.junit.Assert.assertEquals(stringBuffer77.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        relativeDateFormat0.setHourSuffix("h");
        relativeDateFormat0.setHourSuffix("\24414.00");
        java.util.Date date7 = null;
        org.jfree.chart.util.LogFormat logFormat12 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat();
        logFormat14.setParseIntegerOnly(true);
        logFormat14.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat24.setMinimumIntegerDigits(1);
        boolean boolean27 = logFormat24.isGroupingUsed();
        logFormat24.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat30 = logFormat24.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int37 = logFormat36.getMaximumFractionDigits();
        logFormat36.setGroupingUsed(true);
        logFormat36.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer43 = null;
        java.text.FieldPosition fieldPosition44 = null;
        java.lang.StringBuffer stringBuffer45 = logFormat36.format((java.lang.Object) 10, stringBuffer43, fieldPosition44);
        java.text.FieldPosition fieldPosition46 = null;
        java.lang.StringBuffer stringBuffer47 = logFormat24.format(0.0d, stringBuffer45, fieldPosition46);
        java.text.FieldPosition fieldPosition48 = null;
        java.lang.StringBuffer stringBuffer49 = logFormat14.format((double) ' ', stringBuffer45, fieldPosition48);
        java.text.FieldPosition fieldPosition50 = null;
        java.lang.StringBuffer stringBuffer51 = logFormat12.format((-1.0d), stringBuffer45, fieldPosition50);
        java.text.FieldPosition fieldPosition52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer53 = relativeDateFormat0.format(date7, stringBuffer45, fieldPosition52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer47);
// flaky "38) test0713(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer47.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer49);
        org.junit.Assert.assertEquals(stringBuffer49.toString(), "10^1.51");
        org.junit.Assert.assertNotNull(stringBuffer51);
        org.junit.Assert.assertEquals(stringBuffer51.toString(), "NaN");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat12 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str13 = relativeDateFormat12.getHourSuffix();
        java.lang.String str14 = relativeDateFormat12.getDaySuffix();
        boolean boolean15 = relativeDateFormat12.getShowZeroHours();
        java.lang.String str16 = relativeDateFormat12.getMinuteSuffix();
        java.util.Calendar calendar17 = relativeDateFormat12.getCalendar();
        boolean boolean18 = relativeDateFormat0.equals((java.lang.Object) calendar17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date20 = relativeDateFormat0.parse("5.7");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"5.7\"");
        } catch (java.text.ParseException e) {
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
        org.junit.Assert.assertNotNull(calendar11);
// flaky "39) test0714(RegressionTest1)":         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1758659501758,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=41,MILLISECOND=758,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "m" + "'", str16, "m");
        org.junit.Assert.assertNotNull(calendar17);
// flaky "10) test0714(RegressionTest1)":         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1758659501758,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=41,MILLISECOND=758,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat64 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str65 = relativeDateFormat64.getHourSuffix();
        java.lang.String str66 = relativeDateFormat64.getDaySuffix();
        relativeDateFormat64.setDaySuffix("");
        org.jfree.chart.util.LogFormat logFormat73 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int74 = logFormat73.getMaximumFractionDigits();
        logFormat73.setGroupingUsed(true);
        logFormat73.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer80 = null;
        java.text.FieldPosition fieldPosition81 = null;
        java.lang.StringBuffer stringBuffer82 = logFormat73.format((java.lang.Object) 10, stringBuffer80, fieldPosition81);
        java.lang.String str84 = logFormat73.format(0L);
        java.lang.Object obj85 = logFormat73.clone();
        java.lang.String str87 = logFormat73.format((java.lang.Object) (byte) -1);
        relativeDateFormat64.setHourFormatter((java.text.NumberFormat) logFormat73);
        java.text.NumberFormat numberFormat89 = logFormat73.getExponentFormat();
        relativeDateFormat1.setNumberFormat((java.text.NumberFormat) logFormat73);
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "h" + "'", str65, "h");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "d" + "'", str66, "d");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 3 + "'", int74 == 3);
        org.junit.Assert.assertNotNull(stringBuffer82);
        org.junit.Assert.assertEquals(stringBuffer82.toString(), "3.32");
// flaky "40) test0715(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\u221e" + "'", str84, "\u221e");
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "NaN" + "'", str87, "NaN");
        org.junit.Assert.assertNotNull(numberFormat89);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int20 = logFormat19.getMaximumFractionDigits();
        logFormat19.setGroupingUsed(true);
        logFormat19.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition26 = null;
        java.lang.Object obj27 = logFormat19.parseObject("", parsePosition26);
        org.jfree.chart.util.LogFormat logFormat32 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat32.setMinimumIntegerDigits(1);
        boolean boolean35 = logFormat32.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat41 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer43 = null;
        java.text.FieldPosition fieldPosition44 = null;
        java.lang.StringBuffer stringBuffer45 = logFormat41.format((-1L), stringBuffer43, fieldPosition44);
        java.text.FieldPosition fieldPosition46 = null;
        java.lang.StringBuffer stringBuffer47 = logFormat32.format((long) (short) 10, stringBuffer43, fieldPosition46);
        org.jfree.chart.util.LogFormat logFormat52 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int53 = logFormat52.getMaximumFractionDigits();
        logFormat52.setGroupingUsed(true);
        logFormat52.setGroupingUsed(false);
        logFormat52.setMaximumIntegerDigits((-1));
        logFormat32.setExponentFormat((java.text.NumberFormat) logFormat52);
        boolean boolean61 = logFormat19.equals((java.lang.Object) logFormat32);
        logFormat32.setMaximumIntegerDigits((int) (short) 1);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat32);
        java.text.ParsePosition parsePosition66 = null;
        java.util.Date date67 = relativeDateFormat0.parse("3.32", parsePosition66);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\24415.00" + "'", str11, "\24415.00");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer47);
        org.junit.Assert.assertEquals(stringBuffer47.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(date67);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.jfree.chart.util.LogFormat logFormat0 = new org.jfree.chart.util.LogFormat();
        logFormat0.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition4 = null;
        java.lang.Number number5 = logFormat0.parse("6.64", parsePosition4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency6 = logFormat0.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(number5);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("64", jFreeChart1, true);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat0.setMinimumFractionDigits((int) '4');
        numberFormat0.setMaximumFractionDigits((int) (short) 100);
        numberFormat0.setParseIntegerOnly(false);
        org.junit.Assert.assertNotNull(numberFormat0);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        java.lang.String str15 = logFormat4.format(0L);
        logFormat4.setMinimumIntegerDigits((int) ' ');
        java.text.NumberFormat numberFormat18 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean19 = numberFormat18.isGroupingUsed();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat20 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str21 = relativeDateFormat20.getHourSuffix();
        boolean boolean22 = relativeDateFormat20.getShowZeroHours();
        java.lang.String str23 = relativeDateFormat20.getMinuteSuffix();
        long long24 = relativeDateFormat20.getBaseMillis();
        java.lang.String str25 = relativeDateFormat20.getHourSuffix();
        relativeDateFormat20.setPositivePrefix("");
        java.lang.Object obj28 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat20);
        relativeDateFormat20.setBaseMillis((long) 4);
        java.lang.String str31 = numberFormat18.format((java.lang.Object) 4);
        numberFormat18.setMinimumFractionDigits(17);
        java.util.Currency currency34 = numberFormat18.getCurrency();
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setCurrency(currency34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "41) test0720(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "m" + "'", str23, "m");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "4" + "'", str31, "4");
        org.junit.Assert.assertNotNull(currency34);
        org.junit.Assert.assertEquals(currency34.toString(), "XXX");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape32 = org.jfree.chart.util.ShapeUtils.clone(shape31);
        java.awt.Shape shape35 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape32, (double) (byte) 10, (double) 10.0f);
        java.awt.Shape shape37 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape41 = org.jfree.chart.util.ShapeUtils.rotateShape(shape37, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtils.clone(shape41);
        boolean boolean43 = org.jfree.chart.util.ShapeUtils.equal(shape32, shape41);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape41, (double) 0.5f, (double) 1L);
        java.awt.Shape shape49 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape46, (double) 3, (double) 100L);
        java.awt.Shape shape50 = org.jfree.chart.util.ShapeUtils.clone(shape49);
        boolean boolean51 = objectList1.equals((java.lang.Object) shape49);
        java.io.ObjectOutputStream objectOutputStream52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape49, objectOutputStream52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape32);
        org.junit.Assert.assertNotNull(shape35);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(shape41);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertNotNull(shape49);
        org.junit.Assert.assertNotNull(shape50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        java.text.NumberFormat numberFormat25 = logFormat9.getExponentFormat();
        int int26 = logFormat9.getMaximumFractionDigits();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(stringBuffer18);
        org.junit.Assert.assertEquals(stringBuffer18.toString(), "3.32");
// flaky "42) test0722(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u221e" + "'", str20, "\u221e");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NaN" + "'", str23, "NaN");
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.awt.Window[] windowArray0 = java.awt.Window.getOwnerlessWindows();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) windowArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(windowArray0);
        org.junit.Assert.assertArrayEquals(windowArray0, new java.awt.Window[] {});
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"index\" because \"pos\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setSecondSuffix("NaN");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = relativeDateFormat0.parse("\u221e");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"-?\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, (double) 16, (double) 2);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.rotateShape(shape2, (double) 10L, (float) '#', (float) 32);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtils.clone(shape11);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtils.clone(shape11);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape15, (double) 16, (double) 2);
        java.awt.Shape shape20 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape22, (double) 16, (double) 2);
        boolean boolean26 = org.jfree.chart.util.ShapeUtils.equal(shape20, shape25);
        boolean boolean27 = org.jfree.chart.util.ShapeUtils.equal(shape15, shape20);
        boolean boolean28 = org.jfree.chart.util.ShapeUtils.equal(shape11, shape20);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtils.clone(shape11);
        boolean boolean30 = org.jfree.chart.util.ShapeUtils.equal(shape2, shape29);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape2, (double) (short) 100, (float) (-1L), 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList2 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean3 = legendRenderingOrder0.equals((java.lang.Object) objectList2);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        boolean boolean6 = relativeDateFormat4.getShowZeroHours();
        java.lang.String str7 = relativeDateFormat4.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat12 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int13 = logFormat12.getMaximumFractionDigits();
        logFormat12.setGroupingUsed(true);
        logFormat12.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        java.lang.StringBuffer stringBuffer21 = logFormat12.format((java.lang.Object) 10, stringBuffer19, fieldPosition20);
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat26.setMinimumIntegerDigits(1);
        logFormat26.setGroupingUsed(false);
        logFormat12.setExponentFormat((java.text.NumberFormat) logFormat26);
        java.lang.String str33 = logFormat12.format((double) 3);
        relativeDateFormat4.setSecondFormatter((java.text.NumberFormat) logFormat12);
        boolean boolean35 = legendRenderingOrder0.equals((java.lang.Object) logFormat12);
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "m" + "'", str7, "m");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0.66" + "'", str33, "0.66");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) "h");
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 40, (int) ' ', file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, (int) (byte) 1, 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("Rotation.CLOCKWISE", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double) 16, "\24415.00", false);
        logFormat3.setMinimumFractionDigits(5);
        int int6 = logFormat3.getMaximumIntegerDigits();
        int int7 = logFormat3.getMaximumIntegerDigits();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 40 + "'", int7 == 40);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        relativeDateFormat0.setMinuteSuffix("Rotation.CLOCKWISE");
        java.lang.String str7 = relativeDateFormat0.getDaySuffix();
        java.lang.String str8 = relativeDateFormat0.getPositivePrefix();
        java.util.Date date9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = relativeDateFormat0.format(date9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        long long8 = relativeDateFormat0.getBaseMillis();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = relativeDateFormat0.parseObject("\2440.00");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint4 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        int int82 = logFormat75.getMaximumFractionDigits();
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
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 3 + "'", int82 == 3);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getNumberInstance();
        java.lang.Object obj1 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) numberFormat0);
        numberFormat0.setMaximumIntegerDigits(3);
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertNotNull(obj1);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("5.7", jFreeChart1, false);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        long long58 = relativeDateFormat0.getBaseMillis();
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
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency19 = logFormat4.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "43) test0740(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NaN" + "'", str18, "NaN");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, (int) '#', 17, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
        java.awt.Paint paint6 = paintMap0.getPaint((java.lang.Comparable) "NaN");
        boolean boolean8 = paintMap0.containsKey((java.lang.Comparable) 2);
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat(0.0d, "SortOrder.DESCENDING", "1.58", false);
        boolean boolean14 = paintMap0.equals((java.lang.Object) logFormat13);
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int20 = logFormat19.getMaximumFractionDigits();
        logFormat19.setGroupingUsed(true);
        logFormat19.setParseIntegerOnly(true);
        logFormat13.setExponentFormat((java.text.NumberFormat) logFormat19);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 16, (int) ' ', file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat12 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str13 = relativeDateFormat12.getHourSuffix();
        boolean boolean14 = relativeDateFormat12.getShowZeroHours();
        java.lang.String str15 = relativeDateFormat12.getMinuteSuffix();
        long long16 = relativeDateFormat12.getBaseMillis();
        java.lang.String str17 = relativeDateFormat12.getHourSuffix();
        relativeDateFormat12.setPositivePrefix("");
        java.lang.Object obj20 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat12);
        relativeDateFormat12.setBaseMillis((long) 4);
        relativeDateFormat12.setShowZeroHours(true);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat25 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str26 = relativeDateFormat25.getHourSuffix();
        boolean boolean27 = relativeDateFormat25.getShowZeroHours();
        java.lang.String str28 = relativeDateFormat25.getMinuteSuffix();
        long long29 = relativeDateFormat25.getBaseMillis();
        java.text.ParsePosition parsePosition31 = null;
        java.util.Date date32 = relativeDateFormat25.parse("", parsePosition31);
        org.jfree.chart.util.LogFormat logFormat37 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat37.setMinimumIntegerDigits(1);
        logFormat37.setGroupingUsed(false);
        java.lang.String str43 = logFormat37.format((double) 0);
        relativeDateFormat25.setNumberFormat((java.text.NumberFormat) logFormat37);
        logFormat37.setMaximumFractionDigits((int) (byte) 0);
        org.jfree.chart.util.LogFormat logFormat51 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat51.setMinimumIntegerDigits(1);
        boolean boolean54 = logFormat51.isGroupingUsed();
        logFormat51.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat57 = logFormat51.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat63 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int64 = logFormat63.getMaximumFractionDigits();
        logFormat63.setGroupingUsed(true);
        logFormat63.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer70 = null;
        java.text.FieldPosition fieldPosition71 = null;
        java.lang.StringBuffer stringBuffer72 = logFormat63.format((java.lang.Object) 10, stringBuffer70, fieldPosition71);
        java.text.FieldPosition fieldPosition73 = null;
        java.lang.StringBuffer stringBuffer74 = logFormat51.format(0.0d, stringBuffer72, fieldPosition73);
        logFormat37.setExponentFormat((java.text.NumberFormat) logFormat51);
        relativeDateFormat12.setHourFormatter((java.text.NumberFormat) logFormat51);
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat51);
        relativeDateFormat0.setHourSuffix("3.05");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "m" + "'", str15, "m");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "m" + "'", str28, "m");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(date32);
// flaky "44) test0744(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u221e" + "'", str43, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(numberFormat57);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertNotNull(stringBuffer72);
        org.junit.Assert.assertEquals(stringBuffer72.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer74);
// flaky "11) test0744(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer74.toString(), "\u221e");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        java.lang.String str47 = relativeDateFormat2.getPositivePrefix();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode53 = logFormat4.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
// flaky "45) test0746(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u221e" + "'", str10, "\u221e");
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
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 2147483647, 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 14);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat();
        logFormat8.setParseIntegerOnly(true);
        logFormat8.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat18 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat18.setMinimumIntegerDigits(1);
        boolean boolean21 = logFormat18.isGroupingUsed();
        logFormat18.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat24 = logFormat18.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat30 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int31 = logFormat30.getMaximumFractionDigits();
        logFormat30.setGroupingUsed(true);
        logFormat30.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer37 = null;
        java.text.FieldPosition fieldPosition38 = null;
        java.lang.StringBuffer stringBuffer39 = logFormat30.format((java.lang.Object) 10, stringBuffer37, fieldPosition38);
        java.text.FieldPosition fieldPosition40 = null;
        java.lang.StringBuffer stringBuffer41 = logFormat18.format(0.0d, stringBuffer39, fieldPosition40);
        java.text.FieldPosition fieldPosition42 = null;
        java.lang.StringBuffer stringBuffer43 = logFormat8.format((double) ' ', stringBuffer39, fieldPosition42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = logFormat4.format((java.lang.Object) stringBuffer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(numberFormat24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(stringBuffer39);
        org.junit.Assert.assertEquals(stringBuffer39.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer41);
// flaky "46) test0749(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer41.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "10^1.51");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        relativeDateFormat0.setShowZeroHours(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.clone(shape2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape3, 100.0d, (float) 3, (float) 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat8);
        java.lang.String str10 = relativeDateFormat0.getPositivePrefix();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat11 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str12 = relativeDateFormat11.getHourSuffix();
        relativeDateFormat11.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat11.setPositivePrefix("\u221e");
        java.lang.String str17 = relativeDateFormat11.getPositivePrefix();
        java.text.ParsePosition parsePosition19 = null;
        java.lang.Object obj20 = relativeDateFormat11.parseObject("3.32", parsePosition19);
        java.lang.String str21 = relativeDateFormat11.getSecondSuffix();
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat26.setMinimumIntegerDigits(1);
        boolean boolean29 = logFormat26.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat35 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer37 = null;
        java.text.FieldPosition fieldPosition38 = null;
        java.lang.StringBuffer stringBuffer39 = logFormat35.format((-1L), stringBuffer37, fieldPosition38);
        java.text.FieldPosition fieldPosition40 = null;
        java.lang.StringBuffer stringBuffer41 = logFormat26.format((long) (short) 10, stringBuffer37, fieldPosition40);
        java.text.FieldPosition fieldPosition42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer43 = relativeDateFormat0.format((java.lang.Object) relativeDateFormat11, stringBuffer41, fieldPosition42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u221e" + "'", str17, "\u221e");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "s" + "'", str21, "s");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(stringBuffer39);
        org.junit.Assert.assertEquals(stringBuffer39.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer41);
        org.junit.Assert.assertEquals(stringBuffer41.toString(), "3.32");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        java.lang.String str42 = relativeDateFormat7.getPositivePrefix();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "s" + "'", str41, "s");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, 6, (int) (byte) 1, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat6 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat6.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone10 = dateFormat9.getTimeZone();
        boolean boolean11 = logFormat6.equals((java.lang.Object) timeZone10);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat6);
        int int13 = logFormat6.getMaximumFractionDigits();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        relativeDateFormat0.setHourSuffix("h");
        relativeDateFormat0.setHourSuffix("d");
        boolean boolean7 = relativeDateFormat0.getShowZeroDays();
        java.lang.String str8 = relativeDateFormat0.getSecondSuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "s" + "'", str8, "s");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.String str11 = logFormat4.format((double) 0L);
        java.lang.String str13 = logFormat4.format((double) 32);
        java.text.NumberFormat numberFormat14 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean15 = numberFormat14.isGroupingUsed();
        int int16 = numberFormat14.getMinimumIntegerDigits();
        java.util.Currency currency17 = numberFormat14.getCurrency();
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setCurrency(currency17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky "47) test0757(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u221e" + "'", str11, "\u221e");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5.0" + "'", str13, "5.0");
        org.junit.Assert.assertNotNull(numberFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(currency17);
        org.junit.Assert.assertEquals(currency17.toString(), "XXX");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("\u221e", jFreeChart1, true);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        relativeDateFormat1.setShowZeroDays(false);
        relativeDateFormat1.setMinuteSuffix("0.0");
        relativeDateFormat1.setMinuteSuffix("0.66");
        java.text.ParsePosition parsePosition9 = null;
        java.lang.Object obj10 = relativeDateFormat1.parseObject("d", parsePosition9);
        relativeDateFormat1.setDaySuffix("\u221e");
        java.lang.String str13 = relativeDateFormat1.getSecondSuffix();
        java.lang.String str14 = relativeDateFormat1.getPositivePrefix();
        org.jfree.chart.PaintMap paintMap15 = new org.jfree.chart.PaintMap();
        boolean boolean17 = paintMap15.containsKey((java.lang.Comparable) (short) 10);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat18 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str19 = relativeDateFormat18.getHourSuffix();
        boolean boolean20 = relativeDateFormat18.getShowZeroHours();
        java.lang.String str21 = relativeDateFormat18.getMinuteSuffix();
        long long22 = relativeDateFormat18.getBaseMillis();
        java.lang.String str23 = relativeDateFormat18.getHourSuffix();
        relativeDateFormat18.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat30 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int31 = logFormat30.getMaximumFractionDigits();
        logFormat30.setGroupingUsed(true);
        logFormat30.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer37 = null;
        java.text.FieldPosition fieldPosition38 = null;
        java.lang.StringBuffer stringBuffer39 = logFormat30.format((java.lang.Object) 10, stringBuffer37, fieldPosition38);
        java.lang.String str41 = logFormat30.format(0L);
        java.lang.Object obj42 = logFormat30.clone();
        java.lang.String str44 = logFormat30.format((java.lang.Object) (byte) -1);
        relativeDateFormat18.setNumberFormat((java.text.NumberFormat) logFormat30);
        boolean boolean46 = paintMap15.equals((java.lang.Object) relativeDateFormat18);
        java.util.TimeZone timeZone47 = relativeDateFormat18.getTimeZone();
        relativeDateFormat1.setTimeZone(timeZone47);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "s" + "'", str13, "s");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "m" + "'", str21, "m");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(stringBuffer39);
        org.junit.Assert.assertEquals(stringBuffer39.toString(), "3.32");
// flaky "48) test0759(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u221e" + "'", str41, "\u221e");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "NaN" + "'", str44, "NaN");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(timeZone47);
        org.junit.Assert.assertEquals(timeZone47.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        paintList0.clear();
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
        boolean boolean30 = paintList0.equals((java.lang.Object) logFormat9);
        java.lang.String str32 = logFormat9.format((long) 17);
        java.lang.Object obj33 = logFormat9.clone();
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer29);
        org.junit.Assert.assertEquals(stringBuffer29.toString(), "1.0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4.09" + "'", str32, "4.09");
        org.junit.Assert.assertNotNull(obj33);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape3, (double) 16, (double) 2);
        boolean boolean7 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape6);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape6, (double) (-1), (double) 1L);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(17, (int) (short) 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.awt.Paint paint2 = null;
        paintList0.setPaint(16, paint2);
        int int4 = paintList0.size();
        int int5 = paintList0.size();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 17 + "'", int4 == 17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.Object obj3 = relativeDateFormat0.clone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, 32, 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat17 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str18 = relativeDateFormat17.getHourSuffix();
        java.lang.String str19 = relativeDateFormat17.getDaySuffix();
        java.util.Calendar calendar20 = relativeDateFormat17.getCalendar();
        relativeDateFormat10.setCalendar(calendar20);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertNotNull(calendar20);
// flaky "49) test0766(RegressionTest1)":         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1758659503904,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=43,MILLISECOND=904,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        java.text.ParsePosition parsePosition3 = null;
        java.util.Date date4 = relativeDateFormat1.parse("", parsePosition3);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat5 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean6 = relativeDateFormat5.isLenient();
        java.text.ParsePosition parsePosition8 = null;
        java.util.Date date9 = relativeDateFormat5.parse("m", parsePosition8);
        relativeDateFormat5.setBaseMillis((long) 8);
        java.text.NumberFormat numberFormat12 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat12.setParseIntegerOnly(false);
        java.lang.String str16 = numberFormat12.format((long) 15);
        relativeDateFormat5.setHourFormatter(numberFormat12);
        relativeDateFormat5.setMinuteSuffix("");
        java.text.ParsePosition parsePosition21 = null;
        java.util.Date date22 = relativeDateFormat5.parse("NaN", parsePosition21);
        java.util.Calendar calendar23 = relativeDateFormat5.getCalendar();
        relativeDateFormat1.setCalendar(calendar23);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNotNull(numberFormat12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\24415.00" + "'", str16, "\24415.00");
        org.junit.Assert.assertNull(date22);
        org.junit.Assert.assertNotNull(calendar23);
// flaky "50) test0767(RegressionTest1)":         org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=1758659503971,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=43,MILLISECOND=971,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double) 16, "\24415.00", false);
        logFormat3.setMinimumFractionDigits(5);
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode6 = logFormat3.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("Rotation.ANTICLOCKWISE", jFreeChart1, true);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.jfree.chart.util.Rotation rotation0 = org.jfree.chart.util.Rotation.CLOCKWISE;
        java.lang.String str1 = rotation0.toString();
        java.lang.String str2 = rotation0.toString();
        double double3 = rotation0.getFactor();
        java.lang.String str4 = rotation0.toString();
        org.junit.Assert.assertTrue("'" + rotation0 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation0.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Rotation.CLOCKWISE" + "'", str1, "Rotation.CLOCKWISE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rotation.CLOCKWISE" + "'", str2, "Rotation.CLOCKWISE");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rotation.CLOCKWISE" + "'", str4, "Rotation.CLOCKWISE");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.STANDARD;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (short) 0, (float) 4);
        boolean boolean4 = legendRenderingOrder0.equals((java.lang.Object) 4);
        java.lang.String str5 = legendRenderingOrder0.toString();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat6 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str7 = relativeDateFormat6.getHourSuffix();
        java.lang.String str8 = relativeDateFormat6.getDaySuffix();
        relativeDateFormat6.setDaySuffix("");
        relativeDateFormat6.setMinuteSuffix("Rotation.CLOCKWISE");
        java.util.TimeZone timeZone13 = relativeDateFormat6.getTimeZone();
        java.lang.Object obj14 = relativeDateFormat6.clone();
        boolean boolean15 = legendRenderingOrder0.equals(obj14);
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str5, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCurrencyInstance();
        java.lang.String str2 = numberFormat0.format((double) (byte) 0);
        boolean boolean3 = numberFormat0.isParseIntegerOnly();
        int int4 = numberFormat0.getMinimumFractionDigits();
        java.lang.Object obj6 = numberFormat0.parseObject("\2440.00");
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\2440.00" + "'", str2, "\2440.00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 0L + "'", obj6, 0L);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        logFormat4.setGroupingUsed(false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        java.text.AttributedCharacterIterator attributedCharacterIterator27 = logFormat18.formatToCharacterIterator((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
        org.junit.Assert.assertNotNull(attributedCharacterIterator27);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        boolean boolean5 = logFormat4.isParseIntegerOnly();
        logFormat4.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition9 = null;
        java.lang.Object obj10 = logFormat4.parseObject("LegendRenderingOrder.REVERSE", parsePosition9);
        org.jfree.chart.util.LogFormat logFormat15 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int16 = logFormat15.getMaximumFractionDigits();
        logFormat15.setGroupingUsed(true);
        logFormat15.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        java.lang.StringBuffer stringBuffer24 = logFormat15.format((java.lang.Object) 10, stringBuffer22, fieldPosition23);
        java.lang.String str26 = logFormat15.format(0L);
        java.lang.Object obj27 = logFormat15.clone();
        java.lang.String str29 = logFormat15.format((double) (byte) 0);
        boolean boolean30 = logFormat15.isParseIntegerOnly();
        logFormat15.setParseIntegerOnly(true);
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat15);
        int int34 = logFormat4.getMaximumIntegerDigits();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "3.32");
// flaky "51) test0775(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u221e" + "'", str26, "\u221e");
        org.junit.Assert.assertNotNull(obj27);
// flaky "12) test0775(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u221e" + "'", str29, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 40 + "'", int34 == 40);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) 5, paint3);
        paintMap0.clear();
        java.lang.Object obj6 = null;
        boolean boolean7 = paintMap0.equals(obj6);
        java.lang.Comparable comparable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint9 = paintMap0.getPaint(comparable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency21 = logFormat4.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "52) test0778(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "13) test0778(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(numberFormat20);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 1.0f, (double) 0.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        boolean boolean5 = logFormat4.isParseIntegerOnly();
        logFormat4.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition9 = null;
        java.lang.Object obj10 = logFormat4.parseObject("LegendRenderingOrder.REVERSE", parsePosition9);
        logFormat4.setMinimumFractionDigits((int) ' ');
        java.lang.Object obj13 = logFormat4.clone();
        logFormat4.setMaximumFractionDigits((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = relativeDateFormat1.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(12, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, (int) (byte) 10, 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (10) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(0.0d, "", "h", false);
        java.text.NumberFormat numberFormat5 = logFormat4.getExponentFormat();
        logFormat4.setMinimumIntegerDigits((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode8 = logFormat4.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat5);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        relativeDateFormat0.setMinuteSuffix("Rotation.CLOCKWISE");
        relativeDateFormat0.setMinuteSuffix("SortOrder.ASCENDING");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat9 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str10 = relativeDateFormat9.getHourSuffix();
        java.lang.String str11 = relativeDateFormat9.getDaySuffix();
        java.util.Calendar calendar12 = relativeDateFormat9.getCalendar();
        relativeDateFormat0.setCalendar(calendar12);
        relativeDateFormat0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator17 = relativeDateFormat0.formatToCharacterIterator((java.lang.Object) "Rotation.ANTICLOCKWISE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertNotNull(calendar12);
// flaky "53) test0785(RegressionTest1)":         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1758659504906,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=44,MILLISECOND=906,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        int int18 = logFormat4.getMinimumIntegerDigits();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "54) test0786(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, (double) (byte) 10, (double) 10.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.rotateShape(shape7, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtils.clone(shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtils.equal(shape2, shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape11, (double) 0.5f, (double) 1L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape16, (double) 3, (double) 100L);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape19, rectangleAnchor20, (double) (short) 100, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        boolean boolean2 = paintMap0.containsKey((java.lang.Comparable) (short) 10);
        java.lang.Object obj3 = paintMap0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 16);
        java.lang.Object obj2 = relativeDateFormat1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 15, 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (15) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) (byte) 10);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.rotateShape(shape1, (double) 2147483647, 10.0f, (float) 40);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, rectangleAnchor6, (double) 1L, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        logFormat4.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat10 = logFormat4.getExponentFormat();
        int int11 = numberFormat10.getMaximumFractionDigits();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        int int1 = objectList0.size();
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone3 = dateFormat2.getTimeZone();
        dateFormat2.setLenient(true);
        java.util.Calendar calendar6 = dateFormat2.getCalendar();
        boolean boolean7 = dateFormat2.isLenient();
        int int8 = objectList0.indexOf((java.lang.Object) dateFormat2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(dateFormat2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar6);
// flaky "55) test0793(RegressionTest1)":         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=-765948494759,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=45,MILLISECOND=241,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.STANDARD;
        java.lang.String str1 = legendRenderingOrder0.toString();
        java.lang.String str2 = legendRenderingOrder0.toString();
        java.lang.String str3 = legendRenderingOrder0.toString();
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str1, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str2, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str3, "LegendRenderingOrder.STANDARD");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) ' ', (float) '#');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean1 = relativeDateFormat0.isLenient();
        java.text.ParsePosition parsePosition3 = null;
        java.util.Date date4 = relativeDateFormat0.parse("m", parsePosition3);
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
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat13);
        java.text.ParsePosition parsePosition32 = null;
        java.lang.Number number33 = logFormat13.parse("5.0", parsePosition32);
        logFormat13.setMaximumIntegerDigits(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h" + "'", str6, "h");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "m" + "'", str8, "m");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(stringBuffer26);
        org.junit.Assert.assertEquals(stringBuffer26.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer28);
        org.junit.Assert.assertEquals(stringBuffer28.toString(), "3.32");
        org.junit.Assert.assertNull(number33);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 1);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        org.jfree.chart.util.ObjectList objectList50 = new org.jfree.chart.util.ObjectList(100);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat51 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str52 = relativeDateFormat51.getHourSuffix();
        boolean boolean53 = relativeDateFormat51.getShowZeroHours();
        java.lang.String str54 = relativeDateFormat51.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat59 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat59.setMinimumIntegerDigits(1);
        boolean boolean62 = logFormat59.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat68 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer70 = null;
        java.text.FieldPosition fieldPosition71 = null;
        java.lang.StringBuffer stringBuffer72 = logFormat68.format((-1L), stringBuffer70, fieldPosition71);
        java.text.FieldPosition fieldPosition73 = null;
        java.lang.StringBuffer stringBuffer74 = logFormat59.format((long) (short) 10, stringBuffer70, fieldPosition73);
        relativeDateFormat51.setHourFormatter((java.text.NumberFormat) logFormat59);
        java.lang.String str76 = relativeDateFormat51.getHourSuffix();
        boolean boolean77 = objectList50.equals((java.lang.Object) relativeDateFormat51);
        org.jfree.chart.util.LogFormat logFormat82 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat82.setMinimumIntegerDigits(1);
        logFormat82.setGroupingUsed(false);
        relativeDateFormat51.setMinuteFormatter((java.text.NumberFormat) logFormat82);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator88 = relativeDateFormat2.formatToCharacterIterator((java.lang.Object) logFormat82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "h" + "'", str52, "h");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "m" + "'", str54, "m");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(stringBuffer72);
        org.junit.Assert.assertEquals(stringBuffer72.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer74);
        org.junit.Assert.assertEquals(stringBuffer74.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "h" + "'", str76, "h");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100L);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        long long2 = relativeDateFormat1.getBaseMillis();
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat7.setMinimumIntegerDigits(1);
        logFormat7.setGroupingUsed(false);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        boolean boolean14 = logFormat7.equals((java.lang.Object) dateFormat12);
        relativeDateFormat1.setDayFormatter((java.text.NumberFormat) logFormat7);
        int int16 = logFormat7.getMaximumFractionDigits();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        java.lang.Object obj50 = null;
        boolean boolean51 = legendRenderingOrder0.equals(obj50);
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str1, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertNotNull(stringBuffer15);
        org.junit.Assert.assertEquals(stringBuffer15.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(numberFormat27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(stringBuffer42);
        org.junit.Assert.assertEquals(stringBuffer42.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer44);
// flaky "56) test0803(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer44.toString(), "\u221e");
        org.junit.Assert.assertNull(paint48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        java.lang.Number number33 = logFormat8.parse("2.03", parsePosition32);
        logFormat8.setMinimumIntegerDigits(15);
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode36 = logFormat8.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0.66" + "'", str29, "0.66");
        org.junit.Assert.assertNull(number33);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, (double) 16, (double) 2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape8, (double) 16, (double) 2);
        boolean boolean12 = org.jfree.chart.util.ShapeUtils.equal(shape6, shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape6);
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtils.clone(shape15);
        boolean boolean17 = org.jfree.chart.util.ShapeUtils.equal(shape6, shape16);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtils.rotateShape(shape16, (double) '4', (float) 4, (float) 8);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj65 = relativeDateFormat1.parseObject("1.58");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        java.text.NumberFormat numberFormat28 = null;
        relativeDateFormat0.setNumberFormat(numberFormat28);
        relativeDateFormat0.setDaySuffix("m");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "3.32");
// flaky "57) test0807(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u221e" + "'", str23, "\u221e");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NaN" + "'", str26, "NaN");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("LegendRenderingOrder.STANDARD", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 4);
        boolean boolean4 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape3);
        java.io.ObjectOutputStream objectOutputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape1, objectOutputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        boolean boolean10 = logFormat5.equals((java.lang.Object) timeZone9);
        boolean boolean11 = paintList0.equals((java.lang.Object) logFormat5);
        java.awt.Paint paint13 = null;
        paintList0.setPaint((int) (byte) 0, paint13);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) (byte) 10);
        boolean boolean3 = paintMap0.equals((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass4 = paintMap0.getClass();
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        int int39 = logFormat33.getMaximumIntegerDigits();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 40 + "'", int39 == 40);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        java.text.NumberFormat numberFormat43 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat43.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean46 = numberFormat43.isParseIntegerOnly();
        int int47 = numberFormat43.getMaximumIntegerDigits();
        relativeDateFormat7.setHourFormatter(numberFormat43);
        numberFormat43.setMinimumFractionDigits(2147483647);
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
        org.junit.Assert.assertNotNull(numberFormat43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 309 + "'", int47 == 309);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        boolean boolean14 = logFormat4.isParseIntegerOnly();
        java.text.ParsePosition parsePosition16 = null;
        java.lang.Number number17 = logFormat4.parse("\24414.00", parsePosition16);
        logFormat4.setMinimumIntegerDigits(40);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat20 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str21 = relativeDateFormat20.getHourSuffix();
        boolean boolean22 = relativeDateFormat20.getShowZeroHours();
        java.lang.String str23 = relativeDateFormat20.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat28 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat28.setMinimumIntegerDigits(1);
        boolean boolean31 = logFormat28.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat37 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer39 = null;
        java.text.FieldPosition fieldPosition40 = null;
        java.lang.StringBuffer stringBuffer41 = logFormat37.format((-1L), stringBuffer39, fieldPosition40);
        java.text.FieldPosition fieldPosition42 = null;
        java.lang.StringBuffer stringBuffer43 = logFormat28.format((long) (short) 10, stringBuffer39, fieldPosition42);
        relativeDateFormat20.setHourFormatter((java.text.NumberFormat) logFormat28);
        relativeDateFormat20.setPositivePrefix("Rotation.CLOCKWISE");
        java.text.NumberFormat numberFormat47 = relativeDateFormat20.getNumberFormat();
        java.text.NumberFormat numberFormat48 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat48.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean51 = numberFormat48.isParseIntegerOnly();
        java.math.RoundingMode roundingMode52 = numberFormat48.getRoundingMode();
        numberFormat47.setRoundingMode(roundingMode52);
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setRoundingMode(roundingMode52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(number17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "h" + "'", str21, "h");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "m" + "'", str23, "m");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(stringBuffer41);
        org.junit.Assert.assertEquals(stringBuffer41.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "3.32");
        org.junit.Assert.assertNotNull(numberFormat47);
        org.junit.Assert.assertNotNull(numberFormat48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + roundingMode52 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode52.equals(java.math.RoundingMode.HALF_EVEN));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat18 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean19 = relativeDateFormat18.isLenient();
        java.text.ParsePosition parsePosition21 = null;
        java.util.Date date22 = relativeDateFormat18.parse("m", parsePosition21);
        relativeDateFormat18.setBaseMillis((long) 8);
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat18.setSecondFormatter((java.text.NumberFormat) logFormat29);
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat29);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(date22);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double) (byte) -1, "2.03", false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        java.lang.Object obj46 = logFormat36.clone();
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
        org.junit.Assert.assertNotNull(obj46);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat29.setMinimumIntegerDigits(1);
        boolean boolean32 = logFormat29.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer40 = null;
        java.text.FieldPosition fieldPosition41 = null;
        java.lang.StringBuffer stringBuffer42 = logFormat38.format((-1L), stringBuffer40, fieldPosition41);
        java.text.FieldPosition fieldPosition43 = null;
        java.lang.StringBuffer stringBuffer44 = logFormat29.format((long) (short) 10, stringBuffer40, fieldPosition43);
        org.jfree.chart.util.LogFormat logFormat49 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int50 = logFormat49.getMaximumFractionDigits();
        logFormat49.setGroupingUsed(true);
        logFormat49.setGroupingUsed(false);
        logFormat49.setMaximumIntegerDigits((-1));
        logFormat29.setExponentFormat((java.text.NumberFormat) logFormat49);
        java.text.ParsePosition parsePosition59 = null;
        java.lang.Number number60 = logFormat29.parse("hi!", parsePosition59);
        org.jfree.chart.util.LogFormat logFormat61 = new org.jfree.chart.util.LogFormat();
        logFormat61.setParseIntegerOnly(true);
        logFormat61.setParseIntegerOnly(false);
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
        java.text.FieldPosition fieldPosition95 = null;
        java.lang.StringBuffer stringBuffer96 = logFormat61.format((double) ' ', stringBuffer92, fieldPosition95);
        java.text.FieldPosition fieldPosition97 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer98 = relativeDateFormat0.format((java.lang.Object) logFormat29, stringBuffer96, fieldPosition97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(stringBuffer18);
        org.junit.Assert.assertEquals(stringBuffer18.toString(), "3.32");
// flaky "58) test0819(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u221e" + "'", str20, "\u221e");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NaN" + "'", str23, "NaN");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(stringBuffer42);
        org.junit.Assert.assertEquals(stringBuffer42.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertNull(number60);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(numberFormat77);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertNotNull(stringBuffer92);
        org.junit.Assert.assertEquals(stringBuffer92.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer94);
// flaky "14) test0819(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer94.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer96);
        org.junit.Assert.assertEquals(stringBuffer96.toString(), "10^1.51");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 5, (int) (short) 1, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        java.util.Date date16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = relativeDateFormat0.format(date16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("6.64", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = logFormat4.parse("\24414.00");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"?14.00\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.Object obj1 = relativeDateFormat0.clone();
        java.util.Date date2 = null;
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat3 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean4 = relativeDateFormat3.isLenient();
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int10 = logFormat9.getMaximumFractionDigits();
        logFormat9.setGroupingUsed(true);
        logFormat9.setParseIntegerOnly(true);
        java.lang.String str16 = logFormat9.format((double) 0L);
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
        java.lang.StringBuffer stringBuffer62 = relativeDateFormat3.format((java.lang.Object) 0L, stringBuffer60, fieldPosition61);
        java.text.FieldPosition fieldPosition63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer64 = relativeDateFormat0.format(date2, stringBuffer62, fieldPosition63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
// flaky "59) test0824(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u221e" + "'", str16, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(numberFormat39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(stringBuffer54);
        org.junit.Assert.assertEquals(stringBuffer54.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer56);
// flaky "15) test0824(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer56.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer58);
        org.junit.Assert.assertEquals(stringBuffer58.toString(), "10^1.51");
        org.junit.Assert.assertNotNull(stringBuffer60);
        org.junit.Assert.assertEquals(stringBuffer60.toString(), "NaN0h0m0.000s");
        org.junit.Assert.assertNotNull(stringBuffer62);
        org.junit.Assert.assertEquals(stringBuffer62.toString(), "NaN0h0m0.000s");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat0.setMinimumFractionDigits((int) '4');
        int int3 = numberFormat0.getMinimumIntegerDigits();
        numberFormat0.setMaximumFractionDigits(6);
        java.text.NumberFormat numberFormat6 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean7 = numberFormat6.isGroupingUsed();
        int int8 = numberFormat6.getMinimumIntegerDigits();
        java.util.Currency currency9 = numberFormat6.getCurrency();
        // The following exception was thrown during execution in test generation
        try {
            numberFormat0.setCurrency(currency9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(currency9);
        org.junit.Assert.assertEquals(currency9.toString(), "XXX");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(11, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        relativeDateFormat10.setDaySuffix("4.0");
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
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        int int1 = objectList0.size();
        objectList0.clear();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setMinuteSuffix("SortOrder.DESCENDING");
        long long8 = relativeDateFormat4.getBaseMillis();
        objectList0.set(64, (java.lang.Object) relativeDateFormat4);
        relativeDateFormat4.setShowZeroHours(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCurrencyInstance();
        java.lang.String str2 = numberFormat0.format((double) (byte) 0);
        int int3 = numberFormat0.getMaximumIntegerDigits();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = numberFormat0.parseObject("h");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\2440.00" + "'", str2, "\2440.00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, (int) 'a', 12, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 12);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 309, (int) (short) -1, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (309) and height (-1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        java.text.ParsePosition parsePosition16 = null;
        java.lang.Object obj17 = relativeDateFormat0.parseObject("m", parsePosition16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\24415.00" + "'", str11, "\24415.00");
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(0.0d, "", "h", false);
        int int5 = logFormat4.getMinimumFractionDigits();
        logFormat4.setGroupingUsed(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        logFormat12.setMaximumFractionDigits((int) (byte) 0);
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
        logFormat12.setExponentFormat((java.text.NumberFormat) logFormat26);
        int int51 = logFormat26.getMaximumIntegerDigits();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number53 = logFormat26.parse("Rotation.ANTICLOCKWISE");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"Rotation.ANTICLOCKWISE\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(date7);
// flaky "60) test0835(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(numberFormat32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(stringBuffer47);
        org.junit.Assert.assertEquals(stringBuffer47.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer49);
// flaky "16) test0835(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer49.toString(), "\u221e");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        java.lang.String str25 = logFormat4.format((double) 3);
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode26 = logFormat4.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "0.66" + "'", str25, "0.66");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation5 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList1.set((int) (short) 1, (java.lang.Object) rotation5);
        int int7 = objectList1.size();
        java.lang.Object obj9 = objectList1.get(2147483647);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + rotation5 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation5.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle(0.0f);
        java.io.ObjectOutputStream objectOutputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape1, objectOutputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, (float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 64, (double) (byte) 100, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        java.util.Date date60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = relativeDateFormat0.format(date60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(stringBuffer41);
        org.junit.Assert.assertEquals(stringBuffer41.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        boolean boolean8 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat9 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str10 = relativeDateFormat9.getHourSuffix();
        relativeDateFormat9.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat9.setPositivePrefix("\u221e");
        java.lang.String str15 = relativeDateFormat9.getPositivePrefix();
        org.jfree.chart.util.LogFormat logFormat20 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat20.setMinimumIntegerDigits(1);
        boolean boolean23 = logFormat20.isGroupingUsed();
        logFormat20.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat26 = logFormat20.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat32 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int33 = logFormat32.getMaximumFractionDigits();
        logFormat32.setGroupingUsed(true);
        logFormat32.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer39 = null;
        java.text.FieldPosition fieldPosition40 = null;
        java.lang.StringBuffer stringBuffer41 = logFormat32.format((java.lang.Object) 10, stringBuffer39, fieldPosition40);
        java.text.FieldPosition fieldPosition42 = null;
        java.lang.StringBuffer stringBuffer43 = logFormat20.format(0.0d, stringBuffer41, fieldPosition42);
        int int44 = logFormat20.getMinimumIntegerDigits();
        relativeDateFormat9.setNumberFormat((java.text.NumberFormat) logFormat20);
        java.text.NumberFormat numberFormat46 = relativeDateFormat9.getNumberFormat();
        relativeDateFormat0.setMinuteFormatter(numberFormat46);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(stringBuffer41);
        org.junit.Assert.assertEquals(stringBuffer41.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer43);
// flaky "61) test0842(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer43.toString(), "\u221e");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(numberFormat46);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        logFormat4.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat10 = logFormat4.getExponentFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number12 = logFormat4.parse("SortOrder.DESCENDING");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"SortOrder.DESCENDING\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double) 6, "6.64", true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat0.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        dateFormat5.setLenient(true);
        java.util.Calendar calendar9 = dateFormat5.getCalendar();
        relativeDateFormat0.setCalendar(calendar9);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat11 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str12 = relativeDateFormat11.getHourSuffix();
        relativeDateFormat11.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat11.setSecondFormatter((java.text.NumberFormat) logFormat19);
        java.text.NumberFormat numberFormat21 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat21.setMinimumFractionDigits((int) '4');
        int int24 = numberFormat21.getMinimumIntegerDigits();
        numberFormat21.setMaximumFractionDigits(6);
        logFormat19.setExponentFormat(numberFormat21);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat19);
        java.awt.Window[] windowArray29 = java.awt.Window.getWindows();
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer59 = logFormat19.format((java.lang.Object) windowArray29, stringBuffer55, fieldPosition58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar9);
// flaky "62) test0845(RegressionTest1)":         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-765948492308,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=47,MILLISECOND=692,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(windowArray29);
        org.junit.Assert.assertArrayEquals(windowArray29, new java.awt.Window[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer57);
// flaky "17) test0845(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer57.toString(), "\u221e");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, (float) 309);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        java.lang.String str28 = relativeDateFormat0.getDaySuffix();
        long long29 = relativeDateFormat0.getBaseMillis();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "3.32");
// flaky "63) test0847(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u221e" + "'", str23, "\u221e");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NaN" + "'", str26, "NaN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "d" + "'", str28, "d");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        java.lang.Object obj1 = objectList0.clone();
        objectList0.clear();
        java.lang.Object obj4 = objectList0.get(0);
        java.lang.Object obj5 = objectList0.clone();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        java.lang.String str17 = relativeDateFormat0.getSecondSuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "s" + "'", str17, "s");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int14 = logFormat13.getMaximumFractionDigits();
        logFormat13.setGroupingUsed(true);
        logFormat13.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        java.lang.StringBuffer stringBuffer22 = logFormat13.format((java.lang.Object) 10, stringBuffer20, fieldPosition21);
        java.text.FieldPosition fieldPosition23 = null;
        java.lang.StringBuffer stringBuffer24 = logFormat4.format((double) 2, stringBuffer20, fieldPosition23);
        java.lang.Object obj25 = logFormat4.clone();
        java.lang.Object obj26 = org.jfree.chart.util.CloneUtils.clone(obj25);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(stringBuffer22);
        org.junit.Assert.assertEquals(stringBuffer22.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "1.0");
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        java.lang.StringBuffer stringBuffer8 = logFormat4.format((-1L), stringBuffer6, fieldPosition7);
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat13);
        org.jfree.chart.PaintMap paintMap15 = new org.jfree.chart.PaintMap();
        java.lang.Object obj16 = paintMap15.clone();
        java.awt.Paint paint18 = null;
        paintMap15.put((java.lang.Comparable) '4', paint18);
        java.awt.Paint paint21 = paintMap15.getPaint((java.lang.Comparable) "NaN");
        boolean boolean22 = logFormat4.equals((java.lang.Object) paintMap15);
        java.lang.String str24 = logFormat4.format((java.lang.Object) Double.NaN);
        org.junit.Assert.assertNotNull(stringBuffer8);
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "NaN");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNull(paint21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "NaN" + "'", str24, "NaN");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) '4');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.rotateShape(shape1, (double) 100, (float) 100, (float) 7);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, (int) '4', 9, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 0L);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj3 = objectList1.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation5 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList1.set((int) (short) 1, (java.lang.Object) rotation5);
        int int7 = objectList1.size();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat8 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str9 = relativeDateFormat8.getHourSuffix();
        boolean boolean10 = relativeDateFormat8.getShowZeroHours();
        java.lang.String str11 = relativeDateFormat8.getMinuteSuffix();
        long long12 = relativeDateFormat8.getBaseMillis();
        java.lang.String str13 = relativeDateFormat8.getHourSuffix();
        relativeDateFormat8.setShowZeroHours(false);
        long long16 = relativeDateFormat8.getBaseMillis();
        java.lang.String str17 = relativeDateFormat8.getMinuteSuffix();
        long long18 = relativeDateFormat8.getBaseMillis();
        int int19 = objectList1.indexOf((java.lang.Object) relativeDateFormat8);
        int int20 = objectList1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + rotation5 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation5.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "m" + "'", str11, "m");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "m" + "'", str17, "m");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        int int7 = logFormat4.getMaximumIntegerDigits();
        int int8 = logFormat4.getMaximumFractionDigits();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 40 + "'", int7 == 40);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        relativeDateFormat0.setHourSuffix("h");
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 12, "", true);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat8);
        relativeDateFormat0.setLenient(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        int int1 = objectList0.size();
        objectList0.clear();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setMinuteSuffix("SortOrder.DESCENDING");
        long long8 = relativeDateFormat4.getBaseMillis();
        objectList0.set(64, (java.lang.Object) relativeDateFormat4);
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int15 = logFormat14.getMaximumFractionDigits();
        logFormat14.setGroupingUsed(true);
        logFormat14.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat14.format((java.lang.Object) 10, stringBuffer21, fieldPosition22);
        java.lang.String str25 = logFormat14.format(0L);
        java.lang.Object obj26 = logFormat14.clone();
        java.lang.String str28 = logFormat14.format((double) (byte) 0);
        relativeDateFormat4.setDayFormatter((java.text.NumberFormat) logFormat14);
        relativeDateFormat4.setShowZeroDays(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
// flaky "64) test0858(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u221e" + "'", str25, "\u221e");
        org.junit.Assert.assertNotNull(obj26);
// flaky "18) test0858(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u221e" + "'", str28, "\u221e");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat8);
        java.lang.Object obj10 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        relativeDateFormat0.setDaySuffix("5.7");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat13 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str14 = relativeDateFormat13.getHourSuffix();
        relativeDateFormat13.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat13.setPositivePrefix("\u221e");
        java.lang.String str19 = relativeDateFormat13.getPositivePrefix();
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat24.setMinimumIntegerDigits(1);
        boolean boolean27 = logFormat24.isGroupingUsed();
        logFormat24.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat30 = logFormat24.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat36 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int37 = logFormat36.getMaximumFractionDigits();
        logFormat36.setGroupingUsed(true);
        logFormat36.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer43 = null;
        java.text.FieldPosition fieldPosition44 = null;
        java.lang.StringBuffer stringBuffer45 = logFormat36.format((java.lang.Object) 10, stringBuffer43, fieldPosition44);
        java.text.FieldPosition fieldPosition46 = null;
        java.lang.StringBuffer stringBuffer47 = logFormat24.format(0.0d, stringBuffer45, fieldPosition46);
        int int48 = logFormat24.getMinimumIntegerDigits();
        relativeDateFormat13.setNumberFormat((java.text.NumberFormat) logFormat24);
        java.text.NumberFormat numberFormat50 = relativeDateFormat13.getNumberFormat();
        boolean boolean51 = relativeDateFormat0.equals((java.lang.Object) numberFormat50);
        java.util.Date date52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = relativeDateFormat0.format(date52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u221e" + "'", str19, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(numberFormat30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer47);
// flaky "65) test0859(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer47.toString(), "\u221e");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(numberFormat50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) 'a', (float) (byte) 0);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        relativeDateFormat1.setShowZeroDays(false);
        relativeDateFormat1.setMinuteSuffix("6.64");
        java.text.ParsePosition parsePosition7 = null;
        java.lang.Object obj8 = relativeDateFormat1.parseObject("SortOrder.DESCENDING", parsePosition7);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat9 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str10 = relativeDateFormat9.getHourSuffix();
        relativeDateFormat9.setMinuteSuffix("SortOrder.DESCENDING");
        long long13 = relativeDateFormat9.getBaseMillis();
        java.util.Calendar calendar14 = relativeDateFormat9.getCalendar();
        relativeDateFormat9.setPositivePrefix("\u221e");
        relativeDateFormat9.setShowZeroDays(true);
        java.text.NumberFormat numberFormat19 = relativeDateFormat9.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = relativeDateFormat1.format((java.lang.Object) numberFormat19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(calendar14);
// flaky "66) test0861(RegressionTest1)":         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1758659508568,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=48,MILLISECOND=568,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat19);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        int int20 = logFormat4.getMinimumFractionDigits();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "67) test0862(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "19) test0862(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        boolean boolean12 = relativeDateFormat0.getShowZeroHours();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = dateFormat0.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"hi!\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        relativeDateFormat0.setPositivePrefix("h");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat10 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str11 = relativeDateFormat10.getHourSuffix();
        boolean boolean12 = relativeDateFormat10.getShowZeroHours();
        java.lang.String str13 = relativeDateFormat10.getMinuteSuffix();
        long long14 = relativeDateFormat10.getBaseMillis();
        java.lang.String str15 = relativeDateFormat10.getHourSuffix();
        relativeDateFormat10.setShowZeroHours(false);
        long long18 = relativeDateFormat10.getBaseMillis();
        java.lang.String str19 = relativeDateFormat10.getMinuteSuffix();
        long long20 = relativeDateFormat10.getBaseMillis();
        java.util.Calendar calendar21 = relativeDateFormat10.getCalendar();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat22 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str23 = relativeDateFormat22.getHourSuffix();
        java.lang.String str24 = relativeDateFormat22.getDaySuffix();
        boolean boolean25 = relativeDateFormat22.getShowZeroHours();
        java.lang.String str26 = relativeDateFormat22.getMinuteSuffix();
        java.util.Calendar calendar27 = relativeDateFormat22.getCalendar();
        boolean boolean28 = relativeDateFormat10.equals((java.lang.Object) calendar27);
        relativeDateFormat0.setCalendar(calendar27);
        relativeDateFormat0.setMinuteSuffix("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "m" + "'", str13, "m");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "m" + "'", str19, "m");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(calendar21);
// flaky "68) test0865(RegressionTest1)":         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1758659508714,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=48,MILLISECOND=714,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "d" + "'", str24, "d");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "m" + "'", str26, "m");
        org.junit.Assert.assertNotNull(calendar27);
// flaky "20) test0865(RegressionTest1)":         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1758659508714,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=48,MILLISECOND=714,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        int int1 = objectList0.size();
        objectList0.clear();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setMinuteSuffix("SortOrder.DESCENDING");
        long long8 = relativeDateFormat4.getBaseMillis();
        objectList0.set(64, (java.lang.Object) relativeDateFormat4);
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int15 = logFormat14.getMaximumFractionDigits();
        logFormat14.setGroupingUsed(true);
        logFormat14.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer21 = null;
        java.text.FieldPosition fieldPosition22 = null;
        java.lang.StringBuffer stringBuffer23 = logFormat14.format((java.lang.Object) 10, stringBuffer21, fieldPosition22);
        java.lang.String str25 = logFormat14.format(0L);
        java.lang.Object obj26 = logFormat14.clone();
        java.lang.String str28 = logFormat14.format((double) (byte) 0);
        relativeDateFormat4.setDayFormatter((java.text.NumberFormat) logFormat14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency30 = logFormat14.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
// flaky "69) test0866(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u221e" + "'", str25, "\u221e");
        org.junit.Assert.assertNotNull(obj26);
// flaky "21) test0866(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\u221e" + "'", str28, "\u221e");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        long long4 = relativeDateFormat0.getBaseMillis();
        java.util.Calendar calendar5 = relativeDateFormat0.getCalendar();
        relativeDateFormat0.setPositivePrefix("\u221e");
        relativeDateFormat0.setShowZeroDays(true);
        java.text.NumberFormat numberFormat10 = relativeDateFormat0.getNumberFormat();
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = relativeDateFormat0.format(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "70) test0867(RegressionTest1)":         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1758659508803,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=48,MILLISECOND=803,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(numberFormat10);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) ' ', (float) (byte) 100);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, rectangleAnchor3, 0.0d, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("3.32", jFreeChart1, true);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        relativeDateFormat0.setShowZeroDays(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.text.NumberFormat numberFormat28 = null;
        relativeDateFormat0.setNumberFormat(numberFormat28);
        org.jfree.chart.util.LogFormat logFormat34 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat34);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "3.32");
// flaky "71) test0871(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u221e" + "'", str23, "\u221e");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NaN" + "'", str26, "NaN");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 6, "LegendRenderingOrder.REVERSE", "NaN", false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency5 = logFormat4.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, (float) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, (float) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat0.setParseIntegerOnly(false);
        int int3 = numberFormat0.getMinimumIntegerDigits();
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        logFormat4.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat10 = logFormat4.getExponentFormat();
        boolean boolean12 = logFormat4.equals((java.lang.Object) 0.0f);
        logFormat4.setMaximumIntegerDigits(17);
        logFormat4.setMaximumIntegerDigits(32);
        java.text.NumberFormat numberFormat17 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat17.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean20 = numberFormat17.isParseIntegerOnly();
        java.math.RoundingMode roundingMode21 = numberFormat17.getRoundingMode();
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setRoundingMode(roundingMode21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(numberFormat17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + roundingMode21 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode21.equals(java.math.RoundingMode.HALF_EVEN));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(0.0d, "", "h", false);
        org.jfree.chart.util.PaintList paintList5 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat6 = java.text.NumberFormat.getIntegerInstance();
        int int7 = numberFormat6.getMaximumIntegerDigits();
        boolean boolean8 = paintList5.equals((java.lang.Object) int7);
        paintList5.clear();
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat14.setMinimumIntegerDigits(1);
        boolean boolean17 = logFormat14.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int24 = logFormat23.getMaximumFractionDigits();
        logFormat23.setGroupingUsed(true);
        logFormat23.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer30 = null;
        java.text.FieldPosition fieldPosition31 = null;
        java.lang.StringBuffer stringBuffer32 = logFormat23.format((java.lang.Object) 10, stringBuffer30, fieldPosition31);
        java.text.FieldPosition fieldPosition33 = null;
        java.lang.StringBuffer stringBuffer34 = logFormat14.format((double) 2, stringBuffer30, fieldPosition33);
        boolean boolean35 = paintList5.equals((java.lang.Object) logFormat14);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator36 = logFormat4.formatToCharacterIterator((java.lang.Object) boolean35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer34);
        org.junit.Assert.assertEquals(stringBuffer34.toString(), "1.0");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        boolean boolean8 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.PaintList paintList9 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getIntegerInstance();
        int int11 = numberFormat10.getMaximumIntegerDigits();
        boolean boolean12 = paintList9.equals((java.lang.Object) int11);
        java.awt.Paint paint14 = null;
        paintList9.setPaint(11, paint14);
        java.lang.Object obj16 = paintList9.clone();
        java.lang.Object obj17 = null;
        boolean boolean18 = paintList9.equals(obj17);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat19 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str20 = relativeDateFormat19.getHourSuffix();
        boolean boolean21 = relativeDateFormat19.getShowZeroHours();
        boolean boolean22 = relativeDateFormat19.getShowZeroHours();
        java.util.TimeZone timeZone23 = relativeDateFormat19.getTimeZone();
        boolean boolean24 = paintList9.equals((java.lang.Object) relativeDateFormat19);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator25 = relativeDateFormat0.formatToCharacterIterator((java.lang.Object) paintList9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "h" + "'", str20, "h");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, (int) (short) 0, 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, (double) 16, (double) 2);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape5, (double) (short) 100, (float) 2147483647, (float) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(32, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape4, (double) (byte) 10, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint8 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        int int7 = logFormat4.getMaximumIntegerDigits();
        java.lang.String str9 = logFormat4.format((double) 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 40 + "'", int7 == 40);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "31.0" + "'", str9, "31.0");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (byte) -1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        java.awt.Paint paint28 = paintList0.getPaint(2147483647);
        int int29 = paintList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(stringBuffer18);
        org.junit.Assert.assertEquals(stringBuffer18.toString(), "3.32");
// flaky "72) test0887(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u221e" + "'", str20, "\u221e");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NaN" + "'", str23, "NaN");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        java.text.NumberFormat numberFormat24 = java.text.NumberFormat.getCompactNumberInstance();
        logFormat18.setExponentFormat(numberFormat24);
        numberFormat24.setMaximumIntegerDigits(8);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
        org.junit.Assert.assertNotNull(numberFormat24);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        relativeDateFormat1.setShowZeroDays(false);
        relativeDateFormat1.setMinuteSuffix("0.0");
        org.jfree.chart.util.ObjectList objectList7 = new org.jfree.chart.util.ObjectList(6);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat8 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str9 = relativeDateFormat8.getHourSuffix();
        boolean boolean10 = relativeDateFormat8.getShowZeroHours();
        java.lang.String str11 = relativeDateFormat8.getMinuteSuffix();
        long long12 = relativeDateFormat8.getBaseMillis();
        java.lang.String str13 = relativeDateFormat8.getHourSuffix();
        relativeDateFormat8.setPositivePrefix("");
        java.lang.Object obj16 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat8);
        boolean boolean17 = objectList7.equals((java.lang.Object) relativeDateFormat8);
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
        relativeDateFormat8.setHourFormatter((java.text.NumberFormat) logFormat42);
        java.lang.String str52 = relativeDateFormat8.getPositivePrefix();
        java.lang.String str53 = relativeDateFormat8.getDaySuffix();
        java.text.NumberFormat numberFormat54 = relativeDateFormat8.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator55 = relativeDateFormat1.formatToCharacterIterator((java.lang.Object) numberFormat54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "m" + "'", str11, "m");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "d" + "'", str53, "d");
        org.junit.Assert.assertNotNull(numberFormat54);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) '4');
        java.io.ObjectOutputStream objectOutputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape1, objectOutputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDownTriangle((-1.0f));
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createDiamond((float) 13);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint4 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat0.setNumberFormat(numberFormat3);
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone6 = dateFormat5.getTimeZone();
        dateFormat5.setLenient(true);
        java.util.Calendar calendar9 = dateFormat5.getCalendar();
        relativeDateFormat0.setCalendar(calendar9);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat11 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str12 = relativeDateFormat11.getHourSuffix();
        relativeDateFormat11.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat11.setSecondFormatter((java.text.NumberFormat) logFormat19);
        java.text.NumberFormat numberFormat21 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat21.setMinimumFractionDigits((int) '4');
        int int24 = numberFormat21.getMinimumIntegerDigits();
        numberFormat21.setMaximumFractionDigits(6);
        logFormat19.setExponentFormat(numberFormat21);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat19);
        java.lang.String str30 = logFormat19.format((double) 64);
        java.text.NumberFormat numberFormat31 = logFormat19.getExponentFormat();
        java.lang.String str33 = logFormat19.format((double) (byte) 1);
        boolean boolean34 = logFormat19.isGroupingUsed();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar9);
// flaky "73) test0893(RegressionTest1)":         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-765948490103,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=49,MILLISECOND=897,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(numberFormat21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2" + "'", str30, "2");
        org.junit.Assert.assertNotNull(numberFormat31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0" + "'", str33, "0");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) (short) 0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(1, 8, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getPercentInstance();
        numberFormat0.setMaximumFractionDigits(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number4 = numberFormat0.parse("LegendRenderingOrder.STANDARD");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"LegendRenderingOrder.STANDARD\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        java.text.NumberFormat numberFormat40 = logFormat24.getExponentFormat();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat41 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean42 = relativeDateFormat41.isLenient();
        java.text.ParsePosition parsePosition44 = null;
        java.util.Date date45 = relativeDateFormat41.parse("m", parsePosition44);
        relativeDateFormat41.setBaseMillis((long) 8);
        java.text.NumberFormat numberFormat48 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat48.setParseIntegerOnly(false);
        java.lang.String str52 = numberFormat48.format((long) 15);
        relativeDateFormat41.setHourFormatter(numberFormat48);
        java.text.NumberFormat numberFormat54 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat54.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean57 = numberFormat54.isParseIntegerOnly();
        java.math.RoundingMode roundingMode58 = numberFormat54.getRoundingMode();
        numberFormat48.setRoundingMode(roundingMode58);
        numberFormat40.setRoundingMode(roundingMode58);
        // The following exception was thrown during execution in test generation
        try {
            logFormat10.setRoundingMode(roundingMode58);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(number15);
        org.junit.Assert.assertNull(number18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(stringBuffer33);
        org.junit.Assert.assertEquals(stringBuffer33.toString(), "3.32");
// flaky "74) test0897(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u221e" + "'", str35, "\u221e");
        org.junit.Assert.assertNotNull(obj36);
// flaky "22) test0897(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\u221e" + "'", str38, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(date45);
        org.junit.Assert.assertNotNull(numberFormat48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\24415.00" + "'", str52, "\24415.00");
        org.junit.Assert.assertNotNull(numberFormat54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + roundingMode58 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode58.equals(java.math.RoundingMode.HALF_EVEN));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("4.0", jFreeChart1, true);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) 100, (float) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint5 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(15, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        java.text.NumberFormat numberFormat60 = relativeDateFormat0.getNumberFormat();
        java.util.Calendar calendar61 = relativeDateFormat0.getCalendar();
        boolean boolean62 = relativeDateFormat0.getShowZeroDays();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(stringBuffer41);
        org.junit.Assert.assertEquals(stringBuffer41.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(numberFormat60);
        org.junit.Assert.assertNotNull(calendar61);
// flaky "75) test0901(RegressionTest1)":         org.junit.Assert.assertEquals(calendar61.toString(), "java.util.GregorianCalendar[time=1758659510098,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=50,MILLISECOND=98,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        relativeDateFormat0.setPositivePrefix("\24415.00");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder15 = org.jfree.chart.LegendRenderingOrder.STANDARD;
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (short) 0, (float) 4);
        boolean boolean19 = legendRenderingOrder15.equals((java.lang.Object) 4);
        java.lang.String str20 = legendRenderingOrder15.toString();
        org.jfree.chart.util.LogFormat logFormat25 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat25.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat28 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone29 = dateFormat28.getTimeZone();
        boolean boolean30 = logFormat25.equals((java.lang.Object) timeZone29);
        boolean boolean31 = legendRenderingOrder15.equals((java.lang.Object) boolean30);
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
        boolean boolean61 = legendRenderingOrder15.equals((java.lang.Object) relativeDateFormat32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str62 = relativeDateFormat0.format((java.lang.Object) relativeDateFormat32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(legendRenderingOrder15);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "LegendRenderingOrder.STANDARD" + "'", str20, "LegendRenderingOrder.STANDARD");
        org.junit.Assert.assertNotNull(dateFormat28);
        org.junit.Assert.assertNotNull(timeZone29);
        org.junit.Assert.assertEquals(timeZone29.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "h" + "'", str33, "h");
        org.junit.Assert.assertNotNull(dateFormat41);
        org.junit.Assert.assertNotNull(timeZone42);
        org.junit.Assert.assertEquals(timeZone42.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(date47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        relativeDateFormat0.setDaySuffix("SortOrder.DESCENDING");
        java.lang.String str29 = relativeDateFormat0.getSecondSuffix();
        java.util.TimeZone timeZone30 = relativeDateFormat0.getTimeZone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "s" + "'", str29, "s");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        java.awt.Shape shape22 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
        java.awt.Shape shape23 = org.jfree.chart.util.ShapeUtils.clone(shape22);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtils.clone(shape22);
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape26, (double) 16, (double) 2);
        java.awt.Shape shape31 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape36 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape33, (double) 16, (double) 2);
        boolean boolean37 = org.jfree.chart.util.ShapeUtils.equal(shape31, shape36);
        boolean boolean38 = org.jfree.chart.util.ShapeUtils.equal(shape26, shape31);
        boolean boolean39 = org.jfree.chart.util.ShapeUtils.equal(shape22, shape31);
        java.awt.Shape shape42 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape22, (double) 40, 0.0d);
        java.awt.Shape shape46 = org.jfree.chart.util.ShapeUtils.rotateShape(shape22, (double) 100L, (float) 4, (float) 17);
        boolean boolean47 = logFormat8.equals((java.lang.Object) 4);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "3.32");
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shape42);
        org.junit.Assert.assertNotNull(shape46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        boolean boolean8 = logFormat5.isGroupingUsed();
        logFormat5.setMaximumIntegerDigits(1);
        dateFormat0.setNumberFormat((java.text.NumberFormat) logFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date13 = dateFormat0.parse("s");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"s\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(10.0d, "3.46", "3.05", false);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape4, (double) (byte) 10, (double) 10.0f);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtils.rotateShape(shape9, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtils.clone(shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtils.equal(shape4, shape13);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape13, (double) 0.5f, (double) 1L);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape18, (double) 3, (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint22 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        paintList0.setPaint((int) (short) 1, paint32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(stringBuffer18);
        org.junit.Assert.assertEquals(stringBuffer18.toString(), "3.32");
// flaky "76) test0908(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u221e" + "'", str20, "\u221e");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NaN" + "'", str23, "NaN");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape1, 0.0d, (float) 11, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        long long2 = relativeDateFormat1.getBaseMillis();
        java.lang.String str3 = relativeDateFormat1.getPositivePrefix();
        java.lang.Object obj4 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency20 = logFormat8.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle(0.0f);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) 8L, 0.5f);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape8, (double) 16, (double) 2);
        boolean boolean12 = org.jfree.chart.util.ShapeUtils.equal(shape6, shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtils.equal(shape4, shape11);
        boolean boolean14 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape11);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        java.text.ParsePosition parsePosition63 = null;
        java.lang.Object obj64 = relativeDateFormat0.parseObject("NaN", parsePosition63);
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
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        java.util.TimeZone timeZone60 = relativeDateFormat0.getTimeZone();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
// flaky "77) test0915(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u221e" + "'", str13, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertNotNull(stringBuffer51);
        org.junit.Assert.assertEquals(stringBuffer51.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer53);
// flaky "23) test0915(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer53.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "10^1.51");
        org.junit.Assert.assertNotNull(stringBuffer57);
        org.junit.Assert.assertEquals(stringBuffer57.toString(), "NaN0h0m0.000s");
        org.junit.Assert.assertNotNull(stringBuffer59);
        org.junit.Assert.assertEquals(stringBuffer59.toString(), "NaN0h0m0.000s");
        org.junit.Assert.assertNotNull(timeZone60);
        org.junit.Assert.assertEquals(timeZone60.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean1 = relativeDateFormat0.isLenient();
        java.text.ParsePosition parsePosition3 = null;
        java.util.Date date4 = relativeDateFormat0.parse("m", parsePosition3);
        relativeDateFormat0.setBaseMillis((long) 8);
        java.text.NumberFormat numberFormat7 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat7.setParseIntegerOnly(false);
        java.lang.String str11 = numberFormat7.format((long) 15);
        relativeDateFormat0.setHourFormatter(numberFormat7);
        relativeDateFormat0.setLenient(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(numberFormat7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\24415.00" + "'", str11, "\24415.00");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        org.jfree.chart.util.LogFormat logFormat21 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        boolean boolean22 = logFormat21.isParseIntegerOnly();
        logFormat21.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition26 = null;
        java.lang.Object obj27 = logFormat21.parseObject("LegendRenderingOrder.REVERSE", parsePosition26);
        logFormat21.setMinimumFractionDigits((int) ' ');
        java.lang.Object obj30 = logFormat21.clone();
        boolean boolean31 = paintList0.equals(obj30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(16, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.lang.Object obj8 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        relativeDateFormat0.setBaseMillis((long) 4);
        relativeDateFormat0.setShowZeroHours(true);
        relativeDateFormat0.setMinuteSuffix("m");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        relativeDateFormat2.setShowZeroHours(true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double) 11, "Rotation.CLOCKWISE", false);
        logFormat3.setMinimumIntegerDigits(8);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        java.lang.String str28 = relativeDateFormat0.getDaySuffix();
        java.text.ParsePosition parsePosition30 = null;
        java.lang.Object obj31 = relativeDateFormat0.parseObject("", parsePosition30);
        java.util.Calendar calendar32 = relativeDateFormat0.getCalendar();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "3.32");
// flaky "78) test0924(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u221e" + "'", str23, "\u221e");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "NaN" + "'", str26, "NaN");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "d" + "'", str28, "d");
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(calendar32);
// flaky "24) test0924(RegressionTest1)":         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1758659511075,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=51,MILLISECOND=75,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        java.util.TimeZone timeZone27 = relativeDateFormat0.getTimeZone();
        relativeDateFormat0.setMinuteSuffix("14");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        boolean boolean8 = relativeDateFormat0.getShowZeroHours();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat9 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean10 = relativeDateFormat9.isLenient();
        java.text.ParsePosition parsePosition12 = null;
        java.util.Date date13 = relativeDateFormat9.parse("m", parsePosition12);
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
        relativeDateFormat9.setMinuteFormatter((java.text.NumberFormat) logFormat22);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat22);
        java.lang.String str41 = relativeDateFormat0.getDaySuffix();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat42 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str43 = relativeDateFormat42.getHourSuffix();
        java.lang.String str44 = relativeDateFormat42.getDaySuffix();
        relativeDateFormat42.setDaySuffix("");
        relativeDateFormat42.setMinuteSuffix("Rotation.CLOCKWISE");
        java.util.TimeZone timeZone49 = relativeDateFormat42.getTimeZone();
        relativeDateFormat0.setTimeZone(timeZone49);
        java.text.NumberFormat numberFormat51 = relativeDateFormat0.getNumberFormat();
        relativeDateFormat0.setDaySuffix("\2440.00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "m" + "'", str17, "m");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(stringBuffer35);
        org.junit.Assert.assertEquals(stringBuffer35.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer37);
        org.junit.Assert.assertEquals(stringBuffer37.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "d" + "'", str41, "d");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "h" + "'", str43, "h");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "d" + "'", str44, "d");
        org.junit.Assert.assertNotNull(timeZone49);
        org.junit.Assert.assertEquals(timeZone49.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(numberFormat51);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle(1.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape4, (double) 16, (double) 2);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape11, (double) 16, (double) 2);
        boolean boolean15 = org.jfree.chart.util.ShapeUtils.equal(shape9, shape14);
        boolean boolean16 = org.jfree.chart.util.ShapeUtils.equal(shape4, shape9);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtils.clone(shape18);
        boolean boolean20 = org.jfree.chart.util.ShapeUtils.equal(shape9, shape19);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtils.clone(shape19);
        java.awt.Shape shape24 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape19, (double) 10L, (double) (short) 100);
        boolean boolean25 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape19);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape29 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, rectangleAnchor26, (double) 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.jfree.chart.util.Rotation rotation0 = org.jfree.chart.util.Rotation.ANTICLOCKWISE;
        java.lang.String str1 = rotation0.toString();
        double double2 = rotation0.getFactor();
        double double3 = rotation0.getFactor();
        double double4 = rotation0.getFactor();
        org.junit.Assert.assertTrue("'" + rotation0 + "' != '" + org.jfree.chart.util.Rotation.ANTICLOCKWISE + "'", rotation0.equals(org.jfree.chart.util.Rotation.ANTICLOCKWISE));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Rotation.ANTICLOCKWISE" + "'", str1, "Rotation.ANTICLOCKWISE");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 12, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 100, 100, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList2 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean3 = legendRenderingOrder0.equals((java.lang.Object) objectList2);
        java.lang.String str4 = legendRenderingOrder0.toString();
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) 1, 0.0f);
        boolean boolean8 = legendRenderingOrder0.equals((java.lang.Object) shape7);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) (short) 0);
        boolean boolean11 = legendRenderingOrder0.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendRenderingOrder.REVERSE" + "'", str4, "LegendRenderingOrder.REVERSE");
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("1.58", jFreeChart1, true);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer42);
// flaky "79) test0933(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer42.toString(), "\u221e");
        org.junit.Assert.assertNull(paint46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat62 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean63 = relativeDateFormat62.isLenient();
        java.text.ParsePosition parsePosition65 = null;
        java.util.Date date66 = relativeDateFormat62.parse("m", parsePosition65);
        relativeDateFormat62.setBaseMillis((long) 8);
        java.text.NumberFormat numberFormat69 = java.text.NumberFormat.getCurrencyInstance();
        numberFormat69.setParseIntegerOnly(false);
        java.lang.String str73 = numberFormat69.format((long) 15);
        relativeDateFormat62.setHourFormatter(numberFormat69);
        java.text.NumberFormat numberFormat75 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean76 = numberFormat75.isGroupingUsed();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat77 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str78 = relativeDateFormat77.getHourSuffix();
        boolean boolean79 = relativeDateFormat77.getShowZeroHours();
        java.lang.String str80 = relativeDateFormat77.getMinuteSuffix();
        long long81 = relativeDateFormat77.getBaseMillis();
        java.lang.String str82 = relativeDateFormat77.getHourSuffix();
        relativeDateFormat77.setPositivePrefix("");
        java.lang.Object obj85 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat77);
        relativeDateFormat77.setBaseMillis((long) 4);
        java.lang.String str88 = numberFormat75.format((java.lang.Object) 4);
        numberFormat75.setMinimumFractionDigits(17);
        java.util.Currency currency91 = numberFormat75.getCurrency();
        numberFormat69.setCurrency(currency91);
        // The following exception was thrown during execution in test generation
        try {
            logFormat17.setCurrency(currency91);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(date66);
        org.junit.Assert.assertNotNull(numberFormat69);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\24415.00" + "'", str73, "\24415.00");
        org.junit.Assert.assertNotNull(numberFormat75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "h" + "'", str78, "h");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "m" + "'", str80, "m");
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "h" + "'", str82, "h");
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "4" + "'", str88, "4");
        org.junit.Assert.assertNotNull(currency91);
        org.junit.Assert.assertEquals(currency91.toString(), "XXX");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        relativeDateFormat0.setBaseMillis((long) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
// flaky "80) test0935(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u221e" + "'", str13, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(numberFormat36);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertNotNull(stringBuffer51);
        org.junit.Assert.assertEquals(stringBuffer51.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer53);
// flaky "25) test0935(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer53.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "10^1.51");
        org.junit.Assert.assertNotNull(stringBuffer57);
        org.junit.Assert.assertEquals(stringBuffer57.toString(), "NaN0h0m0.000s");
        org.junit.Assert.assertNotNull(stringBuffer59);
        org.junit.Assert.assertEquals(stringBuffer59.toString(), "NaN0h0m0.000s");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle(100.0d, (double) (short) 1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
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
        java.util.TimeZone timeZone32 = relativeDateFormat3.getTimeZone();
        relativeDateFormat3.setDaySuffix("5.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "m" + "'", str6, "m");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "3.32");
// flaky "81) test0937(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\u221e" + "'", str26, "\u221e");
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "NaN" + "'", str29, "NaN");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape2, (double) 100.0f, (float) (byte) -1, (float) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        java.awt.Paint paint5 = null;
        paintList0.setPaint(11, paint5);
        java.lang.Object obj7 = paintList0.clone();
        java.lang.Object obj8 = null;
        boolean boolean9 = paintList0.equals(obj8);
        int int10 = paintList0.size();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat11 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str12 = relativeDateFormat11.getHourSuffix();
        boolean boolean13 = relativeDateFormat11.getShowZeroHours();
        java.lang.String str14 = relativeDateFormat11.getMinuteSuffix();
        long long15 = relativeDateFormat11.getBaseMillis();
        java.lang.String str16 = relativeDateFormat11.getHourSuffix();
        relativeDateFormat11.setPositivePrefix("");
        java.lang.Object obj19 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat11);
        relativeDateFormat11.setBaseMillis((long) 4);
        relativeDateFormat11.setSecondSuffix("6.64");
        org.jfree.chart.util.LogFormat logFormat28 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int29 = logFormat28.getMaximumFractionDigits();
        logFormat28.setGroupingUsed(true);
        logFormat28.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer35 = null;
        java.text.FieldPosition fieldPosition36 = null;
        java.lang.StringBuffer stringBuffer37 = logFormat28.format((java.lang.Object) 10, stringBuffer35, fieldPosition36);
        org.jfree.chart.util.LogFormat logFormat42 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat42.setMinimumIntegerDigits(1);
        logFormat42.setGroupingUsed(false);
        logFormat28.setExponentFormat((java.text.NumberFormat) logFormat42);
        java.lang.String str49 = logFormat28.format((double) 3);
        relativeDateFormat11.setSecondFormatter((java.text.NumberFormat) logFormat28);
        boolean boolean51 = paintList0.equals((java.lang.Object) logFormat28);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "m" + "'", str14, "m");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(stringBuffer37);
        org.junit.Assert.assertEquals(stringBuffer37.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0.66" + "'", str49, "0.66");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.String str11 = logFormat4.format((double) 0L);
        logFormat4.setMinimumIntegerDigits((-1));
        java.awt.Shape shape15 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtils.clone(shape15);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape16, (double) (byte) 10, (double) 10.0f);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtils.rotateShape(shape21, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape26 = org.jfree.chart.util.ShapeUtils.clone(shape25);
        boolean boolean27 = org.jfree.chart.util.ShapeUtils.equal(shape16, shape25);
        java.awt.Shape shape30 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape25, (double) 0.5f, (double) 1L);
        java.awt.Shape shape33 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape30, (double) 3, (double) 100L);
        java.awt.Shape shape34 = org.jfree.chart.util.ShapeUtils.clone(shape33);
        boolean boolean35 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) (-1), (java.lang.Object) shape34);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky "82) test0940(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u221e" + "'", str11, "\u221e");
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertNotNull(shape26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shape30);
        org.junit.Assert.assertNotNull(shape33);
        org.junit.Assert.assertNotNull(shape34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        boolean boolean59 = relativeDateFormat0.equals((java.lang.Object) relativeDateFormat25);
        java.lang.String str60 = relativeDateFormat0.getDaySuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "d" + "'", str60, "d");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(4, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 'a');
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency57 = logFormat45.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        boolean boolean3 = relativeDateFormat0.getShowZeroHours();
        java.lang.Class<?> wildcardClass4 = relativeDateFormat0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createDownTriangle(1.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.rotateShape(shape3, (double) 16, (float) (short) 100, (float) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint8 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList2 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean3 = legendRenderingOrder0.equals((java.lang.Object) objectList2);
        java.lang.String str4 = legendRenderingOrder0.toString();
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) 1, 0.0f);
        boolean boolean8 = legendRenderingOrder0.equals((java.lang.Object) shape7);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape7, (double) (byte) 0, 1.0d);
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "LegendRenderingOrder.REVERSE" + "'", str4, "LegendRenderingOrder.REVERSE");
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond(10.0f);
        java.awt.Shape shape2 = null;
        boolean boolean3 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape2);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        dateFormat0.setTimeZone(timeZone2);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        boolean boolean6 = relativeDateFormat4.getShowZeroHours();
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
        relativeDateFormat4.setMinuteFormatter((java.text.NumberFormat) logFormat11);
        java.lang.String str55 = relativeDateFormat4.getDaySuffix();
        java.util.TimeZone timeZone56 = relativeDateFormat4.getTimeZone();
        dateFormat0.setTimeZone(timeZone56);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(stringBuffer37);
        org.junit.Assert.assertEquals(stringBuffer37.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer39);
        org.junit.Assert.assertEquals(stringBuffer39.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 3 + "'", int45 == 3);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "d" + "'", str55, "d");
        org.junit.Assert.assertNotNull(timeZone56);
        org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat8);
        java.text.NumberFormat numberFormat10 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat10.setMinimumFractionDigits((int) '4');
        int int13 = numberFormat10.getMinimumIntegerDigits();
        numberFormat10.setMaximumFractionDigits(6);
        logFormat8.setExponentFormat(numberFormat10);
        boolean boolean18 = logFormat8.equals((java.lang.Object) "LegendRenderingOrder.STANDARD");
        int int19 = logFormat8.getMinimumIntegerDigits();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat0.setPositivePrefix("\u221e");
        java.lang.String str6 = relativeDateFormat0.getPositivePrefix();
        boolean boolean7 = relativeDateFormat0.getShowZeroHours();
        java.util.TimeZone timeZone8 = relativeDateFormat0.getTimeZone();
        java.util.TimeZone timeZone9 = relativeDateFormat0.getTimeZone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u221e" + "'", str6, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond((float) (byte) 100);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("", jFreeChart1, false);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        boolean boolean5 = logFormat4.isParseIntegerOnly();
        logFormat4.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition9 = null;
        java.lang.Object obj10 = logFormat4.parseObject("LegendRenderingOrder.REVERSE", parsePosition9);
        logFormat4.setMinimumFractionDigits((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = logFormat4.parseObject("5.7");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        relativeDateFormat0.setSecondSuffix("");
        relativeDateFormat0.setBaseMillis((-1L));
        java.lang.String str31 = relativeDateFormat0.getDaySuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(stringBuffer18);
        org.junit.Assert.assertEquals(stringBuffer18.toString(), "3.32");
// flaky "83) test0957(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u221e" + "'", str20, "\u221e");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NaN" + "'", str23, "NaN");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "LegendRenderingOrder.REVERSE" + "'", str31, "LegendRenderingOrder.REVERSE");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        java.lang.String str26 = logFormat9.format((long) 13);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(stringBuffer18);
        org.junit.Assert.assertEquals(stringBuffer18.toString(), "3.32");
// flaky "84) test0958(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u221e" + "'", str20, "\u221e");
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "NaN" + "'", str23, "NaN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "3.7" + "'", str26, "3.7");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.String str11 = logFormat4.format((double) 0L);
        int int12 = logFormat4.getMinimumFractionDigits();
        boolean boolean13 = logFormat4.isGroupingUsed();
        org.jfree.chart.PaintMap paintMap14 = new org.jfree.chart.PaintMap();
        paintMap14.clear();
        java.awt.Paint paint17 = paintMap14.getPaint((java.lang.Comparable) true);
        org.jfree.chart.util.LogFormat logFormat18 = new org.jfree.chart.util.LogFormat();
        logFormat18.setParseIntegerOnly(true);
        logFormat18.setParseIntegerOnly(false);
        org.jfree.chart.util.LogFormat logFormat28 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat28.setMinimumIntegerDigits(1);
        boolean boolean31 = logFormat28.isGroupingUsed();
        logFormat28.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat34 = logFormat28.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat40 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int41 = logFormat40.getMaximumFractionDigits();
        logFormat40.setGroupingUsed(true);
        logFormat40.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer47 = null;
        java.text.FieldPosition fieldPosition48 = null;
        java.lang.StringBuffer stringBuffer49 = logFormat40.format((java.lang.Object) 10, stringBuffer47, fieldPosition48);
        java.text.FieldPosition fieldPosition50 = null;
        java.lang.StringBuffer stringBuffer51 = logFormat28.format(0.0d, stringBuffer49, fieldPosition50);
        java.text.FieldPosition fieldPosition52 = null;
        java.lang.StringBuffer stringBuffer53 = logFormat18.format((double) ' ', stringBuffer49, fieldPosition52);
        java.awt.Paint paint54 = paintMap14.getPaint((java.lang.Comparable) stringBuffer49);
        org.jfree.chart.util.ObjectList objectList56 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj58 = objectList56.get((int) (short) 1);
        org.jfree.chart.util.Rotation rotation60 = org.jfree.chart.util.Rotation.CLOCKWISE;
        objectList56.set((int) (short) 1, (java.lang.Object) rotation60);
        java.awt.Paint paint62 = paintMap14.getPaint((java.lang.Comparable) (short) 1);
        java.lang.Object obj63 = null;
        boolean boolean64 = paintMap14.equals(obj63);
        java.lang.Object obj65 = paintMap14.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = logFormat4.format(obj65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky "85) test0959(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u221e" + "'", str11, "\u221e");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(numberFormat34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(stringBuffer49);
        org.junit.Assert.assertEquals(stringBuffer49.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer51);
// flaky "26) test0959(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer51.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer53);
        org.junit.Assert.assertEquals(stringBuffer53.toString(), "10^1.51");
        org.junit.Assert.assertNull(paint54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + rotation60 + "' != '" + org.jfree.chart.util.Rotation.CLOCKWISE + "'", rotation60.equals(org.jfree.chart.util.Rotation.CLOCKWISE));
        org.junit.Assert.assertNull(paint62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(obj65);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        org.jfree.chart.util.LogFormat logFormat56 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int57 = logFormat56.getMaximumFractionDigits();
        logFormat56.setGroupingUsed(true);
        logFormat56.setParseIntegerOnly(true);
        java.lang.String str63 = logFormat56.format((double) 0L);
        logFormat56.setMinimumIntegerDigits((-1));
        boolean boolean66 = logFormat56.isGroupingUsed();
        boolean boolean67 = paintMap0.equals((java.lang.Object) logFormat56);
        boolean boolean69 = paintMap0.containsKey((java.lang.Comparable) 1.0f);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "m" + "'", str10, "m");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "h" + "'", str12, "h");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertNotNull(dateFormat26);
        org.junit.Assert.assertNotNull(timeZone27);
        org.junit.Assert.assertEquals(timeZone27.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(date32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "h" + "'", str34, "h");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "d" + "'", str35, "d");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
// flaky "86) test0960(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\u221e" + "'", str63, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        relativeDateFormat0.setShowZeroDays(false);
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
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 4);
        boolean boolean5 = org.jfree.chart.util.ShapeUtils.equal(shape2, shape4);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.clone(shape7);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.clone(shape7);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape11, (double) 16, (double) 2);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape18 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape21 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape18, (double) 16, (double) 2);
        boolean boolean22 = org.jfree.chart.util.ShapeUtils.equal(shape16, shape21);
        boolean boolean23 = org.jfree.chart.util.ShapeUtils.equal(shape11, shape16);
        boolean boolean24 = org.jfree.chart.util.ShapeUtils.equal(shape7, shape16);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtils.clone(shape7);
        boolean boolean26 = org.jfree.chart.util.ShapeUtils.equal(shape2, shape7);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape7, (double) 17, (float) 4, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj2 = objectList1.clone();
        boolean boolean4 = objectList1.equals((java.lang.Object) "s");
        objectList1.clear();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, 2, 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        relativeDateFormat32.setShowZeroDays(true);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double) 128, "0.66", true);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double) 14, "Rotation.CLOCKWISE", false);
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat8.setMinimumIntegerDigits(1);
        boolean boolean11 = logFormat8.isGroupingUsed();
        boolean boolean12 = logFormat8.isGroupingUsed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = logFormat3.format((java.lang.Object) logFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond((float) 32);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat90 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str91 = relativeDateFormat90.getHourSuffix();
        relativeDateFormat90.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat90.setPositivePrefix("\u221e");
        java.lang.String str96 = relativeDateFormat90.getPositivePrefix();
        boolean boolean97 = relativeDateFormat90.getShowZeroHours();
        boolean boolean98 = objectList1.equals((java.lang.Object) relativeDateFormat90);
        boolean boolean99 = relativeDateFormat90.getShowZeroHours();
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
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "h" + "'", str91, "h");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "\u221e" + "'", str96, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        relativeDateFormat2.setShowZeroHours(false);
        java.lang.String str43 = relativeDateFormat2.getMinuteSuffix();
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
        org.junit.Assert.assertNotNull(numberFormat40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "m" + "'", str43, "m");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat53 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str54 = relativeDateFormat53.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat59 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat59.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat62 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone63 = dateFormat62.getTimeZone();
        boolean boolean64 = logFormat59.equals((java.lang.Object) timeZone63);
        relativeDateFormat53.setHourFormatter((java.text.NumberFormat) logFormat59);
        relativeDateFormat53.setLenient(false);
        java.lang.String str68 = relativeDateFormat53.getSecondSuffix();
        org.jfree.chart.util.LogFormat logFormat72 = new org.jfree.chart.util.LogFormat((double) 4, "0.66", true);
        relativeDateFormat53.setSecondFormatter((java.text.NumberFormat) logFormat72);
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat72);
        relativeDateFormat0.setLenient(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(calendar3);
// flaky "87) test0972(RegressionTest1)":         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1758659513672,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=53,MILLISECOND=672,ZONE_OFFSET=0,DST_OFFSET=0]");
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "h" + "'", str54, "h");
        org.junit.Assert.assertNotNull(dateFormat62);
        org.junit.Assert.assertNotNull(timeZone63);
        org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "s" + "'", str68, "s");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        java.lang.StringBuffer stringBuffer8 = logFormat4.format((-1L), stringBuffer6, fieldPosition7);
        logFormat4.setParseIntegerOnly(true);
        boolean boolean11 = logFormat4.isGroupingUsed();
        org.jfree.chart.util.ObjectList objectList13 = new org.jfree.chart.util.ObjectList(100);
        java.lang.Object obj15 = objectList13.get((int) (short) 1);
        boolean boolean16 = logFormat4.equals((java.lang.Object) (short) 1);
        logFormat4.setMinimumIntegerDigits((int) (short) -1);
        java.text.NumberFormat numberFormat19 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean20 = numberFormat19.isGroupingUsed();
        int int21 = numberFormat19.getMinimumIntegerDigits();
        java.util.Currency currency22 = numberFormat19.getCurrency();
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setCurrency(currency22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuffer8);
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "NaN");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(numberFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(currency22);
        org.junit.Assert.assertEquals(currency22.toString(), "XXX");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean1 = relativeDateFormat0.isLenient();
        java.text.ParsePosition parsePosition3 = null;
        java.util.Date date4 = relativeDateFormat0.parse("m", parsePosition3);
        relativeDateFormat0.setBaseMillis((long) 8);
        long long7 = relativeDateFormat0.getBaseMillis();
        org.jfree.chart.util.LogFormat logFormat12 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int13 = logFormat12.getMaximumFractionDigits();
        logFormat12.setGroupingUsed(true);
        logFormat12.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer19 = null;
        java.text.FieldPosition fieldPosition20 = null;
        java.lang.StringBuffer stringBuffer21 = logFormat12.format((java.lang.Object) 10, stringBuffer19, fieldPosition20);
        java.lang.String str23 = logFormat12.format(0L);
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat12);
        java.text.NumberFormat numberFormat25 = logFormat12.getExponentFormat();
        java.text.AttributedCharacterIterator attributedCharacterIterator27 = logFormat12.formatToCharacterIterator((java.lang.Object) 52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 8L + "'", long7 == 8L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "3.32");
// flaky "88) test0974(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u221e" + "'", str23, "\u221e");
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertNotNull(attributedCharacterIterator27);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("\24414.00", jFreeChart1, true);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        long long4 = relativeDateFormat0.getBaseMillis();
        relativeDateFormat0.setShowZeroHours(false);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat7 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str8 = relativeDateFormat7.getHourSuffix();
        boolean boolean9 = relativeDateFormat7.getShowZeroHours();
        java.lang.String str10 = relativeDateFormat7.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat15 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat15.setMinimumIntegerDigits(1);
        boolean boolean18 = logFormat15.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat24 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer26 = null;
        java.text.FieldPosition fieldPosition27 = null;
        java.lang.StringBuffer stringBuffer28 = logFormat24.format((-1L), stringBuffer26, fieldPosition27);
        java.text.FieldPosition fieldPosition29 = null;
        java.lang.StringBuffer stringBuffer30 = logFormat15.format((long) (short) 10, stringBuffer26, fieldPosition29);
        relativeDateFormat7.setHourFormatter((java.text.NumberFormat) logFormat15);
        java.lang.String str32 = relativeDateFormat7.getHourSuffix();
        long long33 = relativeDateFormat7.getBaseMillis();
        java.util.TimeZone timeZone34 = relativeDateFormat7.getTimeZone();
        boolean boolean35 = relativeDateFormat0.equals((java.lang.Object) relativeDateFormat7);
        relativeDateFormat7.setMinuteSuffix("");
        java.util.Calendar calendar38 = relativeDateFormat7.getCalendar();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "m" + "'", str10, "m");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(stringBuffer28);
        org.junit.Assert.assertEquals(stringBuffer28.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(timeZone34);
        org.junit.Assert.assertEquals(timeZone34.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(calendar38);
// flaky "89) test0976(RegressionTest1)":         org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=1758659513857,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=53,MILLISECOND=857,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape2, 1.0d, (float) 4L, (float) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 4, 64, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.lang.Object obj8 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        relativeDateFormat0.setSecondSuffix("\u221e");
        org.jfree.chart.util.LogFormat logFormat15 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int16 = logFormat15.getMaximumFractionDigits();
        logFormat15.setGroupingUsed(true);
        logFormat15.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer22 = null;
        java.text.FieldPosition fieldPosition23 = null;
        java.lang.StringBuffer stringBuffer24 = logFormat15.format((java.lang.Object) 10, stringBuffer22, fieldPosition23);
        org.jfree.chart.util.LogFormat logFormat29 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat29.setMinimumIntegerDigits(1);
        logFormat29.setGroupingUsed(false);
        logFormat15.setExponentFormat((java.text.NumberFormat) logFormat29);
        int int35 = logFormat29.getMinimumIntegerDigits();
        relativeDateFormat0.setMinuteFormatter((java.text.NumberFormat) logFormat29);
        java.lang.Class<?> wildcardClass37 = relativeDateFormat0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, (int) (byte) 1, (int) (byte) 10, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) (-1L));
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        java.lang.Class<?> wildcardClass34 = numberFormat33.getClass();
        boolean boolean35 = org.jfree.chart.util.SerialUtils.isSerializable((java.lang.Class) wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat12 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str13 = relativeDateFormat12.getHourSuffix();
        boolean boolean14 = relativeDateFormat12.getShowZeroHours();
        java.lang.String str15 = relativeDateFormat12.getMinuteSuffix();
        long long16 = relativeDateFormat12.getBaseMillis();
        java.lang.String str17 = relativeDateFormat12.getHourSuffix();
        relativeDateFormat12.setPositivePrefix("");
        java.lang.Object obj20 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat12);
        relativeDateFormat12.setBaseMillis((long) 4);
        relativeDateFormat12.setShowZeroHours(true);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat25 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str26 = relativeDateFormat25.getHourSuffix();
        boolean boolean27 = relativeDateFormat25.getShowZeroHours();
        java.lang.String str28 = relativeDateFormat25.getMinuteSuffix();
        long long29 = relativeDateFormat25.getBaseMillis();
        java.text.ParsePosition parsePosition31 = null;
        java.util.Date date32 = relativeDateFormat25.parse("", parsePosition31);
        org.jfree.chart.util.LogFormat logFormat37 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat37.setMinimumIntegerDigits(1);
        logFormat37.setGroupingUsed(false);
        java.lang.String str43 = logFormat37.format((double) 0);
        relativeDateFormat25.setNumberFormat((java.text.NumberFormat) logFormat37);
        logFormat37.setMaximumFractionDigits((int) (byte) 0);
        org.jfree.chart.util.LogFormat logFormat51 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat51.setMinimumIntegerDigits(1);
        boolean boolean54 = logFormat51.isGroupingUsed();
        logFormat51.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat57 = logFormat51.getExponentFormat();
        org.jfree.chart.util.LogFormat logFormat63 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int64 = logFormat63.getMaximumFractionDigits();
        logFormat63.setGroupingUsed(true);
        logFormat63.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer70 = null;
        java.text.FieldPosition fieldPosition71 = null;
        java.lang.StringBuffer stringBuffer72 = logFormat63.format((java.lang.Object) 10, stringBuffer70, fieldPosition71);
        java.text.FieldPosition fieldPosition73 = null;
        java.lang.StringBuffer stringBuffer74 = logFormat51.format(0.0d, stringBuffer72, fieldPosition73);
        logFormat37.setExponentFormat((java.text.NumberFormat) logFormat51);
        relativeDateFormat12.setHourFormatter((java.text.NumberFormat) logFormat51);
        relativeDateFormat0.setDayFormatter((java.text.NumberFormat) logFormat51);
        java.text.NumberFormat numberFormat78 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean79 = numberFormat78.isGroupingUsed();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat80 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str81 = relativeDateFormat80.getHourSuffix();
        boolean boolean82 = relativeDateFormat80.getShowZeroHours();
        java.lang.String str83 = relativeDateFormat80.getMinuteSuffix();
        long long84 = relativeDateFormat80.getBaseMillis();
        java.lang.String str85 = relativeDateFormat80.getHourSuffix();
        relativeDateFormat80.setPositivePrefix("");
        java.lang.Object obj88 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat80);
        relativeDateFormat80.setBaseMillis((long) 4);
        java.lang.String str91 = numberFormat78.format((java.lang.Object) 4);
        numberFormat78.setMinimumFractionDigits(17);
        java.util.Currency currency94 = numberFormat78.getCurrency();
        // The following exception was thrown during execution in test generation
        try {
            logFormat51.setCurrency(currency94);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "m" + "'", str15, "m");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h" + "'", str17, "h");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "h" + "'", str26, "h");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "m" + "'", str28, "m");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(date32);
// flaky "90) test0983(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u221e" + "'", str43, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(numberFormat57);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertNotNull(stringBuffer72);
        org.junit.Assert.assertEquals(stringBuffer72.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer74);
// flaky "27) test0983(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer74.toString(), "\u221e");
        org.junit.Assert.assertNotNull(numberFormat78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "h" + "'", str81, "h");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "m" + "'", str83, "m");
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "h" + "'", str85, "h");
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "4" + "'", str91, "4");
        org.junit.Assert.assertNotNull(currency94);
        org.junit.Assert.assertEquals(currency94.toString(), "XXX");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.util.Calendar calendar1 = relativeDateFormat0.getCalendar();
        java.lang.Object obj2 = relativeDateFormat0.clone();
        java.util.Calendar calendar3 = relativeDateFormat0.getCalendar();
        java.lang.String str4 = relativeDateFormat0.getPositivePrefix();
        org.junit.Assert.assertNotNull(calendar1);
// flaky "91) test0984(RegressionTest1)":         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1758659514169,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=54,MILLISECOND=169,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(calendar3);
// flaky "28) test0984(RegressionTest1)":         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1758659514169,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=54,MILLISECOND=169,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        relativeDateFormat0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date41 = relativeDateFormat0.parse("-1");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"-1\"");
        } catch (java.text.ParseException e) {
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
// flaky "92) test0985(RegressionTest1)":         org.junit.Assert.assertEquals(stringBuffer34.toString(), "\u221e");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(numberFormat37);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle(1.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, (double) 12, (double) (byte) -1);
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat21 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str22 = relativeDateFormat21.getHourSuffix();
        boolean boolean23 = relativeDateFormat21.getShowZeroHours();
        relativeDateFormat21.setHourSuffix("h");
        relativeDateFormat21.setHourSuffix("d");
        boolean boolean28 = relativeDateFormat21.getShowZeroDays();
        java.lang.Class<?> wildcardClass29 = relativeDateFormat21.getClass();
        boolean boolean30 = org.jfree.chart.util.SerialUtils.isSerializable((java.lang.Class) wildcardClass29);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator31 = logFormat4.formatToCharacterIterator((java.lang.Object) boolean30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "93) test0987(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "29) test0987(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "h" + "'", str22, "h");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj2 = objectList1.clone();
        java.lang.Object obj3 = objectList1.clone();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        boolean boolean6 = relativeDateFormat4.getShowZeroHours();
        java.lang.String str7 = relativeDateFormat4.getMinuteSuffix();
        long long8 = relativeDateFormat4.getBaseMillis();
        java.lang.String str9 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat16 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int17 = logFormat16.getMaximumFractionDigits();
        logFormat16.setGroupingUsed(true);
        logFormat16.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer23 = null;
        java.text.FieldPosition fieldPosition24 = null;
        java.lang.StringBuffer stringBuffer25 = logFormat16.format((java.lang.Object) 10, stringBuffer23, fieldPosition24);
        java.lang.String str27 = logFormat16.format(0L);
        java.lang.Object obj28 = logFormat16.clone();
        java.lang.String str30 = logFormat16.format((java.lang.Object) (byte) -1);
        relativeDateFormat4.setNumberFormat((java.text.NumberFormat) logFormat16);
        int int32 = objectList1.indexOf((java.lang.Object) logFormat16);
        java.lang.String str34 = logFormat16.format((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode35 = logFormat16.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "m" + "'", str7, "m");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
// flaky "94) test0988(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u221e" + "'", str27, "\u221e");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "NaN" + "'", str30, "NaN");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "3.32" + "'", str34, "3.32");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat27 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str28 = relativeDateFormat27.getHourSuffix();
        relativeDateFormat27.setMinuteSuffix("SortOrder.DESCENDING");
        long long31 = relativeDateFormat27.getBaseMillis();
        relativeDateFormat27.setShowZeroHours(false);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat34 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str35 = relativeDateFormat34.getHourSuffix();
        boolean boolean36 = relativeDateFormat34.getShowZeroHours();
        java.lang.String str37 = relativeDateFormat34.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat42 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat42.setMinimumIntegerDigits(1);
        boolean boolean45 = logFormat42.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat51 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer53 = null;
        java.text.FieldPosition fieldPosition54 = null;
        java.lang.StringBuffer stringBuffer55 = logFormat51.format((-1L), stringBuffer53, fieldPosition54);
        java.text.FieldPosition fieldPosition56 = null;
        java.lang.StringBuffer stringBuffer57 = logFormat42.format((long) (short) 10, stringBuffer53, fieldPosition56);
        relativeDateFormat34.setHourFormatter((java.text.NumberFormat) logFormat42);
        java.lang.String str59 = relativeDateFormat34.getHourSuffix();
        long long60 = relativeDateFormat34.getBaseMillis();
        java.util.TimeZone timeZone61 = relativeDateFormat34.getTimeZone();
        boolean boolean62 = relativeDateFormat27.equals((java.lang.Object) relativeDateFormat34);
        relativeDateFormat34.setBaseMillis(0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = relativeDateFormat0.format((java.lang.Object) relativeDateFormat34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "h" + "'", str28, "h");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "h" + "'", str35, "h");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "m" + "'", str37, "m");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer57);
        org.junit.Assert.assertEquals(stringBuffer57.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "h" + "'", str59, "h");
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        logFormat4.setParseIntegerOnly(false);
        java.text.ParsePosition parsePosition23 = null;
        java.lang.Number number24 = logFormat4.parse("\24415.00", parsePosition23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "95) test0990(RegressionTest1)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "0.0");
        org.junit.Assert.assertNull(number24);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        java.lang.String str11 = relativeDateFormat0.getMinuteSuffix();
        java.text.ParsePosition parsePosition13 = null;
        java.util.Date date14 = relativeDateFormat0.parse("14", parsePosition13);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "m" + "'", str9, "m");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "m" + "'", str11, "m");
        org.junit.Assert.assertNull(date14);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(309, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 309");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat((double) 16, "\24415.00", false);
        logFormat3.setMinimumFractionDigits(5);
        int int6 = logFormat3.getMinimumIntegerDigits();
        int int7 = logFormat3.getMinimumFractionDigits();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        java.lang.Object obj1 = paintMap0.clone();
        java.awt.Paint paint3 = null;
        paintMap0.put((java.lang.Comparable) '4', paint3);
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
        java.lang.Object obj66 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) logFormat60);
        boolean boolean67 = paintMap0.equals(obj66);
        java.awt.Paint paint69 = paintMap0.getPaint((java.lang.Comparable) "h");
        org.junit.Assert.assertNotNull(obj1);
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
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(paint69);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        java.util.Date date29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = relativeDateFormat0.format(date29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDiagonalCross(0.0f, 1.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat53 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str54 = relativeDateFormat53.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat59 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat59.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat62 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone63 = dateFormat62.getTimeZone();
        boolean boolean64 = logFormat59.equals((java.lang.Object) timeZone63);
        relativeDateFormat53.setHourFormatter((java.text.NumberFormat) logFormat59);
        relativeDateFormat53.setLenient(false);
        java.lang.String str68 = relativeDateFormat53.getSecondSuffix();
        org.jfree.chart.util.LogFormat logFormat72 = new org.jfree.chart.util.LogFormat((double) 4, "0.66", true);
        relativeDateFormat53.setSecondFormatter((java.text.NumberFormat) logFormat72);
        relativeDateFormat0.setNumberFormat((java.text.NumberFormat) logFormat72);
        boolean boolean75 = logFormat72.isGroupingUsed();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(calendar3);
// flaky "96) test0997(RegressionTest1)":         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1758659514646,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=54,MILLISECOND=646,ZONE_OFFSET=0,DST_OFFSET=0]");
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "h" + "'", str54, "h");
        org.junit.Assert.assertNotNull(dateFormat62);
        org.junit.Assert.assertNotNull(timeZone63);
        org.junit.Assert.assertEquals(timeZone63.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "s" + "'", str68, "s");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 4);
        boolean boolean5 = org.jfree.chart.util.ShapeUtils.equal(shape2, shape4);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape4, (double) 64, (float) 1L, 0.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(64, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 64");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}
