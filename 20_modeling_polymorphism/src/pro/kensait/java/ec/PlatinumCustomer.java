package pro.kensait.java.ec;

import java.util.List;

public class PlatinumCustomer extends AbstractCustomer implements FamilySpec<Customer> {

    private List<Customer> familyList;

    public PlatinumCustomer(String name, Integer customerType, String address,
            Integer point) {
        super(name, customerType, address, point);
    }

    @Override
    public List<Customer> getFamilyList() {
        return familyList;
    }

    @Override
    public void setFamilyList(List<Customer> familyList) {
        this.familyList = familyList;
    }

    @Override
    public void checkTotalPriceLimit(Integer totalPrice) throws Exception {
        if (500000 < totalPrice) {
            throw new Exception("限度額オーバー");
        }
    }

    @Override
    public void addPoint(Integer point) {
        setPoint(point * 3);
    }
}
