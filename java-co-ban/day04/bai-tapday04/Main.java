import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    static void bai1(){
        System.out.println("cau 1: in ra hinh vuong hinhf tam giac");
        System.out.println("in ra hinhf vuong");
        System.out.println("* * * *\n* * * *\n* * * *\n* * * *");//in ra hinhf vuong
        System.out.println("in ra hinhf tam giac");
        System.out.println("*\n* *\n* * *\n* * * *");//in ra hinhf tam giac
        System.out.println("-----------------------------------------");
    }
    static void bai2(){
        System.out.println("cau 2: cho chuoi dem so tu trong chuoi va in ra index cac ki tu o");
        String text= "You only live once, but if you do it right, once is enough";
        String[] array= text.split(" ");//tach text thanh cac tu, cach nhau boi dau cach va gan vao bang
        System.out.println(text);
        System.out.println("so tu trong chuoi la: "+ array.length);
        int times= 0;//khai bao bien so lan suat hien cua 'o'
        System.out.print("index cua cac ky tu o la: ");
        for(int i= 0; i < text.length(); i++){
            if(text.charAt(i) == 'o'){
                times++;
                System.out.printf("%d, ",i);
            }
        }
        System.out.println("\nso lan suat hien cua o la: "+ times);
        System.out.println("-----------------------------------------");
    }
    static boolean kiemTraSoNguyeTo(int numbre){
        int squareRoot= (int) Math.sqrt(numbre);
        for(int i= 2; i <= squareRoot; i++){
            if(numbre % i == 0){
                return false;
            }
        }
        return true;
    }
    static void taoMang(int[][] index, Scanner sc){
        for(int i = 0; i < index.length; i++){
            for(int j = 0; j < index[i].length; j++){
                System.out.printf("nhap cac phan tu hang %d cot %d cho mang: ", i , j);
                index[i][j]= sc.nextInt();
            }
        }
    }
    static void inMang(int[][] index){
        for(int[] innerArray: index){
            for(int data: innerArray){
                System.out.print(data+ " ");
            }
            System.out.println();
        }
    }
    static void bai3(){
        System.out.println("cau 3: sinh ra mot so ngau nhien kiem tra co phai so nguyen to");
        boolean isPrimeNumber= true;
        Random rd= new Random();
        int num= rd.nextInt(100);
        System.out.println(num);
        if(num < 2){
            isPrimeNumber= false;
        }
        isPrimeNumber= kiemTraSoNguyeTo(num);//kiem tra co phai so nguyen to k
        if(isPrimeNumber == true){
            System.out.println("so sinh ra ngau nhien la so nguyen to");
        } else {
            System.out.println("so sinh ra ngau nhien k phai so nguyen to");
        }
        System.out.println("-----------------------------------------");
        
    }
    static void bai4(Scanner sc){
        System.out.println("cau 4: liet ke n so nguyen to dau tien");
        System.out.print("nhap so luong nguyen to can liet ke: ");
        int soNguyenToCanLietKe= sc.nextInt();//nhap so nguyen to can liet ke
        int[] bangSoNguyenTo= new int[soNguyenToCanLietKe];//tao bang so nguyen to
        int index = 0;//khai bao index cua bang
        if(soNguyenToCanLietKe <= 0){
            System.out.println("khong co so nguyen to nao");
        } else {
            int primeCount = 1;
            int num = 2;
            while(primeCount <= soNguyenToCanLietKe) {
                boolean isPrime= true;
                if(num == 2){
                    isPrime= true;
                    bangSoNguyenTo[index]=num;
                    index++;
                    num++;
                    primeCount++;
                    continue;
                }
                isPrime = kiemTraSoNguyeTo(num);//kiem tra xem co phai so nguyen to hay khong
                if(isPrime == true){
                    primeCount++;
                    bangSoNguyenTo[index]=num;
                    index++;
                }
                num++;
            }
            System.out.printf(" %s so nguyen to dau tien la: ", soNguyenToCanLietKe);
            for( int prime: bangSoNguyenTo){
                System.out.print(prime + " ");
            }
            System.out.print("\nso nguyen to nho hon 10 la: ");
            for(int i= 0; i <= bangSoNguyenTo.length; i++ ){
                if(bangSoNguyenTo[i] < 10){
                    System.out.print(bangSoNguyenTo[i] + " ");
                } else break;
            }
        }
        System.out.println("\n-----------------------------------------");
    }
    static void bai5(Scanner sc){
        System.out.println("\ncau 5: tao mang");
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap so hang cua bang: ");
        int row= sc.nextInt(); //nhap so hang
        System.out.print("nhap so cot cua bang: ");
        int column= sc.nextInt();//nhap so cot
        int[][] mang1= new int[row][column];//khai bao mang1 co hang row va cot column
        System.out.println("nhap cac phan tu mang");
        taoMang(mang1, scanner);//nhap cac gia tri vao mang1
        inMang(mang1);//in mang1 ra man hinh
        System.out.print("cac phan tu lam tren duong cheo chinh la: ");
        //liet ke cac phan tu lam tren duong cheo chinh
        if(row < column){
            for(int i = 0; i < row; i++){
                System.out.print(mang1[i][i]+ " ");
            }
        } else{
            for(int i = 0; i < column; i++){
                System.out.print(mang1[i][i]+ " ");
            }
        }
        System.out.println();
        System.out.println("nhap gia tri cua mang2");
        int[][] mang2= new int[row][column];//tao mang2 co so dong row va cot column
        taoMang(mang2, scanner);//nhap cac gia tri vao mang2
        inMang(mang2);//in mang2 ra man hih
        System.out.println("cong hai mang voi nhau ta co:");
        int[][] newMang= new int[row][column];
        for(int i = 0; i < newMang.length; i++){
            for(int j = 0; j < newMang[i].length; j++){
                newMang[i][j]= mang1[i][j] + mang2[i][j];
            }
        }
        inMang(newMang);//newMang co gia tri cua mang1 + mang2
        System.out.println("-----------------------------------------");
    }
    static void bai6(Scanner sc){
        System.out.println("cau 6: kiem tra mail sdt nhap tu ban phim co hop le");
        sc.nextLine();//troi lenh
        String EMAIL = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        String SDT = "^([0][\\d]{9})|([+][8][4][\\d]{9})$";
        System.out.print("nhap email: ");
        String email = sc.nextLine();
        System.out.print("nhap so dien thoai: ");
        String sdt = sc.nextLine();
        System.out.println(email +" "+ Pattern.matches(EMAIL, email) );
        System.out.println(sdt +" "+ Pattern.matches(SDT, sdt) );
        System.out.println("-----------------------------------------");
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        bai1();
        bai2();
        bai3();
        bai4(scanner);
        bai5(scanner);
        bai6(scanner);
        scanner.close();
    }
}
