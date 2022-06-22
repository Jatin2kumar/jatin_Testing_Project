package Examples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
//        System.out.println("Entered number is "+ n);
        sc.nextLine();
        System.out.println("What is your name: ");
        String name = sc.nextLine();
        System.out.println("Your name is " +name);
        sc.close();
    }
}
