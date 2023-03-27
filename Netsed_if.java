import java.util.Scanner;

public class Nested_if{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age->");
		int age = sc.nextInt();

		if(age < 0){
			System.out.println("Invalied age");

		}else if (age < 18){
			System.out.println("You are child");
		}else if (age >= 18)
		System.out.println("You are adult");
	    else if (age >= 60){
		System.out.println("You are Seniour Citizen");
		}
	}
	
}