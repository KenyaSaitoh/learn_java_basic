package pro.kensait.designpattern2.singleton;

public class SingletonClient {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("SingletonClient : Singleton1 Name = Foo");
        singleton1.setName("Foo");
        System.out.println("SingletonClient : Singleton2 Name = Bar");
        singleton2.setName("Bar");
        System.out.println("SingletonClient : Singleton1 Name = "
                + singleton1.getName());
    }
}