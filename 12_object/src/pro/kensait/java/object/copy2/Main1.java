package pro.kensait.java.object.copy2;

public class Main1 {
    public static void main(String[] args) {
        Address address = new Address("103-0004", "中央区", "1-1-1");
        Person person = new Person("Alice", 25, address);
        Person copy = new Person(person.getName(), person.getAge(), person.getAddress());
        person.getAddress().setAddressLine("2-2-2");
        System.out.println(copy.getAddress());
    }
}
