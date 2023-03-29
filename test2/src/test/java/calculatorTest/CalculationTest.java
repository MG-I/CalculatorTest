package calculatorTest;

import calculator.Calculation;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static junit.framework.TestCase.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
public class CalculationTest {
    @ParameterizedTest
    @CsvSource(value = {"100,25,4",
            "-300,-10,30",
            "1.43006, 1.43314, 0.9978508729084389",
            "1,-10000,-0.0001",
            "0,-11,0.0",
            "10000000000000000000000000000000000000000000000000,20000000000000000000000000000000000000000000000000,0.5"})
    public void testDivide(double numOne, double numTwo, double expectedResult) {
        assertEquals(expectedResult, Calculation.divide(numOne, numTwo, '/'));
    }

    @ParameterizedTest
    @CsvSource(value = {"2,10,12",
            "-300,-10,-310.0",
            "1.230, 1.233, 2.463",
            "0.0001,-0.00005, 0.00005",
            "0,-11,-11.0",
            "10000000000000000000000000000000000000000000000000,20000000000000000000000000000000000000000000000000,2.9999999999999997E49"})
    public void testAddition(double numOne, double numTwo, double expectedResult) {
        assertEquals(expectedResult, Calculation.fold(numOne, numTwo, '+'));
    }

    @ParameterizedTest
    @CsvSource(value = {"66,10,56",
            "-10,-300,290.0",
            "1.23006, 1.23314, -0.00308",
            "0.00041,-0.00005, 0.00046",
            "0,-11,11.0",
            "10000000000000000000000000000000000000000000000000,20000000000000000000000000000000000000000000000000,-1.0E49"})
    public void testSubtract(double numOne, double numTwo, double expectedResult) {
        assertEquals(expectedResult, Calculation.subtract(numOne, numTwo, '-'));
    }

    @ParameterizedTest
    @CsvSource(value = {"66,11,726",
            "-32,-309,9888.0",
            "1.23006, 1.23314, 1.5168361884",
            "0.00045,-0.00005, -0.00000002",
            "0,-11,0.0",
            "10000000000000000000000000000000000000000000000000,20000000000000000000000000000000000000000000000000,1.9999999999999997E98"})
    public void testMultiplication(double numOne, double numTwo, double expectedResult) {
        assertEquals(expectedResult, Calculation.multiplication(numOne, numTwo, '*'));
    }

}
