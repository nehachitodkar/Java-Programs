public class Printast5{

	public static void main(String args[]){

		int i,j,row=4;
		for(i = 0;i<4;i++){

			for(j=4-i;j>1;j--){
				System.out.print(" ");

			}
			for( j=0;j<=i;j++){

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}