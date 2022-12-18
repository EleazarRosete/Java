package Assets;
import java.util.Scanner;

public class Input {
    public Input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the phrase: ");
    String phrase = sc.nextLine();
    new Process(phrase);
    }
}
