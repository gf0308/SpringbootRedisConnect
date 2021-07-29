package com.rubypaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60)
@SpringBootApplication
public class SpringRedisSaveTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRedisSaveTestApplication.class, args);
	}

}
