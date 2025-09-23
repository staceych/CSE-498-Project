package org.jfree.chart;


import org.junit.FixMethodOrder;
// import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTestZero {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = java.text.DateFormat.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int0 = java.awt.Frame.NW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.io.ObjectInputStream objectInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Stroke stroke1 = org.jfree.chart.util.SerialUtils.readStroke(objectInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int0 = java.awt.Frame.TEXT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = java.awt.Frame.MOVE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int int0 = java.awt.Frame.DEFAULT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.awt.image.BufferedImage bufferedImage0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.BufferedImage bufferedImage1 = org.jfree.chart.util.PaintAlpha.cloneImage(bufferedImage0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.BufferedImage.getRaster()\" because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int0 = java.text.DateFormat.MEDIUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"time\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int0 = java.text.DateFormat.HOUR0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = logFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int0 = java.awt.Frame.HAND_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int int0 = java.awt.Frame.WAIT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_IN_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.awt.Polygon polygon0 = null;
        java.awt.Polygon polygon1 = null;
        boolean boolean2 = org.jfree.chart.util.ShapeUtils.equal(polygon0, polygon1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.io.ObjectInputStream objectInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape1 = org.jfree.chart.util.SerialUtils.readShape(objectInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.awt.geom.GeneralPath generalPath0 = null;
        java.awt.geom.GeneralPath generalPath1 = null;
        boolean boolean2 = org.jfree.chart.util.ShapeUtils.equal(generalPath0, generalPath1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, (int) (byte) 1, (int) (short) 1, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int0 = java.awt.Frame.E_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int int0 = java.text.DateFormat.HOUR1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int int0 = java.text.DateFormat.TIMEZONE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.io.ObjectInputStream objectInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Composite composite1 = org.jfree.chart.util.SerialUtils.readComposite(objectInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int int0 = java.awt.Frame.SW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.awt.Stroke stroke0 = null;
        java.io.ObjectOutputStream objectOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeStroke(stroke0, objectOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        int int0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.lang.StringBuffer stringBuffer2 = null;
        java.text.FieldPosition fieldPosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer4 = dateFormat0.format((java.lang.Object) 1, stringBuffer2, fieldPosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"endIndex\" because \"pos\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int0 = java.text.NumberFormat.FRACTION_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        boolean boolean0 = org.jfree.chart.util.ExportUtils.isOrsonPDFAvailable();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int0 = java.awt.Frame.MAXIMIZED_VERT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.awt.Paint paint0 = null;
        java.awt.Paint paint1 = org.jfree.chart.util.PaintAlpha.darker(paint0);
        org.junit.Assert.assertNull(paint1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int int0 = java.text.DateFormat.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int0 = java.text.DateFormat.DAY_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int0 = java.text.DateFormat.MINUTE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getCurrencyInstance(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.hashCode()\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getInstance(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.hashCode()\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        boolean boolean1 = org.jfree.chart.util.PaintAlpha.setLegacyAlpha(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int0 = java.text.DateFormat.DATE_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 10, 1.0d, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        int int0 = java.awt.Frame.NE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        org.jfree.chart.util.LogFormat logFormat6 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int7 = logFormat6.getMaximumFractionDigits();
        logFormat6.setGroupingUsed(true);
        logFormat6.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        java.lang.StringBuffer stringBuffer15 = logFormat6.format((java.lang.Object) 10, stringBuffer13, fieldPosition14);
        java.text.FieldPosition fieldPosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer17 = dateFormat0.format((java.lang.Object) (byte) 10, stringBuffer15, fieldPosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"endIndex\" because \"pos\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(stringBuffer15);
        org.junit.Assert.assertEquals(stringBuffer15.toString(), "3.32");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getPercentInstance(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.hashCode()\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getNumberInstance(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.hashCode()\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = dateFormat0.format(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int int0 = java.text.DateFormat.MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 2, (int) '#', file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.io.ObjectInputStream objectInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D1 = org.jfree.chart.util.SerialUtils.readPoint2D(objectInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("hi!", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"index\" because \"pos\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.awt.geom.Arc2D arc2D0 = null;
        java.awt.geom.Arc2D arc2D1 = null;
        boolean boolean2 = org.jfree.chart.util.ShapeUtils.equal(arc2D0, arc2D1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 1.0f, (double) (byte) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(2147483647, 13, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.util.Date date2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = dateFormat0.format(date2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.awt.Frame[] frameArray0 = java.awt.Frame.getFrames();
        org.junit.Assert.assertNotNull(frameArray0);
        org.junit.Assert.assertArrayEquals(frameArray0, new java.awt.Frame[] {});
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        float float0 = java.awt.Component.TOP_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.util.Locale locale0 = null;
        java.text.NumberFormat.Style style1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.NumberFormat numberFormat2 = java.text.NumberFormat.getCompactNumberInstance(locale0, style1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        int int0 = java.awt.Frame.ICONIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number11 = logFormat4.parse("\u221e");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"-?\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.math.RoundingMode roundingMode5 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setRoundingMode(roundingMode5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int0 = java.text.DateFormat.FULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator9 = logFormat4.formatToCharacterIterator((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape2, (double) 10.0f, (float) 'a', (float) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape3, (double) 16, (double) 2);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint7 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number9 = logFormat4.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 0, (int) 'a', file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (97) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int int0 = java.text.DateFormat.DEFAULT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int int0 = java.awt.Frame.MAXIMIZED_BOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        int int0 = java.awt.Frame.CROSSHAIR_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.jfree.chart.util.SerialUtils.isSerializable(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.io.ObjectInputStream objectInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint1 = org.jfree.chart.util.SerialUtils.readPaint(objectInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCompactNumberInstance();
        java.math.RoundingMode roundingMode1 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberFormat0.setRoundingMode(roundingMode1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = dateFormat0.parseObject("hi!", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"index\" because \"pos\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        int int0 = java.awt.Frame.N_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 16, 13, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.rotateShape(shape1, (double) 'a', (float) (-1), (float) 'a');
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape5, rectangleAnchor6, (double) 15, (double) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance((int) 'a', locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int0 = java.text.NumberFormat.INTEGER_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) (-1.0f), (double) 2, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond((float) 11);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int int0 = java.text.DateFormat.WEEK_OF_YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        java.awt.geom.Rectangle2D rectangle2D1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jfree.chart.util.ShapeUtils.intersects(rectangle2D0, rectangle2D1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getX()\" because \"rect1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.awt.Paint paint0 = null;
        java.io.ObjectOutputStream objectOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writePaint(paint0, objectOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = logFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.text.AttributedString attributedString0 = null;
        java.io.ObjectOutputStream objectOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeAttributedString(attributedString0, objectOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, (double) 16, (double) 2);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape4, rectangleAnchor5, (double) ' ', (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int int0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, (int) (short) 1, (int) (byte) 100, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateFormat0.parse("LegendRenderingOrder.REVERSE");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"LegendRenderingOrder.REVERSE\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        boolean boolean0 = org.jfree.chart.util.ExportUtils.isJFreeSVGAvailable();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer2 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat7.setMinimumIntegerDigits(1);
        boolean boolean10 = logFormat7.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat16 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        java.lang.StringBuffer stringBuffer20 = logFormat16.format((-1L), stringBuffer18, fieldPosition19);
        java.text.FieldPosition fieldPosition21 = null;
        java.lang.StringBuffer stringBuffer22 = logFormat7.format((long) (short) 10, stringBuffer18, fieldPosition21);
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = dateFormat0.format((java.lang.Object) directionalGradientPaintTransformer2, stringBuffer18, fieldPosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stringBuffer20);
        org.junit.Assert.assertEquals(stringBuffer20.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer22);
        org.junit.Assert.assertEquals(stringBuffer22.toString(), "3.32");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(8, (int) (byte) 10, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) "d");
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        boolean boolean1 = org.jfree.chart.util.PaintAlpha.setLegacyAlpha(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        int int0 = java.awt.Frame.S_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection collection1 = org.jfree.chart.util.ObjectUtils.deepClone(collection0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'collection' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int int0 = java.awt.Frame.MAXIMIZED_HORIZ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.awt.geom.Line2D line2D0 = null;
        java.awt.geom.Line2D line2D1 = null;
        boolean boolean2 = org.jfree.chart.util.ShapeUtils.equal(line2D0, line2D1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.awt.geom.Point2D point2D0 = null;
        java.io.ObjectOutputStream objectOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writePoint2D(point2D0, objectOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 100, (double) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        dateFormat0.setTimeZone(timeZone2);
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateFormat0.format(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        int int0 = java.text.DateFormat.MILLISECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("\u221e", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int6 = logFormat5.getMaximumFractionDigits();
        logFormat5.setGroupingUsed(true);
        logFormat5.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition12 = null;
        java.lang.Object obj13 = logFormat5.parseObject("", parsePosition12);
        boolean boolean14 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) (-1.0f), obj13);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.awt.Composite composite0 = null;
        java.io.ObjectOutputStream objectOutputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeComposite(composite0, objectOutputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.awt.geom.Ellipse2D ellipse2D0 = null;
        java.awt.geom.Ellipse2D ellipse2D1 = null;
        boolean boolean2 = org.jfree.chart.util.ShapeUtils.equal(ellipse2D0, ellipse2D1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        java.util.Date date3 = null;
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer10 = null;
        java.text.FieldPosition fieldPosition11 = null;
        java.lang.StringBuffer stringBuffer12 = logFormat8.format((-1L), stringBuffer10, fieldPosition11);
        java.text.FieldPosition fieldPosition13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer14 = relativeDateFormat0.format(date3, stringBuffer12, fieldPosition13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(stringBuffer12);
        org.junit.Assert.assertEquals(stringBuffer12.toString(), "NaN");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int int0 = java.text.DateFormat.SECOND_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, 0, (int) 'a', file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        int int0 = java.text.DateFormat.ERA_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, (double) 16, (double) 2);
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int int0 = org.jfree.chart.util.AbstractObjectList.DEFAULT_INITIAL_CAPACITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.awt.Paint paint2 = null;
        // The following exception was thrown during execution in test generation
        try {
            paintList0.setPaint((int) (short) -1, paint2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int0 = java.text.DateFormat.HOUR_OF_DAY0_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        int int0 = java.text.DateFormat.HOUR_OF_DAY1_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        java.lang.Object obj2 = objectList1.clone();
        java.text.NumberFormat numberFormat4 = java.text.NumberFormat.getCurrencyInstance();
        // The following exception was thrown during execution in test generation
        try {
            objectList1.set(3, (java.lang.Object) numberFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(numberFormat4);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int int0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateFormat0.parse("m");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"m\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number62 = logFormat7.parse("h");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"h\"");
        } catch (java.text.ParseException e) {
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = relativeDateFormat0.format(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        logFormat4.setGroupingUsed(false);
        logFormat4.setMaximumIntegerDigits((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency11 = logFormat4.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, (float) 17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.util.Map map0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map map1 = org.jfree.chart.util.CloneUtils.cloneMapValues(map0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'source' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(0);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        int int0 = java.text.DateFormat.AM_PM_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((-1), 1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 64, 12, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, 0, (int) (short) 100, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int int0 = java.awt.Frame.W_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, (int) (byte) 100, (int) (byte) 1, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int int0 = java.awt.Frame.SE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency7 = logFormat4.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, (int) (byte) 100, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = dateFormat0.parseObject("hi!", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"index\" because \"pos\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(15, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        java.lang.Object obj61 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) logFormat55);
        java.util.Currency currency62 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat55.setCurrency(currency62);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(obj61);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("h", jFreeChart1, false);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("SortOrder.DESCENDING", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        boolean boolean34 = numberFormat33.isParseIntegerOnly();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(numberFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = logFormat4.parseObject("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        int int0 = java.text.DateFormat.DAY_OF_WEEK_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) (short) 10, (double) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        java.awt.geom.Rectangle2D rectangle2D1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jfree.chart.util.ShapeUtils.contains(rectangle2D0, rectangle2D1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getX()\" because \"rect1\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.lang.Object obj8 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int14 = logFormat13.getMaximumFractionDigits();
        logFormat13.setGroupingUsed(true);
        logFormat13.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition20 = null;
        java.lang.Object obj21 = logFormat13.parseObject("", parsePosition20);
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat26.setMinimumIntegerDigits(1);
        boolean boolean29 = logFormat26.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat35 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer37 = null;
        java.text.FieldPosition fieldPosition38 = null;
        java.lang.StringBuffer stringBuffer39 = logFormat35.format((-1L), stringBuffer37, fieldPosition38);
        java.text.FieldPosition fieldPosition40 = null;
        java.lang.StringBuffer stringBuffer41 = logFormat26.format((long) (short) 10, stringBuffer37, fieldPosition40);
        org.jfree.chart.util.LogFormat logFormat46 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int47 = logFormat46.getMaximumFractionDigits();
        logFormat46.setGroupingUsed(true);
        logFormat46.setGroupingUsed(false);
        logFormat46.setMaximumIntegerDigits((-1));
        logFormat26.setExponentFormat((java.text.NumberFormat) logFormat46);
        boolean boolean55 = logFormat13.equals((java.lang.Object) logFormat26);
        org.jfree.chart.util.LogFormat logFormat60 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat60.setMinimumIntegerDigits(1);
        boolean boolean63 = logFormat60.isGroupingUsed();
        logFormat60.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat66 = logFormat60.getExponentFormat();
        logFormat13.setExponentFormat((java.text.NumberFormat) logFormat60);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator68 = relativeDateFormat0.formatToCharacterIterator((java.lang.Object) logFormat60);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(stringBuffer39);
        org.junit.Assert.assertEquals(stringBuffer39.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer41);
        org.junit.Assert.assertEquals(stringBuffer41.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(numberFormat66);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.io.ObjectInputStream objectInputStream0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedString attributedString1 = org.jfree.chart.util.SerialUtils.readAttributedString(objectInputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 5, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, (int) (short) 10, 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (10) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        int int0 = java.text.DateFormat.YEAR_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        relativeDateFormat0.setShowZeroHours(false);
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer63 = relativeDateFormat0.format((java.lang.Object) "SortOrder.ASCENDING", stringBuffer59, fieldPosition62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(numberFormat44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(stringBuffer59);
        org.junit.Assert.assertEquals(stringBuffer59.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer61);
// flaky "1) test0167(RegressionTest0)":         org.junit.Assert.assertEquals(stringBuffer61.toString(), "\u221e");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int int0 = java.text.DateFormat.WEEK_OF_MONTH_FIELD;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        java.lang.String str18 = relativeDateFormat0.getMinuteSuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(dateFormat3);
        org.junit.Assert.assertNotNull(dateFormat4);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "m" + "'", str18, "m");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        int int0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat0.setMinimumIntegerDigits((int) (short) 100);
        java.math.RoundingMode roundingMode3 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberFormat0.setRoundingMode(roundingMode3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond((float) 13);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, rectangleAnchor2, (double) (byte) 100, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, (int) '#', (int) (short) 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (35) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 16, 128, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 0, (int) (byte) 100, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (100) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 13, (-1), file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (13) and height (-1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        logFormat4.setMaximumIntegerDigits(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = logFormat4.parseObject("4");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
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
        org.jfree.chart.util.LogFormat logFormat59 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat59.setMinimumIntegerDigits(1);
        boolean boolean62 = logFormat59.isGroupingUsed();
        logFormat59.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat65 = logFormat59.getExponentFormat();
        logFormat12.setExponentFormat((java.text.NumberFormat) logFormat59);
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer96 = relativeDateFormat0.format((java.lang.Object) logFormat12, stringBuffer94, fieldPosition95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(stringBuffer38);
        org.junit.Assert.assertEquals(stringBuffer38.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(numberFormat65);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(numberFormat77);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 3 + "'", int84 == 3);
        org.junit.Assert.assertNotNull(stringBuffer92);
        org.junit.Assert.assertEquals(stringBuffer92.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer94);
// flaky "2) test0180(RegressionTest0)":         org.junit.Assert.assertEquals(stringBuffer94.toString(), "\u221e");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(numberFormat61);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(4, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("SortOrder.ASCENDING", jFreeChart1, true);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("", jFreeChart1, true);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.PaintMap paintMap1 = new org.jfree.chart.PaintMap();
        paintMap1.clear();
        java.awt.Paint paint4 = paintMap1.getPaint((java.lang.Comparable) true);
        boolean boolean5 = paintList0.equals((java.lang.Object) paintMap1);
        java.awt.Paint paint7 = paintList0.getPaint((int) 'a');
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(paint7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        java.text.ParsePosition parsePosition15 = null;
        java.lang.Number number16 = logFormat4.parse("SortOrder.DESCENDING", parsePosition15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency17 = logFormat4.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        java.lang.StringBuffer stringBuffer8 = logFormat4.format((-1L), stringBuffer6, fieldPosition7);
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat13);
        java.util.Currency currency15 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setCurrency(currency15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuffer8);
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "NaN");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) 14, (float) 5);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape1, (double) 4, (float) 0, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        boolean boolean5 = logFormat4.isParseIntegerOnly();
        logFormat4.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition9 = null;
        java.lang.Object obj10 = logFormat4.parseObject("LegendRenderingOrder.REVERSE", parsePosition9);
        org.jfree.chart.util.Rotation rotation11 = org.jfree.chart.util.Rotation.ANTICLOCKWISE;
        org.jfree.chart.util.LogFormat logFormat16 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer18 = null;
        java.text.FieldPosition fieldPosition19 = null;
        java.lang.StringBuffer stringBuffer20 = logFormat16.format((-1L), stringBuffer18, fieldPosition19);
        java.text.FieldPosition fieldPosition21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer22 = logFormat4.format((java.lang.Object) rotation11, stringBuffer20, fieldPosition21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + rotation11 + "' != '" + org.jfree.chart.util.Rotation.ANTICLOCKWISE + "'", rotation11.equals(org.jfree.chart.util.Rotation.ANTICLOCKWISE));
        org.junit.Assert.assertNotNull(stringBuffer20);
        org.junit.Assert.assertEquals(stringBuffer20.toString(), "NaN");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, (int) (byte) 0, 16, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        boolean boolean10 = logFormat5.equals((java.lang.Object) timeZone9);
        boolean boolean11 = paintList0.equals((java.lang.Object) logFormat5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 0.0f, (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, (int) (short) 1, (int) '#', file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) (byte) 100, (double) 'a', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, (int) (short) 10, 11, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setGroupingUsed(false);
        logFormat4.setMaximumIntegerDigits((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode12 = logFormat4.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) (byte) 1, (float) 128);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        logFormat4.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat10 = logFormat4.getExponentFormat();
        java.math.RoundingMode roundingMode11 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setRoundingMode(roundingMode11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 12, (int) '4', file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, (double) (byte) 10, (double) 10.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.rotateShape(shape7, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtils.clone(shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtils.equal(shape2, shape11);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape11, (double) 0.5f, (double) 1L);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape16, (double) 3, (double) 100L);
        java.io.ObjectOutputStream objectOutputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape16, objectOutputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        java.util.Currency currency47 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setCurrency(currency47);
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
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(12, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        relativeDateFormat0.setPositivePrefix("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(date15);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 5, (double) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.text.NumberFormat numberFormat3 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat0.setNumberFormat(numberFormat3);
        boolean boolean5 = relativeDateFormat0.getShowZeroDays();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, 5, 17, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) 'a', (float) (-1));
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat6 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str7 = relativeDateFormat6.getHourSuffix();
        boolean boolean8 = relativeDateFormat6.getShowZeroHours();
        java.text.NumberFormat numberFormat9 = java.text.NumberFormat.getIntegerInstance();
        relativeDateFormat6.setNumberFormat(numberFormat9);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator11 = logFormat4.formatToCharacterIterator((java.lang.Object) numberFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(numberFormat9);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape5, (double) 16, (double) 2);
        boolean boolean9 = org.jfree.chart.util.ShapeUtils.equal(shape3, shape8);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint10 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, (int) (byte) 10, (int) (byte) 10, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        boolean boolean1 = relativeDateFormat0.isLenient();
        java.text.ParsePosition parsePosition3 = null;
        java.util.Date date4 = relativeDateFormat0.parse("m", parsePosition3);
        relativeDateFormat0.setBaseMillis((long) 8);
        org.jfree.chart.util.LogFormat logFormat11 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat11);
        boolean boolean13 = relativeDateFormat0.getShowZeroHours();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number6 = logFormat4.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"hi!\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createDownTriangle(1.0f);
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 15, (-1), file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (15) and height (-1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.lang.Class<?> wildcardClass60 = relativeDateFormat0.getClass();
        boolean boolean61 = org.jfree.chart.util.SerialUtils.isSerializable((java.lang.Class) wildcardClass60);
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
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer15 = null;
        java.text.FieldPosition fieldPosition16 = null;
        java.lang.StringBuffer stringBuffer17 = logFormat13.format((-1L), stringBuffer15, fieldPosition16);
        java.text.FieldPosition fieldPosition18 = null;
        java.lang.StringBuffer stringBuffer19 = logFormat4.format((long) (short) 10, stringBuffer15, fieldPosition18);
        java.lang.Object obj20 = logFormat4.clone();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "3.32");
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getInstance();
        int int1 = numberFormat0.getMaximumFractionDigits();
        java.text.ParsePosition parsePosition3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = numberFormat0.parseObject("SortOrder.DESCENDING", parsePosition3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"index\" because \"pos\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat8 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str9 = relativeDateFormat8.getHourSuffix();
        boolean boolean10 = relativeDateFormat8.getShowZeroHours();
        java.lang.String str11 = relativeDateFormat8.getMinuteSuffix();
        long long12 = relativeDateFormat8.getBaseMillis();
        java.lang.String str13 = relativeDateFormat8.getHourSuffix();
        relativeDateFormat8.setShowZeroHours(false);
        relativeDateFormat8.setPositivePrefix("h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = logFormat4.format((java.lang.Object) "h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "m" + "'", str11, "m");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        boolean boolean0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        boolean boolean10 = logFormat5.equals((java.lang.Object) timeZone9);
        boolean boolean11 = paintList0.equals((java.lang.Object) logFormat5);
        boolean boolean12 = logFormat5.isParseIntegerOnly();
        java.text.DateFormat dateFormat13 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat14 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone15 = dateFormat14.getTimeZone();
        dateFormat13.setTimeZone(timeZone15);
        org.jfree.chart.util.LogFormat logFormat21 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int22 = logFormat21.getMaximumFractionDigits();
        logFormat21.setGroupingUsed(true);
        logFormat21.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer28 = null;
        java.text.FieldPosition fieldPosition29 = null;
        java.lang.StringBuffer stringBuffer30 = logFormat21.format((java.lang.Object) 10, stringBuffer28, fieldPosition29);
        dateFormat13.setNumberFormat((java.text.NumberFormat) logFormat21);
        logFormat21.setGroupingUsed(false);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator34 = logFormat5.formatToCharacterIterator((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateFormat13);
        org.junit.Assert.assertNotNull(dateFormat14);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "3.32");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape1, 0.0d, (float) 128, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        int int1 = objectList0.size();
        objectList0.clear();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setMinuteSuffix("SortOrder.DESCENDING");
        long long8 = relativeDateFormat4.getBaseMillis();
        objectList0.set(64, (java.lang.Object) relativeDateFormat4);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date11 = relativeDateFormat4.parse("");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        java.lang.StringBuffer stringBuffer8 = logFormat4.format((-1L), stringBuffer6, fieldPosition7);
        org.jfree.chart.util.LogFormat logFormat13 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number16 = logFormat13.parse("\u221e");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"-?\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(stringBuffer8);
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "NaN");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 1);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (short) 10, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        boolean boolean8 = relativeDateFormat0.getShowZeroHours();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date10 = relativeDateFormat0.parse("\24415.00");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"?15.00\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        relativeDateFormat1.setShowZeroDays(false);
        java.util.Date date4 = null;
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat9.setMinimumIntegerDigits(1);
        boolean boolean12 = logFormat9.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat18 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        java.lang.StringBuffer stringBuffer22 = logFormat18.format((-1L), stringBuffer20, fieldPosition21);
        java.text.FieldPosition fieldPosition23 = null;
        java.lang.StringBuffer stringBuffer24 = logFormat9.format((long) (short) 10, stringBuffer20, fieldPosition23);
        java.text.FieldPosition fieldPosition25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer26 = relativeDateFormat1.format(date4, stringBuffer24, fieldPosition25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stringBuffer22);
        org.junit.Assert.assertEquals(stringBuffer22.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "3.32");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 8, 10, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.rotateShape(shape1, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.clone(shape5);
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        int int21 = logFormat4.getMaximumFractionDigits();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "3) test0237(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "NaN" + "'", str18, "NaN");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        org.jfree.chart.util.LogFormat logFormat35 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int36 = logFormat35.getMaximumFractionDigits();
        logFormat35.setGroupingUsed(true);
        logFormat35.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer42 = null;
        java.text.FieldPosition fieldPosition43 = null;
        java.lang.StringBuffer stringBuffer44 = logFormat35.format((java.lang.Object) 10, stringBuffer42, fieldPosition43);
        java.lang.String str46 = logFormat35.format(0L);
        java.lang.Object obj47 = logFormat35.clone();
        java.lang.String str49 = logFormat35.format((double) (byte) 0);
        boolean boolean50 = logFormat35.isParseIntegerOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = relativeDateFormat0.format((java.lang.Object) logFormat35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "3.32");
// flaky "4) test0238(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\u221e" + "'", str46, "\u221e");
        org.junit.Assert.assertNotNull(obj47);
// flaky "1) test0238(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u221e" + "'", str49, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getInstance();
        java.lang.Object obj2 = numberFormat0.parseObject("4.0");
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 4L + "'", obj2, 4L);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date30 = relativeDateFormat2.parse("\u221e");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"-?\"");
        } catch (java.text.ParseException e) {
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
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, (double) (byte) 10, (double) 10.0f);
        java.io.ObjectOutputStream objectOutputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape5, objectOutputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        boolean boolean3 = paintMap0.containsKey((java.lang.Comparable) 0L);
        java.lang.Object obj4 = paintMap0.clone();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, (double) (byte) 10, (double) 10.0f);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape5, rectangleAnchor6, (double) 8, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("0.0", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer11 = null;
        java.text.FieldPosition fieldPosition12 = null;
        java.lang.StringBuffer stringBuffer13 = logFormat4.format((java.lang.Object) 10, stringBuffer11, fieldPosition12);
        java.text.ParsePosition parsePosition15 = null;
        java.lang.Number number16 = logFormat4.parse("SortOrder.DESCENDING", parsePosition15);
        logFormat4.setMaximumIntegerDigits((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number20 = logFormat4.parse("4.0");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"4.0\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
        org.junit.Assert.assertNull(number16);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.awt.Window[] windowArray0 = java.awt.Window.getWindows();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getInstance();
        int int2 = numberFormat1.getMaximumFractionDigits();
        int int3 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean4 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) windowArray0, (java.lang.Object) numberFormat1);
        org.junit.Assert.assertNotNull(windowArray0);
        org.junit.Assert.assertArrayEquals(windowArray0, new java.awt.Window[] {});
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        java.lang.Comparable comparable68 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Paint paint69 = paintMap0.getPaint(comparable68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        long long2 = relativeDateFormat1.getBaseMillis();
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat7.setMinimumIntegerDigits(1);
        logFormat7.setGroupingUsed(false);
        java.text.DateFormat dateFormat12 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone13 = dateFormat12.getTimeZone();
        boolean boolean14 = logFormat7.equals((java.lang.Object) dateFormat12);
        relativeDateFormat1.setDayFormatter((java.text.NumberFormat) logFormat7);
        boolean boolean16 = logFormat7.isParseIntegerOnly();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
        org.junit.Assert.assertNotNull(dateFormat12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 5, (double) 0.5f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 0.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 17, (int) (short) -1, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (17) and height (-1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dateFormat0.parseObject("6.64");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) (byte) -1, (double) (byte) -1, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 5, 15, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroDays();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = dateFormat0.parseObject("h");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 1L, (double) 9, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) ' ', (double) 10L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        relativeDateFormat0.setLenient(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(stringBuffer12);
        org.junit.Assert.assertEquals(stringBuffer12.toString(), "NaN");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, (-1), (int) '4', file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (52) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 6, (double) (short) 10, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat7 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone8 = dateFormat7.getTimeZone();
        boolean boolean9 = logFormat4.equals((java.lang.Object) timeZone8);
        org.jfree.chart.util.LogFormat logFormat14 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat14.setMinimumIntegerDigits(1);
        boolean boolean17 = logFormat14.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer25 = null;
        java.text.FieldPosition fieldPosition26 = null;
        java.lang.StringBuffer stringBuffer27 = logFormat23.format((-1L), stringBuffer25, fieldPosition26);
        java.text.FieldPosition fieldPosition28 = null;
        java.lang.StringBuffer stringBuffer29 = logFormat14.format((long) (short) 10, stringBuffer25, fieldPosition28);
        org.jfree.chart.util.LogFormat logFormat34 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int35 = logFormat34.getMaximumFractionDigits();
        logFormat34.setGroupingUsed(true);
        logFormat34.setGroupingUsed(false);
        logFormat34.setMaximumIntegerDigits((-1));
        logFormat14.setExponentFormat((java.text.NumberFormat) logFormat34);
        logFormat4.setExponentFormat((java.text.NumberFormat) logFormat34);
        logFormat4.setParseIntegerOnly(false);
        org.junit.Assert.assertNotNull(dateFormat7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer29);
        org.junit.Assert.assertEquals(stringBuffer29.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 0, (int) (short) 100, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (100) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        boolean boolean5 = logFormat4.isParseIntegerOnly();
        java.lang.Object obj6 = logFormat4.clone();
        java.lang.String str8 = logFormat4.format((double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
// flaky "5) test0266(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\u221e" + "'", str8, "\u221e");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        java.util.Currency currency28 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat24.setCurrency(currency28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "6) test0267(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "2) test0267(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode25 = logFormat4.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "7) test0268(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "3) test0268(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4.0" + "'", str24, "4.0");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, 0.0d, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj1 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) "1.58");
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat0.setMinimumFractionDigits((int) '4');
        int int3 = numberFormat0.getMinimumIntegerDigits();
        numberFormat0.setMaximumFractionDigits((int) (byte) 0);
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 1L, (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        boolean boolean19 = dateFormat0.isLenient();
        java.text.NumberFormat numberFormat20 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean21 = numberFormat20.isGroupingUsed();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat22 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str23 = relativeDateFormat22.getHourSuffix();
        boolean boolean24 = relativeDateFormat22.getShowZeroHours();
        java.lang.String str25 = relativeDateFormat22.getMinuteSuffix();
        long long26 = relativeDateFormat22.getBaseMillis();
        java.lang.String str27 = relativeDateFormat22.getHourSuffix();
        relativeDateFormat22.setPositivePrefix("");
        java.lang.Object obj30 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat22);
        relativeDateFormat22.setBaseMillis((long) 4);
        java.lang.String str33 = numberFormat20.format((java.lang.Object) 4);
        int int34 = numberFormat20.getMinimumFractionDigits();
        dateFormat0.setNumberFormat(numberFormat20);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(numberFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "h" + "'", str23, "h");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "m" + "'", str25, "m");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "h" + "'", str27, "h");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4" + "'", str33, "4");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        java.lang.Class<?> wildcardClass8 = logFormat4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) wildcardClass8);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) '4', 8, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        java.lang.String str19 = logFormat4.format((long) 3);
        logFormat4.setMaximumIntegerDigits((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "8) test0277(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.58" + "'", str19, "1.58");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond(1.0f);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, rectangleAnchor2, (-1.0d), (double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) (byte) 10);
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond(1.0f);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, rectangleAnchor2, (double) 4L, (double) 128);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle(0.0d, (double) (short) 0, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int int0 = java.awt.Frame.NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, (double) (byte) 10, (double) 10.0f);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape11 = org.jfree.chart.util.ShapeUtils.rotateShape(shape7, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtils.clone(shape11);
        boolean boolean13 = org.jfree.chart.util.ShapeUtils.equal(shape2, shape11);
        java.io.ObjectOutputStream objectOutputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape11, objectOutputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
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
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) (byte) 0);
        org.junit.Assert.assertNotNull(dateFormat1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 12, 3, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        java.math.RoundingMode roundingMode46 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat36.setRoundingMode(roundingMode46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
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
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        logFormat4.setGroupingUsed(false);
        java.lang.String str10 = logFormat4.format((-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "NaN" + "'", str10, "NaN");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((int) (byte) 0, 13, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) 17, (float) (short) 0);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.rotateShape(shape2, (double) 17, (float) 2147483647, (float) 6);
        java.io.ObjectOutputStream objectOutputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape6, objectOutputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 4);
        boolean boolean4 = org.jfree.chart.util.ShapeUtils.equal(shape1, shape3);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, rectangleAnchor5, (double) 10, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 4, (int) (byte) -1, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape3, (double) 16, (double) 2);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape10 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape10, (double) 16, (double) 2);
        boolean boolean14 = org.jfree.chart.util.ShapeUtils.equal(shape8, shape13);
        boolean boolean15 = org.jfree.chart.util.ShapeUtils.equal(shape3, shape8);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint16 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 128, (double) 0.5f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean1 = numberFormat0.isGroupingUsed();
        int int2 = numberFormat0.getMinimumIntegerDigits();
        java.util.Currency currency3 = null;
        // The following exception was thrown during execution in test generation
        try {
            numberFormat0.setCurrency(currency3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        java.math.RoundingMode roundingMode57 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat45.setRoundingMode(roundingMode57);
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) (short) 100, (-1.0d), rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.awt.Window[] windowArray1 = java.awt.Window.getOwnerlessWindows();
        boolean boolean2 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) 15, (java.lang.Object) windowArray1);
        org.junit.Assert.assertNotNull(windowArray1);
        org.junit.Assert.assertArrayEquals(windowArray1, new java.awt.Window[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
        boolean boolean63 = logFormat55.isGroupingUsed();
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, (int) (short) 1, (int) (short) 100, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        org.jfree.chart.util.LogFormat logFormat46 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        boolean boolean47 = logFormat46.isParseIntegerOnly();
        java.lang.Object obj48 = logFormat46.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator49 = relativeDateFormat0.formatToCharacterIterator(obj48);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        relativeDateFormat0.setShowZeroHours(false);
        boolean boolean33 = relativeDateFormat0.getShowZeroDays();
        java.util.Date date34 = null;
        org.jfree.chart.util.LogFormat logFormat39 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int40 = logFormat39.getMaximumFractionDigits();
        logFormat39.setGroupingUsed(true);
        logFormat39.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer46 = null;
        java.text.FieldPosition fieldPosition47 = null;
        java.lang.StringBuffer stringBuffer48 = logFormat39.format((java.lang.Object) 10, stringBuffer46, fieldPosition47);
        java.lang.String str50 = logFormat39.format(0L);
        java.lang.StringBuffer stringBuffer52 = null;
        java.text.FieldPosition fieldPosition53 = null;
        java.lang.StringBuffer stringBuffer54 = logFormat39.format(1L, stringBuffer52, fieldPosition53);
        java.text.FieldPosition fieldPosition55 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer56 = relativeDateFormat0.format(date34, stringBuffer52, fieldPosition55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(stringBuffer48);
        org.junit.Assert.assertEquals(stringBuffer48.toString(), "3.32");
// flaky "9) test0301(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\u221e" + "'", str50, "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer54);
        org.junit.Assert.assertEquals(stringBuffer54.toString(), "0.0");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) 17, 10.0f);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, rectangleAnchor3, (double) 100, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 32, (int) 'a', file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat8);
        java.lang.String str10 = relativeDateFormat0.getPositivePrefix();
        java.lang.String str11 = relativeDateFormat0.getDaySuffix();
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = relativeDateFormat0.format(date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = logFormat4.parseObject("5.0");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(1);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(10, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
            java.util.Date date10 = relativeDateFormat0.parse("Rotation.CLOCKWISE");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"Rotation.CLOCKWISE\"");
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 7, (int) (byte) -1, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (7) and height (-1) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        logFormat4.setGroupingUsed(false);
        java.lang.String str10 = logFormat4.format((double) 0);
        logFormat4.setMaximumFractionDigits((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number14 = logFormat4.parse("0.0");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"0.0\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
// flaky "10) test0310(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u221e" + "'", str10, "\u221e");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(32, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.rotateShape(shape1, (double) 'a', (float) (-1), (float) 'a');
        java.lang.Class<?> wildcardClass6 = shape5.getClass();
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("m", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        java.util.Currency currency8 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setCurrency(currency8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat6 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat6.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone10 = dateFormat9.getTimeZone();
        boolean boolean11 = logFormat6.equals((java.lang.Object) timeZone10);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat6);
        relativeDateFormat0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date16 = relativeDateFormat0.parse("s");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"s\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        relativeDateFormat0.setHourSuffix("h");
        relativeDateFormat0.setHourSuffix("d");
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = relativeDateFormat0.format(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat1 = dateFormat0.getNumberFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date3 = dateFormat0.parse("\24414.00");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"?14.00\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(numberFormat1);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(11, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date6 = relativeDateFormat0.parse("1.58");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"1.58\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.clone(shape3);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint5 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, 1, 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (-1L), (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 4);
        boolean boolean9 = org.jfree.chart.util.ShapeUtils.equal(shape6, shape8);
        boolean boolean10 = org.jfree.chart.util.ShapeUtils.equal(shape4, shape6);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint11 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, (float) 8L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) 17, (float) (short) 0);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.rotateShape(shape4, (double) 17, (float) 2147483647, (float) 6);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint9 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.util.Currency currency5 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setCurrency(currency5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(0.0d, "", "h", false);
        java.text.NumberFormat numberFormat5 = logFormat4.getExponentFormat();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency6 = logFormat4.getCurrency();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat5);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) '#');
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 8L, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(12, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) '#', (double) 11, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.lang.Object obj8 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        relativeDateFormat0.setSecondSuffix("\u221e");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = relativeDateFormat0.parseObject("0.0");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 15, (int) (byte) 100, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsJPEG(drawable0, 6, 64, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jfree.chart.util.LogFormat logFormat0 = new org.jfree.chart.util.LogFormat();
        logFormat0.setParseIntegerOnly(true);
        java.util.Currency currency3 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat0.setCurrency(currency3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator12 = relativeDateFormat0.formatToCharacterIterator((java.lang.Object) "h");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
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
// flaky "11) test0339(RegressionTest0)":         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-765948526194,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=13,MILLISECOND=806,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(11, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getTimeInstance((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 14, (double) 0L, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        java.lang.Object obj32 = objectList1.get(128);
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
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.jfree.chart.LegendRenderingOrder legendRenderingOrder0 = org.jfree.chart.LegendRenderingOrder.REVERSE;
        org.jfree.chart.util.ObjectList objectList2 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        boolean boolean3 = legendRenderingOrder0.equals((java.lang.Object) objectList2);
        int int4 = objectList2.size();
        java.lang.Object obj6 = objectList2.get(0);
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
        java.util.Calendar calendar19 = relativeDateFormat8.getCalendar();
        // The following exception was thrown during execution in test generation
        try {
            objectList2.set(2, (java.lang.Object) relativeDateFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(legendRenderingOrder0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "m" + "'", str11, "m");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "h" + "'", str13, "h");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "m" + "'", str17, "m");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(calendar19);
// flaky "12) test0344(RegressionTest0)":         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1758659474567,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=14,MILLISECOND=567,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        java.awt.Paint paint5 = paintList0.getPaint((int) (short) -1);
        java.awt.Paint paint7 = paintList0.getPaint((int) (byte) 10);
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(paint7);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) (byte) 0);
        java.lang.Object obj2 = relativeDateFormat1.clone();
        org.junit.Assert.assertNotNull(obj2);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateInstance(9, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat1 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone2 = dateFormat1.getTimeZone();
        dateFormat0.setTimeZone(timeZone2);
        dateFormat0.setLenient(false);
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.lang.Object obj8 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
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
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat17);
        logFormat17.setMinimumFractionDigits(15);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "m" + "'", str12, "m");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "3.32");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        java.awt.Paint paint53 = null;
        paintMap0.put((java.lang.Comparable) "\2440.00", paint53);
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
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat6 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int7 = logFormat6.getMaximumFractionDigits();
        logFormat6.setGroupingUsed(true);
        logFormat6.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer13 = null;
        java.text.FieldPosition fieldPosition14 = null;
        java.lang.StringBuffer stringBuffer15 = logFormat6.format((java.lang.Object) 10, stringBuffer13, fieldPosition14);
        java.lang.String str17 = logFormat6.format(0L);
        org.jfree.chart.util.LogFormat logFormat22 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat22.setMinimumIntegerDigits(1);
        boolean boolean25 = logFormat22.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat31 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer33 = null;
        java.text.FieldPosition fieldPosition34 = null;
        java.lang.StringBuffer stringBuffer35 = logFormat31.format((-1L), stringBuffer33, fieldPosition34);
        java.text.FieldPosition fieldPosition36 = null;
        java.lang.StringBuffer stringBuffer37 = logFormat22.format((long) (short) 10, stringBuffer33, fieldPosition36);
        java.text.FieldPosition fieldPosition38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer39 = relativeDateFormat0.format((java.lang.Object) logFormat6, stringBuffer37, fieldPosition38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(stringBuffer15);
        org.junit.Assert.assertEquals(stringBuffer15.toString(), "3.32");
// flaky "13) test0351(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u221e" + "'", str17, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(stringBuffer35);
        org.junit.Assert.assertEquals(stringBuffer35.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer37);
        org.junit.Assert.assertEquals(stringBuffer37.toString(), "3.32");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        java.lang.Object obj32 = org.jfree.chart.util.CloneUtils.clone(obj31);
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
        org.junit.Assert.assertNotNull(obj32);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat34 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str35 = relativeDateFormat34.getHourSuffix();
        boolean boolean36 = relativeDateFormat34.getShowZeroHours();
        org.jfree.chart.util.LogFormat logFormat41 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int42 = logFormat41.getMaximumFractionDigits();
        logFormat41.setGroupingUsed(true);
        logFormat41.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition48 = null;
        java.lang.Object obj49 = logFormat41.parseObject("", parsePosition48);
        org.jfree.chart.util.LogFormat logFormat54 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat54.setMinimumIntegerDigits(1);
        boolean boolean57 = logFormat54.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat63 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer65 = null;
        java.text.FieldPosition fieldPosition66 = null;
        java.lang.StringBuffer stringBuffer67 = logFormat63.format((-1L), stringBuffer65, fieldPosition66);
        java.text.FieldPosition fieldPosition68 = null;
        java.lang.StringBuffer stringBuffer69 = logFormat54.format((long) (short) 10, stringBuffer65, fieldPosition68);
        org.jfree.chart.util.LogFormat logFormat74 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int75 = logFormat74.getMaximumFractionDigits();
        logFormat74.setGroupingUsed(true);
        logFormat74.setGroupingUsed(false);
        logFormat74.setMaximumIntegerDigits((-1));
        logFormat54.setExponentFormat((java.text.NumberFormat) logFormat74);
        boolean boolean83 = logFormat41.equals((java.lang.Object) logFormat54);
        relativeDateFormat34.setMinuteFormatter((java.text.NumberFormat) logFormat41);
        org.jfree.chart.util.LogFormat logFormat89 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat89.setMinimumIntegerDigits(1);
        boolean boolean92 = logFormat89.isGroupingUsed();
        boolean boolean93 = logFormat89.isGroupingUsed();
        boolean boolean94 = logFormat41.equals((java.lang.Object) logFormat89);
        logFormat89.setMinimumFractionDigits((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            objectList1.set(100, (java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
// flaky "14) test0353(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\u221e" + "'", str27, "\u221e");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "NaN" + "'", str30, "NaN");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "h" + "'", str35, "h");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(stringBuffer67);
        org.junit.Assert.assertEquals(stringBuffer67.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer69);
        org.junit.Assert.assertEquals(stringBuffer69.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 3 + "'", int75 == 3);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 10, 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        java.util.Date date27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = relativeDateFormat0.format(date27);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        logFormat4.setGroupingUsed(false);
        int int9 = logFormat4.getMinimumIntegerDigits();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat10 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str11 = relativeDateFormat10.getHourSuffix();
        boolean boolean12 = relativeDateFormat10.getShowZeroHours();
        java.lang.String str13 = relativeDateFormat10.getMinuteSuffix();
        long long14 = relativeDateFormat10.getBaseMillis();
        java.lang.String str15 = relativeDateFormat10.getHourSuffix();
        relativeDateFormat10.setPositivePrefix("");
        java.lang.Object obj18 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat10);
        relativeDateFormat10.setBaseMillis((long) 4);
        java.lang.String str21 = relativeDateFormat10.getSecondSuffix();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = logFormat4.format((java.lang.Object) str21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "m" + "'", str13, "m");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "s" + "'", str21, "s");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(14, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 14");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        relativeDateFormat0.setLenient(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.clone(shape3);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape4, (double) (byte) 10, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint8 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.util.Calendar calendar2 = relativeDateFormat0.getCalendar();
        boolean boolean3 = relativeDateFormat0.getShowZeroDays();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(calendar2);
// flaky "15) test0363(RegressionTest0)":         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1758659476188,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=16,MILLISECOND=188,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (short) 0, 0.0f);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 4, (int) (byte) 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (4) and height (0) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, (float) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance(2147483647, 0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 2147483647");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPDF(drawable0, 14, (int) (short) 0, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Neither OrsonPDF nor JFreePDF is present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        int int1 = objectList0.size();
        objectList0.clear();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setMinuteSuffix("SortOrder.DESCENDING");
        long long8 = relativeDateFormat4.getBaseMillis();
        objectList0.set(64, (java.lang.Object) relativeDateFormat4);
        org.jfree.chart.PaintMap paintMap10 = new org.jfree.chart.PaintMap();
        boolean boolean12 = paintMap10.containsKey((java.lang.Comparable) (short) 10);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat13 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str14 = relativeDateFormat13.getHourSuffix();
        boolean boolean15 = relativeDateFormat13.getShowZeroHours();
        java.lang.String str16 = relativeDateFormat13.getMinuteSuffix();
        long long17 = relativeDateFormat13.getBaseMillis();
        java.lang.String str18 = relativeDateFormat13.getHourSuffix();
        relativeDateFormat13.setShowZeroHours(false);
        org.jfree.chart.util.LogFormat logFormat25 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int26 = logFormat25.getMaximumFractionDigits();
        logFormat25.setGroupingUsed(true);
        logFormat25.setParseIntegerOnly(true);
        java.lang.StringBuffer stringBuffer32 = null;
        java.text.FieldPosition fieldPosition33 = null;
        java.lang.StringBuffer stringBuffer34 = logFormat25.format((java.lang.Object) 10, stringBuffer32, fieldPosition33);
        java.lang.String str36 = logFormat25.format(0L);
        java.lang.Object obj37 = logFormat25.clone();
        java.lang.String str39 = logFormat25.format((java.lang.Object) (byte) -1);
        relativeDateFormat13.setNumberFormat((java.text.NumberFormat) logFormat25);
        boolean boolean41 = paintMap10.equals((java.lang.Object) relativeDateFormat13);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator42 = relativeDateFormat4.formatToCharacterIterator((java.lang.Object) relativeDateFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h" + "'", str14, "h");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "m" + "'", str16, "m");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h" + "'", str18, "h");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(stringBuffer34);
        org.junit.Assert.assertEquals(stringBuffer34.toString(), "3.32");
// flaky "16) test0369(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\u221e" + "'", str36, "\u221e");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "NaN" + "'", str39, "NaN");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat1 = java.text.NumberFormat.getIntegerInstance();
        int int2 = numberFormat1.getMaximumIntegerDigits();
        boolean boolean3 = paintList0.equals((java.lang.Object) int2);
        paintList0.clear();
        java.lang.Object obj5 = paintList0.clone();
        paintList0.clear();
        org.junit.Assert.assertNotNull(numberFormat1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("\2440.00", jFreeChart1, true);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.text.DateFormat dateFormat2 = java.text.DateFormat.getDateTimeInstance(3, 1);
        org.junit.Assert.assertNotNull(dateFormat2);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 1L, (double) 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) 'a');
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(7, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, (int) (byte) -1, 100, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.awt.Shape shape0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape0, (double) 9, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.awt.geom.Line2D line2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createLineRegion(line2D0, (float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Line2D.getX1()\" because \"line\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat0.setPositivePrefix("\u221e");
        java.lang.String str6 = relativeDateFormat0.getPositivePrefix();
        long long7 = relativeDateFormat0.getBaseMillis();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u221e" + "'", str6, "\u221e");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = relativeDateFormat0.parseObject("\u221e");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        relativeDateFormat0.setMinuteSuffix("Rotation.CLOCKWISE");
        java.lang.String str7 = relativeDateFormat0.getDaySuffix();
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
        relativeDateFormat10.setHourSuffix("h");
        relativeDateFormat10.setShowZeroDays(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = relativeDateFormat0.format((java.lang.Object) relativeDateFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "m" + "'", str13, "m");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        logFormat55.setGroupingUsed(true);
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = relativeDateFormat0.parseObject("\24414.00");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
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
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        relativeDateFormat0.setBaseMillis((long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "3.32");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0.66" + "'", str29, "0.66");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        logFormat7.setParseIntegerOnly(true);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(stringBuffer16);
        org.junit.Assert.assertEquals(stringBuffer16.toString(), "3.32");
// flaky "17) test0386(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer22);
        org.junit.Assert.assertEquals(stringBuffer22.toString(), "0.0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (-1L), (float) (short) -1);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 4);
        boolean boolean9 = org.jfree.chart.util.ShapeUtils.equal(shape6, shape8);
        boolean boolean10 = org.jfree.chart.util.ShapeUtils.equal(shape4, shape6);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.GradientPaint gradientPaint11 = directionalGradientPaintTransformer0.transform(gradientPaint1, shape6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.GradientPaint.getPoint1()\" because \"paint\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat4.setMinimumIntegerDigits(1);
        boolean boolean7 = logFormat4.isGroupingUsed();
        logFormat4.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat10 = logFormat4.getExponentFormat();
        boolean boolean12 = logFormat4.equals((java.lang.Object) 0.0f);
        logFormat4.setMinimumFractionDigits(13);
        java.text.NumberFormat numberFormat15 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat15.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean18 = numberFormat15.isParseIntegerOnly();
        java.math.RoundingMode roundingMode19 = numberFormat15.getRoundingMode();
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setRoundingMode(roundingMode19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(numberFormat15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + roundingMode19 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode19.equals(java.math.RoundingMode.HALF_EVEN));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date57 = relativeDateFormat0.parse("d");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable date: \"d\"");
        } catch (java.text.ParseException e) {
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
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "3.32");
        org.junit.Assert.assertNotNull(calendar27);
// flaky "18) test0390(RegressionTest0)":         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1758659478929,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=18,MILLISECOND=929,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer6 = null;
        java.text.FieldPosition fieldPosition7 = null;
        java.lang.StringBuffer stringBuffer8 = logFormat4.format((-1L), stringBuffer6, fieldPosition7);
        logFormat4.setParseIntegerOnly(true);
        logFormat4.setParseIntegerOnly(false);
        org.junit.Assert.assertNotNull(stringBuffer8);
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "NaN");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
            java.lang.Object obj24 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "19) test0392(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "0.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.0" + "'", str21, "4.0");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        org.jfree.chart.util.LogFormat logFormat6 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int7 = logFormat6.getMaximumFractionDigits();
        logFormat6.setGroupingUsed(true);
        logFormat6.setParseIntegerOnly(true);
        java.text.ParsePosition parsePosition13 = null;
        java.lang.Object obj14 = logFormat6.parseObject("", parsePosition13);
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
        logFormat6.setExponentFormat((java.text.NumberFormat) logFormat19);
        boolean boolean63 = objectList1.equals((java.lang.Object) logFormat6);
        // The following exception was thrown during execution in test generation
        try {
            objectList1.set(17, (java.lang.Object) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 17 out of bounds for length 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer47);
        org.junit.Assert.assertEquals(stringBuffer47.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 3 + "'", int53 == 3);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        long long4 = relativeDateFormat0.getBaseMillis();
        java.util.Calendar calendar5 = relativeDateFormat0.getCalendar();
        long long6 = relativeDateFormat0.getBaseMillis();
        java.lang.Object obj7 = null;
        boolean boolean8 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) long6, obj7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(calendar5);
// flaky "20) test0394(RegressionTest0)":         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1758659479121,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2025,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=19,MILLISECOND=121,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 10L, (double) '#', rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        java.text.ParsePosition parsePosition12 = null;
        java.util.Date date13 = relativeDateFormat0.parse("6.64", parsePosition12);
        relativeDateFormat0.setLenient(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(numberFormat3);
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar9);
// flaky "21) test0396(RegressionTest0)":         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-765948520742,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=19,MILLISECOND=258,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(date13);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(0.0d, "", "h", false);
        logFormat4.setMaximumIntegerDigits(17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number8 = logFormat4.parse("LegendRenderingOrder.REVERSE");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"LegendRenderingOrder.REVERSE\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.lang.Object obj8 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        relativeDateFormat0.setBaseMillis((long) 4);
        java.lang.String str11 = relativeDateFormat0.getSecondSuffix();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = org.jfree.chart.util.CloneUtils.clone((java.lang.Object) str11);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "s" + "'", str11, "s");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, (-1), 128, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (128) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createUpTriangle(1.0f);
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.clone(shape1);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, rectangleAnchor3, (-1.0d), (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        logFormat4.setParseIntegerOnly(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "22) test0401(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "4) test0401(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(numberFormat20);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        java.text.ParsePosition parsePosition22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = numberFormat18.parseObject("s", parsePosition22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"index\" because \"pos\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "23) test0402(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(numberFormat18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "64.0" + "'", str20, "64.0");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("1.58", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) ' ', (float) 'a');
        org.junit.Assert.assertNotNull(shape2);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat7 = dateFormat6.getNumberFormat();
        numberFormat7.setParseIntegerOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = logFormat4.format((java.lang.Object) numberFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(numberFormat7);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        int int50 = logFormat4.getMaximumFractionDigits();
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 5, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        relativeDateFormat0.setMinuteSuffix("Rotation.CLOCKWISE");
        java.util.TimeZone timeZone7 = relativeDateFormat0.getTimeZone();
        java.lang.Object obj8 = relativeDateFormat0.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = relativeDateFormat0.parseObject("hi!");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.lang.Object obj8 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
        relativeDateFormat0.setBaseMillis((long) 4);
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = relativeDateFormat0.format(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Date.getTime()\" because \"date\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) 10);
        java.text.ParsePosition parsePosition3 = null;
        java.util.Date date4 = relativeDateFormat1.parse("", parsePosition3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = relativeDateFormat1.parseObject("SortOrder.ASCENDING");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Format.parseObject(String) failed");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        java.lang.Object obj17 = logFormat8.clone();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        dateFormat0.setLenient(true);
        java.util.Calendar calendar4 = dateFormat0.getCalendar();
        java.text.DateFormat dateFormat5 = java.text.DateFormat.getTimeInstance();
        java.text.DateFormat dateFormat6 = java.text.DateFormat.getInstance();
        java.util.TimeZone timeZone7 = dateFormat6.getTimeZone();
        dateFormat5.setTimeZone(timeZone7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateFormat0.format((java.lang.Object) dateFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar4);
// flaky "24) test0412(RegressionTest0)":         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-765948518955,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=21,MILLISECOND=45,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateFormat5);
        org.junit.Assert.assertNotNull(dateFormat6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        dateFormat0.setLenient(true);
        org.junit.Assert.assertNotNull(dateFormat0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setPositivePrefix("");
        java.lang.Object obj8 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat0);
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
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency35 = logFormat17.getCurrency();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h" + "'", str10, "h");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "m" + "'", str12, "m");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "3.32");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        long long8 = relativeDateFormat0.getBaseMillis();
        java.lang.String str9 = relativeDateFormat0.getMinuteSuffix();
        relativeDateFormat0.setBaseMillis((long) (short) 100);
        boolean boolean12 = relativeDateFormat0.isLenient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = relativeDateFormat0.parseObject("-0h0Rotation.CLOCKWISE0.001s");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "m" + "'", str9, "m");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.jfree.chart.util.PaintList paintList0 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat8 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone9 = dateFormat8.getTimeZone();
        boolean boolean10 = logFormat5.equals((java.lang.Object) timeZone9);
        boolean boolean11 = paintList0.equals((java.lang.Object) logFormat5);
        java.lang.Object obj12 = null;
        boolean boolean13 = paintList0.equals(obj12);
        java.awt.Paint paint15 = paintList0.getPaint(5);
        java.awt.Paint paint17 = paintList0.getPaint(10);
        org.junit.Assert.assertNotNull(dateFormat8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(paint17);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        java.lang.Object obj1 = objectList0.clone();
        objectList0.clear();
        java.lang.Class<?> wildcardClass3 = objectList0.getClass();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        logFormat4.setParseIntegerOnly(true);
        java.lang.String str23 = logFormat4.format(0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "25) test0418(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
// flaky "5) test0418(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u221e" + "'", str18, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky "1) test0418(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u221e" + "'", str23, "\u221e");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) 100, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond(1.0f);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape1, rectangleAnchor2, (double) (byte) -1, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createDiagonalCross((float) (short) 0, (float) 11);
        boolean boolean4 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) shape2, (java.lang.Object) 4L);
        java.io.ObjectOutputStream objectOutputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape2, objectOutputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) (-1L), (float) (short) -1);
        java.awt.Shape shape4 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 4);
        boolean boolean7 = org.jfree.chart.util.ShapeUtils.equal(shape4, shape6);
        boolean boolean8 = org.jfree.chart.util.ShapeUtils.equal(shape2, shape4);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, rectangleAnchor9, 0.0d, (double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        java.text.ParsePosition parsePosition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = numberFormat0.parseObject("Rotation.CLOCKWISE", parsePosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"index\" because \"pos\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.io.ObjectOutputStream objectOutputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape17, objectOutputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        relativeDateFormat0.setMinuteSuffix("Rotation.CLOCKWISE");
        java.util.TimeZone timeZone7 = relativeDateFormat0.getTimeZone();
        java.lang.String str9 = relativeDateFormat0.format((java.lang.Object) (-1.0d));
        boolean boolean10 = relativeDateFormat0.getShowZeroHours();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-0h0Rotation.CLOCKWISE0.001s" + "'", str9, "-0h0Rotation.CLOCKWISE0.001s");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDiamond((float) (short) 1);
        org.junit.Assert.assertNotNull(shape1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.text.ParsePosition parsePosition12 = null;
        java.util.Date date13 = relativeDateFormat0.parse("6.64", parsePosition12);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat14 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str15 = relativeDateFormat14.getHourSuffix();
        boolean boolean16 = relativeDateFormat14.getShowZeroHours();
        java.lang.String str17 = relativeDateFormat14.getMinuteSuffix();
        long long18 = relativeDateFormat14.getBaseMillis();
        java.text.ParsePosition parsePosition20 = null;
        java.util.Date date21 = relativeDateFormat14.parse("", parsePosition20);
        org.jfree.chart.util.LogFormat logFormat26 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat26.setMinimumIntegerDigits(1);
        logFormat26.setGroupingUsed(false);
        java.lang.String str32 = logFormat26.format((double) 0);
        relativeDateFormat14.setNumberFormat((java.text.NumberFormat) logFormat26);
        org.jfree.chart.util.LogFormat logFormat38 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat38.setMinimumIntegerDigits(1);
        boolean boolean41 = logFormat38.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat47 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer49 = null;
        java.text.FieldPosition fieldPosition50 = null;
        java.lang.StringBuffer stringBuffer51 = logFormat47.format((-1L), stringBuffer49, fieldPosition50);
        java.text.FieldPosition fieldPosition52 = null;
        java.lang.StringBuffer stringBuffer53 = logFormat38.format((long) (short) 10, stringBuffer49, fieldPosition52);
        java.text.FieldPosition fieldPosition54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer55 = relativeDateFormat0.format((java.lang.Object) relativeDateFormat14, stringBuffer53, fieldPosition54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
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
// flaky "26) test0427(RegressionTest0)":         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=-765948517584,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=22,MILLISECOND=416,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "h" + "'", str15, "h");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "m" + "'", str17, "m");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(date21);
// flaky "6) test0427(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u221e" + "'", str32, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(stringBuffer51);
        org.junit.Assert.assertEquals(stringBuffer51.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer53);
        org.junit.Assert.assertEquals(stringBuffer53.toString(), "3.32");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) 12, (double) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("-0h0Rotation.CLOCKWISE0.001s", jFreeChart1, false);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) 100L, (double) 0.0f, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        org.jfree.chart.util.PaintList paintList12 = new org.jfree.chart.util.PaintList();
        java.text.NumberFormat numberFormat13 = java.text.NumberFormat.getIntegerInstance();
        int int14 = numberFormat13.getMaximumIntegerDigits();
        boolean boolean15 = paintList12.equals((java.lang.Object) int14);
        java.awt.Paint paint17 = paintList12.getPaint((int) (short) -1);
        java.lang.Object obj18 = paintList12.clone();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator19 = relativeDateFormat0.formatToCharacterIterator(obj18);
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
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(numberFormat13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsSVG(drawable0, 11, 12, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: JFreeSVG is not present on the classpath.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean1 = numberFormat0.isParseIntegerOnly();
        numberFormat0.setMaximumIntegerDigits((int) (short) 10);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat4 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str5 = relativeDateFormat4.getHourSuffix();
        boolean boolean6 = relativeDateFormat4.getShowZeroHours();
        java.lang.String str7 = relativeDateFormat4.getMinuteSuffix();
        long long8 = relativeDateFormat4.getBaseMillis();
        java.lang.String str9 = relativeDateFormat4.getHourSuffix();
        relativeDateFormat4.setPositivePrefix("");
        java.lang.Object obj12 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat4);
        relativeDateFormat4.setBaseMillis((long) 4);
        relativeDateFormat4.setShowZeroDays(false);
        java.lang.Object obj17 = relativeDateFormat4.clone();
        long long18 = relativeDateFormat4.getBaseMillis();
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat25 = new org.jfree.chart.util.LogFormat();
        logFormat25.setParseIntegerOnly(true);
        logFormat25.setParseIntegerOnly(false);
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
        java.text.FieldPosition fieldPosition59 = null;
        java.lang.StringBuffer stringBuffer60 = logFormat25.format((double) ' ', stringBuffer56, fieldPosition59);
        java.text.FieldPosition fieldPosition61 = null;
        java.lang.StringBuffer stringBuffer62 = logFormat23.format((-1.0d), stringBuffer56, fieldPosition61);
        java.text.FieldPosition fieldPosition63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer64 = numberFormat0.format((java.lang.Object) long18, stringBuffer56, fieldPosition63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.text.FieldPosition.setBeginIndex(int)\" because \"fieldPosition\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "m" + "'", str7, "m");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 4L + "'", long18 == 4L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(numberFormat41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertNotNull(stringBuffer56);
        org.junit.Assert.assertEquals(stringBuffer56.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer58);
// flaky "27) test0433(RegressionTest0)":         org.junit.Assert.assertEquals(stringBuffer58.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer60);
        org.junit.Assert.assertEquals(stringBuffer60.toString(), "10^1.51");
        org.junit.Assert.assertNotNull(stringBuffer62);
        org.junit.Assert.assertEquals(stringBuffer62.toString(), "NaN");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.clone(shape2);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape3, (double) (byte) 10, (double) 10.0f);
        java.awt.Shape shape8 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtils.rotateShape(shape8, (double) 'a', (float) (-1), (float) 'a');
        java.awt.Shape shape13 = org.jfree.chart.util.ShapeUtils.clone(shape12);
        boolean boolean14 = org.jfree.chart.util.ShapeUtils.equal(shape3, shape12);
        java.awt.Shape shape17 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape12, (double) 0.5f, (double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape12, (double) (-1), (-1.0f), 0.5f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shape17);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.text.DateFormat dateFormat0 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone1 = dateFormat0.getTimeZone();
        boolean boolean2 = dateFormat0.isLenient();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.text.NumberFormat numberFormat26 = java.text.NumberFormat.getInstance();
        int int27 = numberFormat26.getMaximumFractionDigits();
        boolean boolean28 = legendRenderingOrder0.equals((java.lang.Object) int27);
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
        org.junit.Assert.assertNotNull(numberFormat26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat65 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str66 = relativeDateFormat65.getHourSuffix();
        relativeDateFormat65.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat73 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat65.setSecondFormatter((java.text.NumberFormat) logFormat73);
        java.text.NumberFormat numberFormat75 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat75.setMinimumFractionDigits((int) '4');
        int int78 = numberFormat75.getMinimumIntegerDigits();
        numberFormat75.setMaximumFractionDigits(6);
        logFormat73.setExponentFormat(numberFormat75);
        boolean boolean82 = numberFormat75.isParseIntegerOnly();
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator83 = logFormat32.formatToCharacterIterator((java.lang.Object) numberFormat75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "h" + "'", str66, "h");
        org.junit.Assert.assertNotNull(numberFormat75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        java.text.NumberFormat numberFormat49 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat49.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean52 = numberFormat49.isParseIntegerOnly();
        java.math.RoundingMode roundingMode53 = numberFormat49.getRoundingMode();
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setRoundingMode(roundingMode53);
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
        org.junit.Assert.assertNotNull(numberFormat49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + roundingMode53 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode53.equals(java.math.RoundingMode.HALF_EVEN));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("\u221e", jFreeChart1, false);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 15, 100, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        boolean boolean56 = numberFormat52.isParseIntegerOnly();
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat57 = new org.jfree.chart.util.RelativeDateFormat((long) 15);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator58 = relativeDateFormat0.formatToCharacterIterator((java.lang.Object) relativeDateFormat57);
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
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) '#');
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, (double) 100.0f, (double) 8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape5, 10.0d, (float) 100, (float) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        int int28 = logFormat4.getMinimumFractionDigits();
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode29 = logFormat4.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer27);
// flaky "28) test0445(RegressionTest0)":         org.junit.Assert.assertEquals(stringBuffer27.toString(), "\u221e");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat(0.0d, "", "h", false);
        java.text.NumberFormat numberFormat5 = logFormat4.getExponentFormat();
        logFormat4.setMinimumIntegerDigits((int) (short) 100);
        java.util.Currency currency8 = null;
        // The following exception was thrown during execution in test generation
        try {
            logFormat4.setCurrency(currency8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat5);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.geom.Point2D point2D3 = org.jfree.chart.util.ShapeUtils.getPointInRectangle((double) (short) -1, (double) 8, rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"area\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        java.lang.Object obj56 = objectList1.clone();
        java.lang.Object obj58 = objectList1.get(5);
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
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        boolean boolean22 = logFormat8.isParseIntegerOnly();
        org.junit.Assert.assertNotNull(dateFormat0);
        org.junit.Assert.assertNotNull(dateFormat1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.awt.Graphics2D graphics2D0 = null;
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.clone(shape2);
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
        boolean boolean28 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) shape2, (java.lang.Object) logFormat8);
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ShapeUtils.drawRotatedShape(graphics2D0, shape2, (double) 0L, (float) 15, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics2D.getTransform()\" because \"g2\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat0.setMinimumIntegerDigits((int) (short) 100);
        boolean boolean3 = numberFormat0.isParseIntegerOnly();
        java.math.RoundingMode roundingMode4 = numberFormat0.getRoundingMode();
        int int5 = numberFormat0.getMaximumFractionDigits();
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + roundingMode4 + "' != '" + java.math.RoundingMode.HALF_EVEN + "'", roundingMode4.equals(java.math.RoundingMode.HALF_EVEN));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) (byte) 10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.awt.geom.Rectangle2D rectangle2D0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = org.jfree.chart.util.ShapeUtils.isPointInRect(rectangle2D0, (double) ' ', 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.geom.Rectangle2D.getMinX()\" because \"rect\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat1 = java.text.DateFormat.getDateInstance((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal date style 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat31 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str32 = relativeDateFormat31.getHourSuffix();
        relativeDateFormat31.setMinuteSuffix("SortOrder.DESCENDING");
        org.jfree.chart.util.LogFormat logFormat39 = new org.jfree.chart.util.LogFormat((double) 8, "\u221e", "", false);
        relativeDateFormat31.setSecondFormatter((java.text.NumberFormat) logFormat39);
        java.text.NumberFormat numberFormat41 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat41.setMinimumFractionDigits((int) '4');
        int int44 = numberFormat41.getMinimumIntegerDigits();
        numberFormat41.setMaximumFractionDigits(6);
        logFormat39.setExponentFormat(numberFormat41);
        boolean boolean49 = logFormat39.equals((java.lang.Object) "LegendRenderingOrder.STANDARD");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = relativeDateFormat0.format((java.lang.Object) logFormat39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "h" + "'", str32, "h");
        org.junit.Assert.assertNotNull(numberFormat41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList((int) (byte) 0);
        objectList1.clear();
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 4);
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(16);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.String str5 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setShowZeroHours(false);
        long long8 = relativeDateFormat0.getBaseMillis();
        java.lang.String str9 = relativeDateFormat0.getMinuteSuffix();
        relativeDateFormat0.setBaseMillis((long) (short) 100);
        relativeDateFormat0.setLenient(false);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "m" + "'", str9, "m");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 10L);
        boolean boolean3 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) "LegendRenderingOrder.REVERSE", (java.lang.Object) 10L);
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.jfree.chart.util.Rotation rotation0 = org.jfree.chart.util.Rotation.ANTICLOCKWISE;
        double double1 = rotation0.getFactor();
        double double2 = rotation0.getFactor();
        double double3 = rotation0.getFactor();
        org.junit.Assert.assertTrue("'" + rotation0 + "' != '" + org.jfree.chart.util.Rotation.ANTICLOCKWISE + "'", rotation0.equals(org.jfree.chart.util.Rotation.ANTICLOCKWISE));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat1 = new org.jfree.chart.util.RelativeDateFormat((long) (short) 0);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        int int23 = logFormat4.getMinimumFractionDigits();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "29) test0463(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0" + "'", str19, "0.0");
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        java.lang.Object obj56 = relativeDateFormat0.clone();
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
        org.junit.Assert.assertNotNull(obj56);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.jfree.chart.util.LogFormat logFormat0 = new org.jfree.chart.util.LogFormat();
        org.jfree.chart.util.LogFormat logFormat5 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat5.setMinimumIntegerDigits(1);
        boolean boolean8 = logFormat5.isGroupingUsed();
        logFormat5.setMaximumIntegerDigits(1);
        java.text.NumberFormat numberFormat11 = logFormat5.getExponentFormat();
        numberFormat11.setGroupingUsed(true);
        org.jfree.chart.util.LogFormat logFormat18 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer20 = null;
        java.text.FieldPosition fieldPosition21 = null;
        java.lang.StringBuffer stringBuffer22 = logFormat18.format((-1L), stringBuffer20, fieldPosition21);
        java.text.FieldPosition fieldPosition23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer24 = logFormat0.format((java.lang.Object) true, stringBuffer20, fieldPosition23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Number");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(numberFormat11);
        org.junit.Assert.assertNotNull(stringBuffer22);
        org.junit.Assert.assertEquals(stringBuffer22.toString(), "NaN");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        org.jfree.chart.util.LogFormat logFormat6 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat6.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat9 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone10 = dateFormat9.getTimeZone();
        boolean boolean11 = logFormat6.equals((java.lang.Object) timeZone10);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat6);
        relativeDateFormat0.setLenient(false);
        java.lang.String str15 = relativeDateFormat0.getSecondSuffix();
        org.jfree.chart.util.LogFormat logFormat19 = new org.jfree.chart.util.LogFormat((double) 4, "0.66", true);
        relativeDateFormat0.setSecondFormatter((java.text.NumberFormat) logFormat19);
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode21 = logFormat19.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertNotNull(dateFormat9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "s" + "'", str15, "s");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance((int) (byte) -1, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        int int5 = logFormat4.getMaximumFractionDigits();
        logFormat4.setGroupingUsed(true);
        logFormat4.setGroupingUsed(false);
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode10 = logFormat4.getRoundingMode();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        java.text.ParsePosition parsePosition24 = null;
        java.lang.Number number25 = logFormat4.parse("", parsePosition24);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "30) test0469(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0" + "'", str19, "0.0");
        org.junit.Assert.assertNull(number22);
        org.junit.Assert.assertNull(number25);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat3 = java.text.DateFormat.getDateTimeInstance((-1), (int) (byte) -1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        int int38 = logFormat4.getMaximumFractionDigits();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(number35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, (int) (byte) -1, 8, file3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (-1) and height (8) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number19 = logFormat4.parse("\u221e");
            org.junit.Assert.fail("Expected exception of type java.text.ParseException; message: Unparseable number: \"-?\"");
        } catch (java.text.ParseException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "3.32");
// flaky "31) test0473(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u221e" + "'", str15, "\u221e");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.awt.Shape shape1 = org.jfree.chart.util.ShapeUtils.createDownTriangle(1.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.rotateShape(shape1, (double) 16, (float) (short) 100, (float) 1L);
        java.io.ObjectOutputStream objectOutputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.SerialUtils.writeShape(shape5, objectOutputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stream' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape1);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getDaySuffix();
        relativeDateFormat0.setDaySuffix("");
        relativeDateFormat0.setMinuteSuffix("Rotation.CLOCKWISE");
        relativeDateFormat0.setMinuteSuffix("SortOrder.ASCENDING");
        java.lang.String str9 = relativeDateFormat0.getHourSuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h" + "'", str9, "h");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        java.lang.String str2 = relativeDateFormat0.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat7 = new org.jfree.chart.util.LogFormat(Double.NaN, "Rotation.CLOCKWISE", "", false);
        org.jfree.chart.util.LogFormat logFormat9 = new org.jfree.chart.util.LogFormat();
        logFormat9.setParseIntegerOnly(true);
        logFormat9.setParseIntegerOnly(false);
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
        java.text.FieldPosition fieldPosition43 = null;
        java.lang.StringBuffer stringBuffer44 = logFormat9.format((double) ' ', stringBuffer40, fieldPosition43);
        java.text.FieldPosition fieldPosition45 = null;
        java.lang.StringBuffer stringBuffer46 = logFormat7.format((-1.0d), stringBuffer40, fieldPosition45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = relativeDateFormat0.format((java.lang.Object) logFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(numberFormat25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer42);
// flaky "32) test0476(RegressionTest0)":         org.junit.Assert.assertEquals(stringBuffer42.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "10^1.51");
        org.junit.Assert.assertNotNull(stringBuffer46);
        org.junit.Assert.assertEquals(stringBuffer46.toString(), "NaN");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        logFormat4.setMaximumFractionDigits((int) (byte) -1);
        java.lang.Class<?> wildcardClass31 = logFormat4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(numberFormat10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer27);
// flaky "33) test0477(RegressionTest0)":         org.junit.Assert.assertEquals(stringBuffer27.toString(), "\u221e");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.awt.Shape shape2 = org.jfree.chart.util.ShapeUtils.createRegularCross((float) 17, 10.0f);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape2, (double) 16, 10.0d);
        org.jfree.chart.ui.RectangleAnchor rectangleAnchor6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape5, rectangleAnchor6, (double) 3, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'anchor' argument.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shape2);
        org.junit.Assert.assertNotNull(shape5);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat13 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str14 = relativeDateFormat13.getHourSuffix();
        boolean boolean15 = relativeDateFormat13.getShowZeroHours();
        java.lang.String str16 = relativeDateFormat13.getMinuteSuffix();
        long long17 = relativeDateFormat13.getBaseMillis();
        java.text.ParsePosition parsePosition19 = null;
        java.util.Date date20 = relativeDateFormat13.parse("", parsePosition19);
        org.jfree.chart.util.LogFormat logFormat25 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat25.setMinimumIntegerDigits(1);
        logFormat25.setGroupingUsed(false);
        java.lang.String str31 = logFormat25.format((double) 0);
        relativeDateFormat13.setNumberFormat((java.text.NumberFormat) logFormat25);
        logFormat25.setMaximumFractionDigits((int) (byte) 0);
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
        logFormat25.setExponentFormat((java.text.NumberFormat) logFormat39);
        relativeDateFormat0.setHourFormatter((java.text.NumberFormat) logFormat39);
        java.text.DateFormat dateFormat65 = java.text.DateFormat.getDateTimeInstance();
        java.text.NumberFormat numberFormat66 = dateFormat65.getNumberFormat();
        boolean boolean67 = numberFormat66.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat72 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat72.setMinimumIntegerDigits(1);
        boolean boolean75 = logFormat72.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat81 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer83 = null;
        java.text.FieldPosition fieldPosition84 = null;
        java.lang.StringBuffer stringBuffer85 = logFormat81.format((-1L), stringBuffer83, fieldPosition84);
        java.text.FieldPosition fieldPosition86 = null;
        java.lang.StringBuffer stringBuffer87 = logFormat72.format((long) (short) 10, stringBuffer83, fieldPosition86);
        java.text.FieldPosition fieldPosition88 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer89 = relativeDateFormat0.format((java.lang.Object) boolean67, stringBuffer87, fieldPosition88);
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
        org.junit.Assert.assertNull(date20);
// flaky "34) test0479(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\u221e" + "'", str31, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(numberFormat45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(stringBuffer60);
        org.junit.Assert.assertEquals(stringBuffer60.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer62);
// flaky "7) test0479(RegressionTest0)":         org.junit.Assert.assertEquals(stringBuffer62.toString(), "\u221e");
        org.junit.Assert.assertNotNull(dateFormat65);
        org.junit.Assert.assertNotNull(numberFormat66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(stringBuffer85);
        org.junit.Assert.assertEquals(stringBuffer85.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer87);
        org.junit.Assert.assertEquals(stringBuffer87.toString(), "3.32");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.jfree.chart.ui.Drawable drawable0 = null;
        java.io.File file3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.util.ExportUtils.writeAsPNG(drawable0, 3, (int) ' ', file3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.jfree.chart.ui.Drawable.draw(java.awt.Graphics2D, java.awt.geom.Rectangle2D)\" because \"drawable\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.text.DateFormat dateFormat2 = java.text.DateFormat.getTimeInstance(17, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal time style 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        boolean boolean2 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str3 = relativeDateFormat0.getMinuteSuffix();
        long long4 = relativeDateFormat0.getBaseMillis();
        java.lang.Class<?> wildcardClass5 = relativeDateFormat0.getClass();
        boolean boolean6 = org.jfree.chart.util.SerialUtils.isSerializable((java.lang.Class) wildcardClass5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.CloneNotSupportedException; message: Object without clone() method is impossible.");
        } catch (java.lang.CloneNotSupportedException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "m" + "'", str3, "m");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.jfree.chart.util.LogFormat logFormat3 = new org.jfree.chart.util.LogFormat(10.0d, "", false);
        int int4 = logFormat3.getMinimumIntegerDigits();
        java.lang.Object obj5 = logFormat3.clone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("4", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        // The following exception was thrown during execution in test generation
        try {
            java.math.RoundingMode roundingMode22 = logFormat8.getRoundingMode();
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getIntegerInstance();
        boolean boolean1 = numberFormat0.isGroupingUsed();
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat2 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str3 = relativeDateFormat2.getHourSuffix();
        boolean boolean4 = relativeDateFormat2.getShowZeroHours();
        java.lang.String str5 = relativeDateFormat2.getMinuteSuffix();
        long long6 = relativeDateFormat2.getBaseMillis();
        java.lang.String str7 = relativeDateFormat2.getHourSuffix();
        relativeDateFormat2.setPositivePrefix("");
        java.lang.Object obj10 = org.jfree.chart.util.ObjectUtils.clone((java.lang.Object) relativeDateFormat2);
        relativeDateFormat2.setBaseMillis((long) 4);
        java.lang.String str13 = numberFormat0.format((java.lang.Object) 4);
        int int14 = numberFormat0.getMinimumFractionDigits();
        java.text.ParsePosition parsePosition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = numberFormat0.parseObject("d", parsePosition16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"index\" because \"pos\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(numberFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "m" + "'", str5, "m");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "h" + "'", str7, "h");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        relativeDateFormat0.setMinuteSuffix("\u221e");
        org.jfree.chart.util.PaintList paintList3 = new org.jfree.chart.util.PaintList();
        org.jfree.chart.util.LogFormat logFormat8 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat8.setMinimumIntegerDigits(1);
        java.text.DateFormat dateFormat11 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone12 = dateFormat11.getTimeZone();
        boolean boolean13 = logFormat8.equals((java.lang.Object) timeZone12);
        boolean boolean14 = paintList3.equals((java.lang.Object) logFormat8);
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat15 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str16 = relativeDateFormat15.getHourSuffix();
        boolean boolean17 = relativeDateFormat15.getShowZeroHours();
        java.lang.String str18 = relativeDateFormat15.getMinuteSuffix();
        org.jfree.chart.util.LogFormat logFormat23 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        logFormat23.setMinimumIntegerDigits(1);
        boolean boolean26 = logFormat23.isGroupingUsed();
        org.jfree.chart.util.LogFormat logFormat32 = new org.jfree.chart.util.LogFormat((double) 2, "hi!", "", false);
        java.lang.StringBuffer stringBuffer34 = null;
        java.text.FieldPosition fieldPosition35 = null;
        java.lang.StringBuffer stringBuffer36 = logFormat32.format((-1L), stringBuffer34, fieldPosition35);
        java.text.FieldPosition fieldPosition37 = null;
        java.lang.StringBuffer stringBuffer38 = logFormat23.format((long) (short) 10, stringBuffer34, fieldPosition37);
        relativeDateFormat15.setHourFormatter((java.text.NumberFormat) logFormat23);
        boolean boolean40 = paintList3.equals((java.lang.Object) logFormat23);
        org.jfree.chart.util.LogFormat logFormat41 = new org.jfree.chart.util.LogFormat();
        logFormat41.setParseIntegerOnly(true);
        logFormat41.setParseIntegerOnly(false);
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
        java.text.FieldPosition fieldPosition75 = null;
        java.lang.StringBuffer stringBuffer76 = logFormat41.format((double) ' ', stringBuffer72, fieldPosition75);
        java.text.FieldPosition fieldPosition77 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.StringBuffer stringBuffer78 = relativeDateFormat0.format((java.lang.Object) paintList3, stringBuffer72, fieldPosition77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot format given Object as a Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateFormat11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "h" + "'", str16, "h");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "m" + "'", str18, "m");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(stringBuffer36);
        org.junit.Assert.assertEquals(stringBuffer36.toString(), "NaN");
        org.junit.Assert.assertNotNull(stringBuffer38);
        org.junit.Assert.assertEquals(stringBuffer38.toString(), "3.32");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(numberFormat57);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertNotNull(stringBuffer72);
        org.junit.Assert.assertEquals(stringBuffer72.toString(), "3.32");
        org.junit.Assert.assertNotNull(stringBuffer74);
// flaky "35) test0487(RegressionTest0)":         org.junit.Assert.assertEquals(stringBuffer74.toString(), "\u221e");
        org.junit.Assert.assertNotNull(stringBuffer76);
        org.junit.Assert.assertEquals(stringBuffer76.toString(), "10^1.51");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        java.lang.String str47 = relativeDateFormat2.getSecondSuffix();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "s" + "'", str47, "s");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Currency currency22 = logFormat8.getCurrency();
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat57 = new org.jfree.chart.util.RelativeDateFormat();
        relativeDateFormat57.setMinuteSuffix("\u221e");
        java.text.DateFormat dateFormat60 = java.text.DateFormat.getDateTimeInstance();
        java.util.TimeZone timeZone61 = dateFormat60.getTimeZone();
        dateFormat60.setLenient(true);
        java.util.Calendar calendar64 = dateFormat60.getCalendar();
        relativeDateFormat57.setCalendar(calendar64);
        // The following exception was thrown during execution in test generation
        try {
            java.text.AttributedCharacterIterator attributedCharacterIterator66 = relativeDateFormat0.formatToCharacterIterator((java.lang.Object) calendar64);
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
        org.junit.Assert.assertNotNull(dateFormat60);
        org.junit.Assert.assertNotNull(timeZone61);
        org.junit.Assert.assertEquals(timeZone61.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar64);
// flaky "36) test0490(RegressionTest0)":         org.junit.Assert.assertEquals(calendar64.toString(), "java.util.GregorianCalendar[time=-765948512622,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1945,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=23,DAY_OF_YEAR=266,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=31,SECOND=27,MILLISECOND=378,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.text.NumberFormat numberFormat0 = java.text.NumberFormat.getCompactNumberInstance();
        numberFormat0.setMinimumFractionDigits((int) '4');
        int int3 = numberFormat0.getMinimumIntegerDigits();
        boolean boolean5 = org.jfree.chart.util.ObjectUtils.equal((java.lang.Object) numberFormat0, (java.lang.Object) 4L);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(numberFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(currency9);
        org.junit.Assert.assertEquals(currency9.toString(), "XXX");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.jfree.chart.util.DirectionalGradientPaintTransformer directionalGradientPaintTransformer0 = new org.jfree.chart.util.DirectionalGradientPaintTransformer();
        java.awt.GradientPaint gradientPaint1 = null;
        java.awt.Shape shape3 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) '4');
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame3 = new org.jfree.chart.ChartFrame("0.0", jFreeChart1, false);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
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
        org.jfree.chart.PaintMap paintMap53 = new org.jfree.chart.PaintMap();
        boolean boolean55 = paintMap53.containsKey((java.lang.Comparable) (short) 10);
        paintMap53.clear();
        boolean boolean58 = paintMap53.containsKey((java.lang.Comparable) (-1.0f));
        boolean boolean59 = relativeDateFormat0.equals((java.lang.Object) boolean58);
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.jfree.chart.util.LogFormat logFormat0 = new org.jfree.chart.util.LogFormat();
        logFormat0.setParseIntegerOnly(true);
        java.lang.Class<?> wildcardClass3 = logFormat0.getClass();
        boolean boolean4 = org.jfree.chart.util.SerialUtils.isSerializable((java.lang.Class) wildcardClass3);
        boolean boolean5 = org.jfree.chart.util.SerialUtils.isSerializable((java.lang.Class) wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        java.lang.String str53 = relativeDateFormat0.getHourSuffix();
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "h" + "'", str53, "h");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jfree.chart.util.RelativeDateFormat relativeDateFormat0 = new org.jfree.chart.util.RelativeDateFormat();
        java.lang.String str1 = relativeDateFormat0.getHourSuffix();
        relativeDateFormat0.setMinuteSuffix("SortOrder.DESCENDING");
        relativeDateFormat0.setPositivePrefix("\u221e");
        java.lang.String str6 = relativeDateFormat0.getPositivePrefix();
        boolean boolean7 = relativeDateFormat0.getShowZeroHours();
        java.lang.String str8 = relativeDateFormat0.getHourSuffix();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u221e" + "'", str6, "\u221e");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h" + "'", str8, "h");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jfree.chart.util.LogFormat logFormat4 = new org.jfree.chart.util.LogFormat((double) 2147483647, "", "m", true);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jfree.chart.ChartFrame chartFrame2 = new org.jfree.chart.ChartFrame("\2440.00", jFreeChart1);
            org.junit.Assert.fail("Expected exception of type java.awt.HeadlessException; message: ?No X11 DISPLAY variable was set,?but this program performed an operation which requires it.");
        } catch (java.awt.HeadlessException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.jfree.chart.PaintMap paintMap0 = new org.jfree.chart.PaintMap();
        paintMap0.clear();
        boolean boolean3 = paintMap0.containsKey((java.lang.Comparable) 0L);
        java.awt.Shape shape5 = org.jfree.chart.util.ShapeUtils.createDownTriangle((float) 128);
        java.awt.Shape shape6 = org.jfree.chart.util.ShapeUtils.clone(shape5);
        java.awt.Shape shape7 = org.jfree.chart.util.ShapeUtils.clone(shape5);
        java.awt.Shape shape9 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape12 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape9, (double) 16, (double) 2);
        java.awt.Shape shape14 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape16 = org.jfree.chart.util.ShapeUtils.createUpTriangle((float) 100);
        java.awt.Shape shape19 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape16, (double) 16, (double) 2);
        boolean boolean20 = org.jfree.chart.util.ShapeUtils.equal(shape14, shape19);
        boolean boolean21 = org.jfree.chart.util.ShapeUtils.equal(shape9, shape14);
        boolean boolean22 = org.jfree.chart.util.ShapeUtils.equal(shape5, shape14);
        java.awt.Shape shape25 = org.jfree.chart.util.ShapeUtils.createTranslatedShape(shape5, (double) 40, 0.0d);
        boolean boolean26 = paintMap0.equals((java.lang.Object) 40);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shape5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(shape7);
        org.junit.Assert.assertNotNull(shape9);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(shape14);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shape25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }
}
