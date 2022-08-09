/**
 * Dog
 */
public class Dog extends Animal {
    public Dog(String breed, String name){
        this.breed= breed;
        this.name= name;
    }
    @Override
    public void speek(){

        System.out.println(this.name+ " gogogog");
    }

    public void move(){
        super.move();
        System.out.println("aaaaaaaaa");
    }
}