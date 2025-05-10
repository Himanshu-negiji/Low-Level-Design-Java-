package DecoratorPattern;

import DecoratorPattern.Decorator.ExtraCheese;
import DecoratorPattern.Decorator.ExtraPaneer;

public class Main {
    public static void main(String[] args) {
       BasePizza pizza = new Farmhouse();

        pizza = new ExtraPaneer(new ExtraCheese(pizza));
        System.out.println("Cost of pizza with extra cheese and extra paneer: " + pizza.getCost());

        pizza = new ExtraCheese(pizza);
        System.out.println("Cost of pizza with extra cheese: " + pizza.getCost());

        // Adding extra paneer
        pizza = new ExtraPaneer(pizza);
        System.out.println("Cost of pizza with extra paneer: " + pizza.getCost());

        // Adding extra cheese again
        pizza = new ExtraCheese(pizza);
        System.out.println("Cost of pizza with extra cheese again: " + pizza.getCost());
    }
}
