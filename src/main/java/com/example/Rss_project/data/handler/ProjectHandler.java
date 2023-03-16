package com.example.Rss_project.data.handler;

import com.example.Rss_project.data.entity.ProjectEntity;

public interface ProjectHandler {
    ProjectEntity saveProjectEntity(String id, String file_name, String file_path, String  file_content);

    ProjectEntity getProjectEntity(String id);

}
