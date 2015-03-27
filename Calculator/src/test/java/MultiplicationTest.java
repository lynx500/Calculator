import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    double DELTA = 1e-10;

    @Test
    public void shouldMultiplyTwoNumbers() {
        //Arrange
        Multiplication multiplication = new Multiplication();

        //Act
        double actual = multiplication.act(12345679, 36);
        double expected = 444444444;

        //Assert
        assertEquals(expected, actual, DELTA);
    }
}
