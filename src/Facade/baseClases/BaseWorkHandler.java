package Facade.baseClases;

import Facade.interfaces.WorkHandler;
import Facade.manufacturing.WorkType;

public class BaseWorkHandler implements WorkHandler {
    private WorkHandler successor;
    public void setNext(WorkHandler successor) {
        this.successor = successor;
    }
    @Override
    public Car work(Car car, int type, WorkType workType) {
        if (successor != null) {
            car = successor.work(car, type, workType);
        }
        return car;
    }
    @Override
    public Car work(Car car, String type, WorkType workType) {
        if (successor != null) {
            car = successor.work(car, type, workType);
        }
        return car;
    }
}