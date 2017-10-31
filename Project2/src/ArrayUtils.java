import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {

    private final static int BOUND_OF_RANDOM_ARRAY = 10;
    private final static int BOUND_OF_MAX_VALUE_OF_ARRAY_ELEMENT = 10;
    private final static int NUMBER_TO_FIND_IN_ARRAY = 5;

    private final static String ENTER_ARRAY_SIZE_MESSAGE = "Enter a size of an array:";
    private final static String ENTER_ELEMENT_MESSAGE = "Enter element:";
    private final static String ENTER_NUMBER_TO_FIND_AMOUNT_IN_ARRAY_MESSAGE = "Enter the number you want" +
            " to know how much does array consist:";

    public static int[] getRandomIntArray() {
        return getRandomArray(BOUND_OF_RANDOM_ARRAY);
    }

    public static int[] getRandomIntArray(int arraySize) {
        return getRandomArray(arraySize);
    }

    private static int[] getRandomArray(int arraySize) {
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(BOUND_OF_MAX_VALUE_OF_ARRAY_ELEMENT) + 1;
        }
        return array;
    }

    public static int[] getIntArrayFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println(ENTER_ARRAY_SIZE_MESSAGE);
        int arraySize = sc.nextInt();
        sc.nextLine();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println(ENTER_ELEMENT_MESSAGE + (i + 1));
            array[i] = sc.nextInt();
            sc.nextLine();
        }
        return array;
    }

    public static int returnMinNumber(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public static int returnMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (maxNumber < array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public static int returnCountOfContainingANumber(int[] array, boolean isNumberFromConsole) {
        if (isNumberFromConsole) {
            Scanner sc = new Scanner(System.in);
            System.out.println(ENTER_NUMBER_TO_FIND_AMOUNT_IN_ARRAY_MESSAGE);
            return returnCountOfExactNumber(array, sc.nextInt());
        }
        return returnCountOfExactNumber(array, NUMBER_TO_FIND_IN_ARRAY);
    }

    private static int returnCountOfExactNumber(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        return count;
    }

    public static void bubbleSort(int[] array) {
        int border = array.length;
        int temp;
        while (border != 2) {
            for (int i = 0; i < border - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            border--;
        }
    }

    public static int getMaxNumberAmount(int[] array) {
        int maxCopies = 0;
        for (int k = 0; k < array.length; k++) {
            int counter = 0;
            for (int j = k; j < array.length; j++) {
                if (array[k] == array[j]) {
                    counter++;
                }
                maxCopies = maxCopies < counter ? counter : maxCopies;
            }
        }
        return maxCopies;
    }
}





