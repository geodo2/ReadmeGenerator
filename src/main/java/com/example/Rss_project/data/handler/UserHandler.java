package com.example.Rss_project.data.handler;

import com.example.Rss_project.data.entity.UserEntity;

public interface UserHandler {
    UserEntity saveUserEntity(String project_id, String user_name, String repository_name);

    UserEntity getUserEntity(String project_id);

}
