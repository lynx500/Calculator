import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {
    double DELTA = 1e-10;

    @Test
    public void shouldAddTwoNumbers() {
        //Arrange
        Addition addition = new Addition();


        //Act
        double actual = addition.act(3, 5);
        double expected = 8;

        //Assert
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void shouldAddPositiveAndNegativeNumbers() {
        //Arrange
        Addition addition = new Addition();

        //Act
        double actual = addition.act(-3, 122.5);
        double expected = 119.5;

        //Assert
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void shouldReturnPositiveInfinity() {
        //Arrange
        Addition addition = new Addition();

        //Act
        double actual = addition.act(Double.MAX_VALUE, Double.MAX_VALUE);
        double expected = Double.POSITIVE_INFINITY;

        //Assert
        assertEquals(expected, actual, DELTA);
    }
}
