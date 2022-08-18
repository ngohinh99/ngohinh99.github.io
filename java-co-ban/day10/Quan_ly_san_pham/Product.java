public class Product {
    private String id;
    private String name;
    private String describe;//mo ta
    private int amount;
    private double money;
    private String unit;


    public Product(String id, String name, String describe, int amount, double money, String unit) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.amount = amount;
        this.money = money;
        this.unit = unit;
    }
    
    public double getMoney() {
        return money;
    }

    public void printInfo(){
        System.out.printf("%-5s %-20s %-20s %-20s %-20s %-5s\n",this.id, this.name, this.describe, this.amount, this.money, this.unit);
    }

    public boolean checkName(String name) {
        boolean result = this.name.equals(name)? true: false;
        return result;
    }

    public int getAmount() {
        return amount;
    }

    public boolean checkID(String id) {
        boolean result = this.id.equals(id)? true: false;
        return result;
    }

    public void updateAmount(int amount) {
        this.amount = this.amount + amount;
    }
}
