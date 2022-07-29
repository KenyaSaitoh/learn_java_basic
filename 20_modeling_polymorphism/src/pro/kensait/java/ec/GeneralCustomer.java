package pro.kensait.java.ec;

public class GeneralCustomer extends AbstractCustomer {

    public GeneralCustomer(String name, Integer customerType, String address,
            Integer point) {
        super(name, customerType, address, point);
    }

    @Override
    public void checkTotalPriceLimit(Integer totalPrice) throws Exception {
        if (100000 < totalPrice) {
            throw new Exception("限度額オーバー");
        }
    }

    @Override
    public void addPoint(Integer point) {
        setPoint(point);
    }
}
