package pro.kensait.designpattern.lesson02.factorymethod;

public class BarBean implements Bar {

    // ビジネスメソッド
    public int doBusiness(int param) {
        System.out.println("[ BarImpl#doBusiness ] Start");

        int result = param * param; // 引数を2乗して返す

        System.out.println("result => " + result);
        System.out.println("[ BarImpl#doBusiness ] End");

        return result;
    }
}