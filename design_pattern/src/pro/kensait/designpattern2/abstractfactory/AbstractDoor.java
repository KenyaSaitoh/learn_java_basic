package pro.kensait.designpattern2.abstractfactory;

public abstract class AbstractDoor {

    public void doCommonTask() {
        System.out.println("AbstractDoor : CommonTask done");
    }

    public abstract void doTask();
}