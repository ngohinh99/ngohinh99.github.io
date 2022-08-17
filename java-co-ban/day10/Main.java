import java.util.ArrayList;
import java.util.Scanner;

import Quan_ly_ho_dan.HoDan;
import Quan_ly_ho_dan.Person;
import Tiktok.Follower;
import Tiktok.Idol;
import Tiktok.Song;
import Tiktok.Tiktok;


public class Main {
    static void Quan_ly_ho_dan(Scanner scanner){
        System.out.print("nhap so nha: ");
        String houseNumber = scanner.nextLine();
        System.out.print("nhap so thanh vien: ");
        int numberNember = scanner.nextInt();

        Person person = new Person("huong", "12", "job");
        Person person2 = new Person("hai", "13", "job");
        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person2);

        HoDan hoDan = new HoDan();
        hoDan.setHouseNumber(houseNumber);
        hoDan.setNumberNember(numberNember);
        hoDan.setPeople(people);

        System.out.println(hoDan.toString());
    }
    static void Tiktok(){
        ArrayList<Follower> followers = new ArrayList<>();
        followers.add(new Follower("001", "A", 1));
        followers.add(new Follower("002", "B", 4));
        followers.add(new Follower("003", "C", 5));

        ArrayList<Idol> idols = new ArrayList<>();
        idols.add(new Idol("001", "E", "E", followers));

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("001", "AA", "AAA"));
        songs.add(new Song("002", "BB", "BBB"));

        ArrayList<Tiktok> tiktoks = new ArrayList<>();
        tiktoks.add(new Tiktok(idols, songs));

        System.out.println(tiktoks.toString());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Quan_ly_ho_dan(scanner);
        // Tiktok();
        



    }
}
