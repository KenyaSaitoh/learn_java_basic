package pro.kensait.java.ec;

public class GeneralCustomer extends AbstractCustomer {
    private static final int TOTAL_PRICE_LIMIT = 500_000;

    public GeneralCustomer(String name, Integer customerType, String address,
            Integer point) {
        super(name, customerType, address, point);
    }

    @Override
    public void checkTotalPriceLimit(Integer totalPrice) throws Exception {
        if (TOTAL_PRICE_LIMIT < totalPrice) {
            throw new Exception("限度額オーバー");
        }
    }

    @Override
    public void addPoint(Integer point) {
        setPoint(point);
    }
}
