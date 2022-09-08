package pro.kensait.java.ec1.old;

public class GoldCustomer extends SuperCustomer {
    private static final int TOTAL_PRICE_LIMIT = 300_000;

    public GoldCustomer(String name, Integer point) {
        super(name, point);
    }

    public boolean checkTotalPrice(int totalPrice) {
        if (TOTAL_PRICE_LIMIT < totalPrice) {
            return true;
        }
        return false;
    }

    public void addPoint(int point) {
        setPoint(point * 2);
    }
}