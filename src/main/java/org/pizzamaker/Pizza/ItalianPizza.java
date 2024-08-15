package org.pizzamaker.Pizza;

import org.pizzamaker.Dough.Dough;
import org.pizzamaker.Topping.Topping;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ItalianPizza implements Pizza {
    private Dough yeastDough;
    private Topping peperoniTopping;
    private Topping olivesTopping;
    private Topping mushroomsTopping;

    public ItalianPizza( @Qualifier("yeastDough") Dough yeastDough,
                         @Qualifier("peperoniTopping") Topping peperoniTopping,
                         @Qualifier("olivesTopping") Topping olivesTopping,
                         @Qualifier("mushroomsTopping") Topping mushroomsTopping) {
        this.yeastDough = yeastDough;
        this.peperoniTopping = peperoniTopping;
        this.olivesTopping = olivesTopping;
        this.mushroomsTopping = mushroomsTopping;
    }

    public Pizza bake() {
        System.out.println("Your Italian pizza is ready!" + "\n" +
                "Ingredients: yeast dough, peperoni, olives, mushrooms");
        return this;
    }

}
