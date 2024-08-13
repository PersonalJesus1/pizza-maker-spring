package org.pizzamaker.Topping;

import org.springframework.stereotype.Component;

@Component
public class BeconTopping implements Topping {
    public String getName() {
        return "Becon";
    }
}
