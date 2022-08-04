import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Book[] bookList = new Book[5];
        bookList[0]= new Book(100, "toan", "Nguyen Van A", "giao duc", "tuoi tre", 1999);
        bookList[1]= new Book(101, "ngu van", "Nguyen Van B", "giao duc", "tuoi tre", 2000);
        bookList[2]= new Book(102, "tieng anh", "Nguyen Van A", "tieng nuoc ngoai", "tuoi tre", 2001);
        bookList[3]= new Book(103, "tin hoc", "Nguyen Van D", "giao duc", "tuoi tre", 1999);
        bookList[4]= new Book(104, "hoa hoc", "Nguyen Van E", "khoa hoc", "tuoi tre", 2002);

        for(Book book: bookList){
            System.out.println(book.tenSach);
        }

        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap tu khoa ten sach");
        String keyword= scanner.nextLine();
        scanner.close();
        for(int index= 0; index < bookList.length; index++){
            Book book= bookList[index];
            // String tensach = book.tenSach;
            // if(tensach.contains(keyword)){
            //     System.out.println("tim thay sach: " + tensach);
            // }
            if(book.hasKeyword(keyword)){
                System.out.println("tim thay sach: " + book.tenSach);
            }
        }
        int check= 1999;
        
    }
}