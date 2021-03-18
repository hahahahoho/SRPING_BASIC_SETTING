package com.market79.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * 참고 URL
 * https://dev-pengun.tistory.com/entry/Spring-Boot-CORS-%EC%84%A4%EC%A0%95%ED%95%98%EA%B8%B0
*/
//CORS문제 허용
@Configuration
public class WebConfig  implements WebMvcConfigurer{
	@Override
    public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
    }
}
