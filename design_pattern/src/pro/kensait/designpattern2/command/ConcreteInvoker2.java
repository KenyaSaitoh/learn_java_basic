package pro.kensait.designpattern2.command;

public class ConcreteInvoker2 extends Thread implements Invoker {

    private Command command;
    private Receiver receiver;

    public void execute(Receiver receiver) {
        System.out.println("ConcreteInvoker2 : Command start");
        Thread thread = new ConcreteInvoker2(command, receiver);
        thread.start();
    }

    public ConcreteInvoker2(Command command) {
        this.command = command;
    }

    public ConcreteInvoker2(Command command, Receiver receiver) {
        this.command = command;
        this.receiver = receiver;
    }

    public void run() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        command.execute(receiver);
        System.out.println("ConcreteInvoker2 : Command end");
    }
}