package com.example.Rss_project.data.service;

import com.example.Rss_project.data.dto.FrameworkDTO;

public interface FrameworkService {
    FrameworkDTO saveFramework(String Type, String name, String content);

    FrameworkDTO getFramework(String name);
}
