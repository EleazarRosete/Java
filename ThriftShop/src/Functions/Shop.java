package Functions;

import FileHandling.FileSystem;
import Stocks.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    void runShop(){
        FileSys.CreateFileMen();
        FileSys.CreateFileWomen();
        MenClothes = FileSys.ReadFileMen();
        WomenClothes = FileSys.ReadFileWomen();
        while (true) {
            print("""
                    "Good Day!"
                    
                    1. Add
                    2. View
                    3. Update
                    4. Remove
                    0. Exit
                    -> \s""");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case add:
                    add();
                    println("\nStock Added!\n");
                    break;
                case view:
                    view();
                    ctr = 1;
                    break;
                case update:
                    if (MenClothes.size() == 0 && WomenClothes.size() == 0){
                        print("Empty!\n");
                    }
                    else {
                        update();
                    }

                    break;
                case remove:
                    if (MenClothes.size() == 0 && WomenClothes.size() == 0){
                        print("Empty!\n");
                    }
                    else {
                        remove();
                    }
                    break;
                case exit:
                    System.exit(0);
                    break;
                default:
                    println("Invalid!");
            }
        }
    }
    void add(){
        print("""
                1. Add Men Clothes
                2. Add Women Clothes
                -> \s""");
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case Men -> {
                print("Enter the type of clothe : ");
                type = sc.nextLine();
                print("Enter the brand of clothe: ");
                brand = sc.nextLine();
                print("Enter the price of clothe: ");
                price = sc.nextInt();
                sc.nextLine();
                print("Enter the stock of clothe: ");
                stock = sc.nextInt();
                sc.nextLine();
                MenClothe men = new MenClothe(type, brand, price, stock);
                MenClothes.add(men);
                FileSys.WriteFileMen(MenClothes);
            }
            case Women -> {
                print("Enter the type of clothe : ");
                type = sc.nextLine();
                print("Enter the brand of clothe: ");
                brand = sc.nextLine();
                print("Enter the price of clothe: ");
                price = sc.nextInt();
                sc.nextLine();
                print("Enter the stock of clothe: ");
                stock = sc.nextInt();
                sc.nextLine();
                WomenClothe women = new WomenClothe(type, brand, price, stock);
                WomenClothes.add(women);
                FileSys.WriteFileWomen(WomenClothes);
            }
            default -> println("Invalid!");
        }
    }
    void view(){
        print("""
                1. View Men Clothes
                2. View Women Clothes
                -> \s""");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case Men -> {
                println("");
                if (MenClothes.size()==0){println("Empty!\n");}
                else {
                    for (Clothe clothe : MenClothes) {
                        println(ctr + ".");
                        clothe.display();
                        println("");
                        ctr++;
                    }
                    println("A total of " + MenClothes.size() + " clothes.\n");
                }
            }
            case Women -> {
                println("");
                if (WomenClothes.size()==0){println("Empty!\n");}
                else {
                    for (Clothe clothe : WomenClothes) {
                        println(ctr + ".");
                        clothe.display();
                        println("");
                        ctr++;
                    }
                    println("A total of " + WomenClothes.size() + " clothes.\n");
                }
            }
        }
    }
    void update(){
        print("""
                1. View Men Clothes
                2. View Women Clothes
                -> \s""");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case Men -> {
                print("Enter the position of item you want to edit: ");
                position = sc.nextInt();
                sc.nextLine();
                position-=1;
                print("""
                1. Edit Type
                2. Edit Brand
                3. Edit Price
                4. Edit Stock
                -> \s""");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case EditType -> {
                        print("Enter new Type: ");
                        newType = sc.nextLine();
                        MenClothes.get(position).setType(newType);
                    }
                    case EditBrand -> {
                        print("Enter new Brand: ");
                        newBrand = sc.nextLine();
                        MenClothes.get(position).setBrand(newBrand);
                    }
                    case EditPrice -> {
                        print("Enter new Price: ");
                        newPrice = sc.nextInt();
                        sc.nextLine();
                        MenClothes.get(position).setPrice(newPrice);
                    }
                    case EditStock -> {
                        print("Enter new Stock: ");
                        newStock = sc.nextInt();
                        sc.nextLine();
                        MenClothes.get(position).setStock(newStock);
                    }
                    default -> println("Invalid!");
                }

                println("\nUpdated Successfully!\n");
            }
            case Women -> {
                print("Enter the position of item you want to edit: ");
                position = sc.nextInt();
                sc.nextLine();
                position-=1;
                print("""
                1. Edit Type
                2. Edit Brand
                3. Edit Price
                4. Edit Stock
                -> \s""");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case EditType -> {
                        print("Enter new Type: ");
                        newType = sc.nextLine();
                        WomenClothes.get(position).setType(newType);
                    }
                    case EditBrand -> {
                        print("Enter new Brand: ");
                        newBrand = sc.nextLine();
                        WomenClothes.get(position).setBrand(newBrand);
                    }
                    case EditPrice -> {
                        print("Enter new Price: ");
                        newPrice = sc.nextInt();
                        sc.nextLine();
                        WomenClothes.get(position).setPrice(newPrice);
                    }
                    case EditStock -> {
                        print("Enter new Stock: ");
                        newStock = sc.nextInt();
                        sc.nextLine();
                        WomenClothes.get(position).setStock(newStock);
                    }
                    default -> println("Invalid!");
                }

                println("\nUpdated Successfully!\n");
            }
        }
    }
    void remove(){
        print("""
                1. View Men Clothes
                2. View Women Clothes
                -> \s""");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case Men -> {
                print("Enter the position of item you want to remove: ");
                position = sc.nextInt();
                sc.nextLine();
                position-=1;
                MenClothes.remove(position);
                println("\nRemoved Successfully!\n");
            }
            case Women -> {
                print("Enter the position of item you want to remove: ");
                position = sc.nextInt();
                sc.nextLine();
                position-=1;
                WomenClothes.remove(position);
                println("\nRemoved Successfully!\n");
            }
        }
    }
    void print(Object o){
        System.out.print(o);
    }
    void println(Object o){
        System.out.println(o);
    }

    // Initialize
    private final Scanner sc = new Scanner(System.in);
    ArrayList<Clothe> MenClothes = new ArrayList<>();
    ArrayList<Clothe> WomenClothes = new ArrayList<>();
    private final FileSystem FileSys = new FileSystem();
    private final int add = 1;
    private final int view = 2;
    private final int update = 3;
    private final int remove = 4;
    private final int save = 5;
    private final int exit = 0;
    private final int Men = 1;
    private final int Women = 2;
    private final int EditType = 1;
    private final int EditBrand = 2;
    private final int EditPrice = 3;
    private final int EditStock = 4;
    private int choice, price , stock, ctr = 1, position, newPrice, newStock;
    private String type, brand, newType, newBrand;
}
