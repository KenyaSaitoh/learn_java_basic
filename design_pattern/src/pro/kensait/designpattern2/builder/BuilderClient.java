package pro.kensait.designpattern2.builder;

public class BuilderClient {

    public static void main(String[] args) {
        // ConcreteBuilder1
        Builder builder1 = new ConcreteBuilder1();
        Director director1 = new Director(builder1);
        director1.construct();
        // ConcreteBuilder2
        Builder builder2 = new ConcreteBuilder2();
        Director director2 = new Director(builder2);
        director2.construct();
    }
}
