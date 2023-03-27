public class Forloop{
	public static void main(String[] args){
	int	i =1, j=5;	 

		for(;i<=15;i++,j++){
			System.out.println("Hello Aarya:->>"+i); //initialization can be done outside the for loop also but by syntax you have to mention (;)
		}
			System.out.println(j); //here i is incrementing by 1 as well as j is also increment so last value of j will print (20)
	}
}