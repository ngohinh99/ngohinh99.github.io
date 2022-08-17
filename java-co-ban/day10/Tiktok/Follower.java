package Tiktok;
public class Follower {
    private String id;
    private String name;
    private int numberOfLike;

    public Follower(String id, String name, int numberOfLike) {
        this.id = id;
        this.name = name;
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower [id=" + id + ", name=" + name + ", numberOfLike=" + numberOfLike + "]";
    }

}
