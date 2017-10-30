import com.sun.org.apache.bcel.internal.generic.TABLESWITCH;

import java.util.Scanner;

public class Menu {

    static final String ERROR_MESSAGE = "ERROR!";

    static final String OUTPUT_MENU = "Choose the output style: \n" +
                                      "1. Table \n" +
                                      "2. Text \n" +
                                      "3. Universal \n";

    static private void printMenu() {
        System.out.println(OUTPUT_MENU);
    }

    static public void workWithMenu(Person person) {

        Scanner sc = new Scanner(System.in);

        while(true) {
           printMenu();
            try {
                PersonOutputFormat choice = PersonOutputFormat.values()[sc.nextInt() - 1];
                person.setOutputFormat(choice);
                System.out.println(person.toString());
                sc.nextLine();
                break;
           }
           catch (Exception e) {
               System.out.println(ERROR_MESSAGE);
               sc.nextLine();
           }
        }
    }

}
