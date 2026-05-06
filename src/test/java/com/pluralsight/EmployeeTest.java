package com.pluralsight;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void punchOut_Should_AddCorrectHoursToTotal(){
        Employee employee = new Employee(1, "Carlos", "IT", 20.0, 0);

        employee.punchIn(10);
        employee.punchOut(18);

        assertEquals(8, employee.getRegularHours());

    }

    @Test
    public void punchTimeCard_Should_CalculateOverTimeCorrectly(){
        Employee employee = new Employee(2, "Maria", "Sales", 25.0, 38);

        employee.punchTimeCard(8, 14);

        assertEquals(40, employee.getRegularHours());
        assertEquals(4, employee.getOvertimeHours());


    }

}