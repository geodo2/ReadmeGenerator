package com.example.Rss_project.data.dto;

import com.example.Rss_project.data.entity.FrameworkEntity;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class FrameworkDTO {
    @NotNull
    private String name;
    @NotNull
    private String Type;
    private String content;

    public FrameworkEntity toEntity(){
        return FrameworkEntity.builder()
            .name(name)
            .Type(Type)
            .content(content)
            .build();

    }
}