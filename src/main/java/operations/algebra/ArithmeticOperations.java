package operations.algebra;

import java.text.DecimalFormat;
import java.util.Stack;

public class ArithmeticOperations {


    /* add two numbers */
    public float addition(float a,float b)
    {
        return a+b;
    }

    /* subtract two numbers */
    public float subtraction(float a,float b)
    {
        return a-b;
    }

    /* multiply two numbers */
    public float multiply(float a,float b)
    {
        return a*b;
    }

    /* divide two numbers */
    public float division(float a,float b)
    {
        if(b==0)
        {
            System.err.println("Error: cannot divide a number with zero.");
            return (float) 0.0;
        }
        return a/b;

    }

    /* find n1 modulo n2 */
    public int modulo(int a,int b)
    {
        return a%b;
    }


    public double squareroot(double number){
        if(number<0){
            return -1;
        }
        return Math.sqrt(number);
    }

    public long factorial(int number){
        if(number<0 || number>20){
            return -1;
        }

        long fact=1;
        while(number>0){
            fact=fact*number;
            number--;
        }

        return fact;
    }

    public double floorOfNumber(double number){
        return Math.floor(number);
    }
    public double ceilOfNumber(double number){

        return Math.ceil(number);
    }

    public double naturalLog(double number){
        if(number<=0){
            return -1;
        }

        return Math.log(number);
    }

    public double power(double number,double pow){

        return Math.pow(number,pow);
    }

    public Integer infixToPostfixEvaluation(String infix){
        if(infix==null){
            return null;
        }
        String postfix=convertToPostfix(infix);
        System.out.println(postfix);
        if(!postfix.equals("") && !postfix.equals("Invalid")){
            Integer result=evaluatePostfix(postfix);
            return result;
        }
        return null;
    }

    private String convertToPostfix(String infix){
        Stack<Character> stack=new Stack<>();
        boolean isOperatorRepeat=false;
        boolean isOperandRepeat=false;
        String postfix="";
        for(int i=0;i<infix.length();i++){
            char curr=infix.charAt(i);
            if(curr=='+' || curr=='-' || curr=='*' || curr=='/'){
                if(isOperatorRepeat){
                    postfix="Invalid";
                    break;
                }
                while(!stack.isEmpty() && validatePrecedence(stack.peek(), curr)){
                    char ch=stack.pop();
                    postfix=postfix+ch;
                }
                stack.push(curr);
                isOperatorRepeat=true;
                isOperandRepeat=false;
            }
            else if(Character.isDigit(curr)){
                if(isOperandRepeat){
                    postfix="Invalid";
                    break;
                }
                postfix=postfix+curr;
                isOperandRepeat=true;
                isOperatorRepeat=false;
            }
            else if(curr=='('){
                stack.push(curr);
                isOperandRepeat=false;
                isOperatorRepeat=false;
            }
            else if(curr==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    char ch=stack.pop();
                    postfix=postfix+ch;
                }
                if(stack.isEmpty()){
                    postfix="Invalid";
                    break;
                }
                else{
                    stack.pop();
                }
                isOperandRepeat=false;
                isOperatorRepeat=false;
            }
            else{
                postfix="Invalid";
                break;
            }
        }
        if(postfix.equals("Invalid")){
            return postfix;
        }
        while(!stack.isEmpty()){
            if(stack.peek()=='('){
                postfix="Invalid";
                break;
            }
            else{
                char ch=stack.pop();
                postfix=postfix+ch;
            }
        }
        return postfix;
    }

    private Integer evaluatePostfix(String postfix){
        Stack<Integer> stack=new Stack<>();
        Integer result=0;
        for(int i=0;i<postfix.length();i++){
            char curr=postfix.charAt(i);
            if(Character.isDigit(curr)){
                stack.push(Integer.parseInt(String.valueOf(curr)));
            }
            else{
                int num1=stack.pop();
                int num2=stack.pop();
                int num3=0;
                if(curr=='+'){
                    num3=num1 + num2;
                }
                else if(curr=='-') {
                    num3 = num2 - num1 ;
                }
                else if(curr=='*'){
                    num3 = num1 * num2;
                }
                else if(curr=='/'){
                    num3 = num2/num1;
                }
                else{
                    result=null;
                    break;
                }
                stack.push(num3);
            }
        }
        if(stack.size()!=1){
            result=null;
        }
        else if(result!=null) {
            result = stack.pop();
        }
        return result;
    }

    private boolean validatePrecedence(char top,char curr){
        int w1=getPrecendence(top);
        int w2=getPrecendence(curr);
        return w1>=w2?true:false;
    }

    private int getPrecendence(char operator){
        int weight=-1;
        if(operator=='+' || operator=='-'){
            weight=1;
        }
        else if(operator=='*' || operator=='/'){
            weight=2;
        }
        return weight;
    }
    /* find 10th power of number */
    public int power_base_10(int x)
    {
        ArithmeticOperations g=new ArithmeticOperations();
        int ans=1;
        int i;
//        if(x<0)
//        {
//            x=-x;
//            for(i=0;i<x;i++)
//            {
//                ans=ans*10;
//            }
//            return g.inverse_of_it(ans);
//
//        }
        for(i=0;i<x;i++)
        {
            ans=ans*10;
        }
        return ans;
    }
    public long permutations(int n,int r){
        if(n<0 || r<0 || n<r){
            return -1;
        }
        long fact1=factorial(n);
        long fact2=factorial(n-r);
        return (fact1/fact2);
    }

    public long combinations(int n,int r){
        if(n<0 || r<0 || n<r){
            return -1;
        }
        long fact1=factorial(n);
        long fact2=factorial(r);
        long fact3=factorial(n-r);
        return (fact1/(fact2*fact3));
    }

    public double solveEquation(int a,int b,int c){
        int d=b*b-4*a*c;
        double root1=0;
        double root2=0;
        if(d>0){
            root1=(-b+Math.sqrt(d))/(2*a);
            root2=(-b-Math.sqrt(d))/(2*a);
        }
        else if(d==0){
            root1=(-b+Math.sqrt(d))/(2*a);
        }
        else{
            return -1;
        }
        return root1;
    }

    public double inverse_of_it(int x)
    {
        if(x==0)
        {
            System.err.println("Error: Cannot find inverse 0.");
            return (float) 0.0;
        }
        else
        {
            double temp = (double)1/x;
            System.out.println(temp);
            float ans = Math.round(temp*10)/10;
            System.out.println(temp);
            return temp;
        }


    }


    public double nPr(int n, int r){
        double ans=0;
        //double a=Double.parseDouble(operand1);
        //double b=Double.parseDouble(operand2);

        if(n<0 || r<0 || n<r){
            System.out.println("Invalid input");
        }else{
            ans = division( factorial(n), factorial( (int)(subtraction((float)(n), (float)(r))) ) );
        }

        return ans;
    }

    public double nCr(int n, int r){
        double ans=0;
        if(n<0 || r<0 || n<r){
            System.out.println("Invalid input");
        }else{
            float temp = subtraction((float)(n), (float)(r));
            int tmp = (int)temp;
            ans = division(factorial(n),
                    multiply( factorial(tmp), factorial(r) ));
        }

        return ans;
    }

    public int sumOfnNumbers(int start,int end){
        int cnt = end-start+1;
        int val = (cnt*(start+end))/2;
        return val;
    }

}
