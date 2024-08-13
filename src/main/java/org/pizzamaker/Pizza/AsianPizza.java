package org.pizzamaker.Pizza;

import org.pizzamaker.Dough.Dough;
import org.pizzamaker.Topping.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AsianPizza implements Pizza {
    private Dough shortbreadDough;
    private Topping hamTopping;
    private Topping cucumbersTopping;
    private Topping olivesTopping;

    public AsianPizza(@Autowired @Qualifier("shortbreadDough") Dough shortbreadDough,
                      @Autowired @Qualifier("hamTopping") Topping hamTopping,
                      @Autowired @Qualifier("cucumbersTopping") Topping cucumbersTopping,
                      @Autowired @Qualifier("olivesTopping") Topping olivesTopping) {
        this.shortbreadDough = shortbreadDough;
        this.hamTopping = hamTopping;
        this.cucumbersTopping = cucumbersTopping;
        this.olivesTopping = olivesTopping;
    }

    public AsianPizza bake() {
        System.out.println("Your Asian pizza is ready!" + "\n" +
                "Ingredients: shortbread dough, ham, cucumbers, olives");
        return this;
    }
}