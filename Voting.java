import java.util.Scanner;

public class Voting{
	public static void main(String[] args){
         //declairing variable
		int diff;

		//taking input from user
		Scanner scan = new Scanner(System.in);       //with creating object scan
		System.out.println("Enter your age->>");
		int age = scan.nextInt();       //it put 1st no from console(nextInt)

		//checking for eligible or not
		if(age >= 18){
			System.out.println("You are Eligible for voting");

		}
		else{
			diff = (18 - age);
			System.out.println("Sorry , you can vote after :" +diff+ "years");
		}
	}
}



//Scanner scan = new Scanner(System.in);
//s.o.p("enter ....");
//varname = scan.nextInt();

//Scanner scan = new Scanner(System.in);
//s.o.p("enter)"); 
//varname = objname.nextInt();
