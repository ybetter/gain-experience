package cn.ybetter.download;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("cn.ybetter.download.dao")
public class AttachmentsApplication {
    public static void main( String[] args ) {
        SpringApplication.run(AttachmentsApplication.class, args);
    }
}
