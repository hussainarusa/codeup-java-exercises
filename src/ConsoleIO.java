
import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f.%n", pi);



        System.out.println("Please enter an integer");
        int userInt = scanner.nextInt();
        System.out.println(userInt);
//         We get a runtime error for an input mismatch exception



        System.out.println("Enter three words");
        String userWordOne = scanner.next();
        String userWordTwo = scanner.next();
        String userWordThree = scanner.next();
        System.out.println(userWordOne);
        System.out.println(userWordTwo);
        System.out.println(userWordThree);
//         The program does NOT move on until it gets 3 valid tokens to save
//         It ignores the last token entered if you enter 4



//        System.out.println("Please enter a sentence");
//        String userSentence = scanner.next();
//        System.out.println(userSentence);
//         No, the next() method only captures until the first whitespace by default



        System.out.println("Please enter a sentence");
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);



        System.out.println("Enter length:");
        String userLengthInput = scanner.nextLine();
        int length = Integer.parseInt(userLengthInput);
        System.out.println(length);
        System.out.println("Enter width:");
        String userWidthInput = scanner.nextLine();
        int width = Integer.parseInt(userWidthInput);
        System.out.println(width);

        int area = length * width;
        int perimeter = (length * 2) + (width * 2);


        System.out.printf("The area is %d and the perimeter is %d%n", area, perimeter);

        }





    }

