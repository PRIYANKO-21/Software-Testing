package operations.Units;

public class UnitConversions {

    public double cmToInches(double cm){
        System.out.println("Centimeter to Inches conversion");
        System.out.println(cm);
        System.out.println(cm*0.393701);
        return cm*0.393701;
    }

    public double inchesToCm(double in){
        System.out.println("Inches to Centimeter conversion");
        System.out.println(in);
        System.out.println(in*2.54);
        return in*2.54;
    }

    public double kgToPounds(double kg){
        System.out.println("KG to Pound conversion");
        System.out.println(kg);
        System.out.println(kg*2.20462);
        return kg*2.20462;
    }

    public double PoundsToKG(double p){
        System.out.println("Pound to KG conversion");
        System.out.println(p);
        System.out.println(0.453592*p);
        return 0.453592*p;
    }

    public  double KGTOGram(double k){
        System.out.println("KG to gram conversion");
        System.out.println(k);
        System.out.println(k*1000);
        return k*1000;
    }

    public  double GramToKG(double g){
        System.out.println("Gram to KG conversion");
        System.out.println(g);
        System.out.println(g/1000);
        return g/1000;
    }

    public  double litreToKL(double l){
        System.out.println("Litre to KL conversion");
        System.out.println(l);
        System.out.println(l/1000);
        return l/1000;
    }
}
