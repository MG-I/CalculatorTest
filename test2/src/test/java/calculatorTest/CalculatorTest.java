package calculatorTest;

import calculator.Calculator;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static junit.framework.TestCase.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
public class CalculatorTest {
    @ParameterizedTest
    @CsvSource(value = {"100,25,'/',4",
                        "2,10,'+',12",
                        "66,10,'-',56",
                        "66,11,'*',726"
                        })
    public void testCalculate(double numOne, double numTwo,char operation, double expectedResult) {
        assertEquals(expectedResult, Calculator.calculate(numOne, numTwo, operation));
    }

}
