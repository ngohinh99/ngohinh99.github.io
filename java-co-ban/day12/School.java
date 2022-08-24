

/**
 * School
 */
public class School extends HocSinh{

    public String getLop() {
        return lop;
    }


    private String lop;
    private String khoaHoc;
    private String hocKy;


    public School(String name, int birthday, String queQuan, String lop, String khoaHoc,String hocKy) {
        super(name, birthday, queQuan);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
        this.hocKy = hocKy;
    }


    public void printInfo(){
        System.out.printf("%s %s %s ", this.lop, this.khoaHoc, this.hocKy);
        super.printInfo();
        System.out.println();
    }
    
}