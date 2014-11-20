package com.krissoft.companyassist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
public class DispatcherConfig {
	
	@Bean
	public ViewResolver viewResolver() {
		UrlBasedViewResolver urlBasedViewResolver = new UrlBasedViewResolver();
		urlBasedViewResolver.setSuffix(".zul");
		urlBasedViewResolver.setPrefix("/WEB-INF/views/");
		urlBasedViewResolver.setViewClass(JstlView.class);
		return urlBasedViewResolver;
	}
}