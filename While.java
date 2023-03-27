public class While{

	public static void main(String[] args){
		int x = 1;
		while(x<=10){
			System.out.println("Hello");
			x++; //in post increment operator it is not used immediately when two or more opertaion performed(int x = (i++)+(++j))
			                //while in preincrement opeartor ++i is immediately used    
		}
		System.out.println(x);
	}	
}