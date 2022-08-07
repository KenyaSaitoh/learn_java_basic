package pro.kensait.designpattern.lesson09.specification.provider;

public class DepartmentAndJobrankSpec implements UserSpec {
    private String departmentName;
    private Integer jobrank;

    public DepartmentAndJobrankSpec(String departmentName, Integer jobrank) {
        this.departmentName = departmentName;
        this.jobrank = jobrank;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Integer getJobrank() {
        return jobrank;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        DepartmentSpec departmentSpec = new DepartmentSpec(departmentName);
        JobrankSpec jobrankSpec = new JobrankSpec(jobrank);
        if (departmentSpec.isSatisfiedBy(user) &&
                jobrankSpec.isSatisfiedBy(user)) {
            return true;
        }
        return false;
    }
}
