import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinusTest {
    double DELTA = 1e-10;

    @Test
    public void shouldSubtractTwoPositiveNumbers() {
        //Arrange
        Minus minus = new Minus();

        //Act
        double actual = minus.act(56,32);
        double expected = 24;

        //Assert
        assertEquals("Subtract Two Positive Numbers", expected, actual, DELTA);
    }

    @Test
    public void shouldSubtractTwoNegativeNumbers() {
        //Arrange
        Minus minus = new Minus();

        //Act
        double actual = minus.act(-12.5, -25.123);
        double expected = 12.623;

        //Assert
        assertEquals("Subtract Two Negative Numbers", expected, actual, DELTA);
    }

    @Test
    public void shouldSubtractSmallerNumberFromBigger() {
        //Arrange
        Minus minus = new Minus();

        //Act
        double actual = minus.act(12345678, 12345679 );
        double expected = -1;

        //Assert
        assertEquals("Subtract Smaller Number From Bigger", expected, actual, DELTA);
    }

    @Test
    public void shouldSubtractNumberFromZero() {
        //Arrange
        Minus minus = new Minus();

        //Act
        double actual = minus.act(0, 56.32);
        double expected = -56.32;

        //Assert
        assertEquals("Subtract Number From Zero", expected, actual, DELTA);
    }

    @Test
    public void shouldSubtractZeroFromNegativeNumber() {
        //Arrange
        Minus minus = new Minus();

        //Act
        double actual = minus.act(-138.2563, 0);
        double expected = -138.2563;

        //Assert
        assertEquals("Subtract Zero From Negative Number", expected, actual, DELTA);
    }

    @Test
    public void shouldSubtractNegativeNumberFromPositive() {
        //Arrange
        Minus minus = new Minus();

        //Act
        double actual = minus.act(52.364, -365);
        double expected = -417.364;

        //Assert
        assertEquals("Subtract Negative Number From Positive", expected, actual, DELTA);
    }

    @Test
    public void shouldSubtractPositiveNumberFromNegative() {
        //Arrange
        Minus minus = new Minus();

        //Act
        double actual = minus.act(-9, 3.0);
        double expected = -12;

        //Assert
        assertEquals("Subtract Negative Number From Positive", expected, actual, DELTA);
    }

    @Test
    public void shouldSubtractMinValueFromMinValue() {
        //Arrange
        Minus minus = new Minus();

        //Act
        double actual = minus.act(Double.MIN_VALUE, Double.MIN_VALUE);
        double expected = 0;

        //Assert
        assertEquals("Subtract Min Value From Min Value", expected, actual, DELTA);
    }

    @Test
    public void shouldSubtractMaxValueFromMinValue() {
        //Arrange
        Minus minus = new Minus();

        //Act
        double actual = minus.act(Double.MIN_VALUE, Double.MAX_VALUE);
        double expected = -1.7976931348623157E308;

        //Assert
        assertEquals("Subtract Min Value From Min Value", expected, actual, DELTA);
    }
}
