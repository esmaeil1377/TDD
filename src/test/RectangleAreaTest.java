package test;

import static org.junit.Assert.*;  
import main.*;
import org.junit.Test;  

public class RectangleAreaTest {

    @Test
    public void testRectangleArea() {
        assertEquals(12, Rectangle.computeArea() );
    }
}
