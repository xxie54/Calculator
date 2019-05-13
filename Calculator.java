import java.util.Scanner;

public class Calculator
{
    static int x;
    static int y;
     int result;
   //behaviors
     public int addNumbers(int x, int y)
    {
         result=x+y;
         
         return result;
    }
    public int subtractNumbers(int x, int y)
    {
        result=x-y;
        
        return result;
    }
    public int multiplyNumbers(int x, int y)
    {
        result=x*y;
        
        return result;
    }
    public int divideNumbers(int x, int y)
    {
         result=x/y;
         
         return result;
    }

     public static void main(String[] args) { 
       //instantiation  
            Scanner getNum=new Scanner(System.in);
         
            System.out.print("Enter first integer.");
            x=getNum.nextInt();
            
            System.out.print("Enter second integer");
            y=getNum.nextInt();
            
            //result=calculator();
            Calculator myCalculator = new Calculator();
            System.out.println("the addition of x and y is"+myCalculator.addNumbers(x,y));

       // show all operations here on myCalculator Object 
      }
 }


