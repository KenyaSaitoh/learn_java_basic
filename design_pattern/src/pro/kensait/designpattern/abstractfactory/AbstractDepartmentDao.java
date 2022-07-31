package pro.kensait.designpattern.abstractfactory;

public abstract class AbstractDepartmentDao {

    public void doCommonTask() {
        System.out.println("AbstractSeat : CommonTask done");
    }

    public abstract void doTask();
}