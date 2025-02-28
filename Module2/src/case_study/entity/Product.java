package case_study.entity;
import java.io.Serializable;
public class Product implements Serializable {
    private static final long serialVersionUID = 1602701961467242119L;
    private String id;
    private String name;
    private int quantity;
    private int price;
    private String benefit;
    private String category;
    private String supplier;
    public Product(){
    }
    public Product(String id, String name, int quantity, int price, String benefit, String category, String supplier) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.benefit = benefit;
        this.category = category;
        this.supplier = supplier;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getBenefit(){
        return benefit;
    }
    public void setBenefit(String benefit){
        this.benefit = benefit;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getSupplier(){
        return supplier;
    }
    public void setSupplier(String supplier){
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Product named: " + name +
                ", id: " + id  +
                ", with a current quantity of " + quantity + " units, " +
                "(" + price + " VND/unit); " +
                "belongs to category: " + category +
                " and is distributed by " + supplier + "\n";
    }
}
