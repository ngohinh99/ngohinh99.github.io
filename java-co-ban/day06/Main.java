import animal.Cat;
import animal.Chicken;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Cat cat= new Cat(2.0);
        Chicken chicken= new Chicken(1.2);
        System.out.println(cat.getWeight());
        System.out.println(chicken.getWeight());
    }
}