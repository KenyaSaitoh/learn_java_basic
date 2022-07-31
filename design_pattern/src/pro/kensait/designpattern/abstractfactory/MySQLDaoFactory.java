package pro.kensait.designpattern.abstractfactory;

public class MySQLDaoFactory extends AbstractDaoFactory {

    public AbstractEmployeeDao createEmployeeDao() {
        return new MySQLEmployeeDao();
    }

    public AbstractDepartmentDao createDepartmentDao() {
        return new MySQLDepartmentDao();
    }
}