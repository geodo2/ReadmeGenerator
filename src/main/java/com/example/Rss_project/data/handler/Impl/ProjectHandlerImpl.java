package com.example.Rss_project.data.handler.Impl;

import com.example.Rss_project.data.dao.ProjectDAO;
import com.example.Rss_project.data.entity.ProjectEntity;
import com.example.Rss_project.data.handler.ProjectHandler;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProjectHandlerImpl implements ProjectHandler {
    ProjectDAO projectDAO;

    @Autowired
    public ProjectHandlerImpl(ProjectDAO projectDAO){
        this.projectDAO = projectDAO;
    }

    @Override
    public ProjectEntity saveProjectEntity(String id, String file_name, String file_path, String file_content){
        ProjectEntity projectEntity = new ProjectEntity(id, file_name, file_path,file_content);
        return projectDAO.saveProject(projectEntity);
    }

    @Override
    public ProjectEntity getProjectEntity(String id){
        return projectDAO.getProject(id);
    }
}
