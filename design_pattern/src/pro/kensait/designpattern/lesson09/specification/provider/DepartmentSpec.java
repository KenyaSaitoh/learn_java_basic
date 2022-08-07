package pro.kensait.designpattern.lesson09.specification.provider;

public class DepartmentSpec implements UserSpec {
    private String departmentName;

    public DepartmentSpec(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        if (user.getDepartmentName().equals(departmentName)) {
            return true;
        }
        return false;
    }
}
