package com.msaggik.fifthlessoncarservice.entity;

public class ShipsServiceIncome extends Income {

    /**
     * Стоимость обслуживания 1ого судна
     */
    private double amountOneShip;
    /**
     * Количество судов
     */
    private int shipsCount;

    public ShipsServiceIncome(String name, double amountOneShip, int shipsCount) {
        super(name);
        this.amountOneShip = amountOneShip;
        this.shipsCount = shipsCount;
    }

    @Override
    public double monthlyIncome() {
        return shipsCount * amountOneShip;
    }
}
