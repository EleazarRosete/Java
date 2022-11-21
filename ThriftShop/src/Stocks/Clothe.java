package Stocks;

public abstract class Clothe {
    Clothe(String type, String brand, int price, int stock){
        this.type =type;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
    }
    public abstract void display();

    // Setters
    public void setType(String type ){
        this.type = type;
    }
    public String Serializer(){
        return getType() + "/" + getBrand() + "/" + getPrice() + "/" + getStock() + "\n";
    }

    public void setBrand(String brand ){
        this.brand = brand;
    }
    public void setPrice(int price ){
        this.price = price;
    }
    public void setStock(int stock){this.stock = stock;}
    // Getters
    public String getType(){return this.type;}
    public String getBrand(){return this.brand;}
    public int getPrice(){return this.price;}
    public int getStock(){return this.stock;}
    void println(Object o){
        System.out.println(o);
    }
    private String type, brand;
    private int price, stock;
}
