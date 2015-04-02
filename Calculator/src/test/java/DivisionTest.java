import com.sun.org.apache.xpath.internal.operations.Div;
import org.junit.Ignore;
import org.junit.Test;

import java.util.DoubleSummaryStatistics;

import static org.junit.Assert.assertEquals;

public class DivisionTest {
    double DELTA = 1e-10;

    @Test
      public void shouldDividePositiveNumberOnAnother() throws DivisionByZeroException {
        //Arrange
        Division division = new Division();

        //Act
        double actual = division.act(18.92, 0.4);
        double expected = 47.3;

        //Assert
        assertEquals("Divide Positive Number On Another", expected, actual, DELTA);
    }

    @Test(expected = DivisionByZeroException.class)
    public void shouldThrowDivisionByZeroException() throws DivisionByZeroException {
        Division division = new Division();
        division.act(2.36, 0);
    }

    @Test
    public void shouldDivideSmallerNumberOnBigger() throws DivisionByZeroException {
        //Arrange
        Division division = new Division();

        //Act
        double actual = division.act(0.3, 3);
        double expected = 0.1;

        //Assert
        assertEquals("Divide Smaller Number On Bigger", expected, actual, DELTA);
    }

    @Test
    public void shouldDivideMaxValueOnMin() throws DivisionByZeroException {
        //Arrange
        Division division = new Division();

        //Act
        double actual = division.act(Double.MAX_VALUE, Double.MIN_VALUE);
        double expected = Double.POSITIVE_INFINITY;

        //Assert
        assertEquals("Divide Max Value On Min", expected, actual, DELTA);
    }

    @Test
    public void shouldDividePositiveNumberOnNegative() throws DivisionByZeroException {
        //Arrange
        Division division = new Division();

        //Act
        double actual = division.act(96.3, -32.1);
        double expected = -3;

        //Assert
        assertEquals("Divide Positive Number On Negative", expected, actual, DELTA);
    }

    @Test
    public void shouldDivideNegativeNumberOnAnother() throws DivisionByZeroException {
        //Arrange
        Division division = new Division();

        //Act
        double actual = division.act(-9.99, -3);
        double expected = 3.33;

        //Assert
        assertEquals("Divide Positive Number On Another", expected, actual, DELTA);
    }
}
