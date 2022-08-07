package pro.kensait.designpattern.lesson03.abstractfactory.provider;

public abstract class AbstractEmployeeDao {

    public void doCommonTask() {
        System.out.println("AbstractDoor : CommonTask done");
    }

    public abstract void doTask();
}