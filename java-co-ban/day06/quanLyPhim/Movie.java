public class Movie extends Film{
    //khai bao thuoc tinh
    private int time;//thoi luong
    //constructor
    public Movie(String id, String title, Category category, double raking, int time){
        setId(id);
        setTitle(title);
        setCategory(category);
        setRaking(raking);
        this.time= time;
    }
    //getter
    protected int getTime(){
        return this.time;
    }
    //setter
    protected void setTime(int time){
        this.time= time;
    }
    //in thong tin movie
    protected void printMovie(){
        printFilm();
        System.out.printf("thoi luong: %d (phut)\n",getTime());
    }

}
