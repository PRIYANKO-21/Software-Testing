package operations.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAreaAndPerimeter {

    @Test
    public void testSquareArea(){
        AreaAndPerimeter areaCalculator=new AreaAndPerimeter();
        double input1=4.0;
        Assertions.assertEquals(16,areaCalculator.square(input1));
        double input2=-2;
        Assertions.assertEquals(-1,areaCalculator.square(input2));
        double input3=0;
        Assertions.assertEquals(0,areaCalculator.square(input3));
    }

    @Test
    public void testRectangleArea(){
        AreaAndPerimeter areaCalculator=new AreaAndPerimeter();
        Assertions.assertEquals(12,areaCalculator.rectangle(3,4));
        Assertions.assertEquals(-1,areaCalculator.rectangle(-3,4));
        Assertions.assertEquals(-1,areaCalculator.rectangle(3,-4));
        Assertions.assertEquals(0,areaCalculator.rectangle(0,0));
    }

    @Test
    public void testTriangle1Area(){
        AreaAndPerimeter areaCalculator=new AreaAndPerimeter();
        Assertions.assertEquals(6,areaCalculator.triangle1(3,4));
        Assertions.assertEquals(-1,areaCalculator.triangle1(-3,4));
        Assertions.assertEquals(-1,areaCalculator.triangle1(3,-4));
        Assertions.assertEquals(0,areaCalculator.triangle1(0,0));
    }

    @Test
    public void testTriangle2Area(){
        AreaAndPerimeter areaCalculator=new AreaAndPerimeter();
        Assertions.assertEquals(6,areaCalculator.triangle2(3,4,5));
        Assertions.assertEquals(-1,areaCalculator.triangle2(-3,4,5));
        Assertions.assertEquals(-1,areaCalculator.triangle2(3,-4,5));
        Assertions.assertEquals(-1,areaCalculator.triangle2(3,4,-5));
        Assertions.assertEquals(-1,areaCalculator.triangle2(0,1,2));
        Assertions.assertEquals(-1,areaCalculator.triangle2(1,0,2));
        Assertions.assertEquals(-1,areaCalculator.triangle2(1,2,0));
    }
    @Test
    public void testCircleArea(){
        AreaAndPerimeter areaCalculator=new AreaAndPerimeter();
        Assertions.assertEquals(153.93804002589985,areaCalculator.circle(7));
        Assertions.assertEquals(-1,areaCalculator.circle(-7));
        Assertions.assertEquals(0,areaCalculator.circle(0));
    }

    @Test
    public void testCirclePerimeter(){
        AreaAndPerimeter perimeterCalculator=new AreaAndPerimeter();
        Assertions.assertEquals(43.982297150257104,perimeterCalculator.circlePerimeter(7));
        Assertions.assertEquals(-1,perimeterCalculator.circlePerimeter(-7));
        Assertions.assertEquals(0,perimeterCalculator.circlePerimeter(0));
    }

    @Test
    public void testSquarePerimeter(){
        AreaAndPerimeter perimeterCalculator=new AreaAndPerimeter();
        Assertions.assertEquals(28,perimeterCalculator.squarePerimeter(7));
        Assertions.assertEquals(-1,perimeterCalculator.squarePerimeter(-7));
        Assertions.assertEquals(0,perimeterCalculator.squarePerimeter(0));
    }

    @Test
    public void testRectanglePerimeter(){
        AreaAndPerimeter perimeterCalculator=new AreaAndPerimeter();
        Assertions.assertEquals(14,perimeterCalculator.rectanglePerimeter(3,4));
        Assertions.assertEquals(-1,perimeterCalculator.rectanglePerimeter(-7,9));
        Assertions.assertEquals(-1,perimeterCalculator.rectanglePerimeter(7,-9));
        Assertions.assertEquals(0,perimeterCalculator.rectanglePerimeter(0,0));
    }

    @Test
    public void testTrianglePerimeter(){
        AreaAndPerimeter perimeterCalculator=new AreaAndPerimeter();
        Assertions.assertEquals(12,perimeterCalculator.trianglePerimeter(3,4,5));
        Assertions.assertEquals(-1,perimeterCalculator.trianglePerimeter(-2,3,4));
        Assertions.assertEquals(-1,perimeterCalculator.trianglePerimeter(2,-3,4));
        Assertions.assertEquals(-1,perimeterCalculator.trianglePerimeter(2,3,-4));
        Assertions.assertEquals(-1,perimeterCalculator.trianglePerimeter(0,1,2));
        Assertions.assertEquals(-1,perimeterCalculator.trianglePerimeter(1,0,2));
        Assertions.assertEquals(-1,perimeterCalculator.trianglePerimeter(1,2,0));
    }

}
