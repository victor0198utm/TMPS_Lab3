package Facade;

import Facade.baseClases.Car;

import java.util.Scanner;

public class CarCatalog {
    public static void main(String[] args)
    {
        int option;
        CatalogService catalogService = new CatalogService();
        Scanner s = new Scanner(System.in);

        System.out.println("Choose type of cars to list (0 - Civil, 1 - Industrial, 3 - All)");
        option = s.nextInt();

        switch (option){
            //the case when client wants to look at standard models
            case 0: catalogService.showCivilModels(); break;
            //the case when client wants to look at models with configurable additional options
            case 1: catalogService.showIndustrialModels(); break;
            //the case when client wants to look at all models
            default: catalogService.showAllModels();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a model name:");
        String modelName = sc.nextLine();

        int colorIndex=0, batteryIndex=0, motorsIndex=0;
        System.out.println("Choose color index:");
        colorIndex = s.nextInt();
        System.out.println("Choose battery index:");
        batteryIndex = s.nextInt();
        System.out.println("Choose motors index:");
        motorsIndex = s.nextInt();

        System.out.println("\nWorking on the car:");

        AssemblyLine assemblyLine = new AssemblyLine();
        Car newCar = new Car();
        newCar = assemblyLine.assemble(newCar, modelName, colorIndex, batteryIndex, motorsIndex);

        System.out.println("Your car is ready:");
        System.out.println(newCar.toString());
    }
}
