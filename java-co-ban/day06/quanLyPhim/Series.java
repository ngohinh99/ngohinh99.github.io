public class Series extends Film{
    //khai bao thuoc tinh
    private int episodes;//so tap
    private int duration;//thoi luong moi tap
    //constructor
    public Series(String id, String title, Category category, double raking, int duration, int episodes){
        setId(id);
        setTitle(title);
        setCategory(category);
        setRaking(raking);
        this.duration= duration;
        this.episodes= episodes;

    }
    //getter
    protected int getEpisodes(){
        return this.episodes;
    }
    protected int getDuration(){
        return this.duration;
    }
    //setter
    protected void setEpisodes(int episodes){
        this.episodes= episodes;
    }
    protected void setDuration(int duration){
        this.duration= duration;
    }
    //in thong tin series
    protected void printSeries(){
        printFilm();
        System.out.printf("thoi luong: %d(phut)\ttap: %d\n", getDuration(),getEpisodes());
    }

}
