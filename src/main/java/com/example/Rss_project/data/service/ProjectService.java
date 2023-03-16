package com.example.Rss_project.data.service;
import com.example.Rss_project.data.dto.ProjectDTO;

public interface ProjectService {
    ProjectDTO saveProject(String id, String file_name, String file_path, String  file_content);

    ProjectDTO getProject(String id);
}
