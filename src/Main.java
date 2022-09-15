import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Иванов Андрей", "начало древа", 12);
        Person secondPerson = new Person("Иванов Евгений", "отец", 34);
        Person thirdPerson = new Person("Васильева Алла", "мать", 30);
        Person fourthPerson = new Person("Васильев Егор", "дедушка", 56);

        firstPerson.appendToFamily(secondPerson);
        firstPerson.appendToFamily(thirdPerson);
        firstPerson.appendToFamily(fourthPerson);

        view(firstPerson);

    }

    static void view(Person rootPerson){
        System.out.print("Имя:" + rootPerson.fullName);
        System.out.print(". Статус: " + rootPerson.status);
        System.out.println(". Возраст: " + rootPerson.age + ".");
        for (Person person : rootPerson.getFamily()){
            if (person != null) {
                view(person);
            }
        }
    }
}
