package pro.kensait.designpattern.lesson02.factorymethod;

public class MockBar implements Bar {

    // ビジネスメソッド
    public int doBusiness(int param) {
        System.out.println("[ MockBar#doBusiness ] Start");

        // Fooクラスが単体テストをしやすくなるように実装する
        // ここでは、常に10を返却する
        int result = 10;

        System.out.println("[ MockBar#doBusiness ] End");
        return result;
    }
}