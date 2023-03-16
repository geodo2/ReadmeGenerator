package com.example.Rss_project.data.dao.Impl;

import com.example.Rss_project.data.dao.UserDAO;
import com.example.Rss_project.data.entity.UserEntity;
import com.example.Rss_project.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAOImpl implements UserDAO {
    UserRepository userRepository;

    @Autowired
    public UserDAOImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity){
        userRepository.save(userEntity);
        return userEntity;
    }

    @Override
    public UserEntity getUser(String project_id){
        UserEntity userEntity = userRepository.getReferenceById(project_id);
        return userEntity;
    }
}
