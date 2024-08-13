package org.pizzamaker.Dough;
import org.springframework.stereotype.Component;

@Component
public class YeastDough implements Dough {
    public String getName() {
        return "Yeast dough";
    }
}
