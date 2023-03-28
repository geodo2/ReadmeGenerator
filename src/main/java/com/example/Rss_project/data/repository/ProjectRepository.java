package com.example.Rss_project.data.repository;

import com.example.Rss_project.data.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjectRepository extends JpaRepository<ProjectEntity, String> {
    @Query(value = "SELECT DISTINCT id FROM project", nativeQuery = true)
    List<String> findDistinctId();
}
