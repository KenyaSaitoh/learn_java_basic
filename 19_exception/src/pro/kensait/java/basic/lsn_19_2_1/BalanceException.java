package pro.kensait.java.basic.lsn_19_2_1;

import java.math.BigDecimal;

public class BalanceException extends Exception {
    private BigDecimal balance;
    public BalanceException(String message) {
        super(message);
    }
    public BalanceException(Throwable cause) {
        super(cause);
    }
    public BalanceException(String message, Throwable cause) {
        super(message, cause);
    }
    public BalanceException(String message, BigDecimal balance) {
        super(message);
        this.balance = balance;
    }
    public BigDecimal getBlance() {
        return balance;
    }
    public void setBlance(BigDecimal balance) {
        this.balance = balance;
    }
}