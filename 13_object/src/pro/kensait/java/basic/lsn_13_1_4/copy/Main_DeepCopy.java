package pro.kensait.java.basic.lsn_13_1_4.copy;

public class Main_DeepCopy {
    public static void main(String[] args) {
        Address a1 = new Address("103-0004", "中央区", "1-1-1");
        Person person = new Person("Alice", 25, a1);
        Address a2 = new Address(a1.getZipCode(),
                a1.getCity(),
                a1.getAddressLine()); //【1】
        Person copy = new Person(person.getName(), person.getAge(), a2); //【2】
        person.getAddress().setAddressLine("2-2-2");
        System.out.println(copy.getAddress());
    }
}