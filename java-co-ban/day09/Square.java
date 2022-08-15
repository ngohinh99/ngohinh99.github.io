public class Square implements Polygon{
    private double side;

    /**
     * @return double return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.printf("dien tich hinh vuong la: ");
    }

    @Override
    public void calArea() {
        // TODO Auto-generated method stub
        System.out.println(this.side*this.side);
    }

}
