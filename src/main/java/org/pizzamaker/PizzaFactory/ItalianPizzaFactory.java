package org.pizzamaker.PizzaFactory;

import org.pizzamaker.Pizza.ItalianPizza;
import org.pizzamaker.Pizza.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItalianPizzaFactory implements PizzaFactory {
    @Autowired
    private ItalianPizza italianPizza;
    @Override
    public Pizza createPizza() {
        return italianPizza;
    }
    public ItalianPizza getItalianPizza() {
        return italianPizza;
    }
    @Autowired
    public void setItalianPizza(ItalianPizza italianPizza) {
        this.italianPizza = italianPizza;
    }
}
