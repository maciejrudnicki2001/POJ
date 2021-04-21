package pjatk.order;

import java.util.ArrayList;

public class Order {
    public final ArrayList<Item> positions;
    public int max;

    public Order(ArrayList<Item> positions, int max) {
        this.positions = positions;
        this.max = max;
    }

    public Order(final ArrayList<Item> positions)
    {
        this(positions,10);
    }

    public void addPosition(final Item position)
    {
        if(this.positions.size() == max)
        {
            return;
        }
        this.positions.add(position);
    }

    @Override
    public String toString() {
        return "positions=" + positions + "\n";
    }
}
