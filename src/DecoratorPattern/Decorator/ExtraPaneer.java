package DecoratorPattern.Decorator;

import DecoratorPattern.BasePizza;

public class ExtraPaneer extends ToppingDecorator {
    private BasePizza pizza;

    public ExtraPaneer(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }
}
