import java.util.Scanner;

public class Functions {

    private final static String ENTER = "\nEnter the number: ";

    public static void countTillNumber(int number) {
        for (int result = 1; result <= number; result++) {
            System.out.println(result + " ");
        }
    }

    public static void drawRectangle(int weight, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= weight; j++) {
                System.out.print("+");

            }
            System.out.print("\n");
        }
    }

    public static int getMax(int a, int b) {
        return a >= b ? a : b;
    }

    public static int getMax(int a, float b) {
        return b >= a ? (int)b : a;
    }


}
