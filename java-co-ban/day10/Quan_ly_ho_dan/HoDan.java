package Quan_ly_ho_dan;
import java.util.ArrayList;

public class HoDan {
    private int numberNember;
    private String houseNumber;
    private ArrayList<Person> people;
    public void setNumberNember(int numberNember) {
        this.numberNember = numberNember;
    }
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }
    @Override
    public String toString() {
        return "HoDan [houseNumber=" + houseNumber + ", numberNember=" + numberNember + ", people=" + people + "]";
    }


    


}
