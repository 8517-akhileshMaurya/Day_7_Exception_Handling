package AdvanceProblem;

class validateAge extends Exception{
    public validateAge(String str){
        super(str);
    }
}

class validateDrivingHistory extends Exception{
    public validateDrivingHistory(String str){
        super(str);
    }
}

class validateHealthRecord extends Exception{
    public validateHealthRecord(String str){
        super(str);
    }
}

public class PolicyApplicationProcess {
    static void getAge(int age) throws validateAge{
        if(age < 18){
            System.out.println("Not able to Drive .... ");
        }
    }

    static void getDrivingHistory(boolean poorRecord) throws validateDrivingHistory{
        if(poorRecord = true){
            System.out.println("Have very poor Driving record .... ");
        }
    }

    static void getHealthRecord(boolean poorHealth) throws validateHealthRecord{
        if(poorHealth){
            System.out.println("Found health issues ....");
        }
    }

    public static void main(String[] args) {
        try{
            int age = 23;
            boolean drivingHistory = true;
            boolean healthRecord = false;

            getAge(age);
            getHealthRecord(healthRecord);
            getDrivingHistory(drivingHistory);

        } catch (validateAge | validateDrivingHistory | validateHealthRecord e){
            System.out.println(e.getMessage());
        }
    }
}
