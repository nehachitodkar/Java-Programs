public class Printast9{
	public static void main(String args[]){
		int num =1;

		for(int i = 1;i<=5;i++){


			for(int j = 1;j<=5;j++)
			{
				
				if(i>=2 && j>=2 && i<=4 && j<=4){
					
					if(j==2 || j<=4 || i<=4 ||i==3|| j==2 || i==4 || j==3) {
						System.out.print(num+" ");
						num++;
					}

					
					
					
				
				}
				else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}