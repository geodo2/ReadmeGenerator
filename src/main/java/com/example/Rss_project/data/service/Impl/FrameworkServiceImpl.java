package com.example.Rss_project.data.service.Impl;

import com.example.Rss_project.data.dto.FrameworkDTO;
import com.example.Rss_project.data.entity.FrameworkEntity;
import com.example.Rss_project.data.handler.FrameworkHandler;
import com.example.Rss_project.data.service.FrameworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrameworkServiceImpl implements FrameworkService {
    FrameworkHandler frameworkHandeler;

    @Autowired
    public FrameworkServiceImpl(FrameworkHandler frameworkHandler){
        this.frameworkHandeler = frameworkHandler;
    }

    // Service(Client) <-> Controller : DTO
    // Service <-> DAO(DB) : Entity
    @Override
    public FrameworkDTO saveFramework(String Type, String name, String content){
        FrameworkEntity frameworkEntity = frameworkHandeler.saveFrameworkEntity(Type, name, content);

        FrameworkDTO frameworkDTO = new FrameworkDTO(frameworkEntity.getType(), frameworkEntity.getName(), frameworkEntity.getContent());
        return frameworkDTO;
    }

    @Override
    public FrameworkDTO getFramework(String name){
        FrameworkEntity frameworkEntity = frameworkHandeler.getFrameworkEntity(name);

        FrameworkDTO frameworkDTO = new FrameworkDTO(frameworkEntity.getType(), frameworkEntity.getName(), frameworkEntity.getContent());
        return frameworkDTO;
    }



}
