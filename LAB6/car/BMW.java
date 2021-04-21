package pjatk.car;

public class BMW extends Car{
    public BMW(final String color, final int manufactureYear) {
        super(color, manufactureYear);
    }

    @Override
    public void accelerate() {
        speed += 30;
        if(speed > speedLimit) {
            speed = speedLimit;
        }
    }
}
