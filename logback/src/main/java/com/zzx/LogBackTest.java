package com.zzx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: 周志雄
 * @Description: LogBack
 * @date: 2022-08-25 16:06
 * @ClassName: LogBackTest
 */

public class LogBackTest {

    private static final Logger LOGGER= LoggerFactory.getLogger(LogBackTest.class);

    public static void main(String[] args) {

        //打印日志信息
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");

    }
}
