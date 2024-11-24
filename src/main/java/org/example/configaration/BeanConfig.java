package org.example.configaration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
@Configuration
public class BeanConfig {
    @Bean
    @Primary   // Take this to frk sr project
    @Lazy(value = false)   // Take this to frk sr project
    public ModelMapper createModelMapperObject() {
        return new ModelMapper();
    }
}
