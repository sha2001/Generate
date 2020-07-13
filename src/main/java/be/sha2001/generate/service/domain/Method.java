package be.sha2001.generate.service.domain;

import be.sha2001.generate.service.dto.MethodDTO;
import be.sha2001.generate.service.dto.TypeDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;


@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Method {

    private Type type;
    private String path;
    private String name;
    private List<Parameter> parameters;
    private String returnObject;


    MethodDTO dto() {
        return MethodDTO.builder()
                .name(getName())
                .path(getPath())
                .type(TypeDTO.valueOf(getType().name()))
                .build();

    }
}

