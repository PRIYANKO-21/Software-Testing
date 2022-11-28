package operations.InterestCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestInterestCalc {

    @Test
    public void testSimpleInterest(){
        InterestCalc obj=new InterestCalc();
        float p = 3000;
        int t = 10;
        float r = 10;
        float actual=obj.simpleInterest(p,t,r);
        int expected=3000;
        int notExpected=10;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testCompundInterest(){
        InterestCalc obj=new InterestCalc();
        float p = 1000;
        int t = 1;
        float r = 100;
        int n = 1;
        double actual=obj.compundInterest(p,t,r,n);
        double expected=1000;
        int notExpected=10;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }


}
