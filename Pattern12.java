public class Pattern12{


	public static void main(String args[])
	{

		int num = 1;
		char ch ='a';

		for(int i=1; i<=5; i++)
		{

			for(int j=1;j<=i;j++)
			{

				System.out.print(" ");

			}
			for(int k =1;k<(i*2);k++)
			{
				if(k>1 && k<(i*2)-1)
			
			{
				System.out.print(ch+" ");
				ch++;
			}
			else{
				System.out.print(num+" ");
				num++;
			}
		}
			System.out.println();
		}
	}
}