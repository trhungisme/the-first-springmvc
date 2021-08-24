package com.hust.hedspi.thefirstspringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration                  //là một chú thích chỉ ra rằng một đối tượng là một nguồn gốc của các định nghĩa bean.
@EnableWebMvc                   //định nghĩa spring mvc tương tự như mvc:annotation-driven/ trong xml
@ComponentScan(basePackages = {         //quét các chú thích định kiến (@Controller, @Service vv ...) trong một gói theo quy định của basePackages thuộc tính.
        "com.hust.hedspi.thefirstspringmvc"
})
public class AppConfig {
    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();         //lớp để định nghĩa các resource
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
