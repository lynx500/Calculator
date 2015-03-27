import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalcTest {

    Operations operations;
    Addition addition;
    Division division;

    ArrayList operationList;

    Calc calc = new Calc(operations);

    @Before
    public void createMocks() {
        operations = mock(Operations.class);
        addition = mock(Addition.class);
        division = mock(Division.class);
        operationList.add(addition);
        operationList.add(division);
        when(operations.getOperationsList()).thenReturn(operationList);
        when(addition.getOperator()).thenReturn("+");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowUnsupportedOperationException() throws Exception {
        calc.calculate("*" , 1, 2);
    }

    @Test
    public void shouldCallAdditionOperation() throws Exception {
        calc.calculate("+", 2.3, 6);
    }
}

