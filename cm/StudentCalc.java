package cm;

import java.math.BigDecimal;

public class StudentCalc implements ICalculate {
    private final BigDecimal discount = new BigDecimal("5.5");
    private final BigDecimal percentage = new BigDecimal("0.25");
    public BigDecimal calculate(BigDecimal amount) {
        if (amount.compareTo(discount) < 0) return amount;
        else return amount.subtract((amount.subtract(discount).multiply(percentage)));
    }
}
