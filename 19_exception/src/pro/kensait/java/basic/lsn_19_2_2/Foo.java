package pro.kensait.java.basic.lsn_19_2_2;

public class Foo {
    public int process(String param) throws BusinessException {
        try {
            Bar bar = new Bar();
            int length = bar.process(param);
            return length;
        } catch (IllegalArgumentException iae) {
            throw new BusinessException("業務例外発生", iae);
        }
    }
}