package com.worldengine.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.worldengine.game.screens.GameScreen;
import com.worldengine.game.utils.Assets;

public class WorldEngine extends Game {
	public SpriteBatch batch;
	public ShapeRenderer shapeRenderer;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		Assets.load();
		setScreen(new GameScreen(this));

	}

	@Override//This code is run every tick
	public void render () {
		super.render();
	}
	
	@Override//This code does java memory management or something like that.  Somethings can be disposed
	public void dispose () {
		batch.dispose();
	}
}
