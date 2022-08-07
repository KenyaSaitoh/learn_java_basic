package pro.kensait.designpattern.lesson09.chainofresponsibility.provider;

public class User {
    private String userName;
    private String departmentName;
    private Integer jobrank;

    public User(String userName, String departmentName, Integer jobrank) {
        this.userName = userName;
        this.departmentName = departmentName;
        this.jobrank = jobrank;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
