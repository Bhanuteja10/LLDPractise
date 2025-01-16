package Decorator_Pattern.Java;

public class Mushroom extends ToppingDecorator {
   BasePizza pizza;

    public Mushroom(BasePizza pizza) {
         this.pizza = pizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 15;
    }
    
}
