package pro.kensait.java.basic.lsn_21_2_2;

public class Main1 {
    public static void main(String[] args) {
        PersonDBSearcher pds = new PersonDBSearcher();
        Person person1 = pds.find1("Alice");
        person1.getName();
        Person person2 = pds.find1("Dave");
        person2.getName();
    }
}