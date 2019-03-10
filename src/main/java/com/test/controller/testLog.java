package com.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class testLog {

    private final static Logger logger = LoggerFactory.getLogger(testLog.class);

    public static void main(String[] args){
        logger.info("logger info");
    }
}
