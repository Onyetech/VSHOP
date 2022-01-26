package com.ikenna.vshop.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SwaggerConfig implements WebMvcConfigurer {
    @Bean
    public Docket swagggerConfiguration() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ikenna.vshop"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiDetails());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("swagger-ui/")
                .addResourceLocations("classpath:/META-INF/resources/");
        registry
                .addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }


    private ApiInfo apiDetails() {
        return new ApiInfo(
                "Vshop",
                "Drugs and Supplements Online Shop Application",
                "1.0",
                "Free to use",
                new springfox.documentation.service.Contact("Ikenna Okonkwo",
                                                              "vshop.com", "hello@vshop.com"),
                "API Licence",
                "http://dev-ikenna.com",
                Collections.emptyList()
        );
    }
}
