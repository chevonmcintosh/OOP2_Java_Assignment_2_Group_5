package com.company;

public class Manager extends StaffMember{

    private double bonus;

    Manager(){

        super();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void display () {}



}
