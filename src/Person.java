import java.util.ArrayList;

public class Person {
    public String fullName;
    public String status;
    public int age;
    private ArrayList<Person> family = new ArrayList<>();

    public Person(String fullName, String status, int age) {
        this.fullName = fullName;
        this.status = status;
        this.age = age;
    }

    public void appendToFamily(Person person){
        if (person != null && person != this) {
            family.add(person);
        }
    }

    public ArrayList<Person> getFamily() {
        return family;
    }

    public String getStatus() {
        return status;
    }

    public int getAge() {
        return age;
    }

}
