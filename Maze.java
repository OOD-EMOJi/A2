/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author olymp
 */
public class Maze {
    Tile [][] tiles;
    MazeGenerator generator;

    public Maze(Tile[][] tiles, MazeGenerator generator) {
        this.tiles = tiles;
        this.generator = generator;
    }

    void generateMaze(){
        for (Tile[] a : tiles){
            for(Tile b : a){
                b.makeWall();
            }
        }
    }
    
}
