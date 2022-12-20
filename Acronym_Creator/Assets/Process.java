package Assets;

public class Process {
    Process(String phrase) {
        String[] words = phrase.split(" ");
        String acronym = "";
        for (String word : words) {
            acronym = acronym + Character.toUpperCase(word.charAt(0));
        }
        System.out.println("\n- Phrase: " + phrase);
        System.out.print("- Acronym: " + acronym);
        System.out.println();
    }
}
