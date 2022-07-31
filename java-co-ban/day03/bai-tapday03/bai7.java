import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input seconds: ");
        int seconds= scanner.nextInt();
        scanner.close();
        int gio= 0; 
        int phut= 0; 
        while(seconds>= 60){
            if(seconds - 60 >= 0){
                phut++;
                seconds-=60;
                if(phut -60 >= 0){
                    gio++;
                    phut = phut -60;
                }
            }
            
        }
        System.out.println(gio);
        System.out.println(phut);
        System.out.println(seconds);
    }
}
