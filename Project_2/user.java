public class user extends info{
    private String username;
    private int pinPassword;

    user(){
        super();
    }

    user(String Firstname, String Lastname, String Address, int age, int birthday, String birthMonth, int birthYear,
         String username, int pinPassword){
        super(Firstname, Lastname, Address, age, birthday, birthMonth, birthYear);
        this.username = username;
        this.pinPassword = pinPassword;
        System.out.println("Account Created!");
    }

    void showInfo(){
        super.showInfo();
        System.out.println("Username: " + username);
        System.out.println("Pin Pass: " + pinPassword);
    }
    public String getUsername(){
        return username;
    }

    public int getPinPassword(){
        return pinPassword;
    }
}
