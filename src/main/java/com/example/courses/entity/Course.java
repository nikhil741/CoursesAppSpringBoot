package com.example.courses.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    public long id;
    public String title;
    public String description;

    public Course(){

    }
    public Course(long id, String title, String description){
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }
}
