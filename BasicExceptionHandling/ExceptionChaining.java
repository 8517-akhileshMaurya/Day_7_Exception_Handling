package BasicExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionChaining {
    public static void main(String[] args){
        try{
            readFromFile("Demo.file");
        }catch (IOException e){
            System.out.println("Caught " + e.getMessage());

        }
    }
    static void readFromFile(String filename) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        reader.close();
    }
}
