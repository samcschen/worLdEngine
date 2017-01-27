package com.worldengine.game.utils;

import com.worldengine.game.screens.GameScreen;

/**
 * Created by samuel on 1/25/17.
 */

public class World {
    //All code for updating logic of world should be placed here

    public GameScreen gameScreen;

    public World (GameScreen gameScreen){
        this.gameScreen = gameScreen;
    }

    //Put actual code here.  Top down design already down.  Delta time is time between frames
    public void update(float deltaTime){

    }


}
