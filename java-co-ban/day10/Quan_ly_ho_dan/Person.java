package Quan_ly_ho_dan;
/**
 * QuanLyHoDan
 */
public class Person {

    private String name;
    private String birthday;
    private String job;
    
    public Person(String name, String birthday, String job){
        this.name = name;
        this.birthday = birthday;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person [birthday=" + birthday + ", job=" + job + ", name=" + name + "]";
    }
}