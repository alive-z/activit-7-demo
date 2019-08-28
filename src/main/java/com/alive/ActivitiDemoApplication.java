package com.alive;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication(exclude={
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class ActivitiDemoApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(ActivitiDemoApplication.class);
        builder.web(true);
        ApplicationContext ctx = builder.run(args);
        DispatcherServlet dispatcherServlet = ctx.getBean(DispatcherServlet.class);
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(true);
    }
}
