package pro.kensait.designpattern.lesson03.abstractfactory.provider;

public class OracleDaoFactory extends AbstractDaoFactory {

    public AbstractEmployeeDao createEmployeeDao() {
        return new OracleEmployeeDao();
    }

    public AbstractDepartmentDao createDepartmentDao() {
        return new OracleDepartmentDao();
    }
}