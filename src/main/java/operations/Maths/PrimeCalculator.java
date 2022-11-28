package operations.Maths;

public class PrimeCalculator {

    public String primeNumberFinder(long start, long finish){
        String result="";

        //handle extreme cases
        if(finish<start){
            long i=start;
            start=finish;
            finish=i;
        }
        if(start<3){
            start =3;
            result="2, ";
        }
        if(finish<2){
            result="No Number Found!";
            return result;
        }

        long x; //possible prime number

        if(start%2==0) x=(start+1);   //I have made starting number odd, this will save time
        else x=start;

        for(; x<=finish; x=x+2){   //The program will work only with odd numbers
            int flag=1;  //the flag

            if(x>500){
                if(x%3 == 0) flag=0;
                else if(x%5 == 0) flag=0;
                else if(x%7 == 0) flag=0;
                else if(x%11 == 0) flag=0;
                else if(x%13 == 0) flag=0;
                else if(x%17 == 0) flag=0;
                else if(x%19 == 0) flag=0;
                else if(x%23 == 0) flag=0;
                else if(x%29 == 0) flag=0;
                else if(x%31 == 0) flag=0;
                else if(x%37 == 0) flag=0;
                else if(x%41 == 0) flag=0;
                else if(x%43 == 0) flag=0;
                else if(x%47 == 0) flag=0;

                else if(x%53 == 0) flag=0;
                else if(x%59 == 0) flag=0;
                else if(x%61 == 0) flag=0;
                else if(x%67 == 0) flag=0;
                else if(x%71 == 0) flag=0;
                else if(x%73 == 0) flag=0;
                else if(x%79 == 0) flag=0;
                else if(x%83 == 0) flag=0;
                else if(x%89 == 0) flag=0;
                else if(x%97 == 0) flag=0;

                else if(x%101 == 0) flag=0;
                else if(x%103 == 0) flag=0;
                else if(x%107 == 0) flag=0;
                else if(x%109 == 0) flag=0;
                else if(x%113 == 0) flag=0;
                else if(x%127 == 0) flag=0;
                else if(x%131 == 0) flag=0;
                else if(x%137 == 0) flag=0;
                else if(x%139 == 0) flag=0;
                else if(x%149 == 0) flag=0;

                else if(x%151 == 0) flag=0;
                else if(x%157 == 0) flag=0;
                else if(x%163 == 0) flag=0;
                else if(x%167 == 0) flag=0;
                else if(x%173 == 0) flag=0;
                else if(x%179 == 0) flag=0;
                else if(x%181 == 0) flag=0;
                else if(x%191 == 0) flag=0;
                else if(x%193 == 0) flag=0;
                else if(x%197 == 0) flag=0;
                else if(x%199 == 0) flag=0;

                else if(x%211 == 0) flag=0;
                else if(x%223 == 0) flag=0;
                else if(x%227 == 0) flag=0;
                else if(x%229 == 0) flag=0;
                else if(x%233 == 0) flag=0;
                else if(x%239 == 0) flag=0;
                else if(x%241 == 0) flag=0;

                else if(x%251 == 0) flag=0;
                else if(x%257 == 0) flag=0;

                else{
                    int limit=(int) Math.sqrt(x);

                    for(long y=263; y<=limit; y=y+2){
                        if(x%y==0){
                            flag=0;
                            break;
                        }
                    }
                }
            }
            else {
                for(long y=3; y<=x/3; y=y+2) {
                    if(x%y==0) flag=0;
                }
            }


            if (flag==1){
                result = result + x + ", ";
            }
        }

        result=result + "End.";

        return result;
    }


    //returns specific number of a char in a string
    public int charNumber(String string, char ch){
        int num=0;
        int length=string.length();

        for(int i=0; i<length; i++){
            if(string.charAt(i)==ch) num++;
        }

        return num;
    }




    public int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    public int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    private static int reduceB(int a, String b)
    {
        int result = 0;
        for (int i = 0; i < b.length(); i++)
        {
            result = (result * 10 +
                    b.charAt(i) - '0') % a;
        }
        return result;
    }

    public int gcdLarge(int a, String b)
    {
        // Reduce 'b' i.e the second
        // number after modulo with a
        int num = reduceB(a, b);

        // Now,use the euclid's algorithm
        // to find the gcd of the 2 numbers
        return gcd(num, a);
    }


    public int digitGCD(int n)
    {
        int gcd_ans = 0;
        while (n > 0)
        {
            gcd_ans = gcd(n % 10, gcd_ans);

            // If at point GCD becomes 1,
            // return it
            if (gcd_ans == 1)
                return 1;

            n = n / 10;
        }
        return gcd_ans;
    }




    public int kPrimeFactor(int n, int k)
    {
        // Find the number of 2's that
        // divide k
        while (n % 2 == 0)
        {
            k--;
            n = n / 2;
            if (k == 0)
                return 2;
        }

        // n must be odd at this point.
        // So we can skip one element
        // (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i = i + 2)
        {
            // While i divides n, store i
            // and divide n
            while (n % i == 0)
            {
                if (k == 1)
                    return i;

                k--;
                n = n / i;
            }
        }

        // This condition is to handle the
        // case where n is a prime number
        // greater than 2
        if (n > 2 && k == 1)
            return n;

        return -1;
    }


    public String checkLeapYear(int year) {
        // The desired year to check.
        int yearrr = 1998;

        // Implementing our algorithm.
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
            return "Yes";
        }
        else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
            return "No";
        }
        else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
            return "Yes";
        }
        else {
            System.out.println(year + " is not a leap year.");
            return "No";
        }
    }


}
