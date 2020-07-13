package be.sha2001.generate.service.domain;

import be.sha2001.generate.service.dto.ServiceDefinitionDTO;
import org.springframework.data.repository.Repository;

import java.util.List;

interface GeneratorRepository extends Repository<ServiceDefinition, String> {
    List<ServiceDefinition> findAll();

    List<ServiceDefinitionDTO> findByName(String name);
}
