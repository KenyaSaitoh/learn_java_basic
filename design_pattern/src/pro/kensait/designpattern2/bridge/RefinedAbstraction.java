package pro.kensait.designpattern2.bridge;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void doTask5() {
        System.out.println("RefinedAbstraction : Addtional Task 5 done");
    }
}