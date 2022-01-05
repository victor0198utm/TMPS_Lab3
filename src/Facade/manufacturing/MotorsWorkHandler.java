package Facade.manufacturing;

import Facade.baseClases.BaseWorkHandler;
import Facade.baseClases.Car;

public class MotorsWorkHandler extends BaseWorkHandler {
    @Override
    public Car work(Car car, int type, WorkType workType) {
        if (workType == WorkType.MOTORS) {
            System.out.println(String.format("Installing motors '%d' kW", type));
            car.setPower(type);
        } else {
            car = super.work(car, type, workType);
        }
        return car;
    }
}