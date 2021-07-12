import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    StringCalculator calculator = new StringCalculator();
    @Test
    public void stringShouldReturnZeroWhenEmpty(){
        assertEquals(calculator.sum(""), 0);


    }
    @Test
    public void stringShouldReturnSingleNumber(){
        assertEquals(calculator.sum("7"), 7);
    }
    @Test
    public void stringShouldSumTwoNumbersSeparatedByComma(){
        assertEquals(calculator.sum("2,3"), 5);
    }
}
