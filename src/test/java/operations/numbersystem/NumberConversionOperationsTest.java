package operations.numbersystem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberConversionOperationsTest {

    @Test
    public void testDecimalToBinary(){
        NumberConversionOperations numberConversionOperations=new NumberConversionOperations();
        Assertions.assertEquals("10",numberConversionOperations.menu(1,"2").toString());
        Assertions.assertEquals("10101",numberConversionOperations.menu(1,"21").toString());
        Assertions.assertEquals("",numberConversionOperations.menu(1,"-2").toString());
    }

    @Test
    public void testHexadecimalToBinary(){
        NumberConversionOperations numberConversionOperations=new NumberConversionOperations();
        Assertions.assertEquals("101010110001001000110000",numberConversionOperations.menu(2,"AB1230").toString());
        Assertions.assertEquals("11001101010001010110",numberConversionOperations.menu(2,"CD456").toString());
        Assertions.assertEquals("",numberConversionOperations.menu(2,"").toString());
        Assertions.assertEquals("0111",numberConversionOperations.menu(2,"7").toString());
        Assertions.assertEquals("1000",numberConversionOperations.menu(2,"8").toString());
        Assertions.assertEquals("1001",numberConversionOperations.menu(2,"9").toString());
        Assertions.assertEquals("1110",numberConversionOperations.menu(2,"E").toString());
        Assertions.assertEquals("1111",numberConversionOperations.menu(2,"F").toString());
    }

    @Test
    public void testOctalToBinary(){
        NumberConversionOperations numberConversionOperations=new NumberConversionOperations();
        Assertions.assertEquals("001010011000",numberConversionOperations.menu(3,"1230").toString());
        Assertions.assertEquals("100101110111",numberConversionOperations.menu(3,"4567").toString());
        Assertions.assertEquals("",numberConversionOperations.menu(3,"").toString());
    }

    @Test
    public void testDecimalToHex(){
        NumberConversionOperations numberConversionOperations=new NumberConversionOperations();
        Assertions.assertEquals("f",numberConversionOperations.menu(4,"15").toString());
        Assertions.assertEquals("64",numberConversionOperations.menu(4,"100").toString());
    }

    @Test
    public void testBinaryToHex(){
        NumberConversionOperations numberConversionOperations=new NumberConversionOperations();
        Assertions.assertEquals("F",numberConversionOperations.menu(5,"1111").toString());
        Assertions.assertEquals("40",numberConversionOperations.menu(5,"1000000").toString());
        Assertions.assertEquals("Invalid Binary Number",numberConversionOperations.menu(5,"154").toString());
    }

    @Test
    public void testOctalToHex(){
        NumberConversionOperations numberConversionOperations=new NumberConversionOperations();
        Assertions.assertEquals("26",numberConversionOperations.menu(6,"46").toString());
        Assertions.assertEquals("3f",numberConversionOperations.menu(6,"77").toString());
        Assertions.assertEquals("Invalid Octal Number",numberConversionOperations.menu(6,"8").toString());
        Assertions.assertNotEquals("0",numberConversionOperations.menu(6,"1").toString());
    }

    @Test
    public void testBinaryToOctal(){
        NumberConversionOperations numberConversionOperations=new NumberConversionOperations();
        Assertions.assertEquals("17",numberConversionOperations.menu(7,"1111").toString());
        Assertions.assertEquals("-1",numberConversionOperations.menu(7,"-2").toString());
        Assertions.assertEquals("3",numberConversionOperations.menu(7,"11").toString());
    }


    @Test
    public void testHexadecimalToOctal(){
        NumberConversionOperations numberConversionOperations=new NumberConversionOperations();
        Assertions.assertEquals("21",numberConversionOperations.menu(8,"11").toString());
        Assertions.assertEquals("-1",numberConversionOperations.menu(8,"-100").toString());
        Assertions.assertEquals("1",numberConversionOperations.menu(8,"1").toString());
    }

    @Test
    public void testOctalToDecimal(){
        NumberConversionOperations numberConversionOperations=new NumberConversionOperations();
        Assertions.assertEquals("57",numberConversionOperations.menu(9,"71").toString());
        Assertions.assertEquals("0",numberConversionOperations.menu(9,"0").toString());
        Assertions.assertEquals("Error",numberConversionOperations.menu(9,"8").toString());
        Assertions.assertEquals("Error",numberConversionOperations.menu(9,"9").toString());
    }

    @Test
    public void testBinaryToDecimal(){
        NumberConversionOperations numberConversionOperations=new NumberConversionOperations();
        Assertions.assertEquals("21",numberConversionOperations.menu(10,"10101").toString());
        Assertions.assertEquals("16",numberConversionOperations.menu(10,"10000").toString());
        Assertions.assertEquals("Error",numberConversionOperations.menu(10,"-1").toString());
    }

    @Test
    public void testHexadecimalToDecimal(){
        NumberConversionOperations numberConversionOperations=new NumberConversionOperations();
        Assertions.assertEquals("15",numberConversionOperations.menu(11,"F").toString());
        Assertions.assertEquals("2",numberConversionOperations.menu(11,"2").toString());
        Assertions.assertEquals("Error",numberConversionOperations.menu(11,"-1").toString());
    }


}
