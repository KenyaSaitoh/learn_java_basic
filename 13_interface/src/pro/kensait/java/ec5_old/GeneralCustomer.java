package pro.kensait.java.ec5_old;

public class GeneralCustomer extends AbstractCustomer {
    private static final int TOTAL_PRICE_LIMIT = 100_000;

    public GeneralCustomer(String name, int point) {
        super(name, point);
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
        setPoint(point);
    }
}