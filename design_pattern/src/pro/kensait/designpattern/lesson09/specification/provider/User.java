package pro.kensait.designpattern.lesson09.specification.provider;

public class User {
    private String departmentName;
    private Integer jobrank;

    public User(String departmentName, Integer jobrank) {
        this.departmentName = departmentName;
        this.jobrank = jobrank;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getJobrank() {
        return jobrank;
    }

    public void setJobrank(Integer jobrank) {
        this.jobrank = jobrank;
    }
}
