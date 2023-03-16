package com.example.Rss_project.data.dao;

import com.example.Rss_project.data.entity.ProjectEntity;
public interface ProjectDAO {
    ProjectEntity saveProject(ProjectEntity projectEntity);
    ProjectEntity getProject (String id);
}
