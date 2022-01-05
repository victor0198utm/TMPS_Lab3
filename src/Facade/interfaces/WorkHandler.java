package Facade.interfaces;

import Facade.baseClases.Car;
import Facade.manufacturing.WorkType;

public interface WorkHandler {
    Car work(Car car, int type, WorkType workType);
    Car work(Car car, String type, WorkType workType);
}