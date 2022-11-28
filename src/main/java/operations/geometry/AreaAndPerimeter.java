package operations.geometry;

public class AreaAndPerimeter {

    public double squarePerimeter(double side){
        if(side<0){
            return -1;
        }
        return 4*side;
    }

    public double rectanglePerimeter(double length,double breadth){
        if(length<0 || breadth<0){
            return -1;
        }
        return 2*(length+breadth);
    }


    public double trianglePerimeter(double side1,double side2,double side3){
        if(side1<=0 || side2<=0 || side3<=0){
            return -1;
        }
        return side1+side2+side3;
    }

    public double circlePerimeter(double radius){
        if(radius<0){
            return -1;
        }
        return 2*Math.PI*radius;
    }

    public double square(double side){
        if(side<0){
            return -1;
        }
        return side*side;
    }

    public double rectangle(double length,double breadth){
        if(length<0 || breadth<0){
            return -1;
        }
        return length*breadth;
    }

    public double triangle1(double base, double height){
        if(base<0 || height<0){
            return -1;
        }
        return 0.5*base*height;
    }

    public double triangle2(double side1,double side2,double side3){
        if(side1<=0 || side2<=0 || side3<=0){
            return -1;
        }
        double semiperimeter=(side1+side2+side3)/2;
        double temp=semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3);
        return Math.sqrt(temp);
    }

    public double circle(double radius){
        if(radius<0){
            return -1;
        }
        return Math.PI*radius*radius;
    }


}
