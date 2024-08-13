package org.pizzamaker.Topping;
import org.springframework.stereotype.Component;

@Component
public class TomatoesTopping implements Topping {
    public String getName() {
        return "Tomatoes";
    }
}
