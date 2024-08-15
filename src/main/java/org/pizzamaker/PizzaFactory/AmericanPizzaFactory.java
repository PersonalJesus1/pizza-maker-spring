package org.pizzamaker.PizzaFactory;

import org.pizzamaker.Pizza.AmericanPizza;
import org.pizzamaker.Pizza.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AmericanPizzaFactory implements PizzaFactory {

    @Autowired
    private AmericanPizza americanPizza;

    @Override
    public Pizza createPizza() {
        return americanPizza;
    }

}
