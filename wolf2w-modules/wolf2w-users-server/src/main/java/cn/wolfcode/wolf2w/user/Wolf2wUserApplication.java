package cn.wolfcode.wolf2w.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("cn.wolfcode.wolf2w.user.mapper")
@SpringBootApplication
public class Wolf2wUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(Wolf2wUserApplication.class, args);
    }
}
