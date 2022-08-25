package com.zzx;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author: 周志雄
 * @Description: JCL
 * @date: 2022-08-25 10:43
 * @ClassName: JclTest
 */

public class JclTest {
    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        Log log = LogFactory.getLog(JclTest.class);
        log.info("JCL");
    }
}
