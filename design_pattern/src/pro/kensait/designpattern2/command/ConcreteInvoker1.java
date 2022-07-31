package pro.kensait.designpattern2.command;

public class ConcreteInvoker1 implements Invoker {

    private Command command;

    public ConcreteInvoker1(Command command) {
        this.command = command;
    }

    public void execute(Receiver receiver) {
        System.out.println("ConcreteInvoker1 : Command start");
        command.execute(receiver);
        System.out.println("ConcreteInvoker1 : Command end");
    }
}