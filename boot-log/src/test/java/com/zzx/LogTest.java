package com.zzx;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: 周志雄
 * @Description: Test
 * @date: 2022-08-25 17:36
 * @ClassName: LogTest
 */

@SpringBootTest
public class LogTest {

    private static final Logger LOGGER= LoggerFactory.getLogger(LogTest.class);

    @Test
    public void test01(){

        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");  //默认
        LOGGER.debug("debug");
        LOGGER.trace("trace");


        //使用log4j2使用桥接器切换为slf4j门面和log4j2实现
        org.apache.logging.log4j.Logger logger= LogManager.getLogger(LogTest.class);
        logger.info("log4j2--->info");
    }
}
