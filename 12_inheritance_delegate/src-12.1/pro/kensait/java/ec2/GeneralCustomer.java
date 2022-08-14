package pro.kensait.java.ec2;

public class GeneralCustomer extends AbstractCustomer {
    private static final int TOTAL_PRICE_LIMIT = 100_000;

    public GeneralCustomer(String name, int point) {
        super(name, point);
    }

    @Override
    public boolean isLimitOver(int totalPrice) {
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