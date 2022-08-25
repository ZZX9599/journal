package com.zzx.jul;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.*;

/**
 * @author: 周志雄
 * @Description: JUL
 * @date: 2022-08-25 8:54
 * @ClassName: JulTest
 */

public class JulTest {

    public static void main(String[] args) throws IOException {
        //test01();
        //test02();
        //test03();
        //test04();
        test05();
    }

    /**
     * 简单使用
     */
    public static void test01() {
        //获取日志记录器对象
        Logger logger = Logger.getLogger("com.zzx.jul.JulTest");
        //日志输出
        logger.info("Hello JUL");
        //通用方法输出日志
        logger.log(Level.INFO,"Hello JUL");
        //占位符输出日志
        logger.log(Level.INFO,"信息:{0} and {1}",new Object[]{"张三","李四"});
    }

    /**
     * 日志级别
     */
    public static void test02(){
        //获取日志记录器对象
        Logger logger = Logger.getLogger("com.zzx.jul.JulTest");
        //日志输出
        logger.severe("severe");
        logger.warning("warn");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }

    /**
     * 自定义Handler和Formatter
     * @throws IOException
     */
    public static void test03() throws IOException {
        //logger只是提供API，实际上处理日志是Handler，Handler是接口，要使用具体的实现类
        Logger logger = Logger.getLogger("com.zzx.jul.JulTest");

        //关闭系统的默认配置
        logger.setUseParentHandlers(false);

        //自定义Handler,handler需要一个格式转换对象【控制台输出】
        //Handler handler=new ConsoleHandler();

        Handler handler=new FileHandler("F:\\jul.log");

        //创建一个简单的格式转换对象
        SimpleFormatter simpleFormatter = new SimpleFormatter();

        //设置格式转换
        handler.setFormatter(simpleFormatter);

        //给logger添加handler
        logger.addHandler(handler);

        //配置logger的自定义日志级别
        logger.setLevel(Level.ALL);
        //配置handler的日志级别
        handler.setLevel(Level.ALL);

        logger.severe("severe");
        logger.warning("warn");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }

    /**
     * 验证父子关系
     */
    public static void test04(){
        //获取日志记录器对象
        Logger logger1 = Logger.getLogger("com.zzx.jul.JulTest");

        Logger logger2 = Logger.getLogger("com.zzx.jul");

        System.out.println(logger1.getParent()==logger2);

        logger2.setLevel(Level.OFF);

        logger1.info("666");
    }

    /**
     * 加载自定义配置文件
     */
    public static void test05() throws IOException {

        //通过类加载器来读取配置文件
        InputStream stream = JulTest.class.getClassLoader().getResourceAsStream("logging.properties");

        //创建日志管理器LogManger
        LogManager logManager = LogManager.getLogManager();

        //加载配置文件
        logManager.readConfiguration(stream);

        //获取日志记录器对象
        Logger logger = Logger.getLogger("com.zzx.jul.JulTest");

        //日志输出
        logger.severe("severe");
        logger.warning("warn");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");

    }
}
