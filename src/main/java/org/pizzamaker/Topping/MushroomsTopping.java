package org.pizzamaker.Topping;
import org.springframework.stereotype.Component;

@Component
public class MushroomsTopping implements Topping {
    public String getName() {
        return "Mushrooms";
    }
}
