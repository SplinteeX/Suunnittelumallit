package FactoryMethod;

import FactoryMethod.Maps.CityMap;
import FactoryMethod.Maps.WildernessMap;

public class Game {
    public static void main(String[] args) {
        Map cityMap = new CityMap(5, 5);
        System.out.println("City Map:");
        cityMap.display();

        Map wildernessMap = new WildernessMap(5, 5);
        System.out.println("Wilderness Map:");
        wildernessMap.display();
    }
}