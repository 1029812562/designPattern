package com.learn.designpattern.models.factorymethod;

/**
 * Created by zhengxc on 2019/9/24.
 */
public class Test {

    public static void main(String[] args) {
        ILogger logger = LoggerFactory.getLogger("s");
        logger.info("2323232");
    }

}
