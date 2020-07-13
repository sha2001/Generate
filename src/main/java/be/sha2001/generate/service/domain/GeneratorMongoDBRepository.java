package be.sha2001.generate.service.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

interface GeneratorMongoDBRepository extends MongoRepository<ServiceDefinition, String> {
}
