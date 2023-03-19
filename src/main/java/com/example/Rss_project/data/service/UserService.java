package com.example.Rss_project.data.service;

import com.example.Rss_project.data.dto.UserDTO;

public interface UserService {
    UserDTO saveUser(String project_id, String user_name, String repository_name);

    UserDTO getUser(String project_id);
}
