import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
enum gioiTinh{
    NAM,
    NU,
}

public class Employee {

    //khai bao thuoc tinh
    private String id;
    private String ten;
    private LocalDate ngaySinh;
    //public LocalDate ngaySinh;
    private gioiTinh namORnu;
    private long luongThang;
    //constructor
    
    public Employee(String id, String ten, String ngaySinh, gioiTinh namORnu, long luongThang){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");//formatter time
        this.id= id;
        this.ten= ten;
        //this.ngaySinh= ngaySinh;
        this.ngaySinh= LocalDate.parse(ngaySinh, formatter);//chuyen String sang date
        this.namORnu= namORnu;
        this.luongThang= luongThang;
    }
    //getter
    public String getId(){
        return this.id;
    }
    public String getTen(){
        return this.ten;
    }
    public LocalDate getNgaySinh(){
        return this.ngaySinh;
    }
    public gioiTinh getNamORnu(){
        return this.namORnu;
    }
    public long getLuongThang(){
        return this.luongThang;
    }
    //setter
    public void setId(String id){
        this.id= id;
    }
    public void setten(String ten){
        this.ten= ten;
    }
    public void setNgaySinh(String ngaySinh){
        this.ngaySinh= LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public void setNamORnu(gioiTinh namORnu){
        this.namORnu= namORnu;
    }
    public void setLuongThang(long luongThang){
        this.luongThang= luongThang;
    }
    //tim chinh xac this.id
    public boolean checkID(String ID){
        boolean result= this.id.equals(ID);
        return result;
    }
    //tim chinh xac this.namORnu
    public boolean checkGioiTinh(gioiTinh XY){
        boolean result= this.namORnu.equals(XY);
        return result;
    }
    //tim theo tu khoa this.ten
    public boolean haskeyword(String keyword){
        boolean result= this.ten.contains(keyword);
        return result;
    }
    //in thong tin nhan vien
    public void thongTinNhanVien(){
        System.out.print(this.id+ "\t");
        System.out.print(this.ten+ "\t");
        System.out.print(this.ngaySinh+ "\t");
        System.out.print(this.namORnu+ "\t");
        System.out.print(this.luongThang+ "d\n");
    }
    //kiem tra nhan vien tren 30 tuoi
    public boolean tren30t(){
        LocalDate now= LocalDate.now();
        int age= Period.between(this.ngaySinh, now).getYears();
        boolean result= (age > 30)? true: false;//kiem tra co hon 30t khong
        return result;
    }
    //kiem tra thang
    public boolean checkthang(int month){
        boolean result= this.ngaySinh.getMonthValue()==month;
        return result;
    }
    //tim chinh xac luong
    public boolean checkluongThang(long luong){
        boolean result= this.luongThang == luong;
        return result;
    }

}