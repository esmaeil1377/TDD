package test;

import static org.junit.Assert.*;  
import main.*;
import org.junit.Test;  

public class RectangleAreaTest {

    @Test
    public void testRectangleAreaInt() {
        Rectangle.setHeight(5);
        Rectangle.setWidth(4);
        assertEquals(20, Rectangle.computeArea(), 0.01);
        Rectangle.setHeight(6);
        Rectangle.setWidth(7);
        assertEquals(42, Rectangle.computeArea(), 0.01);
    }

    @Test
    public void testRectangleAreaDouble() {
        Rectangle.setHeight(5.5);
        Rectangle.setWidth(4.5);
        assertEquals(24.75, Rectangle.computeArea(), 0.01);
        Rectangle.setHeight(6.6);
        Rectangle.setWidth(7.3);
        assertEquals(48.18, Rectangle.computeArea(), 0.01);
    }

    @Test
    public void testRectangleAreaInt2() {
        Rectangle.setHeight(8);
        Rectangle.setWidth(7);
        assertEquals(56, Rectangle.computeArea(), 0.01);
        Rectangle.setHeight(8);
        Rectangle.setWidth(8);
        assertEquals(64, Rectangle.computeArea(), 0.01);
    }

    @Test
    public void testRectangleAreaDouble2() {
        Rectangle.setHeight(2.5);
        Rectangle.setWidth(7.5);
        assertEquals(18.75, Rectangle.computeArea(), 0.01);
        Rectangle.setHeight(9.6);
        Rectangle.setWidth(2.03);
        assertEquals(19.488, Rectangle.computeArea(), 0.01);
    }
}
