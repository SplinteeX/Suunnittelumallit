package FactoryMethod.Maps;

import FactoryMethod.Map;
import FactoryMethod.Tile;
import FactoryMethod.Tiles.ForestTile;
import FactoryMethod.Tiles.SwampTile;
import FactoryMethod.Tiles.WaterTile;

import java.util.Random;

public class WildernessMap extends Map {
    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    protected Tile createTile() {
        Random rand = new Random();
        int tileType = rand.nextInt(3);
        switch (tileType) {
            case 0: return new SwampTile();
            case 1: return new WaterTile();
            default: return new ForestTile();
        }
    }
}
