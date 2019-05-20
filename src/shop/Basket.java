package shop;

import java.util.ArrayList;


public class Basket {

    ArrayList b = new ArrayList();

    public void addProductToBasket(String id, String name, double price){
        Product products = new Product(id, name, price);
        b.add(products);
    }

    public int getSize(){
                return b.size();
    }

    public Product getProductFromBasket(int n){
        return (Product) b.get(n);
    }







}
