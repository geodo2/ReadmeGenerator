package com.example.Rss_project.data.entity;

import com.example.Rss_project.data.dto.UserDTO;
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
@Table(name = "User")
public class UserEntity {
    @Id
    String project_id;
    String user_name;
    String repository_name;

    public UserDTO toDto(){
        return UserDTO.builder()
                .project_id(project_id)
                .user_name(user_name)
                .repository_name(repository_name)
                .build();
    }
}