package be.sha2001.generate.service.domain;

import org.springframework.data.repository.Repository;

import java.util.List;

interface GeneratorRepository extends Repository<ServiceDefinition, String> {
    List<ServiceDefinition> findAll();

    List<ServiceDefinition> findByName(String name);

    ServiceDefinition save(ServiceDefinition serviceDefinition);
}
