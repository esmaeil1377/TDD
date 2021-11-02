package test;

import static org.junit.Assert.*;
import main.*;
import org.junit.Test;

public class SquareAreaTest {
    @Test
    public void testSquareAreaInt() {
        Square s = new Square(3);
        assertEquals(9, s.computeArea(), 0.01);
    }
    @Test
    public void testSquareAreaDouble() {
        Square s = new Square(3.3);
        assertEquals(10.89, s.computeArea(), 0.01);
    }
}
