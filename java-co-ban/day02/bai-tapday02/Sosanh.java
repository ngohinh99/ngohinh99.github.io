import java.util.Scanner;

/**
 * Main
 */

public class Sosanh {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("hay nhap so tu nhien tu ban phim");
        int intNumber= scanner.nextInt();
        int randNumber= (int)(Math.random() * 100);
        System.out.println("so random"+ randNumber);
        String compare= intNumber > randNumber ? "number lon hon" : "random lonn hon";
        System.out.println(compare);
        scanner.close();
    }
}