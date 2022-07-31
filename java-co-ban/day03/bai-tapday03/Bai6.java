import java.util.Scanner;
import java.lang.String;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input s sentence:");
        String textString= scanner.nextLine();
        scanner.close();
        String text="";
        String trunggian="";
        for(int i= 0; i < textString.length(); i++){
            trunggian="";
            if(i ==0){
                trunggian = trunggian +textString.charAt(0);
                trunggian= trunggian.toUpperCase();
                text= text + trunggian;
            } else if( textString.charAt(i)== ' '){
                trunggian = trunggian + textString.charAt(i+1);
                trunggian= trunggian.toUpperCase();
                text= text + ' ' + trunggian;
                i++;
            } else {
                text = text + textString.charAt(i);
            }
        }
        System.out.println(text);
    }
}
