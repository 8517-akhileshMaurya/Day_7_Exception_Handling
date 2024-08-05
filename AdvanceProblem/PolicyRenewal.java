package AdvanceProblem;

class PolicyExpiredException extends Exception {
   public  PolicyExpiredException(String str){
       super(str);
   }

}

class PaymentPendingException extends Exception {
   public PaymentPendingException(String str){
       super(str);
   }
}

class NonComplianceException extends Exception {
    public NonComplianceException(String str){
        super(str);
    }

}

class PolicyRenewal {
    // Assume we have policy status, payment history, and renewal terms
    private boolean isPolicyExpired;
    private boolean hasPendingPayment;
    private boolean compliesWithRenewalTerms;

    public PolicyRenewal(boolean isPolicyExpired, boolean hasPendingPayment, boolean compliesWithRenewalTerms) {
        this.isPolicyExpired = isPolicyExpired;
        this.hasPendingPayment = hasPendingPayment;
        this.compliesWithRenewalTerms = compliesWithRenewalTerms;
    }

    public void renewPolicy() throws PolicyExpiredException, PaymentPendingException, NonComplianceException {
        if (isPolicyExpired) {
            throw new PolicyExpiredException("Policy has expired. Renewal not allowed.");
        }

        if (hasPendingPayment) {
            throw new PaymentPendingException("Payment pending. Complete payment to renew.");
        }

        if (compliesWithRenewalTerms) {
            throw new NonComplianceException("Policy does not comply with renewal terms.");
        }

        // If all checks pass, proceed with policy renewal
        System.out.println("Policy successfully renewed!");
    }

    public static void main(String[] args) {
        // Example usage
        PolicyRenewal renewal = new PolicyRenewal(false, false, false);
        try {
            renewal.renewPolicy();
        } catch (PolicyExpiredException | PaymentPendingException | NonComplianceException e) {
            System.err.println("Error during policy renewal: " + e.getMessage());
            // Notify policyholders accordingly (e.g., send an email or display a message)
        }
    }
}
