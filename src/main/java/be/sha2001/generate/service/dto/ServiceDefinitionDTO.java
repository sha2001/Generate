package be.sha2001.generate.service.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ServiceDefinitionDTO {
    String name;
    List<MethodDTO> methods;
}
