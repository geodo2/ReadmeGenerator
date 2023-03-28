package com.example.Rss_project.data.dao;

import com.example.Rss_project.data.entity.FrameworkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface FrameworkDAO  {
    FrameworkEntity saveFramework(FrameworkEntity frameworkEntity);
    FrameworkEntity getFramework (String name);


}
