package calculator;
import java.util.Scanner;
import java.util.Random;

public class calculating {
	 public void adding()
	          {
	              int num1, num2, result;
	 
	           Scanner bucky = new Scanner (System.in);
	           System.out.print("\t\t\tHello\n\nEnter first number");
	           num1 = bucky.nextInt();
	           System.out.print("Enter Second number : " );
	           num2 = bucky.nextInt();
	           result = num1 + num2;
	           System.out.print("The result is : " + result);
	          }
	 
	  public void subtract()
	          {
	              int num1, num2, result;
	 
	              Scanner bucky = new Scanner (System.in);
	              System.out.print("\t\t\tHello\n\nEnter First number : ");
	              num1 = bucky.nextInt();
	              System.out.print("Enter Second number : ");
	              num2 = bucky.nextInt();
	              result = num1 - num2;
	              System.out.print("Result is : " + result); 
	 
	          }
	   public void multiply()
	          {
	              double num1 , num2, result;
	 
	              Scanner bucky = new Scanner (System.in);
	              System.out.print("\t\t\tHello\n\nEnter first number : ");
	              num1 = bucky.nextDouble();
	              System.out.print("Enter Second number : ");
	              num2 = bucky.nextDouble();
	 
	              result = num1 * num2;
	              System.out.print("The result is " + result);
	          }
	 
	   public void randomNumbers()
	          {
	              int random;
	 
	              Random hello = new Random();
	 
	              random = hello.nextInt(5);
	              System.out.println("The random number is " + random);
	          }
}
