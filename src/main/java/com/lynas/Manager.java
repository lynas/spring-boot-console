package com.lynas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by LynAs on 02-Jun-16.
 */
@Component
public class Manager {

    @Autowired
    Student student;

    public void doingManagerThing() {
        student.doSomething();
    }
}
