package creationalDesignPatterns.myOwnDecorator;

public class JacketDecorator extends OutfitDecorator{

    public JacketDecorator(Outfit customOutfit){
        super(customOutfit);
    }
    public String putTogetherOutfit(){
        return customOutfit.putTogetherOutfit() + addJacket();
    }
    public String addJacket() {
        return " + Winter Jacket";
    }
}
