package Stocks;

public class MenClothe extends Clothe{
    public MenClothe(String name, String brand, int price, int stock){
        super(name, brand,price, stock);
    }
    public void display(){
        println("\"Men Clothes\"");
        println("Clothe Type : " + getType());
        println("Clothe Brand: " + getBrand());
        println("Clothe Price: " + getPrice());
        println("Clothe Stock: " + getStock());
    }
    public static Clothe MenDeserialize(String data){
        String[] value = data.split("/");
        return new MenClothe(value[0], value[1], Integer.parseInt(value[2]), Integer.parseInt(value[3]));
    }
}
