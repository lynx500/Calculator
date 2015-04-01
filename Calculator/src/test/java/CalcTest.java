import com.sun.org.apache.xpath.internal.operations.Div;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalcTest {

    @Mock
    Operations operations;
    @Mock
    Addition addition;
    @Mock
    Division division;

    ArrayList<Action> operationList;

    Calc calc;

    @Before
    public void createMocks() {
        calc = new Calc(operations);
        operationList = new ArrayList<Action>();
        operationList.add(addition);
        operationList.add(division);

        when(operations.getOperationsList()).thenReturn(operationList);
        when(addition.getOperator()).thenReturn("+");
        when(addition.getDiscription()).thenReturn("Addition");
        when(division.getDiscription()).thenReturn("Division");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowUnsupportedOperationException() throws Exception {
        calc.calculate("*" , 1, 2);
    }

    @Test
    public void shouldCallAdditionOperation() throws Exception {
        calc.calculate("+", 2.3, 6);
    }

    @Test
    public void shouldGetActionDescription() {
        calc.showHelp();
    }
}

