package pro.kensait.designpattern2.flyweight;

public class FlyweightClient {

    public static void main(String[] args) {
        FlyweightFactory factory = FlyweightFactory.getInstance();
        System.out.println("=====");
        //
        Flyweight flyweight1 = factory.getFlyweight("Foo");
        flyweight1.doTask();
        System.out.println("=====");
        //
        Flyweight flyweight2 = factory.getFlyweight("Bar");
        flyweight2.doTask();
        System.out.println("=====");
        //
        Flyweight flyweight3 = factory.getFlyweight("Baz");
        flyweight3.doTask();
        System.out.println("=====");
        //
        Flyweight flyweight4 = factory.getFlyweight("Foo");
        flyweight4.doTask();
    }
}