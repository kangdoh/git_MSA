package org.pmh.conf;

import org.pmh.components.AA;
import org.pmh.components.BB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// IOC라는 spring 객체 담는 통, 이라고 생각하자
@Configuration
public class MyConf {

    @Bean
    public AA aa(){
        return new AA();
    }
    @Bean
    public BB bb(){
        return new BB();
    }




}