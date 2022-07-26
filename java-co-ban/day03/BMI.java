import java.util.Scanner;

/**
 * Main
 */
public class BMI {

    public static void main(String[] args) {
        double cannang, chieucao, BMI;
        Scanner sc= new Scanner(System.in);
        System.out.println("can nang: ");
        cannang =sc.nextDouble();
        System.out.println("chieu cao: ");
        chieucao =sc.nextDouble();
        sc.close();
        BMI= cannang/(Math.pow(chieucao, 2));
        System.out.println(BMI);
        if (BMI<18.5) {
            System.out.println("thieu can");
        } else if (BMI>24.9) { 
            System.out.println("thua can");
        } else {
            System.out.println("can doi");
        }
    }
}