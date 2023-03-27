public class Narrowing1{

	public static void main(String[] args){

		double md = 9.78d;    //by default java consider all floating point values
	    int myint = (int) md;
        
        System.out.println(md);
        System.out.println(myint); //java is case sensitive declaire variable in small-letters


	}
}