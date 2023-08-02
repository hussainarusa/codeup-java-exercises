
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Talk to Bob! Say something to him: ");
        String userInput = scanner.nextLine();

        if (userInput.trim().isEmpty()) {
            // If the input is empty or contains only whitespace characters
            System.out.println("Fine. Be that way!");
        } else if (userInput.endsWith("?")) {
            // If the input ends with a question mark
            System.out.println("Bob answers: 'Sure.'");
        } else if (userInput.endsWith("!")) {
            // If the input ends with an exclamation mark
            System.out.println("Bob answers: 'Whoa, chill out!'");
        } else {
            // If none of the above conditions match
            System.out.println("Bob answers: 'Whatever.'");
        }
    }
}
