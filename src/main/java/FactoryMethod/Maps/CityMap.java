package FactoryMethod.Maps;

import FactoryMethod.Map;
import FactoryMethod.Tile;
import FactoryMethod.Tiles.*;

import java.util.Random;

public class CityMap extends Map {
    public CityMap(int width, int height) {
        super(width, height);
    }
    @Override
    protected Tile createTile() {
        Random rand = new Random();
        int tileType = rand.nextInt(3);
        switch(tileType) {
            case 0:
                return new RoadTile();
            case 1:
                return new ForestTile();
            default: return new BuildingTile();
        }
    }
}

