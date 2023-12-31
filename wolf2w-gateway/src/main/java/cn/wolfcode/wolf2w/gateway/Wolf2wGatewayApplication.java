package cn.wolfcode.wolf2w.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.swing.*;

@SpringBootApplication
@EnableDiscoveryClient
public class Wolf2wGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(Wolf2wGatewayApplication.class, args);
    }
}
