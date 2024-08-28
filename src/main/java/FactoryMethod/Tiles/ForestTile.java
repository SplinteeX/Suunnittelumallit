package FactoryMethod.Tiles;

import FactoryMethod.Tile;

public class ForestTile extends Tile {
    @Override
    public char getCharacter() {
        return 'F';
    }

    @Override
    public String getDescription() {
        return "Forest";
    }

    @Override
    public void action() {
    }
}
