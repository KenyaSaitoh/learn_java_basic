package pro.kensait.java.basic.lsn_12_1_2;

public class Main {
    public static void main(String[] args) {
        NameAggregator alice1 = new GeneralCustomer(1, "Alice", "東京都中央区中央1-1-1");
        alice1.setPoint(3000);
        NameAggregator alice2 = new GeneralCustomer(2, "Alice", "東京都中央区中央1-1-1");
        alice2.setPoint(1000);
        
        // 名寄せ前のチェックメソッドを呼び出す（同じ顧客か？）
        if (NameAggregators.isSame(alice1, alice2)) {
            // 名寄せする
            NameAggregator aggregatedAlice = NameAggregators.aggregate(alice1, alice2);
            System.out.println("名寄せ先 => " + aggregatedAlice);
            System.out.println("名寄せ元 => " + alice2);
        }
    }
}