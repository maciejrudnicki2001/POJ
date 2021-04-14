package pjatk.shop;

public class Shop {
    public final String address;
    public final String size;

    public Shop(){
        address = "";
        size = "";

    }


    public Shop(String address, String size) {
        this.address = address;
        this.size = size;
    }

    public void getInformation(String address, String size){
        System.out.println("Adres:" + address + "Wielkość Sklepu:" + size);
    }
}
