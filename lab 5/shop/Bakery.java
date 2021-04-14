package pjatk.shop;

public class Bakery extends Shop{
    Shop bakery = new Shop("Brzegi 55","150^m2");
    String[] products = new String[] {"Bułka 0.5pln","Chleb 3pln","Pączek co nie ma rączek 1.5pln"};
    public void getInformation(){
        System.out.println("Adres:" + bakery.address + "\nWielkość Sklepu:" + bakery.size);
        for(int i=0; i < products.length; i++){
            System.out.println(products[i]);
        }

    }
}
