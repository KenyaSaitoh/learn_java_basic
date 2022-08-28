package pro.kensait.java.ec3;

public class GoldCustomer {
    private static final int TOTAL_PRICE_LIMIT = 300_000;

    private CommonCustomer commonCustomer;

    public GoldCustomer(String name, int point) {
        commonCustomer = new CommonCustomer(name, point);
    }

    public int getId() {
        return commonCustomer.getId();
    }

    public void setId(int id) {
        commonCustomer.setId(id);
    }

    public String getName() {
        return commonCustomer.getName();
    }

    public void setName(String name) {
        commonCustomer.setName(name);
    }

    public int getPoint() {
        return commonCustomer.getPoint();
    }

    public void setPoint(int point) {
        commonCustomer.setPoint(point);
    }

    public boolean checkTotalPrice(int totalPrice) {
        if (TOTAL_PRICE_LIMIT < totalPrice) {
            return true;
        }
        return false;
    }

    public void addPoint(int value) {
        setPoint(getPoint() + value * 2);
    }
}