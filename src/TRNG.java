import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static java.lang.Math.sin;

public class TRNG {

    String BinaryForm;

    double ft(double x) {
        double a = 1.99999;
        if (x < 0.5)return a * x;
        else return  a * (1 - x);
    }

    double ft2(double x) {
        double a = 0.99999;
        return a*sin(3.14*x);
    }
    public void ReadFile(String input){
        StringBuilder sb = new StringBuilder();
        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(input))) {
            for (int b; (b = is.read()) != -1;) {
                String s = "0000000" + Integer.toBinaryString(b);
                s = s.substring(s.length() - 8);
                s = s.substring(5,7);
                sb.append(s);
            }
            BinaryForm = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void getL(){
        System.out.println(BinaryForm.length());
    }



}
