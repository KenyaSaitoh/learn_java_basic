package pro.kensait.java.ec5;

// Customerクラスとしての共通実装を提供する
public abstract class AbstractCustomer implements Customer {
    private Integer id;
    private String name;
    private Integer point;
    private boolean active;

    public AbstractCustomer(String name, Integer point) {
        this.name = name;
        this.point = point;
        this.active = true;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPoint() {
        return point;
    }

    @Override
    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public boolean isActive() {
        return active;
    }

    @Override
    public void setActive(boolean active) {
        this.active = active;
    }

    // 抽象メソッドを記述することもできるが、インタフェースに記述した方が望ましい
    //public abstract void addPoint(Integer point);
}
