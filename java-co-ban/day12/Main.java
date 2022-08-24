

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Date stringToDay(String birthday){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); 
        Date birth = format.parse(birthday);
        return birth;
    }
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.print("ban can bao nhieu hoc sinh: ");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<School> schools = new ArrayList<>();
        for(int i = 0; i < n; i++){
            System.out.printf("moi ban nhap hoc sinh thu %d\n", i + 1);
            System.out.print("nhap ten:");
            String name = scanner.nextLine();
            System.out.print("nhap nam sinh:(dd/MM/yyyy)");
            String birthday = scanner.nextLine();
            System.out.print("nhap que quan: ");
            String queQuan = scanner.nextLine();
            System.out.print("nhap lop: ");
            String lop = scanner.nextLine();
            System.out.print("khoa hoc: ");
            String khoaHoc = scanner.nextLine();
            System.out.print("hoc ky: ");
            String hocKy = scanner.nextLine();
            System.out.println("-------------------------");

            schools.add(new School(name, stringToDay(birthday), queQuan, lop, khoaHoc, hocKy));//them vao list school
        }
        //in ra hoc sinh sinh nam 1985 va que quan thai nguyen
        System.out.println("hoc sinh sinh nam 1985 va que quan thai nguyen:");
        for(School school: schools){
            if(school.getBirthday() == 1985&& school.getQueQuan().equals("thai nguyen")){
                school.printInfo();
            }
        }
        //in ra hoc sinh lop 10A1
        for(School school: schools){
            if(school.getLop().equals("10A1")){
                school.printInfo();
            }
        }
    }

}
