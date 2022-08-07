package pro.kensait.designpattern.lesson10.state.provider;

public interface State {
    public abstract boolean canDoAction(String actionName);
    public abstract State doAction(String actionName);
}
