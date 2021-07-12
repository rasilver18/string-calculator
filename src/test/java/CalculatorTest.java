import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private StringCalculator calculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void initialize() {
        calculator = new StringCalculator();
    }
    @Test
    public void stringShouldReturnZeroWhenEmpty(){
        assertEquals(calculator.add(""), 0);


    }
    @Test
    public void stringShouldReturnSingleNumber(){
        assertEquals(calculator.add("7"), 7);
    }
    @Test
    public void stringShouldSumTwoNumbersSeparatedByComma(){
        assertEquals(calculator.add("2,3"), 5);
    }

    @Test
    public void stringShouldReturnSumOfMultipleNumbers(){

        assertEquals(calculator.add("3,3,3"), 9);
    }

    @Test
    public void stringShouldReturnSumOfNumbersOnNewLine(){
        assertEquals(calculator.add("5\n5\n5"), 15);
    }
}

