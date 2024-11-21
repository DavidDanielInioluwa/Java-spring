package com.example.cmp325.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private Long id;

    private String CourseTitle;
    private String CourseCode;



}
