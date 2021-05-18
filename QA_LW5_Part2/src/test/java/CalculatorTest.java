import org.junit.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int result = calculator.sum(5,5);
        int expectedResult = 10;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtraction(100,10);
        int expectedResult = 90;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiplication(2,3);
        int expectedResult = 6;
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivision() {
        double result = calculator.division(6,3);
        double expectedResult = 2;
        Assert.assertEquals(expectedResult, result, 0.0);
    }
}
