public class First1{

	static int x = 10;
	int y = 20;
	static char c ='A';


	public static void main(String[] args){

		First1 f1 = new First1();
		First1 f2 =new First1();
		


		f1.x = f1.x + 5;
		System.out.println(f2.y);
		System.out.println(f2.x);
		System.out.println(c);

	}
}