package BasicExceptionHandling;

//  Write a Java program that takes two integer inputs from the user.
//  Implement exception handling using multiple catch blocks to handle
//  ArithmeticException
//  (if the second number is zero) and InputMismatchException
//  (if the user enters non-integer values).
//  Display appropriate messages for each exception.


import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number : ");
            int input1  = sc.nextInt();
            System.out.println("Enter second number : ");
            int input2 = sc.nextInt();
            System.out.println(input1/input2);
        }

        catch (ArithmeticException e){
            System.out.println("Second number can not be 0");
        }

        catch (InputMismatchException e){
            System.out.println("Please enter Integer value");
        }
    }
}
