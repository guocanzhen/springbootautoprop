package com.guocz.test;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Properties;

/**
 * @author guocz
 * @date 2022/9/2 14:47
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Properties properties = MyPropertyReader.readPropertyForMe("/MyProperties.properties");
        String s = (String) properties.get(MyEnableAutoConfig.class.getName());
        return new String[]{s};

        // 导入配置类
//        return new String[]{"config.MyConfig"};
    }
}
