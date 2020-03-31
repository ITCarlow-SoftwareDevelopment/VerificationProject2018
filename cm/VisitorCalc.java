package cm;

import java.math.BigDecimal;

public class VisitorCalc implements ICalculate{
    private BigDecimal freeAmount = new BigDecimal(8.00);
    private BigDecimal percentageDiscount = new BigDecimal(0.50);
    public BigDecimal calculate(BigDecimal amount) {
        if (amount.compareTo(freeAmount) == -1) return new BigDecimal(0.0);
        else return amount.subtract(freeAmount).multiply(percentageDiscount);
    }
}