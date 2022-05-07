public class Person {
    private String firstName;
    private String lastName;
    private int age;
    Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(getFirstName()).append(" ");
        sb.append(getLastName()).append(" ");
        sb.append(getAge()).append(" ");
        return sb.toString();
    }
}
