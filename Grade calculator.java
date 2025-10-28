import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Enter the marks: ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks>90)
		{
		  System.out.println("Topper");  
		}
		else if(marks<90 && marks>60){
		    System.out.println("Intermediate");
		}
		else if(marks>30){
		    System.out.println("Average");
		}
		else{
		    System.out.println("Bekaar");
		}
	}
}
