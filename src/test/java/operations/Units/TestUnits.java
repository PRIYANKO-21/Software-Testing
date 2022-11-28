package operations.Units;

import operations.algebra.ArithmeticOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUnits {

    @Test
    public void testCMToInches(){
        UnitConversions uniCon=new UnitConversions();
        double cm=10;
        double expected =3.9370100000000003;
        double actual=uniCon.cmToInches(cm);

        double notExpected=13;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testInchesToCM(){
        UnitConversions uniCon=new UnitConversions();
        double in=10;
        double expected =25.4;
        double actual=uniCon.inchesToCm(in);

        double notExpected=13;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testKGToPounds(){
        UnitConversions uniCon=new UnitConversions();
        double kg=10;
        double expected =22.0462;
        double actual=uniCon.kgToPounds(kg);

        double notExpected=13;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testPoundsToKG(){
        UnitConversions uniCon=new UnitConversions();
        double in=10;
        double expected =4.53592;
        double actual=uniCon.PoundsToKG(in);

        double notExpected=13;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testKGToGram(){
        UnitConversions uniCon=new UnitConversions();
        double in=10;
        double expected =10000;
        double actual=uniCon.KGTOGram(in);

        double notExpected=13;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testGramToKG(){
        UnitConversions uniCon=new UnitConversions();
        double in=1000;
        double expected =1;
        double actual=uniCon.GramToKG(in);

        double notExpected=13;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

    @Test
    public void testLitreToKL(){
        UnitConversions uniCon=new UnitConversions();
        double in=1000;
        double expected =1;
        double actual=uniCon.litreToKL(in);

        double notExpected=13;
        Assertions.assertEquals(expected,actual);
        Assertions.assertNotEquals(notExpected,actual);
    }

}
