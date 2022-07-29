package pro.kensait.designpattern.proxy;

public class ProxyClient {

    public static void main(String[] args) {

        Subject subject = new Proxy();
        subject.doTask1();
        subject.doTask2();
        subject.doTask3();
    }
}