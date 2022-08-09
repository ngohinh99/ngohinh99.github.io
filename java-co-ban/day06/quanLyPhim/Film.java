/**
 * Film
 */
public class Film {
    //khai bao thuoc tinh
    protected String id;
    protected String title;//tieu de
    protected Category category;//the loai
    protected double raking;
    //constructor
    public Film(String id, String title, Category category, double raking){
        this.id= id;
        this.title= title;
        this.category= category;
        this.raking= raking;
    }
    //getter
    protected String getId(){
        return this.id;
    }
    protected String getTitle(){
        return this.title;
    }
    protected Category getCategory(){
        return this.category;
    }
    protected double getRaking(){
        return this.raking;
    }
    //setter
    protected void setId(String id){
        this.id= id;
    }
    protected void setTitle(String title){
        this.title= title;
    }
    protected void setCategory(Category category){
        this.category= category;
    }
    protected void setRaking(double raking){
        this.raking= raking;
    }

    //in thong tin Film
    protected void printthongtin(){
        System.out.printf("stt: %s\tten: %s\tthe loai: %s\traking: %s\t",getId(),getTitle(),getCategory(),getRaking());
    }
    //tim hasKeyword the title
    protected boolean hasKeyword(String keyword){
        boolean result= this.title.contains(keyword);
        return result;
    }
    //check Category
    protected boolean checkCategory(Category category){
        boolean result = this.category == category;
        return result;
    }
}