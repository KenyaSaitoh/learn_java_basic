package pro.kensait.designpattern.lesson02.factorymethod;

public class BarFactory {

    public static BarFactory getInstance() {
        return new BarFactory();
    }

    public Bar getBar() {
        // BarBeanインスタンスを生成し、 Bar型で返す
        Bar bar = new BarBean();
        return bar;
    }
}