import java.util.Arrays;
import java.util.Scanner;


public class Menu {

    enum MainMenuMessages {
        COUNT("1. Count till number") ,
        DRAW_REC("\n2. Draw rectangle"),
        DRAW_SQUARE("\n3. Draw Square"),
        GET_MAX("\n4. Get max");

        MainMenuMessages(String str) {
            this.message = str;
        }
        private String message;

        public String getMessage() {
            return message;
        }
    }

    private final static String CHOOSE_THE_ANSWER_MESSAGE= "\nChoose the answer: ";
    private final static String WANT_TO_FINISH_MESSAGE = "\nDo you want to finish: ";
    private final static String ENTER_COUNT_NUMBER = "\nEnter the number till what I should count: ";
    private final static String ENTER_WEIGHT = "\nEnter a weight of rectangle: ";
    private final static String ENTER_HEIGHT = "\nEnter a height of rectangle: ";
    private final static String ENTER_SQUARE_SIZE = "\nEnter a size of square: ";
    private final static String ENTER_FIRST_NUMBER = "\nEnter first number: ";
    private final static String ENTER_SECOND_NUMBER = "\nEnter second number: ";


    private final static String[] BACKGROUND_MENU_MESSAGE = {"1. Ordinary algorithm",
                                                          "\n2. Recursion algorithm"};

    private final static String[] WANT_TO_FINISH = {"1. Yes",
                                                 "\n2. No"};

    public static void workWithMenu() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            printMenu();
            System.out.println(CHOOSE_THE_ANSWER_MESSAGE);
            MainMenuMessages choice = MainMenuMessages.values()[sc.nextInt() - 1];
            sc.nextLine();
            switch (choice) {
                case COUNT: {
                    int number = oneEnteringFromConsole(ENTER_COUNT_NUMBER);
                    Functions.countTillNumber(number);
                    break;
                }
                case DRAW_REC: {
                    int weight = oneEnteringFromConsole(ENTER_WEIGHT);
                    int height = oneEnteringFromConsole(ENTER_HEIGHT);
                    Functions.drawRectangle(weight, height);
                    break;
                }
                case DRAW_SQUARE: {
                    int size = oneEnteringFromConsole(ENTER_SQUARE_SIZE);
                    Functions.drawRectangle(size, size);
                    break;
                }
                case GET_MAX: {
                    int a = oneEnteringFromConsole(ENTER_FIRST_NUMBER);
                    int b = oneEnteringFromConsole(ENTER_SECOND_NUMBER);
                    System.out.println(Functions.getMax(a,b));
                    break;
                }
            }

            System.out.println(Arrays.toString(WANT_TO_FINISH));
            int exit = oneEnteringFromConsole(WANT_TO_FINISH_MESSAGE);
            if (exit == 1) {
                break;
            }
        }

    }

    private static void printMenu() {
        MainMenuMessages[] menu = MainMenuMessages.values();
        for(MainMenuMessages m: menu) {
            System.out.println(m.getMessage());
        }
    }

    private static int oneEnteringFromConsole(String result) {
        Scanner sc = new Scanner(System.in);
        System.out.println(result);
        int x = sc.nextInt();
        sc.nextLine();
        return x;
    }
}

