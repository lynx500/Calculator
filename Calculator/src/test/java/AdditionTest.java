import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {
    double DELTA = 1e-10;

    @Test
    public void shouldAddTwoPositiveNumbers() {
        //Arrange
        Addition addition = new Addition();


        //Act
        double actual = addition.act(3, 5);
        double expected = 8;

        //Assert
        assertEquals("Add Two Positive Numbers", expected, actual, DELTA);
    }

    @Test
    public void shouldAddPositiveAndNegativeNumbers() {
        //Arrange
        Addition addition = new Addition();

        //Act
        double actual = addition.act(-3, 122.5);
        double expected = 119.5;

        //Assert
        assertEquals("Add Positive And Negative Numbers", expected, actual, DELTA);
    }

    @Test
    public void shouldAddTwoMaxValues() {
        //Arrange
        Addition addition = new Addition();

        //Act
        double actual = addition.act(Double.MAX_VALUE, Double.MAX_VALUE);
        double expected = Double.POSITIVE_INFINITY;

        //Assert
        assertEquals("Add Two Max Values", expected, actual, DELTA);
    }

    @Test
    public void shouldAddPositiveNumberAndZero() {
        //Arrange
        Addition addition = new Addition();

        //Act
        double actual = addition.act(85632145896.325, 0);
        double expected = 85632145896.325;

        //Assert
        assertEquals("Add Positive Number And Zero", expected, actual, DELTA);
    }

    @Test
    public void shouldAddTwoNegativeNumbers() {
        //Arrange
        Addition addition = new Addition();

        //Act
        double actual = addition.act(-9.6, -3.5);
        double expected = -13.1;

        //Assert
        assertEquals("Add Two Negative Numbers", expected, actual, DELTA);
    }
}
