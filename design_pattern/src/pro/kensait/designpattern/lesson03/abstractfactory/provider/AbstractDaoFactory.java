package pro.kensait.designpattern.lesson03.abstractfactory.provider;

public abstract class AbstractDaoFactory {

    public abstract AbstractEmployeeDao createEmployeeDao();

    public abstract AbstractDepartmentDao createDepartmentDao();
}