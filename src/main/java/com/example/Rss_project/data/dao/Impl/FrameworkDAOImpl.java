package com.example.Rss_project.data.dao.Impl;

import com.example.Rss_project.data.dao.FrameworkDAO;
import com.example.Rss_project.data.entity.FrameworkEntity;
import com.example.Rss_project.data.repository.FrameworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public FrameworkEntity getFramework(String id){
        FrameworkEntity frameworkEntity = frameworkRepository.getReferenceById(id);
        return frameworkEntity;
    }
}
