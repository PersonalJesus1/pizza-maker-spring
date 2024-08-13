package org.pizzamaker.Topping;
import org.springframework.stereotype.Component;

@Component
public class HamTopping implements Topping {
    public String getName() {
        return "Ham";
    }
}
