import java.util.Scanner;
public class ATM{
    Scanner input = new Scanner(System.in);
    boolean ifOn = true;
    int option, myBalance = 0;

    void option() {
        while (ifOn) {
            System.out.println("\nATM System\n" +
                    "My Balance: " + myBalance + '.');
            System.out.print("""
                    1.Deposit
                    2.Withdraw
                    0.Exit
                    Enter here:\s""");
            option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                deposit();
            }
            else if (option == 2) {
                withdraw();
            }
            else if (option == 0) {
                System.out.println("Thank You!");
                ifOn = false;
            }
            else {
                System.out.println("\nInvalid!\n");
            }
        }
    }
    void deposit(){
        int toAdd;
        System.out.print("How much will you deposit? ");
        toAdd = input.nextInt();
        input.nextLine();
        if (toAdd <= 0){
            System.out.println("Please enter an appropriate value!");
        }
        else {
            System.out.println("Thank you!");
            myBalance += toAdd;
        }
    }
    void withdraw(){
        int toGet;
        System.out.print("How much will you withdraw? ");
        toGet = input.nextInt();
        input.nextLine();
        if (toGet > myBalance){
            System.out.println("Insufficient money!");
        }
        else if(toGet <= 0){
            System.out.println("Please enter an appropriate value!");
        }
        else {
            System.out.println("Thank you!");
            myBalance -= toGet;
        }
    }
}
