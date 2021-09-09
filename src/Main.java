public class Main {

    public static void main(String[] args){

        System.out.println("Hello World");
        TRNG A = new TRNG();
        A.ReadFile("byme.wav");
        System.out.println(A.BinaryForm);


    }

}
