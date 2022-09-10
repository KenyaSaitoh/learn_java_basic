package pro.kensait.java.object.clone2;

public class Main1 {
    public static void main(String[] args) throws Exception {
        Address address = new Address("103-0004", "中央区", "1-1-1");
        Person person = new Person("Alice", 25, address);
        Person copy = person.clone();
        person.getAddress().setAddressLine("2-2-2");
        System.out.println(copy.getAddress());
    }
}
