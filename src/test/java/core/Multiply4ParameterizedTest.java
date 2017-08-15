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

public class Multiply4ParameterizedTest {
    @Parameters(name = "Parameter # {index}: {1} * {2} * {3} * {4} = {0}")
    public static Collection<Double[]> addNumbers() {
        return Arrays.asList(new Double [][] {
                {},
                {},
                {},
        });}
    @Parameter(value = 0) public Double expected;
    @Parameter(value = 1) public Double first;
    @Parameter(value = 2) public Double second;
    @Parameter(value = 3) public Double third;
    @Parameter(value = 4) public Double forth;
    @Test
    public void multiply() {
        System.out.println(first + " * " + second + " * " + third +  " * " + forth +  " = " + expected);
        assertEquals("Not Correct", Calculator.multiply(first, second, third, forth), expected, 0.09);
    }
}
