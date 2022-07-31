package pro.kensait.designpattern2.composite;

public class CompositeClient {

    public static void main(String[] args) {

        //
        Composite composite1 = new Composite("Composite1(Root)");
        Composite composite2 = new Composite("Composite2");
        Composite composite3 = new Composite("Composite3");
        composite1.addComposite(composite1);
        composite1.addComposite(composite2);
        composite2.addComposite(composite3);
        Leaf leaf = new Leaf("Leaf");
        composite3.addComposite(leaf);

        //
        view(composite1);
    }

    public static void view(Component component) {
        component.viewNames();
    }
}