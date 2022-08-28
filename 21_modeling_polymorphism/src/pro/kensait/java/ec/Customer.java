package pro.kensait.java.ec;

public interface Customer {
    Integer getId();
    void setId(Integer id);
    String getName();
    void setName(String name) ;
    Integer getCustomerType(); // TODO 要るかな？せめて列挙型にしよう
    void setCustomerType(Integer customerType);  // TODO 要るかな？
    String getAddress() ;
    void setAddress(String address) ;
    Integer getPoint();
    void setPoint(Integer point);
    boolean isActive();
    void setActive(boolean flag);
    void checkTotalPrice(int totalPrice) throws Exception;
    void addPoint(int point);

    // 名寄せのためのチェックメソッドなので、単純にequalsでは判定できない
    // 名前と住所が一致していたら、同じ顧客と見なす
    static boolean isSame(Customer c1, Customer c2) {
        if (c1.getName().equals(c2.getName())
                && c1.getAddress().equals(c2.getAddress())) {
            return true;
        }
        return false;
    }

    static Customer aggregate(Customer c1, Customer c2) {
        c1.setPoint(c1.getPoint() + c2.getPoint());
        c2.setActive(false);
        return c1;
    }
}