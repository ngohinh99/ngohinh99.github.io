public class News implements INews{
    private String title;
    private String author;
    private String publicDate;
    private double rate;
    

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return String return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return String return the publicDate
     */
    public String getPublicDate() {
        return publicDate;
    }

    /**
     * @param publicDate the publicDate to set
     */
    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    /**
     * @return double return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("hello "+ this.author );
        
    }

    //
    
}
