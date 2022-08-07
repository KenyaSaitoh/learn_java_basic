package pro.kensait.designpattern.lesson02.factorymethod;

public class Foo {

    // ビジネスメソッド
    public int doBusiness(int param) {
        System.out.println("[ Foo#doBusiness ] Start");

        // 呼び出し先をファクトリからBar型で取得する
        Bar bar = BarFactory.getInstance().getBar();

        // Barのビジネスメソッドを呼び出す
        int retVal = bar.doBusiness(param);

        // Barの結果を受けてビジネスロジックを実行する
        int result = retVal + retVal;

        System.out.println("[ Foo#doBusiness ] End");
        return result;
    }
}