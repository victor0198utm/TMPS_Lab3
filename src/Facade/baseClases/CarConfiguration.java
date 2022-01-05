package Facade.baseClases;

import java.util.ArrayList;
import java.util.List;

public class CarConfiguration {
    List<String> colors = new ArrayList<String>();
    List<Integer> batteries = new ArrayList<Integer>();
    List<Integer> powers = new ArrayList<Integer>();
    String name;

    public CarConfiguration(String name, List<String> colors, List<Integer> batteries, List<Integer> powers){
        this.colors = colors;
        this.batteries = batteries;
        this.powers = powers;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getColors() {
        return colors;
    }

    public List<Integer> getBatteries() {
        return batteries;
    }

    public List<Integer> getPowers() {
        return powers;
    }

    @Override
    public String toString() {
        return name +
                ": colors=" + colors +
                ", batteries=" + batteries +
                ", powers=" + powers;
    }
}
