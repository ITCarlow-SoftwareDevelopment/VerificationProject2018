package cm;

import java.math.BigDecimal;

public class StudentCalc implements ICalculate {
    private BigDecimal discount = new BigDecimal(5.50);
    private BigDecimal percentage = new BigDecimal(0.25);
    public BigDecimal calculate(BigDecimal amount) {
        if (amount.compareTo(discount) == -1) return amount;
        else return amount.subtract((amount.subtract(discount).multiply(percentage)));
    }
}
