package cm;

import java.math.BigDecimal;

public class VisitorCalc implements ICalculate{
    private final BigDecimal freeAmount = new BigDecimal("10");
    private final BigDecimal percentageDiscount = new BigDecimal("0.5");
    public BigDecimal calculate(BigDecimal amount) {
        if (amount.compareTo(freeAmount) < 0) return new BigDecimal("0");
        else return amount.subtract(freeAmount).multiply(percentageDiscount);
    }
}