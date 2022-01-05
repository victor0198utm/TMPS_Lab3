package Facade.service;

import Facade.baseClases.CarConfiguration;

import java.util.ArrayList;
import java.util.List;

public class CivilModels {
    private List<CarConfiguration> cars = new ArrayList<>();

    public CivilModels(){
        List<String> color = new ArrayList<String>();
        color.add("gray");
        color.add("blue");
        List<Integer> battery = new ArrayList<Integer>();
        battery.add(78);
        battery.add(95);
        List<Integer> power = new ArrayList<Integer>();
        power.add(121);
        power.add(242);
        CarConfiguration car = new CarConfiguration("Model X", color, battery, power);
        cars.add(car);

        color = new ArrayList<String>();
        color.add("white");
        color.add("red");
        battery = new ArrayList<Integer>();
        battery.add(52);
        battery.add(74);
        power = new ArrayList<Integer>();
        power.add(129);
        power.add(258);
        car = new CarConfiguration("Model Y", color, battery, power);
        cars.add(car);
    }

    public void show() {
        for (CarConfiguration car: cars) {
            System.out.println("  Tesla " + car.toString());
        }
    }

    public int count() {
        return cars.size();
    }

    public List<CarConfiguration> getAll() {
        return cars;
    }
}
