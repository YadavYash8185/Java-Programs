public class EvenOdd {
    public static void main(String[] args) {
        int num = 10;

        if (num % 2 == 0)
            System.out.println(num + " is Even.");
        else
            System.out.println(num + " is Odd.");
    }
}
// Another way without if else by using ternary operator

import java.util.Scanner;
public class Evenodd{
    public static void main(String[] args){
        System.out.print("Enter the nuumber : ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.print("The Number is : " + ((s % 2==0) ? "Even" : "Odd"));
    }
}
