package com.zzx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author: 周志雄
 * @Description: SLF4J
 * @date: 2022-08-25 15:25
 * @ClassName: Slf4JTest
 */

public class Slf4JTest {
    // 声明日志对象
    public final static Logger LOGGER = LoggerFactory.getLogger(Slf4JTest.class);

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
        // 将系统异常信息写入日志
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            // e.printStackTrace();
            LOGGER.info("出现异常：", e);
        }
    }
}
