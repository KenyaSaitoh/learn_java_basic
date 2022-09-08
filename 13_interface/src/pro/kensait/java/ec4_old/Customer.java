package pro.kensait.java.ec4_old;

public interface Customer {
    int getId();
    void setId(int id);
    String getName();
    void setName(String name) ;
    int getPoint();
    void setPoint(int point);
    boolean isActive();
    void setActive(boolean flag);
    boolean checkTotalPrice(int totalPrice);
    void addPoint(int point);

    static Customer aggregate(Customer c1, Customer c2) {
        c1.setPoint(c1.getPoint() + c2.getPoint());
        c2.setActive(false);
        return c1;
    }
}