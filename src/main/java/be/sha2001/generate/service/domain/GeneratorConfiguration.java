package be.sha2001.generate.service.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class GeneratorConfiguration {


    @Bean
    GeneratorFacade generatorFacade(GeneratorMongoDBRepository generatorRepository) {
        GeneratorCreator generatorCreator = new GeneratorCreator();
        return new GeneratorFacade(generatorRepository, generatorCreator);
    }

}
