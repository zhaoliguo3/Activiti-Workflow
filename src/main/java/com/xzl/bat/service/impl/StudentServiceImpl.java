package com.xzl.bat.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzl.bat.domain.mapper.StudentMapper;
import com.xzl.bat.domain.modul.Student;
import com.xzl.bat.service.StudentService;
import com.xzl.boilerplate.common.dto.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public void addStudents(List<Student> list) {

        for (Student student:list)
            studentMapper.insertSelective(student);
    }

    @Override
    public void removeStudentById(String id) {
        System.out.println(id);
        studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void modifyStudentById(Student student) {
        studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public List<Student> getStudents(String school, Integer age) {
        return studentMapper.selectStudents(school,age);
    }

    @Override
    public Pager getStudentsByOrder(Student student, Pager pager) {
        PageHelper.startPage(pager.getIndex(), pager.getSize());
        List<Student> list =studentMapper.selectStudentsByOrder(student);
        PageInfo pageInfo = new PageInfo(list);
        pager.setList(list);
        pager.setTotal((int) pageInfo.getTotal());
        return pager;
    }
}
