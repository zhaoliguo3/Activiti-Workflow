package com.xzl.bat.domain.modul;

import lombok.Data;

import javax.persistence.Id;


@Data
public class Student {

    @Id
    private String id;

    private String name;

    private Integer age;

    private String school;

    public Student(String id, String name, Integer age, String school) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
