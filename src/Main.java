import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        line = line.replace(" ", "").toLowerCase();
        if(new StringBuilder(line).reverse().toString().equals(line)){
            System.out.println("Это полиндром");
        }else{
            System.out.println("Это не полиндром");
        }
    }
}
