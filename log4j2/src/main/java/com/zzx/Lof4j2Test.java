package com.zzx;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author: 周志雄
 * @Description: Log4j2
 * @date: 2022-08-25 16:41
 * @ClassName: Lof4j2Test
 */

public class Lof4j2Test {
    private static final Logger LOGGER= LogManager.getLogger(Lof4j2Test.class);

    public static void main(String[] args) {
        //打印日志信息
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
        // 使用占位符输出日志信息
        String name = "jack";
        Integer age = 18;
        LOGGER.info("用户：{},{}", name, age);
    }
}
