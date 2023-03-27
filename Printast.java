public class Printast{
			

	public static void main(String args[]){
					
		int i,j,n=4;


		for( i =0;i<=n;i++){
		
		for( j = n;j>i;j--){ 

			System.out.print(" ");
		}

			char ch ='a';
			for(int k=0;k<=i;k++){
			System.out.print(ch+" ");
			ch++;
		}
		System.out.println();
	}
}
}
