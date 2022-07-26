/**
 * Baitapday02
 */
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
public class Baitapday02 {

    public static void main(String[] args) throws Exception{
        //bai 1
        String letter = "Than gui cac ban,\n Duoi day la cau noi noi tieng \n\t \"A journey of a thousand miles begins with a single step \"\n No co nghia la \n\t \" Hanh trinh ngan dam bat dau tu mot buoc chan \"\n Chuc cac ban thanh cong !!!";
        System.out.println(letter);
        System.out.println("------------------------------------");
        System.out.println();
        //bai 2
        double distant = 0.0;
        String startTimeStr = "";
        String finishTimeStr = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("tinh thoi gian va van toc trung binh cua van dong vien");
        System.out.print("Nhap khoang cach(km): \t");
        distant = scanner.nextDouble();
        scanner.nextLine();
        
        
        System.out.print("Nhap thoi gian bat đau  HH:mm:ss :\t");
        startTimeStr = scanner.nextLine();
        System.out.print("Nhap thoi gian ket thuc  HH:mm:ss :\t");
        finishTimeStr = scanner.nextLine();
        scanner.close();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date startTime= formatter.parse(startTimeStr);
        Date finishTime= formatter.parse(finishTimeStr);
        long khoang= finishTime.getTime() - startTime.getTime();
        double time= khoang/3600000d;
        System.out.printf("Thoi gian chay %s h \n", time);
        System.out.printf("Van toc trung binh %s km/h\n", distant/time );
        
    }
}