import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static void menu(TechMaster techMaster) {
        printInfo(techMaster);//in thong tin techMaster
        System.out.println("menu:");
        System.out.println("[1] hien thi thong tin trung tam.");
        System.out.println("[2] them hoc vien vao lop.");
        System.out.println("[3] cap nhap thong tin hoc luc theo id.");
        System.out.println("[4] xoa hoc sinh khoi lop hoc.");
        System.out.println("[5] thoat");
        
    }
    private static void printInfo(TechMaster techMaster) {
        System.out.println("trung tam TechMaster");
        System.out.println("-----------------------");
        techMaster.printInfo();//print
    }
    private static void addStudent(ArrayList<Student> students) {
        System.out.printf("nhap id hoc sinh: ");
        String id= scanner.nextLine();
        System.out.printf("nhap ten: ");
        String name= scanner.nextLine();
        System.out.printf("nhap tuoi: ");
        int age= Integer.parseInt(scanner.nextLine());//chong troi lenh
        System.out.printf("nhap hoc luc(tot/kem): ");
        String hocLuc= scanner.nextLine();

        students.add(new Student(id, name, age, hocLuc.equals("tot")? HocLuc.TOT: HocLuc.KEM));//them mot student

    }
    private static void update(ArrayList<Student> students) {
        System.out.print("nhap id muon thay doi thong tin hoc luc: ");
        String id = scanner.nextLine();
        for(Student student: students){
            if(student.checkId(id)){//kiem tra id cua student co giong id moi nhap
                System.out.print("ban muon thay doi hoc luc thanh TOT or KEM: ");
                String hocLuc = scanner.nextLine();
                student.setHocLuc(hocLuc.toUpperCase());//cho hoc luc nhap tu ban phim in hoa het cho chac
                break;
            }
        }
    }
    private static void remove(ArrayList<Student> students) {
        System.out.println("nhap id hoac ten can xoa: ");
        String keyword = scanner.nextLine();
        // int temp = 0;
        // for(Student student: students){
        //     temp++;
        //     if(student.checkId(keyword)){//kiem tra this.id co giong keyword 
        //         students.remove(temp-1);
        //         break;
        //     } else if (student.checkName(keyword)){//kiem tra this.name co giong keyword 
        //         students.remove(temp-1);
        //         break;
        //     }
        // }
        students.removeIf(e -> e.checkId(keyword)||e.checkName(keyword));
    }
    public static void main(String[] args) {

        System.out.printf("nhap ten nguoi quan ly lop hoc: ");
        String manage = scanner.nextLine();
        System.out.printf("nhap ten giang vien: ");
        String lecturers = scanner.nextLine();
        System.out.printf("nhap mon hoc cua lop: ");
        String subjects = scanner.nextLine();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("001", "Nguyen Van A", 19, HocLuc.TOT));
        students.add(new Student("002", "Nguyen Van B", 20, HocLuc.KEM));
        students.add(new Student("003", "Nguyen Van C", 21, HocLuc.TOT));
        students.add(new Student("004", "Nguyen Van D", 24, HocLuc.TOT));
        students.add(new Student("005", "Nguyen Van E", 17, HocLuc.KEM));

        Class class1 = new Class(subjects, students);//tao mot lop hoc
        TechMaster techMaster = new TechMaster(manage, lecturers, class1);//tao mot techMaster

        boolean isQuit = false;
        while (true) {
            menu(techMaster);
            System.out.printf("nhap so menu: ");
            int key = Integer.parseInt(scanner.nextLine());//chong troi lenh
            switch (key) {
                case 1://print teckMaster
                    printInfo(techMaster);
                    break;
                case 2://them hoc sinh
                    addStudent(students);
                    break;
                case 3://cap nhap thong tin hoc luc theo id
                    update(students);
                    break;
                case 4://xoa hoc sinh
                    remove(students);
                    break;
                case 5://quit
                    isQuit = true;
                    break;
                default:
                    break;
            }
            if(isQuit == true){
                System.out.println("hen gap lai!!!");
                break;
            }
        }
        scanner.close();

    }






}
