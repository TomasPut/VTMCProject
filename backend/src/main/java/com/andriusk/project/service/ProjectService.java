package com.andriusk.project.service;

import com.andriusk.project.entity.Project;

import java.util.List;

public interface ProjectService {
    List<Project> findAll();
    void createProject(Project project);
}
