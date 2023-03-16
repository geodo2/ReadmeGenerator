package com.example.Rss_project.data.dto;
import com.example.Rss_project.data.entity.FrameworkEntity;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class FrameworkDTO {
    @NotNull
    private String id;
    @NotNull
    private String name;
    private String content;

    public FrameworkEntity toEntity(){
        return FrameworkEntity.builder()
                .id(id)
                .name(name)
                .content(content)
                .build();

    }
}