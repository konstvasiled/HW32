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

public class Multiply3ParameterizedTest {
    @Parameters(name = "Parameter {index}: {1} * {2} * {3} = {0}")
    public static Collection<Double[]> addNumber() {
        return Arrays.asList(new Double [][] {
                {625.0, 25.0, 5.0, 5.0},
                {160.0, 8.0, 2.0, 10.0},
                {320.0, 8.0, 4.0, 10.0},
        });}
        @Parameter(value = 0) public Double expected;
        @Parameter(value = 1) public Double first;
        @Parameter(value = 2) public Double second;
        @Parameter(value = 3) public Double third;
        @Test
        public void multiply() {
            System.out.println(first + " * " + second + " * " + third +  " = " + expected);
            assertEquals("Not Correct", Calculator.multiply(first, second, third), expected, 0.09);
        }
}
