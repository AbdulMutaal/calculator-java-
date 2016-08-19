package calculator;
import java.util.Scanner;

public class hello {
	public static void main(String h[]) { 
		         System.out.println("Welcome\n\n\n"); 
	             System.out.println("Menu\n1.Additon\n2.Subtraction\n3.Multiplication\n4.Random numbers"); 
	             int choose;
	             Scanner bucky = new Scanner(System.in); 
	             System.out.print("Please choose what you want to do : "); 
	             choose = bucky.nextInt(); 
	             calculating s1 = new calculating();
	
	          switch (choose)
	          {
	          case 1 :
	              s1.adding();
	
	          case 2 : 
	              s1.subtract();
	
	          case 3 :
	              s1.multiply();
	
	          case 4 : 
	              s1.randomNumbers();
	
	          }
	
	      }
}
