import java.util.*;
class Arthametic{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Sum is :"+ (a+b));
		System.out.println("diff is :"+ (a-b));
		System.out.println("product is"+ (a*b));
		System.out.println("division:"+ (a/b));
		System.out.println("reminder:"+ (a%b));
	} 
}