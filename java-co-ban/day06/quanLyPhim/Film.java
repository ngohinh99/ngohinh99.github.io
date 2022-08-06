/**
 * Film
 */
public class Film {
    //khai bao thuoc tinh
    private String id;
    private String title;//tieu de
    private Category category;//the loai
    private double raking;
    //constructor
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
    protected void printFilm(){
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