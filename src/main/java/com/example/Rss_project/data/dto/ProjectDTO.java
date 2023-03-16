package com.example.Rss_project.data.dto;
import com.example.Rss_project.data.entity.ProjectEntity;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProjectDTO {
    String id;
    String file_name;
    String file_path;
    String file_content;

    public ProjectEntity toEntity(){
        return ProjectEntity.builder()
                .id(id)
                .file_name(file_name)
                .file_path(file_path)
                .file_content(file_content)
                .build();
    }
}