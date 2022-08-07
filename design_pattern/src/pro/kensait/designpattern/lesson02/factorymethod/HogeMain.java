package pro.kensait.designpattern.lesson02.factorymethod;

public class HogeMain {

    public static void main(String[] args) {
        System.out.println("[ HogeMain#main ] Start");

        // Fooインスタンスを生成する
        Foo foo = new Foo();

        // Fooのビジネスメソッドを呼び出す
        int result = foo.doBusiness(3);

        System.out.println("result => " + result);
        System.out.println("[ Main#main ] End");
    }
}