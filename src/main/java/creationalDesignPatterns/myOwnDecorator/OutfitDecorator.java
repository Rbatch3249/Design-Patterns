package creationalDesignPatterns.myOwnDecorator;

public abstract class OutfitDecorator implements Outfit {

    protected Outfit customOutfit;

    public OutfitDecorator(Outfit customOutfit){
        this.customOutfit = customOutfit;
    }
    public String putTogetherOutfit(){
        return customOutfit.putTogetherOutfit();
    }
}
