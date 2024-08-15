package org.pizzamaker.Pizza;

import org.pizzamaker.Dough.Dough;
import org.pizzamaker.Topping.Topping;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AsianPizza implements Pizza {
    private Dough shortbreadDough;
    private Topping hamTopping;
    private Topping cucumbersTopping;
    private Topping olivesTopping;

    public AsianPizza( @Qualifier("shortbreadDough") Dough shortbreadDough,
                       @Qualifier("hamTopping") Topping hamTopping,
                       @Qualifier("cucumbersTopping") Topping cucumbersTopping,
                       @Qualifier("olivesTopping") Topping olivesTopping) {
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