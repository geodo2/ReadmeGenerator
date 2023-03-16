package com.example.Rss_project.data.service.Impl;

import com.example.Rss_project.data.dto.FrameworkDTO;
import com.example.Rss_project.data.entity.FrameworkEntity;
import com.example.Rss_project.data.handler.FrameworkHandler;
import com.example.Rss_project.data.service.FrameworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public FrameworkDTO saveFramework(String id, String name, String content){
        FrameworkEntity frameworkEntity = frameworkHandeler.saveFrameworkEntity(id, name, content);

        FrameworkDTO frameworkDTO = new FrameworkDTO(frameworkEntity.getId(), frameworkEntity.getName(), frameworkEntity.getContent());
        return frameworkDTO;
    }

    @Override
    public FrameworkDTO getFramework(String id){
        FrameworkEntity frameworkEntity = frameworkHandeler.getFrameworkEntity(id);

        FrameworkDTO frameworkDTO = new FrameworkDTO(frameworkEntity.getId(), frameworkEntity.getName(), frameworkEntity.getContent());
        return frameworkDTO;
    }

}
