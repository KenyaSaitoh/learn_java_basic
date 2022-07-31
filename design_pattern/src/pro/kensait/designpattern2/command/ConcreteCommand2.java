package pro.kensait.designpattern2.command;

public class ConcreteCommand2 implements Command {

    public void execute(Receiver receiver) {
        ConcreteReceiver request = (ConcreteReceiver)receiver;
        System.out
                .println("ConcreteCommand2 : Param1 = " + request.getParam1());
        System.out
                .println("ConcreteCommand2 : Param2 = " + request.getParam2());
    }
}