package pro.kensait.designpattern2.command;

public class CommandClient {

    public static void main(String[] args) {

        // 
        ConcreteReceiver request = (ConcreteReceiver)new ConcreteReceiver();
        request.setParam1("Foo");
        request.setParam2("Bar");

        //
        Command command1 = new ConcreteCommand1();
        Command command2 = new ConcreteCommand2();

        //
        Invoker invoker1 = new ConcreteInvoker1(command1);
        Invoker invoker2 = new ConcreteInvoker2(command2);

        //
        System.out.println("===== Invoker1 start =====");
        invoker1.execute(request);
        System.out.println("===== Invoker1 end =====");
        System.out.println("");
        System.out.println("===== Invoker2 start =====");
        invoker2.execute(request);
        System.out.println("===== Invoker2 end =====");
    }
}