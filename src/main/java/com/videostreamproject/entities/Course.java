package com.videostreamproject.entities;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name="yt_courses")
public class Course {

    @Id
    private String id;
    private String title;

    // @OneToMany(mappedBy="course")
    // private List<Video>list=new ArrayList<>();

}
