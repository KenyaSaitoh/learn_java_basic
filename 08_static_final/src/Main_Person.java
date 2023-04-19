public class Main_Person {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            Person.name = "Alice";
            Person.age = 25;
            System.out.println("=> end");
        }
        {
            System.out.println("***** snippet_2 *****");
            Person.name = "Alice";
            Person.age = 25;
            System.out.println("name => " + Person.name);
            System.out.println("age => " + Person.age);
            System.out.println("=> end");
        }
    }
}