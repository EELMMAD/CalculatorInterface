package se.lexicon.elmira;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void test_addition() {

        //Arrange
        CalculatorImpl calculator = new CalculatorImpl();
        double num1 = 5;
        double num2 = 5;
        double actual;

        double expected = 10;

        //Act
        actual = calculator.addition(num1, num2);


        //Assert
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void test_subtraction() {
        //Arrange
        CalculatorImpl calculator = new CalculatorImpl();
        double num1 = 6;
        double num2 = 5;
        double actual;

        double expected = 1;

        //Act
        actual = calculator.subtraction(num1, num2);


        //Assert
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void test_multiplication() {
        //Arrange
        CalculatorImpl calculator = new CalculatorImpl();
        double num1 = 4;
        double num2 = 4;
        double actual;

        double expected = 16;

        //Act
        actual = calculator.multiplication(num1, num2);


        //Assert
        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void test_divition() {
        //Arrange
        CalculatorImpl calculator = new CalculatorImpl();
        double num1 = 10;
        double num2 = 2;
        double actual;

        double expected = 5;

        //Act
        actual = calculator.division(num1, num2);


        //Assert
        Assert.assertEquals(expected, actual, 0);
    }
}
