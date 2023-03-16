package com.example.Rss_project.data.handler;

import com.example.Rss_project.data.entity.FrameworkEntity;

public interface FrameworkHandler {
    FrameworkEntity saveFrameworkEntity(String id, String name, String content);

    FrameworkEntity getFrameworkEntity(String id);

}
