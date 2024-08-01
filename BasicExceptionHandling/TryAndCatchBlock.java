package BasicExceptionHandling;

import java.util.Scanner;

// Write a Java program that takes an integer input from the user and divides
// 100 by the input number. Implement exception handling using a try-and-catch
// block to handle
// the potential ArithmeticException that occurs when the input is zero. Display an
// appropriate message to the user if an exception occurs.

public class TryAndCatchBlock {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(100/num);
        }
        catch (ArithmeticException e){
            System.out.println("Can not divide by 0 ");
        }


    }
}
