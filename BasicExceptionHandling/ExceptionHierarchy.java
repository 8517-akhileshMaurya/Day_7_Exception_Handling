package BasicExceptionHandling;

public class ExceptionHierarchy {
    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println(str.length());
//           Give Null Pointer Exception

            int num1 = 12;
            int num2 = 0;

            int result = num1/num2;
//           Give Arithmetic Exception
        }
        catch (NullPointerException e){
            System.out.println("string have null value  ");
        }

        catch (ArithmeticException e){
            System.out.println("Number can not be divided by '0'  ");
        }
        catch (Exception e){
            System.out.println("Universal Exception  ");
        }
    }
}

