package pro.kensait.designpattern.abstractfactory;

public abstract class AbstractEmployeeDao {

    public void doCommonTask() {
        System.out.println("AbstractDoor : CommonTask done");
    }

    public abstract void doTask();
}