public class Book {
    public int maSach;
    public String tenSach;
    public String tacGiai;
    public String theLoai;
    public String nhaSuatBan;
    public int namSuatBan;
    
    public Book(int maSach, String tenSach, String tacGiai, String theLoai, String nhaSuatBan, int namSuatBan){
        this.maSach= maSach;
        this.tenSach= tenSach;
        this.tacGiai= tacGiai;
        this.theLoai= theLoai;
        this.nhaSuatBan= nhaSuatBan;
        this.namSuatBan= namSuatBan;
    }

    public boolean hasKeyword(String keyword){
        boolean result = this.tenSach.contains(keyword);
        return false;
    }
}
