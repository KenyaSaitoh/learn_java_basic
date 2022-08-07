package pro.kensait.designpattern2.composite;

public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    public void viewNames() {
        System.out.println("Leaf : " + name);
    }
}