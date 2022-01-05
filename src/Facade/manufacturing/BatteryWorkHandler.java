package Facade.manufacturing;

import Facade.baseClases.BaseWorkHandler;
import Facade.baseClases.Car;

public class BatteryWorkHandler extends BaseWorkHandler {
    @Override
    public Car work(Car car, int type, WorkType workType) {
        if (workType == WorkType.BATTERY) {
            System.out.println(String.format("Installing battery '%d' kWh", type));
            car.setBattery(type);
        } else {
            car = super.work(car, type, workType);
        }
        return car;
    }
}