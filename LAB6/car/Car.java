package pjatk.car;

import java.util.Objects;

public abstract class Car {
    protected int speed;
    protected int speedLimit;
    private final String color;
    private final String manufacturer;
    private final int manufactureYear;

    public Car(int speedLimit, String color, String manufacturer, int manufactureYear) {
        this.speedLimit = speedLimit;
        this.color = color;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", speedLimit=" + speedLimit +
                ", color='" + color + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufactureYear=" + manufactureYear +
                '}';
    }
    @Override
    public boolean equals(final Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        final Car car = (Car) o;

        if (manufactureYear != car.manufactureYear) return false;
        if (!color.equals(car.color)) return false;
        return manufacturer.equals(car.manufacturer);
    }
    @Override
    public int hashCode() {
        return Objects.hash(speed,speedLimit, color, manufacturer, manufactureYear);
    }

    public abstract void accelerate();

}
