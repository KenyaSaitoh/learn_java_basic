package pro.kensait.designpattern.abstractfactory;

public class Client {

    public static void main(String[] args) {

        //
        System.out.println("===== Oracle =====");
        AbstractDaoFactory factory1 = new OracleDaoFactory();
        AbstractEmployeeDao door1 = factory1.createEmployeeDao();
        AbstractDepartmentDao seat1 = factory1.createDepartmentDao();
        door1.doTask();
        seat1.doTask();

        //
        System.out.println("===== MySQL =====");
        AbstractDaoFactory factory2 = new MySQLDaoFactory();
        AbstractEmployeeDao door2 = factory2.createEmployeeDao();
        AbstractDepartmentDao seat2 = factory2.createDepartmentDao();
        door2.doTask();
        seat2.doTask();
    }
}