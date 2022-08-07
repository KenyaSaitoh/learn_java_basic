package pro.kensait.designpattern.lesson04.adaptor.legacy;

public class CustomerImpl implements Customer {
    private Integer id;
    private String name;
    private String address;
    private Integer point;

    public CustomerImpl(String name, String address, Integer point) {
        this.name = name;
        this.address = address;
        this.point = point;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Integer getPoint() {
        return point;
    }

    @Override
    public void setPoint(Integer point) {
        this.point = point;
    }

    @Override
    public void checkTotalPriceLimit(Integer totalPrice) throws Exception {
        if (1000000 < totalPrice) {
            throw new Exception("限度額オーバー");
        }
    }

    @Override
    public void addPoint(Integer point) {
        setPoint(point * 2);
    }
}