import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input seconds: ");
        int seconds= scanner.nextInt();
        scanner.close();
        int hours= 0; 
        int minute= 0; 
        while(seconds>= 60){
            if(seconds - 60 >= 0){
                minute++;
                seconds-=60;
                if(minute -60 >= 0){
                    hours++;
                    minute = minute -60;
                }
            }
            
        }
        System.out.printf("%s:%s:%s",hours, minute, seconds);
    }
}
