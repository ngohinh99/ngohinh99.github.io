public class Movie extends Film{
    //khai bao thuoc tinh
    private int time;//thoi luong
    //constructor
    public Movie(String id, String title, Category category, double raking, int time){
        super(id, title, category, raking);
        this.time= time;
    }
    //getter
    protected int getTime(){
        return this.time;
    }
    //setter

    //in thong tin movie
    @Override
    protected void printthongtin(){
        super.printthongtin();
        System.out.printf("thoi luong: %d (phut)\n",getTime());
    }

}
