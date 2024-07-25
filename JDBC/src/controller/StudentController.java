package controller;

import entity.Student;
import model.StudentModel;

import javax.swing.*;

public class StudentController {

    StudentModel objStudentModel = new StudentModel();

    public void create(){
        //Create intance of Student
        Student objStudent = new Student();

        // Input of name
        String name = JOptionPane.showInputDialog("Insert name");

        //Input of age
        int age = Integer.parseInt(JOptionPane.showInputDialog("Insert age"));

        objStudent.setName(name);
        objStudent.setAge(age);

        Student result = (Student) this.objStudentModel.create(objStudent);

        JOptionPane.showMessageDialog(null,  result.toString());
    }
}
