package pro.kensait.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> pool = new HashMap<String, Flyweight>();
    private static FlyweightFactory singleton = null;

    private FlyweightFactory() {
        System.out.println("FlyweightFactory : Singleton created");
    }

    public static synchronized FlyweightFactory getInstance() {
        if (singleton == null) {
            singleton = new FlyweightFactory();
        }
        return singleton;
    }

    public synchronized Flyweight getFlyweight(String name) {
        System.out.println("FlyweightFactory : Flyweight(" + name
                + ") start Getting");
        Flyweight flyweight = (Flyweight)pool.get(name);
        if (flyweight == null) {
            flyweight = new Flyweight(name);
            pool.put(name, flyweight);
            System.out.println("FlyweightFactory : Flyweight(" + name
                    + ") Stock to Pool");
        }
        System.out.println("FlyweightFactory : Flyweight(" + name + ") return");
        return flyweight;
    }
}