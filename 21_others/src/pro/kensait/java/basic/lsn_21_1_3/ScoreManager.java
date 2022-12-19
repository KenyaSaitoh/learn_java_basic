package pro.kensait.java.basic.lsn_21_1_3;

public class ScoreManager {
    private int[] array;
    public ScoreManager(int... array) {
        this.array = array;
    }
    public int getMax() { // 最大値を返す
        return 0;
    }
    public double getAvg() { // 平均値を返す
        return 0;
    }
    public class ArrayIterator {
        private int index = 0;
        public int next() {
            return array[index++];
        }
    }
    public ArrayIterator getIterator() {
        return new ArrayIterator();
    }
}
