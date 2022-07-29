package pro.kensait.java.ec2;

// Customerクラスとしての共通実装を提供する
public abstract class AbstractCustomer {
    private int id;
    private String name;
    private int point;
    private boolean active;

    public AbstractCustomer(String name, int point) {
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

    public abstract boolean isLimitOver(int totalPrice);

    public abstract void addPoint(int point);
}
