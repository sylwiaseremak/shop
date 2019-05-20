package shop;

import java.util.ArrayList;

public class Shop {

    ArrayList list = new ArrayList();

    public void addProduct(String id, String name, String price ){
        Product product = new Product(id, name, price );
        list.add(product);
    }

    public Product getProduct(int n){
        return (Product) list.get(n);
    }

    public int getSize(){
        return list.size();
    }










}
