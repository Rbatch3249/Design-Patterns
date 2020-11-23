package creationalDesignPatterns.prototypePattern;
//Clone/Cloneable
//avoids keyword "new"
//costly construction not handled by client
//can still utilize parameters for construction
//shallow vs deep copy

public abstract class Item implements Cloneable {
    private String title;
    private double price;
    private String url;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //TODO Auto-generated method stub
        return super.clone();
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }
}
