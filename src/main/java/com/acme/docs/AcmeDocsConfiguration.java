package com.acme.docs;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// START SNIPPET: acme-config
@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(AcmeDocsConfigurationProperties.class)
public class AcmeDocsConfiguration {
    private final AcmeDocsConfigurationProperties properties;

    @Bean
    AcmeProperty acmeConfig(){
        return new AcmeProperty(properties.getSomeProperty());
    }
}
// END SNIPPET: acme-config