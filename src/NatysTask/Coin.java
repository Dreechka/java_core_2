package NatysTask;

import java.math.BigDecimal;

public class Coin implements MyPrecious {
    private BigDecimal faceValue;
    private BigDecimal collectorValue;

    public Coin(BigDecimal faceValue, BigDecimal collectorValue) {
        this.faceValue = faceValue;
        this.collectorValue = collectorValue;
    }

    public BigDecimal getValue() {
        return faceValue.add(collectorValue);
    }


}

