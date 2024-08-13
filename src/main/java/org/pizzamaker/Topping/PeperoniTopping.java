package org.pizzamaker.Topping;
import org.springframework.stereotype.Component;

@Component
public class PeperoniTopping implements Topping{
    public String getName() {
        return "Peperoni";
    }
}
