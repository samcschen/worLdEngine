package com.worldengine.game.actors;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.worldengine.game.utils.Assets;

/**
 * Created by samuel on 1/26/17.
 */

public class Player extends Actor{

    Texture texture;

    public Player(){
        texture  = Assets.testImage;
        setX(100);
        setY(100);
    }

    @Override//Code for drawing here
    public void draw (Batch batch, float parentAlpha){
        Color color = getColor();
        batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
        batch.draw(texture, getX(), getY());
    }

    @Override//Code for logic here.  Method is called act, cause it's an actor.  Get it?
    public void act(float deltaTime){
        setX(getX()+5*deltaTime);
    }
}
