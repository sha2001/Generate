package be.sha2001.generate.service.domain;

import be.sha2001.generate.service.dto.MethodDTO;
import be.sha2001.generate.service.dto.ServiceDefinitionDTO;

import java.util.UUID;
import java.util.stream.Collectors;

class GeneratorCreator {
        ServiceDefinition fromDto(ServiceDefinitionDTO serviceDefinitionDTO) {
                return ServiceDefinition
                        .builder()
                        .name(serviceDefinitionDTO.getName())
                        .id(UUID.randomUUID().toString())
                        .methods(serviceDefinitionDTO.getMethods().stream().map(this::fromDto).collect(Collectors.toList()))
                        .build();

        }


        Method fromDto(MethodDTO methodDTO) {
                return Method.builder()
                        .name(methodDTO.getName())
                        .path(methodDTO.getPath())
                        .returnObject(methodDTO.getReturnObject())
                        .type(Type.valueOf(methodDTO.getType().name()))
                        .build();
        }
}
