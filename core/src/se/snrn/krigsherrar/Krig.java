package se.snrn.krigsherrar;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Krig extends Game {

    MainScreen mainScreen;

    SpriteBatch batch;


    @Override
    public void create() {
        batch = new SpriteBatch();
        mainScreen = new MainScreen(batch);
        setScreen(mainScreen);
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        batch.dispose();

    }
}
