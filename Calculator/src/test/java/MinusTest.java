import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinusTest {
    double DELTA = 1e-10;

    @Test
    public void shouldSubtractOneNumberFromAnother() {
        //Arrange
        Minus minus = new Minus();

        //Act
        double actual = minus.act(56,32);
        double expected = 24;

        //Assert
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void shouldSubtractTwoNegativeValues() {
        //Arrange
        Minus minus = new Minus();

        //Act
        double actual = minus.act(-12.5, -25.123);
        double expected = 12.623;

        //Assert
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void shouldGetNegativeValue() {
        //Arrange
        Minus minus = new Minus();

        //Act
        double actual = minus.act(12345678, 12345679 );
        double expected = -1;

        //Assert
        assertEquals(expected, actual, DELTA);
    }
}
