import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    double DELTA = 1e-10;

    @Test
    public void shouldMultiplyTwoPositiveNumbers() {
        //Arrange
        Multiplication multiplication = new Multiplication();

        //Act
        double actual = multiplication.act(12345679, 36);
        double expected = 444444444;

        //Assert
        assertEquals("Multiply Two Positive Numbers", expected, actual, DELTA);
    }

    @Test
    public void shouldMultiplyTwoNegativeNumbers() {
        //Arrange
        Multiplication multiplication = new Multiplication();

        //Act
        double actual = multiplication.act(-9.456, -0.1);
        double expected = 0.9456;

        //Assert
        assertEquals("Multiply Two Negative Numbers", expected, actual, DELTA);
    }

    @Test
    public void shouldMultiplyPositiveAndNegativeNumbers() {
        //Arrange
        Multiplication multiplication = new Multiplication();

        //Act
        double actual = multiplication.act(-42, 0.3e-9);
        double expected = -1.26e-8;

        //Assert
        assertEquals("Multiply Positive And Negative Numbers", expected, actual, DELTA);
    }

    @Test
    public void shouldMultiplyPositiveNumberAndZero() {
        //Arrange
        Multiplication multiplication = new Multiplication();

        //Act
        double actual = multiplication.act(2.1, 0);
        double expected = 0;

        //Assert
        assertEquals("Multiply Positive Number And Zero", expected, actual, DELTA);
    }

    @Test
    public void shouldMultiplyTwoMaxValues() {
        //Arrange
        Multiplication multiplication = new Multiplication();

        //Act
        double actual = multiplication.act(Double.MAX_VALUE, Double.MAX_VALUE);
        double expected = Double.POSITIVE_INFINITY;

        //Assert
        assertEquals("Multiply Two Max Values", expected, actual, DELTA);
    }
}
