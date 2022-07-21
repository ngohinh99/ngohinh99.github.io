/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        char y = 'b';
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println(y);
        byte number= 5;
        short numberShort= number;
        System.out.println(numberShort);
        long numberLong= number;
        System.out.println(numberLong);
        double numberDouble= 1.7;
        int numberDoubleint= (int) numberDouble;
        System.out.println(numberDoubleint);
        long weight= 100;
        int weightint= (int)weight;
        System.out.println(weightint);
        // hằng số
        final float pi= 3.14f;
        // toán tử điều kiện
        boolean result= weight==weightint;
        System.out.println(result);
        System.out.println(weight>=weightint);
        weight++;
        System.out.println(weight);
        

    }
}