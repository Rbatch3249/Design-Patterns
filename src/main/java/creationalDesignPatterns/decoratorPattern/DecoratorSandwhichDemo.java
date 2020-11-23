package creationalDesignPatterns.decoratorPattern;
//adding functionality to simplesandwhich we didn't have before
//modifying the structure of simplesandwhich
public class DecoratorSandwhichDemo {
    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
