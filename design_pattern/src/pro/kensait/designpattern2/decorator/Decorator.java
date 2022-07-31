package pro.kensait.designpattern2.decorator;

public abstract class Decorator extends Component {

    protected Component component;

    protected Decorator() {
    }

    public Decorator(Component component) {
        this.component = component;
    }
}