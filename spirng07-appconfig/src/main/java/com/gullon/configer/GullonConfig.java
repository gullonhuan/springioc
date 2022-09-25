package com.gullon.configer;

import com.gullon.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration代表这是一个配置类，就和我们之前看的beans.xml
@Configuration
@ComponentScan("com.gullon.pojo")
@Import(GullonConfig2.class)
public class GullonConfig {
    //注册一个bean，就相当于我们之前写的一个bean标签
    //方法的方法名 ： bean中的id
    //方法的返回值 ： bean中的class
    @Bean
    public User getuser(){
        return new User();
    }
}
