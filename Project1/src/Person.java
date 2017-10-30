
public class Person {
    private String name;
    private String city;
    private int age;
    private String hobbie;
    private PersonOutputFormat outputFormat = PersonOutputFormat.UNIVERSAL;

    public Person(String name, String city, int age, String hobbie) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.hobbie = hobbie;
    }

    public PersonOutputFormat getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(PersonOutputFormat outputFormat) {
        this.outputFormat = outputFormat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    @Override
    public String toString() {
        String result = "";
        switch (outputFormat){
            case TABLE:
            {
                result = getTableOutput();
                break;
            }
            case TEXT:
            {
                result = getTextOutput();
                break;
            }
            case UNIVERSAL:
            {
                result = getUniversalOutput();
                break;
            }
        }

        return result;
    }

    private String getTableOutput() {
        return  "Name: \t" + name +
                "\nCity: \t" + city +
                "\nAge: \t" + age +
                "\nHobbie: \t" + hobbie;
    }

    private String getTextOutput() {
        return  "The person whoes name is :" + name +
                "lives in the city: " + city +
                "\nHe is " + age + " years old" +
                "and his hobbie is " + hobbie;
    }

    private String getUniversalOutput() {
        return  name + "-name\n" +
                city + "-city\n" +
                age + "-age\n" +
                hobbie + "-hobbie\n";
    }

}
