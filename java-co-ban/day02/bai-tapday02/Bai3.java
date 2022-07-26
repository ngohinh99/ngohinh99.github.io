import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.Duration;
public class Bai3 {
    public static void main(String[] args) {
        double distant = 0.0;
        String startTimeStr = "";
        String finishTimeStr = "";
        Scanner scanner = new Scanner(System.in);
        // nhập khoảng cách từ bàn phím, gán vào biến distant
        System.out.print("Nhập khoảng cách: ");
        distant = scanner.nextDouble();
        scanner.nextLine();
        
        // nhập thời gian bắt đầu, gán vào biên startTimeStr
        System.out.print("Nhập thời gian bắt đầu: ");
        startTimeStr = scanner.next();
        
        // nhập thời gian kết thúc, gán vào biến finishTimeStr
        System.out.print("Nhập thời gian kết thúc: ");
        finishTimeStr = scanner.next();

        scanner.close();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        //SimpleDateFormat formatter2 = new SimpleDateFormat("HH:mm:ss");
        // chuyển startTimeStr và finishTimeStr sang kiểu LocalDateTime
        LocalDateTime startTime = LocalDateTime.parse(startTimeStr, formatter);
        LocalDateTime finishTime = LocalDateTime.parse(finishTimeStr,formatter);
        System.out.println(startTime);
        Duration duration = Duration.between(startTime, finishTime);
        // Tính và in ra thời gian chạy của bạn
        System.out.printf("Thời gian chạy %s phút\n", duration.toMinutes());
        // Tính và in ra vận tốc trung bình của bạn (km/h)
        System.out.printf("Vận tốc trung bình %s km/h\n", distant/(duration.toMinutes()/60.0));
    }
}
