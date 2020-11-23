package creationalDesignPatterns.decoratorPattern;

public class SimpleSandwich implements Sandwich {

    @Override
    public String make(){
        return "Bread";
    }
}
