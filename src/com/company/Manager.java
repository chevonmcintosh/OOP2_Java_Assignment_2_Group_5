package com.company;
//ChevonMcIntosh 2017001610 //Shaquan Turner 1817001436 //Jahvaughn Binns 2017001833
public class Manager extends StaffMember{

    private double bonus;
    Manager(String FirstName,String LastName,String deptNumber,Double hoursWorked){

        super(FirstName,LastName,deptNumber,hoursWorked);
    }

    public void setBonus(double bonus) {
        this.bonus = 7000;
    }

    public double getBonus() {
        return bonus;
    }

    public void display () {
        System.out.println("Full name: " + this.FirstName + " " + this.LastName);
        System.out.println(" Here is your Department Number: " + this.deptNumber);
        System.out.println("These are the hours you work : " + this.hoursWorked);
    }

}