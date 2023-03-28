package com.example.Rss_project.data.dao.Impl;

import com.example.Rss_project.data.dao.FrameworkDAO;
import com.example.Rss_project.data.entity.FrameworkEntity;
import com.example.Rss_project.data.repository.FrameworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrameworkDAOImpl implements FrameworkDAO {
    FrameworkRepository frameworkRepository;


    @Autowired
    public FrameworkDAOImpl(FrameworkRepository frameworkRepository){
        this.frameworkRepository = frameworkRepository;
    }

    @Override
    public FrameworkEntity saveFramework(FrameworkEntity frameworkEntity){
        frameworkRepository.save(frameworkEntity);
        return frameworkEntity;
    }

    @Override
    public FrameworkEntity getFramework(String name){
        FrameworkEntity frameworkEntity = frameworkRepository.getReferenceById(name);
        return frameworkEntity;
    }



}