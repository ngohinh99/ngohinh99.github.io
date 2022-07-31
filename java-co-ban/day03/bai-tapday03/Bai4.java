import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input a number: ");
        int number= scanner.nextInt();
        scanner.close();
        for(int i= 1; i< 11; i++){
            System.out.printf("%s x %s = %s \n", number, i, number*i);
        }
    }
}
