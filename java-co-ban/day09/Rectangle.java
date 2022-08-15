public class Rectangle implements Polygon {
    private double length;
    private double width;
    

    /**
     * @return double return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return double return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.printf("dien tich hinh chu nhat la: ");
    }

    @Override
    public void calArea() {
        // TODO Auto-generated method stub
        System.out.println(this.length*this.width);
    }

}
