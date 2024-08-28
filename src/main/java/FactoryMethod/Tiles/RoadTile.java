package FactoryMethod.Tiles;
import FactoryMethod.Tile;

public class RoadTile extends Tile {
    @Override
    public char getCharacter() {
        return 'R';
    }

    @Override
    public String getDescription() {
        return "Road";
    }

    @Override
    public void action() {
    }
}