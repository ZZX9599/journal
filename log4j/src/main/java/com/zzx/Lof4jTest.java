package com.zzx;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * @author: 周志雄
 * @Description: Lof4j
 * @date: 2022-08-25 10:01
 * @ClassName: Lof4jTest
 */

public class Lof4jTest {
    public static void main(String[] args) {
        test02();
    }

    private static void test01() {
        //初始化配置信息
        BasicConfigurator.configure();

        //创建日志记录器
        Logger logger = Logger.getLogger(Lof4jTest.class);

        //输出日志
        logger.info("Log4j");
    }

    private static void test02() {
        //初始化配置信息
        BasicConfigurator.configure();

        //创建日志记录器
        Logger logger = Logger.getLogger(Lof4jTest.class);

        // 日志级别
        logger.fatal("fatal");  // 严重错误，一般会造成系统崩溃和终止运行
        logger.error("error");  // 错误信息，但不会影响系统运行
        logger.warn("warn");    // 警告信息，可能会发生问题
        logger.info("info");    // 程序运行信息，数据库的连接、网络、IO操作等
        logger.debug("debug");  // 调试信息，一般在开发阶段使用，记录程序的变量、参数等
        logger.trace("trace");  // 追踪信息，记录程序的所有流程信息
    }
}
