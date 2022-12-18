import Assets.Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\"Acronym Creator\"\n");
        new Input();

        while (true){
            try {
                System.out.print("\nCreate Again?\n1.[Yes] 2.[No]\n-> ");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 2){
                    System.exit(0);
                }
                else if (choice == 1){
                    System.out.println();
                    new Input();
                }
                else {
                    System.out.println("\n\"Invalid Input\"");
                }
            }
            catch (Exception e){
                System.out.println("\n\"Oops! Something Went Wrong!\"");
                System.exit(0);
            }
        }

    }
}