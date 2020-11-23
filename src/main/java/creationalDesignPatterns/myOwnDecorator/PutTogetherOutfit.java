package creationalDesignPatterns.myOwnDecorator;

public class PutTogetherOutfit {
    public static void main(String[] args) {
        Outfit outfit = new JacketDecorator(new PantsDecorator(new ShirtDecorator(new Underwear())));
        System.out.println(outfit.putTogetherOutfit());
    }
}