package FileHandling;

import Stocks.Clothe;
import Stocks.MenClothe;
import Stocks.WomenClothe;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileSystem {
    public void CreateFileMen(){
        try{
            MenFile = new File("ThriftShop/src/FileHandling/ThriftShopMen.data");
            if(!MenFile.exists()){
                MenFile.createNewFile();
            }
        }catch(Exception e){
            System.out.println("\nAn Error Occurred!\n");
        }
    }
    public void CreateFileWomen(){
        try{
            WomenFile = new File("ThriftShop/src/FileHandling/ThriftShopWomen.data");
            if(!WomenFile.exists()){
                WomenFile.createNewFile();
            }
        }catch(Exception e){
            System.out.println("\nAn Error Occurred!\n");
        }
    }
    public void WriteFileMen(ArrayList<Clothe> MenClothes){
        try{
            FileWriter writer = new FileWriter(MenFile);
            for (Clothe clothes : MenClothes){
                writer.write(clothes.Serializer());
            }
            writer.close();
        }catch(Exception e){System.out.println("\nAn Error Occurred!\n");}
    }
    public void WriteFileWomen(ArrayList<Clothe> WomenClothes){
        try{
            FileWriter writer = new FileWriter(WomenFile);
            for (Clothe clothes : WomenClothes){
                writer.write(clothes.Serializer());
            }
            writer.close();
        }catch(Exception e){System.out.println("\nAn Error Occurred!\n");}
    }
    public ArrayList<Clothe> ReadFileMen(){
        ArrayList<Clothe> clothes = new ArrayList<>();
        try {
            Scanner sc = new Scanner(MenFile);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                Clothe clothe = MenClothe.MenDeserialize(data.trim());
                clothes.add(clothe);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("\nAn Error Occurred!\n");
        }
        return clothes;
    }
    public ArrayList<Clothe> ReadFileWomen(){
        ArrayList<Clothe> clothes = new ArrayList<>();
        try {
            Scanner sc = new Scanner(WomenFile);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                Clothe clothe = WomenClothe.WomenDeserialize(data.trim());
                clothes.add(clothe);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("\nAn Error Occurred!\n");
        }
        return clothes;
    }
    File MenFile;
    File WomenFile;
}