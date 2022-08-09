import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class User {
    protected String id;
    protected String name;
    protected Gender gender;
    protected LocalDate birthday;
    protected String email;
    protected String phoneNumber;
    public User(String id, String name, Gender gender, String birthday, String email, String phoneNumber){
        this.id= id;
        this.name= name;
        this.gender= gender;
        this.birthday= LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.email= email;
        this.phoneNumber= phoneNumber;
    }
    protected String getName(){
        return this.name;
    }
    protected void printInfo(){
        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t", this.id, this.name, this.gender, this.birthday, this.email, this.phoneNumber);
    }
    protected boolean hasKeywordName(String keyword){
        boolean result= this.name.contains(keyword);
        return result;
    }
    protected boolean hasKeywordEmail(String keyword){
        boolean result= this.email.contains(keyword);
        return result;
    }
    protected boolean hasKeywordPhoneNumber(String keyword){
        boolean result= this.phoneNumber.contains(keyword);
        return result;
    }
    protected int year(){
        LocalDate now= LocalDate.now();
        return Period.between(this.birthday, now).getYears();
    }
}
