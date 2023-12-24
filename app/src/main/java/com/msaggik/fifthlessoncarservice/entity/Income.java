package com.msaggik.fifthlessoncarservice.entity;

public abstract class Income {
    /**
     * ID
     */
    private int id;
    /**
     * Название дохода
     */
    String nameIncome;

    /**
     * Выручка за месяц
     * @return
     */
    abstract double monthlyIncome();

    public Income(String nameIncome) {
        this.nameIncome = nameIncome;
    }
}
