package pro.kensait.designpattern.lesson03.abstractfactory.provider;

public class MySQLDaoFactory extends AbstractDaoFactory {

    public AbstractEmployeeDao createEmployeeDao() {
        return new MySQLEmployeeDao();
    }

    public AbstractDepartmentDao createDepartmentDao() {
        return new MySQLDepartmentDao();
    }
}