public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Иванов Иван Иванович");
        Person secondPerson = new Person("Петров Петр Петрович");
        Person thirdPerson = new Person("Васильев Василий Васильевич");

        firstPerson.appendToFamily(secondPerson);
        firstPerson.appendToFamily(thirdPerson);

        view(firstPerson);
    }

    static void view(Person rootPerson){
        System.out.println(rootPerson.fullName);
        for(Person person : rootPerson.getFamily()){
            if (person != null) {
                view(person);
            }
        }
    }
}
