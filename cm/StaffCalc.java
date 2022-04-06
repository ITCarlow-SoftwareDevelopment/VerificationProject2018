package cm;

import java.math.BigDecimal;

public class StaffCalc implements ICalculate {
    private final BigDecimal maximum = new BigDecimal("16");
    public BigDecimal calculate(BigDecimal amount) {
        if (amount.compareTo(maximum) < 0) return amount;
        else return maximum;
    }
}
