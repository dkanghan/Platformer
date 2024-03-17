package com.example.platformer;

import com.example.platformer.LevelData;

import java.util.ArrayList;
public class LevelCave extends LevelData
        // Tile types
        // . = no tile
        // 1 = Grass
        // 2 = Snow
        // 3 = Brick
        // 4 = Coal
        // 5 = Concrete
        // 6 = Scorched
        // 7 = Stone
        //Active objects
        // g = guard
        // d = drone
        // t = teleport
        // c = coin
        // u = upgrade
        // f = fire
        // e = extra life
        //Inactive objects
        // w = tree
        // x = tree2 (snowy)
        // l = lampost
        // r = stalactite
        // s = stalacmite
        // m = mine cart
        // z = boulders
{

    LevelCave() {
        tiles = new ArrayList<String>();
        this.tiles.add("p.............................................");
        this.tiles.add("..............................................");
        this.tiles.add("..............................................");
        this.tiles.add("..............................................");
        this.tiles.add("....................c.....g...................");
        this.tiles.add("....................1........u................");
        this.tiles.add(".................c..........u1................");
        this.tiles.add(".................1.........u1.................");
        this.tiles.add("..............c...........u1..................");
        this.tiles.add("..............1..........u1...................");
        this.tiles.add("......................e..1....e.....e.........");
        this.tiles.add("................g.............................");
        this.tiles.add("...........................d..................");
        this.tiles.add("1111111111111111111111111111111111111111111111");
    }
}
