package cm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StudentRate extends Rate {
    public StudentRate(CarParkKind kind, BigDecimal normalRate, java.math.BigDecimal reducedRate, ArrayList<Period> reducedPeriods
            , java.util.ArrayList<Period> normalPeriods) {
        super(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        this.calculateDiscount = new StudentCalc();
    }
}
