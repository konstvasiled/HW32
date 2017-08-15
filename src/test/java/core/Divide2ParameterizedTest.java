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

public class Divide2ParameterizedTest {
    @Parameters(name = "Parameter {index}: {1} / {2} = {0}")
    public static Collection<Double[]> addNumeber() {
        return Arrays.asList(new Double [][] {
            {2.0, 6.0, 3.0},
            {10.0, 50.0, 5.0},
            {7.0, 49.0, 7.0},
        });}
    @Parameter(value = 0) public Double expected;
    @Parameter(value = 1) public Double first;
    @Parameter(value = 2) public Double second;
    @Test
        public void divide() {
        System.out.println(first + " / " + second + " = " expected);
        assertEquals("Not Correct", Calculator.divide(first, second), expected, 0.09);
    }
}
