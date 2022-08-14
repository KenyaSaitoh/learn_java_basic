package pro.kensait.java.ec2;

public class GoldCustomer extends AbstractCustomer {
    private static final int TOTAL_PRICE_LIMIT = 300_000;

    public GoldCustomer(String name, int point) {
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
        setPoint(point * 2);
    }
}