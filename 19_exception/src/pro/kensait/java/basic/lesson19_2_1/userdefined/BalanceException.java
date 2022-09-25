package pro.kensait.java.basic.lesson19_2_1.userdefined;

import java.math.BigDecimal;

public class BalanceException extends Exception {
    private BigDecimal blance;
    public BalanceException(String message) {
        super(message);
    }
    public BalanceException(Throwable cause) {
        super(cause);
    }
    public BalanceException(String message, Throwable cause) {
        super(message, cause);
    }
    public BalanceException(String message, BigDecimal blance) {
        super(message);
        this.blance = blance;
    }
    public BigDecimal getBlance() {
        return blance;
    }
    public void setBlance(BigDecimal blance) {
        this.blance = blance;
    }
}