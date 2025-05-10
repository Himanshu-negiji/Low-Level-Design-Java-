package DecoratorPattern.Decorator;

import DecoratorPattern.BasePizza;

public class ToppingDecorator extends BasePizza {

    @Override
    public int getCost() {
        return 0;
    }
}
