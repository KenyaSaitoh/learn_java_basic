package pro.kensait.designpattern.abstractfactory;

public abstract class AbstractDaoFactory {

    public abstract AbstractEmployeeDao createEmployeeDao();

    public abstract AbstractDepartmentDao createDepartmentDao();
}