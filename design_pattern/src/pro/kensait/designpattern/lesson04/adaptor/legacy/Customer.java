package pro.kensait.designpattern.lesson04.adaptor.legacy;

public interface Customer {
    Integer getId();
    void setId(Integer id);
    String getName();
    void setName(String name) ;
    String getAddress() ;
    void setAddress(String address) ;
    Integer getPoint();
    void setPoint(Integer point);
    void checkTotalPriceLimit(Integer totalPrice) throws Exception;
    void addPoint(Integer point);
}