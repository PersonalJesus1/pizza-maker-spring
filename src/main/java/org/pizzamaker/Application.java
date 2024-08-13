package org.pizzamaker;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.io.BufferedReader;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        BufferedReader READER=context.getBean("bufferedReader", BufferedReader.class);
        PizzaMaker pizzaMaker=context.getBean("pizzaMaker", PizzaMaker.class);
        pizzaMaker.main(READER);
        context.close();
    }
}
