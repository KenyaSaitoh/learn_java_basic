package pro.kensait.designpattern.adaptor;

public class CustomerWrapper implements Customer {
    private CustomerImpl customerImpl;

    public CustomerWrapper(CustomerImpl customerImpl) {
        this.customerImpl = customerImpl;
    }

    public Integer getId() {
        return customerImpl.getId();
    }

    public void setId(Integer id) {
        customerImpl.setId(id);
    }

    public String getName() {
        return customerImpl.getName();
    }

    public void setName(String name) {
        customerImpl.setName(name);
    }

    public String getAddress() {
        return customerImpl.getAddress();
    }

    public void setAddress(String address) {
        customerImpl.setAddress(address);
    }

    public Integer getPoint() {
        return customerImpl.getPoint();
    }

    public void setPoint(Integer point) {
        customerImpl.setPoint(point);
    }

    public void checkTotalPriceLimit(Integer totalPrice) throws Exception {
        customerImpl.checkTotalPriceLimit(totalPrice);
    }

    public void addPoint(Integer point) {
        customerImpl.addPoint(point);
    }
}