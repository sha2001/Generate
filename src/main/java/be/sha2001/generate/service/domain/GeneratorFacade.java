package be.sha2001.generate.service.domain;

import be.sha2001.generate.service.dto.ServiceDefinitionDTO;
import lombok.extern.java.Log;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Log
public class GeneratorFacade {

    private GeneratorRepository generatorRepository;
    private GeneratorCreator generatorCreator;

    public GeneratorFacade(GeneratorRepository generatorRepository, GeneratorCreator generatorCreator) {
        this.generatorRepository = generatorRepository;
        this.generatorCreator = generatorCreator;
    }

    public void create(ServiceDefinitionDTO serviceDefinitionDTO) {

        ServiceDefinition service = generatorCreator.fromDto(serviceDefinitionDTO);
        generatorRepository.save(service);
    }

    public List<ServiceDefinitionDTO> getServices() {
        return generatorRepository.findAll().stream().map(ServiceDefinition::dto).collect(Collectors.toList());
    }

    public List<ServiceDefinitionDTO> getService(String name) {
        return generatorRepository.findByName(name).stream().map(ServiceDefinition::dto).collect(Collectors.toList());
    }
}
