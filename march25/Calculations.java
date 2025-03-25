   import java.util.*;
   class Calculations{
   	public static void main(String args[]){
   		System.out.println("Welocome to Calculator..... ");
   		System.out.println("1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Exit");
   		System.out.println("SELECT WHAT DO YOU WANT TO PERFORM...");
   		Scanner scan = new Scanner(System.in);
   		int a = scan.nextInt();
   		int x,y;
   		System.out.println("Enter the two numbers: ");
   			 x = scan.nextInt();
   			 y = scan.nextInt();
   		switch(a){	
   		case 1:
   		    System.out.println("Sum is"+(x+y));
   			break;
   		case 2:
   			System.out.println("Difference is"+(x-y));
   			break;
   		case 3:
   			System.out.println("product is"+(x*y));
   			break;
   		case 4:
   			System.out.println("Division"+(x/y));
   			break;
   		default:
   			System.out.println("operator is not found!");


   		}
   	}
   }