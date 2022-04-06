package cm;

import java.math.BigDecimal;

public class ManagementCalc implements ICalculate {
    private final BigDecimal minimum = new BigDecimal("4");
    public BigDecimal calculate(BigDecimal amount) {
        if (amount.compareTo(minimum) < 0) return minimum;
        else return amount;
    }
}
