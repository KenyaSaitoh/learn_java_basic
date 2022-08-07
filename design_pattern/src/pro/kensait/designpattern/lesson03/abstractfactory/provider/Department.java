package pro.kensait.designpattern.lesson03.abstractfactory.provider;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Integer departmentId;
    private String departmentName;
    private String location;
    private List<Employee> employees = new ArrayList<Employee>();
    private Long version;

    // 引数なしのコンストラクタ
    public Department() {
    }

    // コンストラクタ
    public Department(Integer departmentId, String departmentName,
            String location, List<Employee> employees, Long version) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.location = location;
        this.employees = employees;
        this.version = version;
    }

    // 部署IDへのアクセサメソッド
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    // 部署名へのアクセサメソッド
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    // 所在地へのアクセサメソッド
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // 社員のリストへのアクセサメソッド
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    // バージョン（楽観的ロックで使用）へのアクセサメソッド
    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Department [" + departmentId + ", " + departmentName + ", " +
                location + ", " + version + "]";
    }
}