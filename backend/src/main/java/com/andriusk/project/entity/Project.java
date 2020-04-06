package com.andriusk.project.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Project {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String projectName;
    private String description;
    private boolean status;
    private LocalDateTime createdOn;
    private LocalDateTime deadline;

    protected Project() {
    }

    public Project(Long id, String projectName, String description, boolean status, LocalDateTime deadline) {
        this.id = id;
        this.projectName = projectName;
        this.description = description;
        this.status = status;
        this.createdOn = LocalDateTime.now();
        this.deadline = deadline;
    }
}
