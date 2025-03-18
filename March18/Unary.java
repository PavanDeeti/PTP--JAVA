class Unary{
	public static void main(String args[]){
		int a = 10;
		System.out.println("Pre Inc:"+ (++a + a));
		a = 10;
		System.out.println("post Inc:" + (a+++a));
		a = 10;
		System.out.println("Sum is :" + Integer.sum(++a,a));

	}
}