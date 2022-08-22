public class Code7_2_4 {
    public static void main(String[] args) {
        Person3 p = new Person3("Alice");
        p.withAge(25).withNationality("JAPAN");
        System.out.println(p);
        
        Person3 p1 = (new Person3("Alice")).withAge(25).withNationality("JAPAN");
        System.out.println(p1);
    }
}