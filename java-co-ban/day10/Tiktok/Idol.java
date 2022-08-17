package Tiktok;
import java.util.ArrayList;

public class Idol {
    private String id;
    private String name;
    private String email;
    private ArrayList<Follower> followers;
    
    public Idol(String id, String name, String email, ArrayList<Follower> followers) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "Idol [email=" + email + ", followers=" + followers + ", id=" + id + ", name=" + name + "]";
    }



}
