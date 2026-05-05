package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    // exercise 2
    private int startTime;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {

        if (this.hoursWorked <= 40){
            return  this.hoursWorked;
        }
            return 40;

    }

    public double getOvertimeHours() {

        if (this.hoursWorked > 40){
            return this.hoursWorked - 40;
        }
        return 0;

    }

    public double getTotalPay() {

        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * (payRate * 1.5);
        return regularPay + overtimePay;
    }

    //working on exercise 2 and 3 here:
    public void punchIn(int time){
        this.startTime = time;
    }
    public void punchIn(){
        LocalDateTime now = LocalDateTime.now();
        int currentHour = now.getHour();

        punchIn(currentHour);
    }
    public void punchOut(int time){
    int duration = time - this.startTime;
    this.hoursWorked += duration;
    this.startTime = 0;
    }
    public void punchOut(){
        LocalDateTime now = LocalDateTime.now();
        int currentHour = now.getHour();

        punchIn(currentHour);
    }

}

