package model;

import java.math.BigDecimal;

public class Summary {

    private final BigDecimal interestSum;

    private final BigDecimal overpaymentProvisionSum;

    private final BigDecimal totalLostSum;

    public Summary(BigDecimal interestSum, BigDecimal overpaymentProvisionSum, BigDecimal totalLostSum) {
        this.interestSum = interestSum;
        this.overpaymentProvisionSum = overpaymentProvisionSum;
        this.totalLostSum = totalLostSum;
    }

    public BigDecimal getInterestSum() {
        return interestSum;
    }

    public BigDecimal getOverpaymentProvisionSum() {
        return overpaymentProvisionSum;
    }

    public BigDecimal getTotalLostSum() {
        return totalLostSum;
    }
}
