package shop;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        Shop shop = new Shop();

        shop.addProduct("A", "koszulka", "25.59" );
        shop.addProduct("B", "sweter", "34.99");
        shop.addProduct("C", "sukienka", "65.89");
        shop.addProduct("D", "spodnie", "68.99" );
        shop.addProduct("E", "kurtka", "145.99");

        System.out.println("W sklepie znajduje się " + shop.getSize() + " rodzajów produktów: ");

        for(int i = 0; i < shop.getSize(); i++){
            System.out.println("\nId: " + shop.getProduct(i).getId() +
            "\nNazwa: " + shop.getProduct(i).getName() +
            "\nCena: " + shop.getProduct(i).getPrice() + "zł");
        }

        System.out.println();
        Basket basket = new Basket();
        System.out.println("Co chcesz kupić? Wpisz nr id produktu, który chcesz kupić:");

        char response = scan.nextLine().toUpperCase().charAt(0);

        while(response != '0') {
            if (response == 'A') {
                System.out.println("Wybrałeś produkt: " + shop.getProduct(0).getName() +
                        " w cenie " + shop.getProduct(0).getPrice() + "zł");
                basket.addProductToBasket(shop.getProduct(0).getId(), shop.getProduct(0).getName(),
                        shop.getProduct(0).getPrice());
            } else if (response == 'B') {
                System.out.println("Wybrałeś produkt: " + shop.getProduct(1).getName() +
                        " w cenie " + shop.getProduct(1).getPrice() + "zł");
                basket.addProductToBasket(shop.getProduct(1).getId(), shop.getProduct(1).getName(),
                        shop.getProduct(1).getPrice());
            } else if (response == 'C') {
                System.out.println("Wybrałeś produkt: " + shop.getProduct(2).getName() +
                        " w cenie " + shop.getProduct(2).getPrice() + "zł");
                basket.addProductToBasket(shop.getProduct(2).getId(), shop.getProduct(2).getName(),
                        shop.getProduct(2).getPrice());
            } else if (response == 'D') {
                System.out.println("Wybrałeś produkt: " + shop.getProduct(3).getName() +
                        " w cenie " + shop.getProduct(3).getPrice() + "zł");
                basket.addProductToBasket(shop.getProduct(3).getId(), shop.getProduct(3).getName(),
                        shop.getProduct(3).getPrice());
            } else if (response == 'E') {
                System.out.println("Wybrałeś produkt: " + shop.getProduct(4).getName() +
                        " w cenie " + shop.getProduct(4).getPrice() + "zł");
                basket.addProductToBasket(shop.getProduct(4).getId(), shop.getProduct(4).getName(),
                        shop.getProduct(4).getPrice());
            } else {
                System.out.println("Błędny nr id");
            }
            System.out.println("Wpisz nr id kolejnego produktu, który chcesz kupić. Jeśli" +
                    " chcesz zakończyć zakupy wpisz 0 ");
            response = scan.nextLine().toUpperCase().charAt(0);
        }

        if(basket.getSize() != 0) {
            System.out.println("W Twoim koszyku znajdują się następujące produkty:");
            for (int i = 0; i < basket.getSize(); i++) {
                System.out.println(basket.getProductFromBasket(i).getName() +
                        " za " + basket.getProductFromBasket(i).getPrice() + "zł");
            }

            double sum = 0;
            for (int i = 0; i < basket.getSize(); i++) {
                sum += basket.getProductFromBasket(i).getPrice();
            }

            if (basket.getSize() >= 4) {
                sum *= .9D;
                sum = Math.floor(sum * 100) / 100;
                System.out.println("Suma Twoich zakupów wynosi: " + sum + " zł. Udzielono rabatu 10% wartości zakupów.");
            } else {
                System.out.println("Suma Twoich zakupów wynosi: " + sum + " zł.");
            }
        }



























    }
}
