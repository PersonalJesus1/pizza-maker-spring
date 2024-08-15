package org.pizzamaker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import java.io.BufferedReader;
import java.io.InputStreamReader;

@Configuration
@ComponentScan("org.pizzamaker")
public class AppConfiguration {

    @Bean
    public BufferedReader bufferedReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

    @Bean
    public PizzaMaker pizzaMaker() {
        return new PizzaMaker();
    }






}
