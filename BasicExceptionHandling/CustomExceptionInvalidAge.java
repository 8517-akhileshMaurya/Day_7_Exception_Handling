package BasicExceptionHandling;

import java.util.Scanner;

public class CustomExceptionInvalidAge {
    static void ViewAge(int age) throws InvalidAge {
        if (age < 18) {
            System.out.println("You must be 18+ ..");
        } else {
            System.out.println("You are allowed ......");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age for voting : ");
            int age = sc.nextInt();
            ViewAge(age);
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidAge extends Exception{
    public InvalidAge(String age){
        super(age);
    }
}
