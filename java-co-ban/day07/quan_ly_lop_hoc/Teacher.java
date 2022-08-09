public class Teacher extends User {
    private int yearOfExperiences;
    private String speciality;
    public Teacher(String id, String name, Gender gender, String birthday, String email, String phoneNumber,int yearOfExperiences,String speciality){
        super(id, name, gender, birthday, email, phoneNumber);
        this.yearOfExperiences= yearOfExperiences;
        this.speciality= speciality;
    }
    @Override
    protected void printInfo(){
        super.printInfo();
        System.out.printf("%s\t%s\n", this.yearOfExperiences, this.speciality);
    }
}
