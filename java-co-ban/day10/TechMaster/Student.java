/**
 * Student
 */
enum HocLuc{
    TOT,
    KEM
}
public class Student {

    private String id;
    private String name;
    private int age;
    private HocLuc hocLuc;

    public Student(String id, String name, int age, HocLuc hocLuc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hocLuc = hocLuc;
    }

    public void printInfo(){
        System.out.printf("%-10s %-30s %-10s %-10s\n", this.id, this.name, this.age, this.hocLuc);
    }
    public boolean checkId(String id){//kiem tra this.id co giong id
        boolean result = this.id.equals(id)? true: false;
        return result;
    }

    public void setHocLuc(String hocLuc) {
        this.hocLuc = hocLuc.equals("TOT")? HocLuc.TOT : HocLuc.KEM;
    }

    public boolean checkName(String name) {//kiem tra this.name co giong name
        boolean result = this.name.equals(name)? true: false;
        return result;
    }
}