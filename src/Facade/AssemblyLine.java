package Facade;

import Facade.baseClases.BaseWorkHandler;
import Facade.baseClases.Car;
import Facade.baseClases.CarConfiguration;
import Facade.manufacturing.BatteryWorkHandler;
import Facade.manufacturing.MotorsWorkHandler;
import Facade.manufacturing.PaintWorkHandler;
import Facade.manufacturing.WorkType;
import Facade.service.CivilModels;
import Facade.service.IndustrialModels;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AssemblyLine {
    List<CarConfiguration> civils = new CivilModels().getAll();
    List<CarConfiguration> industrials = new IndustrialModels().getAll();
    List<CarConfiguration> allCars = new ArrayList<>();

    BaseWorkHandler baseWorkHandler = new PaintWorkHandler();
    BatteryWorkHandler batteryWorkHandler = new BatteryWorkHandler();
    MotorsWorkHandler motorsWorkHandler = new MotorsWorkHandler();

    public AssemblyLine(){
        allCars.addAll(civils);
        allCars.addAll(industrials);



        baseWorkHandler.setNext(batteryWorkHandler);
        batteryWorkHandler.setNext(motorsWorkHandler);
    }

    public CarConfiguration findConfiguration(String name) {
        for (CarConfiguration c : allCars) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return new CarConfiguration(null, null, null, null);
    }

    public Car assemble(Car car, String name, int colorIndex, int batteryIndex, int motorIndex) {
        CarConfiguration carConfiguration = this.findConfiguration(name);
        if(carConfiguration.getName() == null){
            System.out.println("There is no such a model");
            return car;
        }

        String color = carConfiguration.getColors().get(colorIndex);
        Integer battery = carConfiguration.getBatteries().get(batteryIndex);
        Integer power = carConfiguration.getPowers().get(motorIndex);

        baseWorkHandler.work(car, color, WorkType.PAINT);
        baseWorkHandler.work(car, battery, WorkType.BATTERY);
        baseWorkHandler.work(car, power, WorkType.MOTORS);
        car.setName(name);

        return car;
    }
}
