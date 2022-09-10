package pro.kensait.java.object.clone1;

public class Main1 {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Alice", 25, "中央区1-1-1");
        Person copy = person.clone();
        person.setAddress("中央区2-2-2");
        System.out.println(copy.getAddress());
    }
}
