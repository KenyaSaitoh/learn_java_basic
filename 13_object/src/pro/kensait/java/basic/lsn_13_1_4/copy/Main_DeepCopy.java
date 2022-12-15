package pro.kensait.java.basic.lsn_13_1_4.copy;

public class Main_DeepCopy {
    public static void main(String[] args) {
        Address a1 = new Address("103-0004", "中央区", "1-1-1");
        Person p1 = new Person("Alice", 25, a1);
        Address a2 = new Address(a1.getZipCode(),
                a1.getCity(),
                a1.getAddressLine());
        Person p2 = new Person(p1.getName(), p1.getAge(), a2);
        p1.getAddress().setAddressLine("2-2-2");
        System.out.println(p2.getAddress());
    }
}