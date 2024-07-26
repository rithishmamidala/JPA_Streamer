package com.Streamers.JPAStreamers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages={"com.Streamers.JPAStreamers;", "com.speedment.jpastreamer"})
public class JpaStreamersApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaStreamersApplication.class, args);
	}

}
