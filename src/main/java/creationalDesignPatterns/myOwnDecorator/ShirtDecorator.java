package creationalDesignPatterns.myOwnDecorator;

import creationalDesignPatterns.decoratorPattern.Sandwich;

public class ShirtDecorator extends OutfitDecorator{

    public ShirtDecorator(Outfit customOutfit) {
        super(customOutfit);
    }
        public String putTogetherOutfit(){
            return customOutfit.putTogetherOutfit() + addShirt();
        }
        private String addShirt(){
            return " + Stripped Sweater";
        }
}
