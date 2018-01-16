/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.test;

import com.coderbd.entity.Department;
import com.coderbd.entity.Teacher;
import com.coderbd.service.TeacherService;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppTeacher {

    private static TeacherService teacherService = new TeacherService();

    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher();
        teacher.setTeacherName("Md. Amin");
        teacher.setTeacherId("www");
        teacher.setTeacherInstitiute("IDB-BISEW");

        Department department = new Department();
        department.setId(1);

        teacher.setDepartment(department);
        try {
            teacherService.persist(teacher);
        } catch (Exception ex) {
            Logger.getLogger(AppEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
