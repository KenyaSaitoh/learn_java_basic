package pro.kensait.java.ec4_old;

public class GoldCustomer implements Customer {
    private static final int TOTAL_PRICE_LIMIT = 300_000;

    private Integer id;
    private String name;
    private Integer point;
    private boolean active;

    public GoldCustomer(String name, Integer point) {
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

    @Override
    public boolean checkTotalPrice(int totalPrice) {
        if (TOTAL_PRICE_LIMIT < totalPrice) {
            return true;
        }
        return false;
    }

    @Override
    public void addPoint(int point) {
        setPoint(point * 2);
    }
}