package com.xzl.bat.service;


import com.xzl.bat.domain.modul.Student;
import com.xzl.boilerplate.common.dto.Pager;

import java.util.List;

public interface StudentService {

    void addStudents(List<Student> list);

    void removeStudentById(String id);

    void modifyStudentById(Student student);

    List<Student> getStudents(String school,Integer age);

    Pager getStudentsByOrder(Student student, Pager pager);

}
