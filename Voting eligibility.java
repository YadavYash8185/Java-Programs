import java.util.Scanner;
public class VoteChecker
{
	public static void main(String[] args) {
		System.out.print("Enter the age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18)
		{
		  System.out.println("Eligible for vote");  
		}
		else{
		    System.out.println("Not eligible for vote");
		}
	}
}
