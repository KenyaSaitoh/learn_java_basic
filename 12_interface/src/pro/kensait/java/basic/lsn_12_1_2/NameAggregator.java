package pro.kensait.java.basic.lsn_12_1_2;

interface NameAggregator {
    String getName(); // 名前を取得する
    String getAddress() ; // 住所を取得する
    int getPoint(); // ポイントを取得する
    void setPoint(int point); // ポイントを更新
    void invalidate(); //状態を無効にする
}