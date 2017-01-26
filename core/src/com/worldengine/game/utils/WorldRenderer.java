package com.worldengine.game.utils;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by samuel on 1/25/17.
 */

public class WorldRenderer {
    //Put all code for rendering here
    SpriteBatch batch;//This allows rendering images
    ShapeRenderer shapeRenderer;//This allows rendering shapes.  Probably only use for debugging
    World world;//This is an instance of the world, where all logic happens


    public WorldRenderer (SpriteBatch batch, ShapeRenderer shapeRenderer, World world){
        this.batch = batch;
        this.shapeRenderer = shapeRenderer;
        this.world = world;
    }

    public void render(){
        batch.begin();//You have to start the batch before it can draw
        batch.draw(Assets.testImage,100,100);
        batch.end();//You have to end batch so that memory is saved
    }
}
