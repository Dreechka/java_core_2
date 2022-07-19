package NatysTask;

import java.math.BigDecimal;

public class Stamp implements MyPrecious {
    private BigDecimal value;

    public Stamp(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
}

