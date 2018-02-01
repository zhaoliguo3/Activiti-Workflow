package com.xzl.bat.domain.mapper;

import com.xzl.bat.domain.modul.Student;
import com.xzl.bat.domain.tk.TKMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentMapper")
public interface StudentMapper extends TKMapper<Student>{
    List<Student> selectStudents(@Param("school") String school, @Param("age") Integer age);
    List<Student> selectStudentsByOrder(@Param("student") Student student);
}
