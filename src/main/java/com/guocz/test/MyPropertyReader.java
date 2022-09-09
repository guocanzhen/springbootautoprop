package com.guocz.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author guocz
 * @date 2022/9/2 15:07
 */
public class MyPropertyReader {

    public static Properties readPropertyForMe(String path) {
        Properties properties = new Properties();
        InputStream in = MyPropertyReader.class.getResourceAsStream(path);
        try {
            properties.load(in);
        } catch (IOException e) {
            System.out.println("读取异常");
            throw new RuntimeException(e);
        }
        return properties;
    }
}
