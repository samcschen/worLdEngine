package com.worldengine.game.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
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
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            gameScreen.camera.position.set(gameScreen.camera.position.x - 400 * deltaTime, gameScreen.camera.position.y, gameScreen.camera.position.z);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)) {
            gameScreen.camera.position.set(gameScreen.camera.position.x + 400 * deltaTime, gameScreen.camera.position.y, gameScreen.camera.position.z);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            gameScreen.camera.position.set(gameScreen.camera.position.x, gameScreen.camera.position.y + 400 * deltaTime, gameScreen.camera.position.z);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            gameScreen.camera.position.set(gameScreen.camera.position.x, gameScreen.camera.position.y - 400 * deltaTime, gameScreen.camera.position.z);
        }
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            gameScreen.camera.zoom += 2 * deltaTime;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.BACKSPACE)) {
            gameScreen.camera.zoom -= 2 * deltaTime;
        }
    }


}
