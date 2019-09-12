package com.huawei.hesian.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@SpringBootApplication
public class HessianClientApplication {
    public static void main(String[] args) {
		SpringApplication.run(HessianClientApplication.class, args);
	}
    
    @Bean
    public HessianProxyFactoryBean helloClient() {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:8988/HelloWorldService");
        factory.setServiceInterface(HelloWorldService.class);
        return factory;
    }
}
