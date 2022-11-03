public abstract class info {
    private  String Firstname, Lastname, Address, birthMonth;
    private int age, birthday, birthYear;

    info(){

    }
    info(String Firstname, String Lastname, String Address,int age, int birthday, String birthMonth, int birthYear){
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.Address = Address;
        this.age = age;
        this.birthday = birthday;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }
    void showInfo(){
        System.out.println("\nPersonal Information");
        System.out.println("Name    : " + Firstname + " " + Lastname);
        System.out.println("Age     : " + age + "yrs old");
        System.out.println("Address : " + Address);
        System.out.println("Birthday: " + birthMonth + " " + birthday + "," + birthYear);
    }
}
