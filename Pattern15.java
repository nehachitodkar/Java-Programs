public class Pattern15 {
	public static void main(String args[]) {
		int i, j, n = 4;
		char ch='a';
		int num =1;

		for(i=1; i<=n; i++) {
					
		
			for(j=4; j<=i; j++) { 

				System.out.print(" ");
			}

			for(int k=1; k<i*2; k++) {
				if(k==1 || j==2){
				System.out.print(ch);
				ch++;
			}
			else{
				System.out.println(num);
			}
		}
			System.out.println();
		}
	}
}
