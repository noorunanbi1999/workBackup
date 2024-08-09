package com.sonata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class SpringMvcExampleApplication {
//    @Bean//This is how we set the view resolver to point the server towards the view page with .jsp extension that we made in the View folder in the src 
//	//folder
//    public InternalResourceViewResolver getViewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("/WEB-INF/view/");
//        viewResolver.setSuffix(".jsp");
//        return viewResolver;
//    }
	public static void main(String[] args) {
		SpringApplication.run(SpringMvcExampleApplication.class, args);
	}

}
