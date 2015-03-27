import com.sun.org.apache.xpath.internal.operations.Div;
import org.junit.Ignore;
import org.junit.Test;

import java.util.DoubleSummaryStatistics;

import static org.junit.Assert.assertEquals;

public class DivisionTest {
    double DELTA = 1e-10;

    @Test
      public void shouldDivideOneNumberOnAnother() throws DivisionByZeroException {
        //Arrange
        Division division = new Division();

        //Act
        double actual = division.act(18.92, 0.4);
        double expected = 47.3;

        //Assert
        assertEquals(expected, actual, DELTA);
    }

    @Test(expected = DivisionByZeroException.class)
    public void shouldThrowDivisionByZeroException() throws DivisionByZeroException {
        Division division = new Division();
        division.act(2.36, 0);
    }
}
