import java.util.Scanner;

public class Main {

    static final String CREATING_THE_PERSON = "Creating the person";

    static final String PUT_THE_NAME_OF_PERSON = "Put the name of the person:";
    static final String PUT_THE_NAME_OF_CITY = "Put the name of the city:";
    static final String PUT_THE_AGE_OF_PERSON = "Put the age:";
    static final String PUT_THE_HOBBIE_OF_PERSON = "Put the hobbie:";
    static final String ERROR_MESSAGE = "ERROR! PUT THE NUMBER!";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(CREATING_THE_PERSON);

        System.out.println(PUT_THE_NAME_OF_PERSON);
        String name = sc.nextLine();

        System.out.println(PUT_THE_NAME_OF_CITY);
        String city = sc.nextLine();

        int age;
        while (true) {
            try {
                System.out.println(PUT_THE_AGE_OF_PERSON);
                age = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println(ERROR_MESSAGE);
                sc.nextLine();
            }
        }

        System.out.println(PUT_THE_HOBBIE_OF_PERSON);
        String hobbie = sc.nextLine();

        Person pr = new Person(name, city, age, hobbie);

        Menu.workWithMenu(pr);

    }
}
