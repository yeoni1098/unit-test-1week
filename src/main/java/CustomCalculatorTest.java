import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {
    private CustomCalculator customCalculator;

    @Test
    public void 더하기테스트(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(3,4);
        assertTrue(result==7);
        assertFalse(result!=7);

    }

    @Test
    public void 빼기테스트(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(4,3);
        assertTrue(result==1);
        assertFalse(result!=1);
    }

    @Test
    public void 나누기테스트(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(10,2);
        assertTrue(result ==5);
        assertFalse(result!=5);
    }
    @Test
    public void 곱셈테스트(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5,5);
        assertTrue(result==25);
        assertFalse(result!=25);
    }


}