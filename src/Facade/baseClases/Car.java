package Facade.baseClases;

import java.util.ArrayList;
import java.util.List;

public class Car {
    String color;
    Integer battery;
    Integer power;
    String name;

    public void setColor(String color) {
        this.color = color;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name +
                ": color='" + color + '\'' +
                ", battery=" + battery +
                ", power=" + power;
    }
}
