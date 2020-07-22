package cn.ybetter.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.ybetter.data.dao")
public class GainExperienceDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(GainExperienceDataApplication.class, args);
    }

}
