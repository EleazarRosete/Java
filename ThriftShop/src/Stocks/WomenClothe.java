package Stocks;

public class WomenClothe extends Clothe{
    public WomenClothe(String name, String brand, int price, int stock){
        super(name, brand,price, stock);
    }
    public void display(){
        println("\"Women Clothes\"");
        println("Clothe Type  : " + getType());
        println("Clothe Brand : " + getBrand());
        println("Clothe Price : " + getPrice());
        println("Clothe Stock : " + getStock());
    }
    public static Clothe WomenDeserialize(String data){
        String[] value = data.split("/");
        return new WomenClothe(value[0], value[1], Integer.parseInt(value[2]), Integer.parseInt(value[3]));
    }
}
