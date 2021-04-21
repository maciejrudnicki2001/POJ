package pjatk.order;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final Order order = new Order(new ArrayList<>());
        order.addPosition(new Item("Sernik", 8, 1));
        order.addPosition(new Item("Olej Kujawski", 1, 6));
        System.out.println("Order: \n" + order );
    }
}
