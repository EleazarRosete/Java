import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option, size = 0, cnt = 0, age, birthday, birthYear, pinPassword;
        String Firstname, Lastname, Address, birthMonth, username;
        boolean isOn = true;

        user[] users = new user[10];

        while (isOn) {

            System.out.println("\nATM System\n");
            System.out.print("""
                    1.Sign in
                    2.Register
                    0.Exit
                    Enter here:\s""");
            option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                if (users[0] != null) {
                    System.out.print("\nEnter your username    : ");
                    username = input.nextLine();
                    System.out.print("Enter your pin password: ");
                    pinPassword = input.nextInt();
                    input.nextLine();
                    for (int x = 0; x < size; x++) {
                        if (users[x].getUsername().equals(username) && users[x].getPinPassword() == pinPassword) {
                            ATM todo = new ATM();
                            users[x].showInfo();
                            todo.option();
                        } else {
                            System.out.println("""
                                    
                                    Account does not exist!
                                    You might entered wrong pin password or username.""");
                        }
                    }
                }
                else {
                    System.out.println("\nNo Registered Account Yet!");
                }
            } else if (option == 2) {

                System.out.println("\nRegister Here!");
                System.out.print("Enter your First name : ");
                Firstname = input.nextLine();
                System.out.print("Enter your Last name  : ");
                Lastname = input.nextLine();
                System.out.print("Enter your Age        : ");
                age = input.nextInt();
                input.nextLine();
                System.out.print("Enter your Address    : ");
                Address = input.nextLine();
                System.out.print("Enter your Birt day   : ");
                birthday = input.nextInt();
                input.nextLine();
                System.out.print("Enter your Birth month: ");
                birthMonth = input.nextLine();
                System.out.print("Enter your Birt year  : ");
                birthYear = input.nextInt();
                input.nextLine();
                System.out.println("\nPersonal Info Saved!\n");
                System.out.print("Set your username      : ");
                String newUsername = input.nextLine();
                System.out.print("Enter your Pin password: ");
                int newPassword = input.nextInt();
                input.nextLine();

                users[cnt] = new user(Firstname, Lastname,Address, age, birthday, birthMonth, birthYear,newUsername,newPassword);
                cnt += 1;
                size += 1;
            } else if (option == 0) {
                System.out.println("\nThank you!");
                isOn = false;
            } else {
                System.out.println("Invalid!\n");
            }
        }
    }
}