package quan_ly_hoc_sinh;

public class Main {
    public static void main(String[] args) {
        Student[] studentList = new Student[5];
        studentList[0] = new Student("Nguyen Van A", 15, 5);
        studentList[1] = new Student("Nguyen Van B", 16, 4);
        studentList[2] = new Student("Nguyen Van C", 14, 8);
        studentList[3] = new Student("Nguyen Van D", 17, 7);
        studentList[4] = new Student("Nguyen Van E", 15, 9);

        System.out.printf("%-30s %-5s %-5s %s\n" , "name", "age", "marks","classification");
        for(Student student: studentList){
            student.classify();
            student.display();
        }
    }
}
