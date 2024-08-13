package org.pizzamaker.Pizza;

import org.pizzamaker.Dough.Dough;
import org.pizzamaker.Topping.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AmericanPizza implements Pizza {
    private Dough yeastDough;
    private Topping cucumbersTopping;
    private Topping tomatoesTopping;
    private Topping beconTopping;

    public AmericanPizza(@Autowired @Qualifier("yeastDough") Dough yeastDough,
                         @Autowired @Qualifier("cucumbersTopping") Topping cucumbersTopping,
                         @Autowired @Qualifier("tomatoesTopping") Topping tomatoesTopping,
                         @Autowired @Qualifier("beconTopping") Topping beconTopping) {
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