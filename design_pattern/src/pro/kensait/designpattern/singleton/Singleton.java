package pro.kensait.designpattern.singleton;

public class Singleton {

    private String name;
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("Singleton : Singleton created");
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Singleton : Name = " + name);
    }

    public String getName() {
        return name;
    }
}
