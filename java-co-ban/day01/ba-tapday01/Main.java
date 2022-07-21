/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int i=10, a=10;
        int n= i++%5, l= ++a%5;
        System.out.println("gia tri cua i la: " + i);
        System.out.println("gia tri cua n= i++%5 la: " + n);
        System.out.println("gia tri cua i la: " + a);
        System.out.println("gia tri cua n= ++i%5 la: " + l);
        //chuyển đổi từ độ f sang độ c
        int doF= 100;
        System.out.println("100 do F =" + (double) 5/9*(doF - 32) + " do C");
        //bai 3
        System.out.println("gia tri cua d = 9 / 5 la: " + 9 / 5);
        double f= 9/5f;
        System.out.println("de bieu thuc co gia tri bang " + (double) Math.round(f*10) /10 + " thi d= 9/5f va dung Math.round()" );
        //bai 4
        int x= 20, y= 4;
        System.out.println("ta co x= " + x);
        System.out.println("ta co y= " + y);
        System.out.println("x la so duong " + (x > 0));
        System.out.println("x chia het cho y " + (x % y ==0));
        System.out.println("x nam trong khoan tu 2 den 15 " + ((x<2)&&(x>15)));
        System.out.println("hieu so cua x va y nho hon 5 " + ((x - y)<5));
        System.out.println("x khong thuoc khoan tu 10 den 30 " + !((x>10)&&(x<30)));
        System.out.println("x co nhieu hon 4 chu so"  ) ;
        System.out.println("x co chinh xac 6 chu so");
    }
}