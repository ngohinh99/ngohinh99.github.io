import java.time.LocalDate;

/**
 * HocSinh
 */
public class HocSinh {

    private String name;
    private LocalDate birthday;
    private String queQuan;
    public HocSinh(String name, LocalDate birthday, String queQuan) {
        this.name = name;
        this.birthday = birthday;
        this.queQuan = queQuan;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void printInfo(){
        System.out.printf("%s %s %s ", this.name, this.birthday, this.queQuan);
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    
}