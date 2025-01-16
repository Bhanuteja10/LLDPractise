package Decorator_Pattern.Java;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Margherita();
        ToppingDecorator extracheese = new ExtraCheese(pizza);
        System.out.println("Cost of Margherita with Extra Cheese: " + extracheese.cost());
        ToppingDecorator mushroom = new Mushroom(extracheese);
        System.out.println("Cost of Margherita with Extra Cheese and Mushroom: " + mushroom.cost());
    }
    
}
