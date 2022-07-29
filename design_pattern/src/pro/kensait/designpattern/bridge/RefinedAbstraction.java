package pro.kensait.designpattern.bridge;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void doTask5() {
        System.out.println("RefinedAbstraction : Addtional Task 5 done");
    }
}