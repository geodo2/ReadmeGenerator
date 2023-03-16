package com.example.Rss_project.data.dao.Impl;

import com.example.Rss_project.data.dao.ProjectDAO;
import com.example.Rss_project.data.entity.ProjectEntity;
import com.example.Rss_project.data.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectDAOImpl implements ProjectDAO {
    ProjectRepository projectRepository;

    @Autowired
    public ProjectDAOImpl(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }

    @Override
    public ProjectEntity saveProject(ProjectEntity projectEntity){
        projectRepository.save(projectEntity);
        return projectEntity;
    }

    @Override
    public ProjectEntity getProject(String id){
        ProjectEntity projectEntity = projectRepository.getReferenceById(id);
        return projectEntity;
    }
}
