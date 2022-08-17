package Quan_ly_tran_dau;

public class Tuong {
    private String name;
    private String position;
    
    public Tuong(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void printInfo(){
        System.out.printf("%s %s", this.name, this.position);
    }

    
}
