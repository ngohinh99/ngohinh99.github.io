import java.util.Scanner;

/**
 * Tong
 */
public class Bai1 {

    public static void main(String[] args) {
        long S=0;
        Scanner scanner= new Scanner(System.in);
        while(true){
            System.out.println("nhap so nguyen duong");
            long intNumber= scanner.nextLong();
            if(intNumber > 0){
                System.out.println(intNumber+ " la so duong");
                for(long i= intNumber; i >0; i--){
                    S = S + i;
                }
                System.out.printf("tong tu 1 ->%s: %s",intNumber, S );
                break;
            }
        }
        scanner.close();
    }
}