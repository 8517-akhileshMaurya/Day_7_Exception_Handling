package BasicExceptionHandling;

import java.util.Scanner;

public class InsufficientFundsException {
    private double balance;

    public InsufficientFundsException(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdrawMoney(double amount) throws  InsufficientMoney{
        if(amount > balance){
            throw new InsufficientMoney("Insufficient funds ....... ");
        }
        System.out.print("Remaining balance : ");
        balance -= amount;
        System.out.println(balance);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            InsufficientFundsException insufficientFundsException = new InsufficientFundsException(500);
            System.out.println("You have " + insufficientFundsException.getBalance());
            System.out.println("Enter money to withdrawal ");
            int money = sc.nextInt();
            insufficientFundsException.withdrawMoney(money);
        }catch (InsufficientMoney e){
            System.out.println(e.getMessage());
        }
    }
}


class InsufficientMoney extends Exception {
    public InsufficientMoney(String str){
        super(str);
    }
}


