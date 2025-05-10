package DecoratorPattern.Decorator;

import DecoratorPattern.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    private BasePizza pizza;

    public ExtraCheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}
