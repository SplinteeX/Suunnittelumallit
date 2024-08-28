package FactoryMethod;

import java.util.Random;

public abstract class Map {
    protected int width;
    protected int height;
    protected Tile[][] grid;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new Tile[width][height];
        generateMap();
    }

    protected abstract Tile createTile();

    private void generateMap() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[i][j] = createTile();
            }
        }
    }

    public void display() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(grid[i][j].getCharacter());
            }
            System.out.println();
        }
    }
}