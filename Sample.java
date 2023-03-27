public class Sample{
       static int count = 1;
	public static void main(String[] args){

		if(count<=10){
			System.out.println("Hello");
			count = count + 1;
			main(null);
			
		}
	}
}