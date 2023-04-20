package pro.kensait.java.basic.lsn_12_1_2;

public class NameAggregators {
    // 【1】名寄せ前のチェックメソッド
    // 名前と住所が両方一致していたら、同じ顧客と見なす
    public static boolean isSame(NameAggregator n1, NameAggregator n2) {
        if (n1.getName().equals(n2.getName())
                && n1.getAddress().equals(n2.getAddress())) {
            return true;
        }
        return false;
    }

    // 【2】二人の顧客を統合するメソッド
    public static NameAggregator aggregate(NameAggregator n1, NameAggregator n2) {
        n1.setPoint(n1.getPoint() + n2.getPoint());
        n2.invalidate();
        return n1;
    }
}