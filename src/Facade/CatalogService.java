package Facade;

import Facade.service.IndustrialModels;
import Facade.service.CivilModels;

public class CatalogService {
    CivilModels civilModels = new CivilModels();
    IndustrialModels industrialModels = new IndustrialModels();

    public void showCivilModels() {
        System.out.println(" - Civil models: " + civilModels.count() + " -");
        civilModels.show();
        System.out.println("");
    }

    public void showIndustrialModels() {
        System.out.println(" - Industrial models: " + industrialModels.count() + " -");
        industrialModels.show();
        System.out.println("");
    }

    public void showAllModels() {
        System.out.println(" - All models: " + String.valueOf(civilModels.count() + industrialModels.count()) + " -");
        civilModels.show();
        industrialModels.show();
    }
}
