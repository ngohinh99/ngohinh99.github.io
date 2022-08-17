public class TechMaster {
    private String manage;
    private String lecturers;
    private Class class1;

    public TechMaster(String manage, String lecturers, Class class1) {
        this.manage = manage;
        this.lecturers = lecturers;
        this.class1 = class1;
    }
    public void printInfo(){
        System.out.printf("quan ly hoc sinh: %s\n", this.manage);
        System.out.printf("giang vien: %s \n", this.lecturers);
        class1.printInfo();
    }

}
