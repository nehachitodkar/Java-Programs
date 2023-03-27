public class Array{
	public static void main(String[] args){

		int[] x ={12,45,67,10,23,11,79,38};
		int min= x[0];
		for(int i = 1;i<x.length;i++)
		{
			if(x[i]<min) 
			{
			 min=x[i];
			}
			
		}
		System.out.println("smaller number is:"+min);
	}
}