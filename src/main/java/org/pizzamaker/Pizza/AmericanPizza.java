package org.pizzamaker.Pizza;

import org.pizzamaker.Dough.Dough;
import org.pizzamaker.Topping.Topping;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AmericanPizza implements Pizza {
    private Dough yeastDough;
    private Topping cucumbersTopping;
    private Topping tomatoesTopping;
    private Topping beconTopping;

    public AmericanPizza( @Qualifier("yeastDough") Dough yeastDough,
                        @Qualifier("cucumbersTopping") Topping cucumbersTopping,
                          @Qualifier("tomatoesTopping") Topping tomatoesTopping,
                          @Qualifier("beconTopping") Topping beconTopping) {
        this.yeastDough = yeastDough;
        this.cucumbersTopping = cucumbersTopping;
        this.tomatoesTopping = tomatoesTopping;
        this.beconTopping = beconTopping;
    }

    public AmericanPizza bake() {
        System.out.println("Your American pizza is ready!" + "\n" +
                "Ingredients: yeast dough, cucumbers,tomatoes, becon");
        return this;
    }
}