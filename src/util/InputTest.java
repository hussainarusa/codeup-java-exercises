package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Enter a string: ");
        String str = input.getString();
        System.out.println("You entered: " + str);

        System.out.print("Enter yes or no: ");
        boolean yesOrNo = input.yesNo();
        System.out.println("You entered: " + (yesOrNo ? "Yes" : "No"));

        int min = 1;
        int max = 10;
        int numInRange = input.getInt(min, max);
        System.out.println("You entered: " + numInRange);

        int anyInt = input.getInt();
        System.out.println("You entered: " + anyInt);

        double minD = 0.5;
        double maxD = 5.5;
        double doubleInRange = input.getDouble(minD, maxD);
        System.out.println("You entered: " + doubleInRange);

        double anyDouble = input.getDouble();
        System.out.println("You entered: " + anyDouble);
    }
}

