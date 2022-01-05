package Facade.service;

import Facade.baseClases.CarConfiguration;

import java.util.ArrayList;
import java.util.List;

public class IndustrialModels {
    private List<CarConfiguration> cars = new ArrayList<>();

    public IndustrialModels(){
        List<String> color = new ArrayList<String>();
        color.add("gray");
        color.add("white");
        List<Integer> battery = new ArrayList<Integer>();
        battery.add(384);
        List<Integer> power = new ArrayList<Integer>();
        power.add(240);
        power.add(360);
        CarConfiguration car = new CarConfiguration("Semi", color, battery, power);
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
