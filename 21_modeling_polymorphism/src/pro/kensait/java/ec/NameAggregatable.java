package pro.kensait.java.ec;

public interface NameAggregatable {
    String getName();
    String getAddress() ;
    Integer getPoint();
    void setPoint(Integer point);
    void setActive(boolean flag);

    // 名寄せのためのチェックメソッドなので、単純にequalsでは判定できない
    // 名前と住所が一致していたら、同じ顧客と見なす
    static boolean isSame(NameAggregatable c1, NameAggregatable c2) {
        if (c1.getName().equals(c2.getName())
                && c1.getAddress().equals(c2.getAddress())) {
            return true;
        }
        return false;
    }

    static NameAggregatable aggregate(NameAggregatable c1, NameAggregatable c2) {
        c1.setPoint(c1.getPoint() + c2.getPoint());
        c2.setActive(false);
        return c1;
    }
}