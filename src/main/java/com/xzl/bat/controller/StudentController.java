package com.xzl.bat.controller;

import com.xzl.bat.domain.dto.RequestDTO;
import com.xzl.bat.domain.modul.Student;
import com.xzl.bat.service.StudentService;
import com.xzl.boilerplate.common.dto.Pager;
import com.xzl.boilerplate.common.dto.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping
    public ResultResponse addOrder(
            @RequestBody List<Student> list)  {
        System.out.println(list);
            studentService.addStudents(list);
        return ResultResponse.createSuccessResponse("ok");
    }

    @DeleteMapping
    public ResultResponse deleteStudent(
            @RequestBody String id)  {
        studentService.removeStudentById(id);
        return ResultResponse.createSuccessResponse("ok");
    }

    @PutMapping
    public ResultResponse modifyStudent(
            @RequestBody Student student)  {
        studentService.modifyStudentById(student);
        return ResultResponse.createSuccessResponse("ok");
    }

    @GetMapping
    public ResultResponse getStudents(
            @RequestParam String school,@RequestParam Integer age)  {
        return ResultResponse.createSuccessResponse(studentService.getStudents(school,age));
    }

    @PostMapping("/order")
    public ResultResponse getStudentsByOrder(
             @RequestBody RequestDTO requestDTO)  {
        return ResultResponse.createSuccessResponse(studentService.getStudentsByOrder(new Student(requestDTO.getId(),requestDTO.getName(),requestDTO.getAge(),requestDTO.getSchool()),new Pager(requestDTO.getIndex(),requestDTO.getSize())));
    }

}
