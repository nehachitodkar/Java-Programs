public class Printast3{
	public static void main(String args[]){

		int i,j,rows=4;

		for(i = 0;i<=4;i++){

			for(j=0;j<=i;j++){

				System.out.print("");


			}
			int num =1;
			for(int k=1;k<=i;k++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}