package pro.kensait.designpattern.lesson09.chainofresponsibility.provider;

public class DepartmentSpec extends UserSpec {
    private String departmentName;

    public DepartmentSpec(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        System.out.println("[ DepartmentSpec ]");
        if (user.getDepartmentName().equals(departmentName)) {
            return true;
        }
        return false;
    }
}