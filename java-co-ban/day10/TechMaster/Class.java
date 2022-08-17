import java.util.ArrayList;

public class Class {
    private String subjects;
    private ArrayList<Student> Students;

    public Class(String subjects, ArrayList<Student> students) {
        this.subjects = subjects;
        Students = students;
    }
    
    public void printInfo(){
        System.out.printf("mon hoc: %s\n", this.subjects);
        System.out.printf("%-10s %-30s %-10s %-10s\n", "id", "name", "age", "hoc luc");
        for(Student student: Students){
            student.printInfo();
        }
    }

}
