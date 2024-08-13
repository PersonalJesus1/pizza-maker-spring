package org.pizzamaker.Topping;

import org.springframework.stereotype.Component;

@Component
public class CucumbersTopping implements Topping {
    public String getName() {
        return "Cucumbers";
    }
}
