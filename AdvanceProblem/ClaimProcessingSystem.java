package AdvanceProblem;
//  Develop a ClaimProcessingSystem class with a method processClaim that  processes insurance
//  claims. Implement logic to check for fraudulent
//  claims by validating claim amounts and dates against policy coverage.
//  Throw custom unchecked exceptions like FraudulentClaimException and
//  InvalidClaimAmountException. Handle these exceptions in the main
//   method and send notifications to the claims department for
//  further investigation.


import BasicExceptionHandling.InsufficientFundsException;

class FraudulentClaimException extends Exception{
    public FraudulentClaimException(String str){
        super(str);
    }
}

class InvalidClaimAmountException extends Exception{
    public InvalidClaimAmountException(String str){
        super(str);

    }
}

public class ClaimProcessingSystem {

    static void getClaimAmount(int amount) throws FraudulentClaimException{
        if(amount > 0 && amount < 2000){
            System.out.println("Invalid amount ");
        }
    }

    static void getClaimDate(String date) throws InvalidClaimAmountException{
        if(date == null){
            System.out.println("Invalid amount ");
        }
    }

    public static void main(String[] args) {
        int POLICY_AMOUNT = 10000;
        try {
            getClaimAmount(1000);
            getClaimDate("12/09/2024");
        }catch ( FraudulentClaimException | InvalidClaimAmountException e){
            System.out.println(e.getMessage());
        }

    }
}
