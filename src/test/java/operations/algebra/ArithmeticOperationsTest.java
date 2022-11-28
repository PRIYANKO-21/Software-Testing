package operations.algebra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticOperationsTest {


    @Test
    public void testAdditionOfTwoNumbers(){
        ArithmeticOperations scientificCalculator
                = new ArithmeticOperations();
        float num1 = 3;
        float num2 = 10;
        float actual=scientificCalculator.addition(num1,num2);
        int expected=13;
        int notExpected=10;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testSubtractionOfTwoNumbers(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        float num1 = 10;
        float num2 = 3;
        float actual=scientificCalculator.subtraction(num1,num2);
        int expected=7;
        int notExpected=10;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testMultiplicationOfTwoNumbers(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        float num1 = 3;
        float num2 = 10;
        float actual=scientificCalculator.multiply(num1,num2);
        int expected=30;
        int notExpected=10;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testnPr(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        int num1 = 10;
        int num2 = 4;
        double actual=scientificCalculator.nPr(num1,num2);
        int expected=5040;
        int notExpected=10;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testnCr(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        int num1 = 10;
        int num2 = 4;
        double actual=scientificCalculator.nCr(num1,num2);
        int expected=210;
        int notExpected=10;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }


    @Test
    public void testModulo(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        int num1 = 103;
        int num2 = 10;
        int actual=scientificCalculator.modulo(num1,num2);
        int expected=3;
        int notExpected=10;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testSqrt(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        double actual=scientificCalculator.squareroot(25.0);
        double expected=5.0;
        double NotExpected=6.0;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(NotExpected,actual);
        double invalidInput=-1;
        double expectedResult=-1;
        double actualResult=scientificCalculator.squareroot(invalidInput);
        Assertions.assertEquals(expectedResult,actualResult);
        double boundaryInput=0.0;
        double expectedResult2=0.0;
        double actualResult2=scientificCalculator.squareroot(boundaryInput);
        Assertions.assertEquals(expectedResult2,actualResult2);
    }

    @Test
    public void testNaturalLog(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        double num=145.256;
        double actual= scientificCalculator.naturalLog(num);
        double expected=4.978497702968366;
        double NotExpected=6.0;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(NotExpected,actual);
        double invalidInput1=-3;
        double actualResult=scientificCalculator.naturalLog(invalidInput1);
        Assertions.assertEquals(-1,actualResult);
        double invalidInput2=0.0;
        double actualResult2=scientificCalculator.naturalLog(invalidInput2);
        Assertions.assertEquals(-1,actualResult2);
    }

    @Test
    public void testFactorial(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        long actual= scientificCalculator.factorial(5);
        long expected=120;
        long notExpected=720;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
        int invalidInput1=-3;
        long actualResult=scientificCalculator.factorial(invalidInput1);
        Assertions.assertEquals(-1,actualResult);
        int invalidInput2=35;
        actualResult=scientificCalculator.factorial(invalidInput2);
        Assertions.assertEquals(-1,actualResult);
        int validInput2=0;
        actualResult=scientificCalculator.factorial(validInput2);
        Assertions.assertEquals(1,actualResult);
        int validInput3=20;
        actualResult=scientificCalculator.factorial(validInput3);
        Assertions.assertEquals(actualResult,actualResult);
    }

    @Test
    public void testPower(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        double num=3.0;
        double actual=scientificCalculator.power(num,num);
        double expected=27.0;
        double notExpected=64.0;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testCeilOfNumber(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        double num=3.3;
        double actual=scientificCalculator.ceilOfNumber(num);
        double expected=4;
        double notExpected=64.0;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testFloorOfNumber(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        double num=3.3;
        double actual=scientificCalculator.floorOfNumber(num);
        double expected=3;
        double notExpected=64.0;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }


    @Test
    public void testInfixToPostfix(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        String validInput1="2+3*5-8/4+6";
        Integer expectedresult1=21;
        Integer actualresult1=scientificCalculator.infixToPostfixEvaluation(validInput1);
        Assertions.assertEquals(expectedresult1,actualresult1);
        String validInput2="((2+3)-7)*6/3-(5+4)";
        Integer expectedresult2=-13;
        Integer actualresult2=scientificCalculator.infixToPostfixEvaluation(validInput2);
        Assertions.assertEquals(expectedresult2,actualresult2);
        String invalidInput1="2+*3*5-8/4+6";
        Integer actualresult3=scientificCalculator.infixToPostfixEvaluation(invalidInput1);
        Assertions.assertNull(actualresult3);
        String invalidInput2="23+3@a-(3+8)";
        Integer actualresult4=scientificCalculator.infixToPostfixEvaluation(invalidInput2);
        Assertions.assertNull(actualresult4);
        String invalidInput3="((2+3)*6/3-4";
        Integer actualresult5=scientificCalculator.infixToPostfixEvaluation(invalidInput3);
        Assertions.assertNull(actualresult5);
        String invalidInput4="";
        Integer actualresult6=scientificCalculator.infixToPostfixEvaluation(invalidInput4);
        Assertions.assertNull(actualresult6);
        String invalidInput5=null;
        Integer actualresult7=scientificCalculator.infixToPostfixEvaluation(invalidInput5);
        Assertions.assertNull(actualresult7);
        String invalidInput6="(2+3)*6/3-4)";
        Integer actualresult8=scientificCalculator.infixToPostfixEvaluation(invalidInput6);
        Assertions.assertNull(actualresult8);
    }

    @Test
    public void testPermutations(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        Assertions.assertEquals(3,scientificCalculator.permutations(3,1));
        Assertions.assertEquals(-1,scientificCalculator.permutations(-1,1));
        Assertions.assertEquals(-1,scientificCalculator.permutations(3,-1));
        Assertions.assertEquals(-1,scientificCalculator.permutations(3,8));
        Assertions.assertEquals(1,scientificCalculator.permutations(0,0));
    }

    @Test
    public void testCombinations(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        Assertions.assertEquals(3,scientificCalculator.combinations(3,1));
        Assertions.assertEquals(-1,scientificCalculator.combinations(-1,1));
        Assertions.assertEquals(-1,scientificCalculator.combinations(3,-1));
        Assertions.assertEquals(-1,scientificCalculator.combinations(3,8));
        Assertions.assertEquals(1,scientificCalculator.combinations(0,0));
    }

    @Test
    public void testSolveEquation(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        Assertions.assertEquals(2,scientificCalculator.solveEquation(1,-4,4));
        Assertions.assertEquals(3,scientificCalculator.solveEquation(1,-5,6));
        Assertions.assertEquals(-1,scientificCalculator.solveEquation(7,5,4));
    }

    @Test
    public void testInverseOfANumber(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        int num=5;
        double actual=scientificCalculator.inverse_of_it(num);
        double expected=0.2;
        double notExpected=6.0;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testPowerBase10(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        int num=3;
        int actual=scientificCalculator.power_base_10(num);
        int expected=1000;
        int notExpected=10;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }


    @Test
    public void testSumofNumbers(){
        ArithmeticOperations scientificCalculator=new ArithmeticOperations();
        int num=1;
        int num1 = 10;
        int actual=scientificCalculator.sumOfnNumbers(num,num1);
        int expected=55;
        int notExpected=10;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }
}
