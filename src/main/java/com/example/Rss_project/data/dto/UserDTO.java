package com.example.Rss_project.data.dto;
import com.example.Rss_project.data.entity.UserEntity;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserDTO {
    @NotNull
    private String project_id;
    @NotNull
    private String user_name;
    private String repository_name;

    public UserEntity toEntity(){
        return UserEntity.builder()
                .project_id(project_id)
                .user_name(user_name)
                .repository_name(repository_name)
                .build();
    }
}