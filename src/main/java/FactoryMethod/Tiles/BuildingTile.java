package FactoryMethod.Tiles;

import FactoryMethod.Tile;

public class BuildingTile extends Tile {
    @Override
    public char getCharacter() {
        return 'B';
    }

    @Override
    public String getDescription() {
        return "Building";
    }

    @Override
    public void action() {
    }
}
