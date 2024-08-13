package org.pizzamaker.Topping;
import org.springframework.stereotype.Component;

@Component
public class OlivesTopping implements Topping{
    public String getName() {
        return "Olives";
    }
}
