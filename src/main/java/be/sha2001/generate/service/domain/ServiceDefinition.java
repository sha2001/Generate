package be.sha2001.generate.service.domain;


import be.sha2001.generate.service.dto.ServiceDefinitionDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
class ServiceDefinition {
    @Id
    private String id;

    private String name;
    private List<Method> methods;

    ServiceDefinitionDTO dto() {
        return ServiceDefinitionDTO.builder()
                .name(getName())
                .methods(getMethods().stream().map(Method::dto).collect(Collectors.toList()))
                .build();
    }
}
