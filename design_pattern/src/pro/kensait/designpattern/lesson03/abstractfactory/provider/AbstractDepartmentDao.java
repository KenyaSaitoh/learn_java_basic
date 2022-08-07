package pro.kensait.designpattern.lesson03.abstractfactory.provider;

public abstract class AbstractDepartmentDao {

    public void doCommonTask() {
        System.out.println("AbstractSeat : CommonTask done");
    }

    public abstract void doTask();
}