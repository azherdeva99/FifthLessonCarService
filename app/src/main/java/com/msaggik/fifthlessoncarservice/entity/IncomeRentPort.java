package com.msaggik.fifthlessoncarservice.entity;

public class IncomeRentPort extends Income {

    /**
     * Величина дохода
     */
    private double amountMonth;

    public IncomeRentPort(String name, double amountMonth) {
        super(name);
        this.amountMonth = amountMonth;
    }

    @Override
    public double monthlyIncome() {
        return amountMonth;
    }
}
