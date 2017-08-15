package core;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class);

public class Substract2ParameterizedTest {
    @Parameters(name = "Parameter {index}: {1} - {2} = {0}")
    public static Collection<Double[]> addNumber() {
        return Arrays.asList(new Double [][] {
                {2.0, 6.0, 4.0},
                {3.0, 12.0, 9.0},
                {4.0, 12.0, 8.0},
        });}
    @Parameter(value = 0) public Double expected;
    @Parameter(value = 1) public Double first;
    @Parameter(value = 2) public Double second;
    @Test
        public void substract() {
        System.out.println(first + " - " + second + " - " + expected);
        assertEquals("Not Correct", Calculator.subtract(first, second), expected, 0.09);
    }
}
