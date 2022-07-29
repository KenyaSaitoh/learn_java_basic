package pro.kensait.java.ec3;

// Customerクラスとしての共通実装を提供する
public class CommonCustomer {
    private int id;
    private String name;
    private int point;
    private boolean active;

    public CommonCustomer(String name, int point) {
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
