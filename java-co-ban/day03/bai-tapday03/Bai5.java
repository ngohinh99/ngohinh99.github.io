import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input a string: ");
        String textString= scanner.nextLine();
        scanner.close();
        String reverseString = "";
        for (int i= textString.length()-1; i>=0 ; i--){
            reverseString += textString.charAt(i);
        }
        System.out.println(reverseString);
    }
}
