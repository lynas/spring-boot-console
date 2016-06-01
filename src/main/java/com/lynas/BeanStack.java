package com.lynas;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by LynAs on 02-Jun-16
 */
@Component
public class BeanStack {

    @Bean
    public Student student() {
        return new Student();
    }
}
