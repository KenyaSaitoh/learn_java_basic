package pro.kensait.java.basic.lsn_13_1_4.clone;

public class Main {
    public static void main(String[] args) throws Exception {
        Address address = new Address("103-0004", "中央区", "1-1-1");
        Person person = new Person("Alice", 25, address);

        // Personインスタンスのディープコピーを生成
        Person copy = person.clone();

        // コピー元を書き換えても、コピー先には反映しない
        person.getAddress().setAddressLine("2-2-2");
        System.out.println(copy.getAddress());
    }
}
