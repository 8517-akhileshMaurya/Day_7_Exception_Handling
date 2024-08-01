package BasicExceptionHandling;

import java.util.Scanner;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int num = sc.nextInt();
            System.out.println(100/num);
        }
        catch (ArithmeticException e){
            System.out.println("Number can not be divided by '0'");
        }
        finally {
            System.out.println("Operation is complete");
        }
    }
}