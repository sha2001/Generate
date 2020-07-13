package be.sha2001.generate.service.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class MethodDTO {

    private TypeDTO type;
    private String path;
    private String name;
    private List<ParameterDTO> parameters;
    private String returnObject;
}
