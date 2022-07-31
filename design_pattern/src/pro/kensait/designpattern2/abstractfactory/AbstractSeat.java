package pro.kensait.designpattern2.abstractfactory;

public abstract class AbstractSeat {

    public void doCommonTask() {
        System.out.println("AbstractSeat : CommonTask done");
    }

    public abstract void doTask();
}