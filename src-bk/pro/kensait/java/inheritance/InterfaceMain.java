package pro.kensait.java.inheritance;

public class InterfaceMain {

    public static void main(String[] args) {
        MessageShower target = new MessageShowerImpl();
        target.showMessage();
    }
}

/* ======================================== */
interface MessageShower {

    String message = "Foo";

    void showMessage();
}

/* ======================================== */
class MessageShowerImpl implements MessageShower {

    public void showMessage() {
        System.out.println("Message from MessageShowerImpl ---> " + message);
    }
}