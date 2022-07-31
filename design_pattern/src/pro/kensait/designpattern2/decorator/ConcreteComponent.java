package pro.kensait.designpattern2.decorator;

public class ConcreteComponent extends Component {

    private String name;

    public ConcreteComponent(String name) {
        this.name = name;
    }

    public void showMessage() {
        System.out.println(name);
    }
}