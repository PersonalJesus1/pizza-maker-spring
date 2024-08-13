package org.pizzamaker.Pizza;

import org.pizzamaker.Dough.Dough;
import org.pizzamaker.Dough.YeastDough;
import org.pizzamaker.Topping.MushroomsTopping;
import org.pizzamaker.Topping.OlivesTopping;
import org.pizzamaker.Topping.PeperoniTopping;
import org.pizzamaker.Topping.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ItalianPizza implements Pizza {
    private Dough yeastDough;
    private Topping peperoniTopping;
    private Topping olivesTopping;
    private Topping mushroomsTopping;

    public ItalianPizza(@Autowired @Qualifier("yeastDough") Dough yeastDough,
                        @Autowired @Qualifier("peperoniTopping") Topping peperoniTopping,
                        @Autowired @Qualifier("olivesTopping") Topping olivesTopping,
                        @Autowired @Qualifier("mushroomsTopping") Topping mushroomsTopping) {
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
