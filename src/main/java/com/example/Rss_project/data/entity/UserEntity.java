package com.example.Rss_project.data.entity;

import com.example.Rss_project.data.dto.UserDTO;
import jakarta.persistence.*;
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="project_id")
    private ProjectEntity project;

    String user_name;
    String repository_name;

    public UserDTO toDto(){
        return UserDTO.builder()
                .project_id(project.getId())
                .user_name(user_name)
                .repository_name(repository_name)
                .build();
    }
}
