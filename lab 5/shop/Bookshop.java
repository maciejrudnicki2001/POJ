package pjatk.shop;

public class Bookshop extends Shop {
    Shop book = new Shop("Aleja Rzeczypospolitej 4B", "150m^2");
    String[] products = new String[] {"'To' 50pln", "'O północy w czarnobylu' 35pln", "'Zgroza w Dunwich i inne straszne opowieści' 50pln"};
    public void getInformation(){
        System.out.println("\nAdres:" + book.address + "\nWielkość Sklepu:" + book.size);
        for(int i=0; i < products.length; i++){
            System.out.println(products[i]);
        }

}
}
