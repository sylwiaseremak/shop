package shop;

public class Product {


    public String id;
    public String name;
    public double price;


    public Product(String idIn, String nameIn, String priceIn){
        id = idIn;
        name = nameIn;
        price = Double.parseDouble(priceIn);
    }

    public Product(String idInBasket, String nameInBasket, double priceInBasket){
        id = idInBasket;
        name = nameInBasket;
        price = priceInBasket;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }




}
