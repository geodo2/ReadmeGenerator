package com.example.Rss_project.data.service.Impl;

import com.example.Rss_project.data.dto.ProjectDTO;
import com.example.Rss_project.data.entity.ProjectEntity;
import com.example.Rss_project.data.handler.ProjectHandler;
import com.example.Rss_project.data.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class ProjectServiceImpl implements ProjectService {
    ProjectHandler projectHandeler;

    @Autowired
    public ProjectServiceImpl(ProjectHandler projectHandler){
        this.projectHandeler = projectHandler;
    }

    // Service(Client) <-> Controller : DTO
    // Service <-> DAO(DB) : Entity
    @Override
    public ProjectDTO saveProject(String id, String file_name, String file_path, String file_content){
        ProjectEntity projectEntity = projectHandeler.saveProjectEntity(id, file_name, file_path, file_content);

        ProjectDTO projectDTO = new ProjectDTO(projectEntity.getId(), projectEntity.getFile_name(), projectEntity.getFile_path(),projectEntity.getFile_content());
        return projectDTO;
    }

    @Override
    public ProjectDTO getProject(String id){
        ProjectEntity projectEntity = projectHandeler.getProjectEntity(id);

        ProjectDTO projectDTO = new ProjectDTO(projectEntity.getId(), projectEntity.getFile_name(), projectEntity.getFile_path(),projectEntity.getFile_content());
        return projectDTO;
    }

}
