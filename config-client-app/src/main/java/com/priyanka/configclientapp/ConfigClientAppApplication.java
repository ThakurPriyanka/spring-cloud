package com.priyanka.configclientapp;

import com.priyanka.configclientapp.config.ConfigClientApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(ConfigClientApplication.class)
public class ConfigClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientAppApplication.class, args);
	}

}
