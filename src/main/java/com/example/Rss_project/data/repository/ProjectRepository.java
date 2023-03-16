package com.example.Rss_project.data.repository;

import com.example.Rss_project.data.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntity, String> {

}
