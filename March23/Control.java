class Control{
	public static void main(String args[]){
		int x = 1;
		for(;;){
			if(x<=10){
				System.out.println(x);
				x++;
			}
			else{
				break;			}
		}
	}
}