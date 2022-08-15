package quan_ly_hoc_sinh;

public class Student implements Iclassification{
    private String name;
    private int age;
    private double marks;
    private String classification;

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return byte return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(byte age) {
        this.age = age;
    }

    /**
     * @return byte return the marks
     */
    public double getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(byte marks) {
        this.marks = marks;
    }

    /**
     * @return String return the classification
     */
    public String getClassification() {
        return classification;
    }

    public Student(String name, int age, double marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public void classify() {
        // TODO Auto-generated method stub
        if(this.marks >= 8){
            this.classification = "A";
        } else if(this.marks < 6.5){
            this.classification = "C";
        } else {
            this.classification = "B";
        }
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        
        System.out.printf("%-30s %-5s %-5s %s\n", this.name, this.age, this.marks, this.classification);
    }

}
