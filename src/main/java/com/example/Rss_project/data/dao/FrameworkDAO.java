package com.example.Rss_project.data.dao;

import com.example.Rss_project.data.entity.FrameworkEntity;

public interface FrameworkDAO {
    FrameworkEntity saveFramework(FrameworkEntity frameworkEntity);
    FrameworkEntity getFramework (String id);
}
