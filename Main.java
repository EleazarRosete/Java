import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("This program is a numeric storage value that lets you execute actions you want to do");
        int rep = 1;

        while(rep != 0){
            System.out.println("Please select the action you want to execute:");
            System.out.println("1. Add Data");
            System.out.println("2. Show Stored Data");
            System.out.println("3. Delete Stored Data");
            System.out.println("4. Select and Change Data");
            System.out.println("5. Print Minimum Data");
            System.out.println("6. Print Maximum Data");
            System.out.println("7. Print Average of all Data");
            System.out.println("8. Print Total of all Data");
            System.out.println("9. Clear Data");
            System.out.println("0. Exit");
            System.out.print("-> ");
            int execute = scan.nextInt();
            scan.nextLine();

            switch (execute) {
                case 1 -> {
                    if (data.size() != 25){
                        AddData();
                    }
                    else {
                        System.out.println("\nMaxed Sized!\n");
                    }
                }
                case 2 -> ShowData();
                case 3 -> DeleteData();
                case 4 -> ChangeData();
                case 5 -> MinData();
                case 6 -> MaxData();
                case 7 -> AvgOfData();
                case 8 -> TotalOfData();
                case 9 -> ClearData();
                case 0 -> rep = 0;
                default -> System.out.println("Invalid Input");
            }
        }
    }
    public static void AddData(){
        Scanner scan = new Scanner (System.in);
        int size = 26;
        while (size > 25)
        {
            System.out.print("Enter Size of the Data: ");
            size = scan.nextInt();
        }
        for(int i = 0; i<size; i++) {
            System.out.print("Enter the Values: ");
            int value = scan.nextInt();
            data.add(value);
        }
        System.out.println("\nValues Added Successfully!\n");
    }
    static void ShowData(){
        int ctr = 1;
        for(Integer d: data){
            System.out.print(ctr++ + ") ");
            System.out.println(d);
        }
        ctr = 1;
        System.out.println();
    }
    public static void DeleteData(){
        ShowData();
        System.out.print("Enter the position of the data you want to delete: ");
        int position = scan.nextInt();
        position-=1;
        data.remove(position);
        System.out.println("\nDeleted Successfully!\n");
    }
    public static void ChangeData(){
        ShowData();
        System.out.print("Enter the position of the data you want to change: ");
        int position = scan.nextInt();
        position-=1;
        System.out.print("Enter a new data: ");
        int NewData = scan.nextInt();
        data.set(position, NewData);
        System.out.println("\nChanged Successfully!\n");
    }
    public static void MinData(){
        Collections.sort(data);
        System.out.println("\nMinimum data is : " + data.get(0) + "\n");
    }
    public static void MaxData(){
        Collections.sort(data);
        int pos = data.size();
        System.out.println("\nMaximum data is : " + data.get(pos-=1) + "\n");
    }
    public static void AvgOfData(){
        int sum = 0;
        int result;
        for(Integer d: data){
            sum+=d;
        }
        result = sum/data.size();
        System.out.println("\nAverage of all the data: " + result + "\n");
    }
    public static void TotalOfData(){
        int sum = 0;
        for(Integer d: data){
            sum+=d;
        }
        System.out.println("\nTotal of all the data: " + sum + "\n");
    }
    public static void ClearData(){
        data.clear();
        System.out.println("\nCleared All Data\n");
    }

    static ArrayList<Integer> data = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
}