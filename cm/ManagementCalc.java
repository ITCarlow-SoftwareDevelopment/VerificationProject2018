package cm;

import java.math.BigDecimal;

public class ManagementCalc implements ICalculate {
    private BigDecimal minimum = new BigDecimal(3.00);
    public BigDecimal calculate(BigDecimal amount) {
        if (amount.compareTo(minimum) == -1) return minimum;
        else return amount;
    }
}
