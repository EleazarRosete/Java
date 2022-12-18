package Assets;
import java.util.Arrays;
public class Process {
    Process(String phrase) {
        String[] words = phrase.split(" ");
        int size = words.length;
        char[] Acronym = new char[size];
        int index = 0;
        for (String word : words) {
            Acronym[index] = word.charAt(0);
            index++;
        }
        System.out.println("\n- Phrase: " + phrase);
        System.out.print("- Acronym: ");
        for(char acronym : Acronym){
            System.out.print(Character.toUpperCase(acronym));
        }
        System.out.println();
    }
}
