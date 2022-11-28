package operations.InterestCalculator;

public class InterestCalc {

    public float simpleInterest(float p,int t,float r){
        return (p*t*r)/100;
    }
    public double compundInterest(float p,int t,float r,int n){
        return p * (Math.pow((1 + r/100), (t * n))) - p;
    }
}
