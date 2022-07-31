package pro.kensait.designpattern2.composite;

public class Composite implements Component {

    private String name;
    private Component component = null; // 親

    public Composite(String name) {
        this.name = name;
    }

    public void addComposite(Component component) {
        this.component = component;
    }

    public void viewNames() {
        System.out.println("Composite : " + name);
        if (component != null) {  
            component.viewNames();
        }
    }
}