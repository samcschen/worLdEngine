package com.worldengine.game.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;

/**
 * Created by samuel on 1/25/17.
 */

//This is a custom class that makes it easier to import assets
    //Since everything is static, other files can use these instances with Assets."name of thing"
public class Assets {

    public static Texture testImage;
    public static TiledMap testLevel;

    public static void load(){
        testImage = loadTexture("badlogic.jpg");
        testLevel = new TmxMapLoader().load("testLevel.tmx");
    }

    public static Texture loadTexture(String file){
        return new Texture(Gdx.files.internal(file));
    }
}
