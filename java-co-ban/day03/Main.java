import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main {
    public static void main(String[] args) {
        // for (int i=10; i>0; i--){
        //     System.out.println("so lan lap"+ i);
        //     i--;
        // }
        // int count=0;
        // String text= "toi la java code";
        // for ( int index=0; index < text.length(); index++){
        //     char character = text.charAt(index);
        //     if (character== 'a') {
        //         System.out.println("kytu a");
        //         count++;
        //     }
        // }
        // int index=text.length()-1;
        // while (index>=0){
        //     System.out.printf("ky tu o vi tri %s ky tu la %s \n", index +1 , text.charAt(index));
        //     index--;
        // }
        Scanner sc= new Scanner(System.in);
        boolean isEven= false;
        do {
            System.out.println("nhap tren so chan");
            int inputNumber= sc.nextInt();
            if (inputNumber % 2 == 0){
                System.out.println("ba da nhap dung");
                isEven= true;
            }
        } while(isEven== false);
        sc.close();
        
    }
    
}
