package newprojet;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

public class testCalculatorApplication {
    @InjectMocks
    private CalculatorApplication calculatorApplication;

    @Mock
    private CalculatorService calcService;

    @Test
    public void testAdd() {
        when(calcService.add(10.0, 20.0)).thenReturn(30.0);
        assertEquals(calculatorApplication.add(10.0, 20.0), 30.0, 0);
    }


}
