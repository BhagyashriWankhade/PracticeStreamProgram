import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaCompExp {

    public static void main(String[] args) {
        List<Person> personList = createList();

        Collections.sort(personList, (Person a, Person b) ->
                a.getFirstName().compareTo(b.getFirstName()));


        System.out.println("Sorted list with lambda implementation");
        // Using the new ForEach loop of Java 8
        // used with lambda expression
        personList.forEach((per) -> System.out.print(per.getFirstName() + " "));

    }

    private static List<Person> createList(){
        List<Person> tempList = new ArrayList<Person>();
        Person person = new Person("Ram","Tiwari", 50);
        tempList.add(person);
        person = new Person("John", "Myers", 13);
        tempList.add(person);
        person = new Person("Tanuja", "Trivedi", 30);
        tempList.add(person);
        person = new Person("Amy", "Jackson", 40);
        tempList.add(person);
        System.out.println("List elements are - ");
        System.out.println(tempList);
        return tempList;
    }
}
