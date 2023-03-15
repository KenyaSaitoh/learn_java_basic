public class Main_8_1 {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            Person.name = "Alice";
            Person.age = 25;
        }
        {
            System.out.println("***** snippet_2 *****");
            Person.name = "Alice";
            Person.age = 25;
            System.out.println("name => " + Person.name);
            System.out.println("age => " + Person.age);
        }
        {
            System.out.println("***** snippet_3 *****");
            long x = Math.round(3.6); // 4が返る
        }
    }
}