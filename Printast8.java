public class Printast8{
	public static void main(String args[])
	{
		char ch ='a';
		for(int i =1;i<=5;i++)
		{
			for( int j =1;j<=i;j++){

				System.out.print(" ");


			}
		
		
		    for(int k =1;k<(i*2);k++)
		{
			
			if(k>i && k<=(i*2)-1)
			{
				System.out.print(ch+" ");
				ch++;
			}
			else{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
}