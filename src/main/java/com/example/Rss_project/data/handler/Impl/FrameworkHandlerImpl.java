package com.example.Rss_project.data.handler.Impl;

import com.example.Rss_project.data.dao.FrameworkDAO;
import com.example.Rss_project.data.entity.FrameworkEntity;
import com.example.Rss_project.data.handler.FrameworkHandler;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FrameworkHandlerImpl implements FrameworkHandler {
    FrameworkDAO frameworkDAO;

    @Autowired
    public FrameworkHandlerImpl(FrameworkDAO frameworkDAO){
        this.frameworkDAO = frameworkDAO;
    }

    @Override
    public FrameworkEntity saveFrameworkEntity(String Type, String name, String content){
        FrameworkEntity frameworkEntity = new FrameworkEntity(Type, name, content);
        return frameworkDAO.saveFramework(frameworkEntity);
    }

    @Override
    public FrameworkEntity getFrameworkEntity(String name){
        return frameworkDAO.getFramework(name);
    }

}