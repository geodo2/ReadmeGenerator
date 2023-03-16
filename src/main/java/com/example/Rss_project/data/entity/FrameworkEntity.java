package com.example.Rss_project.data.entity;

import com.example.Rss_project.data.dto.FrameworkDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "Framework")
public class FrameworkEntity {
    @Id
    String id;
    String name;
    String content;

    public FrameworkDTO toDto(){
        return FrameworkDTO.builder()
                .id(id)
                .name(name)
                .content(content)
                .build();
    }
}
