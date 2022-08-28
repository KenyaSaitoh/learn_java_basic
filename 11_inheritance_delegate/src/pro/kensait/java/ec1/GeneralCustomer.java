package pro.kensait.java.ec1;

public class GeneralCustomer extends SuperCustomer {
    private static final int TOTAL_PRICE_LIMIT = 100_000;

    public GeneralCustomer(String name, int point) {
        super(name, point);
    }

    public boolean checkTotalPrice(int totalPrice) {
        if (TOTAL_PRICE_LIMIT < totalPrice) {
            return true;
        }
        return false;
    }

    public void addPoint(int point) {
        setPoint(point);
    }
}