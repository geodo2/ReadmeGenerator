package com.example.Rss_project.data.entity;

import com.example.Rss_project.data.dto.ProjectDTO;
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
@Table(name = "Project")
public class ProjectEntity {
    @Id
    String id;
    @Id
    String file_name;
    @Id
    String file_path;
    String file_content;
    public ProjectDTO toDto(){
        return ProjectDTO.builder()
                .id(id)
                .file_name(file_name)
                .file_path(file_path)
                .file_content(file_content)
                .build();
    }
}
