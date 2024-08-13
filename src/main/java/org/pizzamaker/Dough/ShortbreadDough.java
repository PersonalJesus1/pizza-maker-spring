package org.pizzamaker.Dough;
import org.springframework.stereotype.Component;

@Component
public class ShortbreadDough implements Dough{
    public String getName() {
        return "Shortbread dough";
    }
}
