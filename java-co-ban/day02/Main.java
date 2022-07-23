/**
 * Main
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String s = "hello";
        String x = new String("hello");
        //
        String s1= "cat";
        System.out.println(s1);

        String s2= "cat";
        System.out.println(s2);

        String s3= new String("cat");
        System.out.println(s3);

        String s4= new String("cat");
        System.out.println(s4);

        String s5= "dog";
        System.out.println(s5);

        String s6= new String("dog");
        System.out.println(s6);

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        String txt= "toi la code ";
        System.out.println("length:" + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        char ch = txt.charAt(5);
        System.out.println("ky tu: " + ch);
        int firstIndex=txt.indexOf("o");
        System.out.println(firstIndex);
        int lastIndex= txt.lastIndexOf("o");
        System.out.println(lastIndex);
        String subString= txt.substring(1, 3);
        System.out.println(subString);
        //date & time
        LocalDate curLocalDate= LocalDate.now();
        System.out.println(curLocalDate);
        LocalTime curLocalTime= LocalTime.now();
        System.out.println(curLocalTime);
        LocalDate daysinhnhat= LocalDate.of(1999, 04, 24);
        System.out.println(daysinhnhat);
        LocalTime timesinhnhat= LocalTime.of(10, 20, 20);
        System.out.println(timesinhnhat);
        LocalDate birthday= LocalDate.of(1999, 05, 24);
        LocalDate currentDate= LocalDate.now();
        int birthdatYear= birthday.getYear();
        int currentDateYear= currentDate.getYear();
        int age= currentDateYear - birthdatYear;
        System.out.println("tuoi:" + age);
        int month= birthday.getMonthValue();
        System.out.println(month);
        LocalDate netDate= birthday.plusDays(300);
        System.out.println(netDate);
        System.out.println(birthday.isLeapYear());
        LocalDateTime birthTime= LocalDateTime.of(1999, 05, 24, 4, 30, 40);
        System.out.println(birthTime);
        // nam/thang/ngay
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yy/MM/dd hh-mm-ss");
        String display= formatter.format(birthTime);
        System.out.println(display);
        // nhap suat duu lieu
        Scanner scanner= new Scanner(System.in);
        System.out.println("hay nhap so nguyen ");
        int intNumber= scanner.nextInt();
        System.out.println(intNumber);
        System.out.println("nhap text");
        scanner.nextLine();
        String inputText= scanner.nextLine();
        scanner.close();
        
        

    }
}