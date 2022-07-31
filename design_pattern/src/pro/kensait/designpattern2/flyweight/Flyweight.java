package pro.kensait.designpattern2.flyweight;

public class Flyweight {

    private String name;

    public Flyweight(String name) {
        this.name = name;
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
    }

    public String getName() {
        return name;
    }

    public void doTask() {
        System.out.println("Flyweight : Task done / name = " + name);
    }
}