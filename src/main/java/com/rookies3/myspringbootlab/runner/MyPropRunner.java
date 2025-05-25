package com.rookies3.myspringbootlab.runner;

import com.rookies3.myspringbootlab.config.MyEnvironment;
import com.rookies3.myspringbootlab.property.MyPropProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyPropRunner implements ApplicationRunner {
    @Value("${myprop.username}")
    private String name;

    @Value("${myprop.port}")
    private int port;

    @Autowired
    MyPropProperties properties;

    @Autowired
    MyEnvironment environment;


    private Logger logger = LoggerFactory.getLogger(MyPropRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info(name);
        logger.debug("{}",port);

        logger.info("{}",environment);

        logger.info(properties.getUsername());
        logger.debug("{}",properties.getPort());
    }

}
