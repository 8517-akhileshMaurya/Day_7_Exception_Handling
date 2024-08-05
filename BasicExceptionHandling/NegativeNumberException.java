package BasicExceptionHandling;

import java.util.Scanner;

public class NegativeNumberException {
    static void getNumber(int n)  throws NegativeNumber{
        if(n < 0) {
            System.out.println("Please Enter positive number ...");
        }
        else {
            System.out.println("Your number is positive .");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number : ");
            int number = sc.nextInt();
            getNumber(number);
        }catch (NegativeNumber e){
            System.out.println(e.getMessage());
        }
    }
}

class NegativeNumber extends Exception{
    public NegativeNumber(String str){
        super(str);
    }
}
