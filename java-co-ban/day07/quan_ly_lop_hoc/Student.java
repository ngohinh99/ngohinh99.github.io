public class Student extends User{
    private boolean isOnline;
    private String background;
    
    public Student(String id, String name, Gender gender, String birthday, String email, String phoneNumber, boolean isOnline, String background){
        super(id, name, gender, birthday, email, phoneNumber);
        this.isOnline= isOnline;
        this.background= background;
    }
    //getter
    //setter
    @Override
    protected void printInfo(){
        super.printInfo();
        System.out.printf("%s\t%s\n", this.isOnline, this.background);
    }
}
