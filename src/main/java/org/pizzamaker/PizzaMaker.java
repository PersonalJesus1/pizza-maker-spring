package org.pizzamaker;

import org.pizzamaker.PizzaFactory.AsianPizzaFactory;
import org.pizzamaker.PizzaFactory.ItalianPizzaFactory;
import org.pizzamaker.PizzaFactory.AmericanPizzaFactory;
import java.io.BufferedReader;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaMaker {
    private int choiceOfPizza;
    private AmericanPizzaFactory americanPizzaFactory;
    private ItalianPizzaFactory italianPizzaFactory;
    private AsianPizzaFactory asianPizzaFactory;

    public void main(BufferedReader reader) {
        boolean isRight = false;
        do {
            try {
                System.out.println("What kind of pizza you would like: 1. American, 2.Italian, 3. Asian, 4. Quit");
                choiceOfPizza = Integer.parseInt(reader.readLine());
                switch (choiceOfPizza) {
                    case 1: {
                        System.out.println(americanPizzaFactory.createPizza().bake());
                        break;
                    }
                    case 2: {
                        System.out.println(italianPizzaFactory.createPizza().bake());
                        break;
                    }
                    case 3: {
                        System.out.println(asianPizzaFactory.createPizza().bake());
                        break;
                    }
                    case 4: {
                        isRight = true;
                        break;
                    }
                    default:
                        System.out.println("You have written a wrong number, try again");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("You have written a wrong information. Try again");
            }
        } while (!isRight);
    }


    public AmericanPizzaFactory getAmericanPizzaFactory() {
        return americanPizzaFactory;
    }

    @Autowired
    public void setAmericanPizzaFactory(AmericanPizzaFactory americanPizzaFactory) {
        this.americanPizzaFactory = americanPizzaFactory;
    }

    public ItalianPizzaFactory getItalianPizzaFactory() {
        return italianPizzaFactory;
    }

    @Autowired
    public void setItalianPizzaFactory(ItalianPizzaFactory italianPizzaFactory) {
        this.italianPizzaFactory = italianPizzaFactory;
    }

    public AsianPizzaFactory getAsianPizzaFactory() {
        return asianPizzaFactory;
    }

    @Autowired
    public void setAsianPizzaFactory(AsianPizzaFactory asianPizzaFactory) {
        this.asianPizzaFactory = asianPizzaFactory;
    }
}


