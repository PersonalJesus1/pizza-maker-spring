package org.pizzamaker.PizzaFactory;


import org.pizzamaker.Pizza.AsianPizza;
import org.pizzamaker.Pizza.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AsianPizzaFactory implements PizzaFactory {
    @Autowired
    private AsianPizza asianPizza;
    @Override
    public Pizza createPizza() {
        return asianPizza;
    }
    public AsianPizza getAsianPizza() {
        return asianPizza;
    }
    @Autowired
    public void setAsianPizza(AsianPizza asianPizza) {
        this.asianPizza = asianPizza;
    }
}
