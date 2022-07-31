import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Original String: ");
        String text= scanner.nextLine();
        scanner.close();
        boolean resultString = true;
        for(int i= 0; i < text.length() -1; i++){
            for(int y= i+ 1; y< text.length(); y++ ){
                if( text.charAt(i)==text.charAt(y)){
                    resultString= false;
                    break;
                }
            }
            if (resultString==false){
                break;
            }
        }
        System.out.println("Result String: "+resultString);
    }
}
