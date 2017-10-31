import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = ArrayUtils.getRandomIntArray();
        System.out.println(Arrays.toString(array1));
        int[] array2 = ArrayUtils.getRandomIntArray(5);
        System.out.println(Arrays.toString(array2));
        //int[] array3 = ArrayUtils.getIntArrayFromConsole();
        //System.out.println(Arrays.toString(array3));
        System.out.println(ArrayUtils.returnMaxNumber(array1));
        System.out.println(ArrayUtils.returnMinNumber(array1));
        System.out.println(ArrayUtils.returnCountOfContainingANumber(array1, true));
        ArrayUtils.bubbleSort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(ArrayUtils.getMaxNumberAmount(array1));
    }
}
