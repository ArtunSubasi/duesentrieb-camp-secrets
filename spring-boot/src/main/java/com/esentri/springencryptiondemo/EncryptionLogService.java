package com.esentri.springencryptiondemo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EncryptionLogService {

    private final Logger logger = LoggerFactory.getLogger(EncryptionLogService.class);

    @Value("${databaseSecret}")
    private String databaseSecret;

    @PostConstruct
    public void onStart() {
        logger.info("My database secret: '{}'", databaseSecret);
    }

}
