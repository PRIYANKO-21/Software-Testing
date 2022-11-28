package operations.temperature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureConversionOperationTest {

    @Test
    public void testConvertTemperature(){
        TemperatureConversionOperations temp=new TemperatureConversionOperations();
        Assertions.assertEquals("56.0", temp.convertTemperature("K","K", 56));
        Assertions.assertEquals("-217.14999999999998", temp.convertTemperature("C","K", 56));
        Assertions.assertEquals("329.15", temp.convertTemperature("K","C", 56));
        Assertions.assertEquals("132.8", temp.convertTemperature("F","C", 56));
        Assertions.assertEquals("-358.86999999999995", temp.convertTemperature("F","K", 56));
        Assertions.assertEquals("13.333333333333334", temp.convertTemperature("C","F", 56));
        Assertions.assertEquals("286.8333333333333", temp.convertTemperature("K","F", 56));
        Assertions.assertEquals("Invalid Units passed", temp.convertTemperature("T","F", 56));
    }
}
