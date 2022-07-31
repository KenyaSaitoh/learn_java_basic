package pro.kensait.designpattern.abstractfactory;

public class OracleDaoFactory extends AbstractDaoFactory {

    public AbstractEmployeeDao createEmployeeDao() {
        return new OracleEmployeeDao();
    }

    public AbstractDepartmentDao createDepartmentDao() {
        return new OracleDepartmentDao();
    }
}