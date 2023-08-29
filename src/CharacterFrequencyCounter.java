import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        String inputString = "Hello , I Love BCS!!!!";
        countWordFrequency(inputString);
    }

    public static void countWordFrequency(String inputString) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            // Convert the character to lowercase for case-insensitive counting
            char lowerCaseChar = Character.toLowerCase(c);

            // Check if the character is a letter or a space
            if (Character.isLetter(lowerCaseChar) || Character.isSpaceChar(lowerCaseChar)) {
                charFrequency.put(lowerCaseChar, charFrequency.getOrDefault(lowerCaseChar, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            char character = entry.getKey();
            int frequency = entry.getValue();

            if (Character.isSpaceChar(character)) {
                System.out.println("space - " + frequency);
            } else if (Character.isLetter(character)) {
                System.out.println(character + " - " + frequency);
            }
        }
    }
}
