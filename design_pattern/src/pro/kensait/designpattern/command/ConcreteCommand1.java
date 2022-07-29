package pro.kensait.designpattern.command;

public class ConcreteCommand1 implements Command {

    public void execute(Receiver receiver) {
        ConcreteReceiver request = (ConcreteReceiver)receiver;
        System.out.println("ConcreteCommand1 : Param1 = " + request.getParam1());
        System.out.println("ConcreteCommand1 : Param2 = " + request.getParam2());
    }
}