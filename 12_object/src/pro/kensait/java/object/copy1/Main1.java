package pro.kensait.java.object.copy1;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25, "中央区1-1-1");
        Person copy = new Person(person.getName(), person.getAge(), person.getAddress());
        person.setAddress("中央区2-2-2");
        System.out.println(copy.getAddress());
    }
}
