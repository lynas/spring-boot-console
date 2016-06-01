package com.lynas;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by LynAs on 01-Jun-16
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .sources(Main.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);

        Main app = context.getBean(Main.class);
        //Student student = context.getBean(Student.class);
        Manager manager = context.getBean(Manager.class);
        app.start();
        //student.doSomething();
        manager.doingManagerThing();
    }

    private void start() {
        System.out.println("Hello World!");
    }
}
