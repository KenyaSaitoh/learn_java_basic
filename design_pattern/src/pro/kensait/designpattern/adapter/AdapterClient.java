package pro.kensait.designpattern.adapter;

public class AdapterClient {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        // 実際には、Target型の引数を期待している何らかのクラスのメソッドを呼び出すことが想定される
        System.out.println("AdapterClient : Task1 call");
        target.doTask1();
        System.out.println("AdapterClient : Task2 call");
        target.doTask2();
    }
}