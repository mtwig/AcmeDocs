package com.acme.docs;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

// START SNIPPET: config-props

@Validated
@RequiredArgsConstructor
@ConstructorBinding
@Getter
@ConfigurationProperties(prefix = "org.acme")
public class AcmeDocsConfigurationProperties {
    private final String someProperty;
}

// END SNIPPET: config-props
