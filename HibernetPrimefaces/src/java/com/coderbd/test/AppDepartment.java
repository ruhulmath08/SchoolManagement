/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.test;

import com.coderbd.entity.Department;
import com.coderbd.service.DepartmentService;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J2EE-33
 */
public class AppDepartment {
    private static DepartmentService departmentService = new DepartmentService();

    public static void main(String[] args) {

        Department department = new Department();
        department.setDeptName("J2EE");
        try {
            departmentService.persist(department);
        } catch (Exception ex) {
            Logger.getLogger(AppEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
