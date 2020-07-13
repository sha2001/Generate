package be.sha2001.generate.service;

import be.sha2001.generate.service.domain.GeneratorFacade;
import be.sha2001.generate.service.dto.ServiceDefinitionDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class GeneratorController {

    GeneratorFacade generatorFacade;


    public GeneratorController(GeneratorFacade generatorFacade) {
        this.generatorFacade = generatorFacade;
    }

    @PostMapping("service/create/")
    void create(ServiceDefinitionDTO serviceDefinition) {
        generatorFacade.create(serviceDefinition);
    }

    @GetMapping("services")
    List<ServiceDefinitionDTO> getServices() {
        return generatorFacade.getServices();
    }

    @GetMapping("service/{name}")
    List<ServiceDefinitionDTO> getService(@PathVariable String name) {
        return generatorFacade.getService(name);
    }
}
