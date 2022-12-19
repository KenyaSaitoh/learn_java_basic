package pro.kensait.java.basic.lsn_19_2_1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            throw new BalanceException("残高不足発生", new BigDecimal(5000));
        } catch (BalanceException be) {
            be.printStackTrace();
        }
    }
}