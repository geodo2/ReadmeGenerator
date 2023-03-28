package com.example.Rss_project.data.handler;

import com.example.Rss_project.data.entity.FrameworkEntity;

public interface FrameworkHandler {
    FrameworkEntity saveFrameworkEntity(String name, String Type, String content);

    FrameworkEntity getFrameworkEntity(String name);

}
