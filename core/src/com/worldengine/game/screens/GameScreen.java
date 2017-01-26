package com.worldengine.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.worldengine.game.WorldEngine;
import com.worldengine.game.utils.World;
import com.worldengine.game.utils.WorldRenderer;

/**
 * Created by samuel on 1/25/17.
 */

public class GameScreen extends ScreenAdapter{
    //This will be screen where gameplay actually happens
    WorldEngine game;

    World world;//An instance of where all logic will happen
    WorldRenderer renderer;//An instance of where rendering will happen

    public GameScreen (WorldEngine game){
        this.game = game;
        world = new World(this);
        renderer = new WorldRenderer(game.batch,game.shapeRenderer,world);
    }

    //This code update logic.  Put in the other class
    public void update (float deltaTime){
        world.update(deltaTime);
    }

    //This is the actual graphics code
    public void draw(){
        GL20 gl = Gdx.gl;
        gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.render();
    }

    @Override//Only stuff here will be run every tick
    public void render(float deltaTime){
        update(deltaTime);
        draw();
    }

    @Override//Anything here will happen every time screen is resized
    public void resize(int width, int height){

    }
}
