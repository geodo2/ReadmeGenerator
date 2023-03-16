package com.example.Rss_project.data.dao;

import com.example.Rss_project.data.entity.UserEntity;
public interface UserDAO {
    UserEntity saveUser(UserEntity userEntity);
    UserEntity getUser (String project_id);
}
