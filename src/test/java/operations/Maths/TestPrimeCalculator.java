package operations.Maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPrimeCalculator {

    @Test
    public void testPrime(){
        PrimeCalculator scientificCalculator=new PrimeCalculator();
        int num1 = 2;
        int num2 = 5;
        String actual=scientificCalculator.primeNumberFinder(num1,num2);
        String expected="2, 3, 5, End.";
        String notExpected="10";
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);


        num1 = 5;
        num2 = 1;
        actual=scientificCalculator.primeNumberFinder(num1,num2);
        expected="2, 3, 5, End.";
        notExpected="10";
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);


        num1 = 1;
        num2 = 1;
        actual=scientificCalculator.primeNumberFinder(num1,num2);
        expected="No Number Found!";
        notExpected="10";
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);

        num1 = 500;
        num2 = 504;
        actual=scientificCalculator.primeNumberFinder(num1,num2);
        expected="503, End.";
        notExpected="10";
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);

        num1 = 511;
        num2 = 511;
        actual=scientificCalculator.primeNumberFinder(num1,num2);
        expected="End.";
        notExpected="10";
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);

    }

    @Test
    public void testLcm(){
        PrimeCalculator scientificCalculator=new PrimeCalculator();
        int num1 = 10;
        int num2 = 5;
        int actual=scientificCalculator.lcm(num1,num2);
        int expected=10;
        int notExpected=5;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testGcd(){
        PrimeCalculator scientificCalculator=new PrimeCalculator();
        int num1 = 5;
        int num2 = 10;
        int actual=scientificCalculator.gcd(num1,num2);
        int expected=5;
        int notExpected=15;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testGcdLarge(){
        PrimeCalculator scientificCalculator=new PrimeCalculator();
        int num1 = 5;
        String num2 = "10";
        int actual=scientificCalculator.gcdLarge(num1,num2);
        int expected=5;
        int notExpected=15;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testDigitGcd(){
        PrimeCalculator scientificCalculator=new PrimeCalculator();
        int num1 = 2448;

        int actual=scientificCalculator.digitGCD(num1);
        int expected=2;
        int notExpected=15;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }


    @Test
    public void testKPrimeFactor(){
        PrimeCalculator scientificCalculator=new PrimeCalculator();
        int num1 = 12;
        int num2 = 3;
        int actual=scientificCalculator.kPrimeFactor(num1,num2);
        int expected=3;
        int notExpected=15;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }


    @Test
    public void testLeapYear(){
        PrimeCalculator scientificCalculator=new PrimeCalculator();
        int num1 = 1998;
        int num2 = 3;
        String actual=scientificCalculator.checkLeapYear(num1);
        String expected="No";
        String notExpected="Yes";
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);

        num1=2000;
        actual=scientificCalculator.checkLeapYear((num1));
        Assertions.assertNotEquals(expected,actual);

        num1=2100;
        actual=scientificCalculator.checkLeapYear((num1));
        Assertions.assertEquals(expected,actual);

        num1=2004;
        actual=scientificCalculator.checkLeapYear((num1));
        Assertions.assertNotEquals(expected,actual);
    }

}
