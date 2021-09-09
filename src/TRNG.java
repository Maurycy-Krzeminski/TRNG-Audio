import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TRNG {

    String BinaryForm;


    void ReadFile(String input){
        StringBuilder sb = new StringBuilder();
        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(input))) {
            for (int b; (b = is.read()) != -1;) {
                String s = "0000000" + Integer.toBinaryString(b);
                s = s.substring(s.length() - 8);
                sb.append(s);
            }
            BinaryForm = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
