package creationalDesignPatterns.myOwnDecorator;

public class Underwear implements Outfit {

    @Override
    public String putTogetherOutfit(){
        return "briefs and socks";
    }
}
