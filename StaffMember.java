package com.company;

public class StaffMember {
    protected String FirstName;
    protected String LastName;
    protected String deptNumber;
    protected Double hoursWorked;

    public StaffMember() {
    }
    public StaffMember(String Fname,String Lname,String DNumber,Double Hworked) {

        this.FirstName = Fname;
        this.LastName = Lname;
        this.deptNumber= DNumber;
        this.hoursWorked = Hworked;

    }
    public void setFirstName(String firstName) {firstName="John";
        this.FirstName=firstName;}  //=firstName;}   //="john";}
    public String getFirstName() {
        return FirstName;
    }

    public void setLastName(String lastName) {lastName="Will";
        this.LastName = lastName;}
    public String getLastName() {
        return LastName;
    }

    public void setDeptNumber(String depNumber) {depNumber="432695438";
        this.deptNumber = depNumber;
    }
    public String getDeptNumber() {
        return deptNumber;
    }

    public void setHoursWorked(Double hourWorked) {hourWorked=5.5;
        this.hoursWorked = hourWorked;
    }
    public Double getHoursWorked() {
        return hoursWorked;
    }



    public void display() {
        System.out.println("Enter First name :"+FirstName);
        System.out.println("Enter Last name :"+LastName);
        System.out.println("Enter dept number :"+deptNumber);
        System.out.println("Enter hoursWorked :"+hoursWorked);





    }
}