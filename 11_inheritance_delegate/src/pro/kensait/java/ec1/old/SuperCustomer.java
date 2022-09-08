package pro.kensait.java.ec1.old;

// Customerクラスとしての共通実装を提供する
public class SuperCustomer {
    private Integer id;
    private String name;
    private Integer point;
    private boolean active;

    public SuperCustomer(String name, Integer point) {
        this.name = name;
        this.point = point;
        this.active = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
