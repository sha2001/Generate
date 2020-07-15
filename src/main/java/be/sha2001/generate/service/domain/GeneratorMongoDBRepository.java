package be.sha2001.generate.service.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface GeneratorMongoDBRepository extends GeneratorRepository, MongoRepository<ServiceDefinition, String> {
}
