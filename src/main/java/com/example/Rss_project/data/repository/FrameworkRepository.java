package com.example.Rss_project.data.repository;

import com.example.Rss_project.data.entity.FrameworkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FrameworkRepository extends JpaRepository<FrameworkEntity, String> {
    @Query(value = "SELECT content FROM framework WHERE name = :name_value", nativeQuery = true)
    String findcontent(@Param("name_value")String nameValue);

    @Query(value = "SELECT name FROM framework", nativeQuery = true)
    List<String> findAllName();
}
