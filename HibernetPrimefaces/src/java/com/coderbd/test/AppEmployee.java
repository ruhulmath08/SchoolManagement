/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.test;

import com.coderbd.entity.Employee;
import com.coderbd.service.EmployeeService;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class AppEmployee {

    private static EmployeeService employeeService = new EmployeeService();

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setEmpName("Atique");
        employee.setEmpAddress("Dhaka");
        employee.setEmpMobileNos("4567654");
        try {
            employeeService.persist(employee);
        } catch (Exception ex) {
            Logger.getLogger(AppEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
