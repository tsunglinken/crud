package com.tutorial.crud.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MvcConfiguration extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager manager) {
        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        resolver.setContentNegotiationManager(manager);

        // Define all possible view resolvers
        List<ViewResolver> resolvers = new ArrayList<>();

        // JSP View Resolver
        InternalResourceViewResolver jspResolver = new InternalResourceViewResolver(
                "/WEB-INF/views/", ".jsp");

        resolvers.add(jspResolver);
        resolver.setViewResolvers(resolvers);

        return resolver;
    }

    /**
     * Content Negotiation (CNVR) :
     * According to Request's URL suffix, URL parameter and HTTP Header Accept determine Response
     */
    @Override
    public void configureContentNegotiation(
            ContentNegotiationConfigurer configurer) {
        // Simple strategy: only path extension is taken into account
        configurer.favorPathExtension(true).ignoreAcceptHeader(true)
                .defaultContentType(MediaType.TEXT_HTML);
    }

}