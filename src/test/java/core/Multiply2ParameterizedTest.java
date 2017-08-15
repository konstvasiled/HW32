package core;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)

public class Multiply2ParameterizedTest {
    @Parameters(name = "Parameter # {index}: {1} * {2} = {0}")
    public static Collection<Double[]> addNumbers() {
        return Arrays.asList(new Double [][] {
            {30.0, 5.0, 6.0},
            {45.0, 9.0, 5.0},
            {60.0, 15.0, 4.0},
        });}
    @Parameter(value = 0) public Double expected;
    @Parameter(value = 1) public Double first;
    @Parameter(value = 2) public Double second;
    @Test
        public void multiply() {
        System.out.println(first + " * " + second + " = " + expected);
        assertEquals("Not Correct", Calculator.multiply(first, second), expected, 0.09);
    }
}
