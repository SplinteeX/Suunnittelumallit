package FactoryMethod.Tiles;
import FactoryMethod.Tile;

public class SwampTile extends Tile {
    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getDescription() {
        return "Swamp";
    }

    @Override
    public void action() {
    }
}
