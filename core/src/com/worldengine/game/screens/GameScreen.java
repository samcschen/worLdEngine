package com.worldengine.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.renderers.IsometricTiledMapRenderer;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.worldengine.game.WorldEngine;
import com.worldengine.game.actors.Player;
import com.worldengine.game.utils.Assets;
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

    IsometricTiledMapRenderer mapRenderer;

    public OrthographicCamera camera;
    ExtendViewport viewport;

    private Stage stage;

    public GameScreen (WorldEngine game){
        this.game = game;
        world = new World(this);
        renderer = new WorldRenderer();
        mapRenderer = new IsometricTiledMapRenderer(Assets.testLevel);

        camera = new OrthographicCamera(30, 30 * (Gdx.graphics.getHeight() / Gdx.graphics.getWidth()));
        camera.setToOrtho(false, 640, 480);


        viewport = new ExtendViewport(640, 480, camera);
        camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2, 0);
        camera.update();

        stage = new Stage(viewport);
        Gdx.input.setInputProcessor(stage);
        stage.addActor(new Player());

        mapRenderer.setView(camera);
    }

    //This code update logic.  Put in the other class
    public void update (float deltaTime){
        world.update(deltaTime);
        stage.act(deltaTime);
    }

    //This is the actual graphics code
    public void draw(){
        GL20 gl = Gdx.gl;
        gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        stage.draw();
        renderer.render();

        mapRenderer.setView(camera);
        mapRenderer.render();
    }

    @Override//Only stuff here will be run every tick
    public void render(float deltaTime){
        update(deltaTime);
        draw();

    }

    @Override//Anything here will happen every time screen is resized
    public void resize(int width, int height){
        viewport.update(width, height);
    }
}
