package Facade.manufacturing;

import Facade.baseClases.BaseWorkHandler;
import Facade.baseClases.Car;

public class PaintWorkHandler extends BaseWorkHandler {
    @Override
    public Car work(Car car, String type, WorkType workType) {
        if (workType == WorkType.PAINT) {
            System.out.println(String.format("Painting with '%s'", type));
            car.setColor(type);
        } else {
            car = super.work(car, type, workType);
        }
        return car;
    }
}