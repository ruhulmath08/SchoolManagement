package com.coderbd.controller;

import com.coderbd.entity.Teacher;
import com.coderbd.service.TeacherService;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "teacherController")
public class TeacherController implements Serializable{
    private Teacher teacher;
    private TeacherService teacherService = new TeacherService();
    
    public void saveTeacher(){
        try {
            teacherService.persist(teacher);
        } catch (Exception e) {
            Logger.getLogger(TeacherController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
