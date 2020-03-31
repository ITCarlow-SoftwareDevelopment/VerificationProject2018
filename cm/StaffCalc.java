package cm;

import java.math.BigDecimal;

public class StaffCalc implements ICalculate {
    private BigDecimal maximum = new BigDecimal(16.00);
    public BigDecimal calculate(BigDecimal amount) {
        if (amount.compareTo(maximum) == -1) return amount;
        else return maximum;
    }
}
