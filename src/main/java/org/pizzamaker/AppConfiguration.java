package org.pizzamaker;

import org.pizzamaker.Dough.ShortbreadDough;
import org.pizzamaker.Dough.YeastDough;
import org.pizzamaker.Pizza.AmericanPizza;
import org.pizzamaker.Pizza.AsianPizza;
import org.pizzamaker.Pizza.ItalianPizza;
import org.pizzamaker.PizzaFactory.AmericanPizzaFactory;
import org.pizzamaker.PizzaFactory.AsianPizzaFactory;
import org.pizzamaker.PizzaFactory.ItalianPizzaFactory;
import org.pizzamaker.Topping.*;
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


    // Topping
    @Bean
    public CucumbersTopping cucumbersTopping() {
        return new CucumbersTopping();
    }

    @Bean
    public TomatoesTopping tomatoesTopping() {
        return new TomatoesTopping();
    }

    @Bean
    public BeconTopping beconTopping() {
        return new BeconTopping();
    }

    @Bean
    public HamTopping hamTopping() {
        return new HamTopping();
    }

    @Bean
    public OlivesTopping olivesTopping() {
        return new OlivesTopping();
    }

    @Bean
    public PeperoniTopping peperoniTopping() {
        return new PeperoniTopping();
    }

    @Bean
    public MushroomsTopping mushroomsTopping() {
        return new MushroomsTopping();
    }

    //Dough
    @Bean
    public ShortbreadDough shortbreadDough() {
        return new ShortbreadDough();
    }

    @Bean
    public YeastDough yeastDough() {
        return new YeastDough();
    }

    //Pizza
    @Bean
    public AmericanPizza americanPizza() {
        return new AmericanPizza(yeastDough(), cucumbersTopping(), tomatoesTopping(), beconTopping());
    }

    @Bean
    public AsianPizza asianPizza() {
        return new AsianPizza(shortbreadDough(), hamTopping(), cucumbersTopping(), olivesTopping());
    }

    @Bean
    public ItalianPizza italianPizza() {
        return new ItalianPizza(yeastDough(),  peperoniTopping(),  olivesTopping(),  mushroomsTopping());
    }

    //Factories
    @Bean
    public AmericanPizzaFactory americanPizzaFactory() {
        return new AmericanPizzaFactory();
    }
    @Bean
    public ItalianPizzaFactory italianPizzaFactory() {
        return new ItalianPizzaFactory();
    }
    @Bean
    public AsianPizzaFactory asianPizzaFactory() {
        return new AsianPizzaFactory();
    }

}
