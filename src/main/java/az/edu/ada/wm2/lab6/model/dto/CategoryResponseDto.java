package az.edu.ada.wm2.lab6.model.dto;

import lombok.Builder;

import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CategoryResponseDto {

    private UUID id;

    private String name;


}
