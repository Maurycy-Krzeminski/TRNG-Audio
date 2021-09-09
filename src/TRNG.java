import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static java.lang.Math.sin;

public class TRNG {

    String BinaryForm;
    int L = 8;
    int gamma = 4; // =L/2|__
    double e = 0.05;
    double ft(double x) {
        double a = 1.99999;
        if (x < 0.5)return a * x;
        else return  a * (1 - x);
    }

    double ft2(double x) {
        double a = 0.99999;
        return a*sin(3.14*x);
    }
    void postProcessing1(){
        int N = 10000;
        double x[][] = new double[9][gamma];
        x[0][0] = 0.141592;
        x[1][0] = 0.653589;
        x[2][0] = 0.793238;
        x[3][0] = 0.462643;
        x[4][0] = 0.383279;
        x[5][0] = 0.502884;
        x[6][0] = 0.197169;
        x[7][0] = 0.399375;

    }

    void postProcessing2(){

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
