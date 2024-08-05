package AdvanceProblem;

import java.util.logging.Logger;

class DataNotFoundException extends Exception {
    public DataNotFoundException(String str){
        super(str);
    }
}

class CalculationException extends RuntimeException {
    public CalculationException(String str){
        super(str);
    }
}

class PremiumCalculator {
    private static final Logger LOGGER = Logger.getLogger(PremiumCalculator.class.getName());

    // Instance variables (you can add more as needed)
    private int age;
    private String healthCondition;
    private String vehicleType;

    // Constructor to initialize data
    public PremiumCalculator(int age, String healthCondition, String vehicleType) {
        this.age = age;
        this.healthCondition = healthCondition;
        this.vehicleType = vehicleType;
    }

    // Method to fetch age
    public int getAge() throws DataNotFoundException {
        if (age <= 0) {
            LOGGER.warning("Age data not found!");
            throw new DataNotFoundException("Age data is missing.");
        }
        return age;
    }

    // Method to fetch health condition
    public String getHealthCondition() throws DataNotFoundException {
        if (healthCondition == null || healthCondition.isEmpty()) {
            LOGGER.warning("Health condition data not found!");
            throw new DataNotFoundException("Health condition data is missing.");
        }
        return healthCondition;
    }

    // Method to fetch vehicle type
    public String getVehicleType() throws DataNotFoundException {
        if (vehicleType == null || vehicleType.isEmpty()) {
            LOGGER.warning("Vehicle type data not found!");
            throw new DataNotFoundException("Vehicle type data is missing.");
        }
        return vehicleType;
    }


    public double calculatePremium() {
        try {
            int age = 1600;
            String healthCondition = "Good";
            String vehicleType = "Good";

            double basePremium = 1000.0;
            double ageFactor = 1.2;
            double healthFactor = 1.1;
            double vehicleFactor = 1.05;
            return basePremium * ageFactor * healthFactor * vehicleFactor;

        } catch (DataNotFoundException e) {
            LOGGER.severe("Error calculating premium: " + e.getMessage());
            throw new CalculationException("Error calculating premium.");
        }
    }

    public static void main(String[] args) {
        // Example usage
        PremiumCalculator calculator = new PremiumCalculator(30, "Good", "Car");
        double premium = calculator.calculatePremium();
        System.out.println("Premium: $" + premium);
    }
}