package creationalDesignPatterns.myOwnDecorator;

import creationalDesignPatterns.decoratorPattern.Sandwich;

public class PantsDecorator extends OutfitDecorator{

    public PantsDecorator(Outfit customOutfit){
        super(customOutfit);
    }
    public String putTogetherOutfit(){
        return customOutfit.putTogetherOutfit() + addPants();
    }
    private String addPants(){
        return " + ripped jeans";
    }
}
