package com.devstofi;

import com.devstofi.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)

@SpringBootApplication
public class ShpDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShpDashboardApplication.class, args);
	}

}
