package se.snrn.krigsherrar;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class MainScreen implements Screen{


    private OrthographicCamera camera;
    private Batch batch;
    private Viewport viewport;
    private TiledMap tiledMap;
    private TmxMapLoader tmxMapLoader;
    private TiledMapRenderer tiledMapRenderer;


    public MainScreen(Batch batch){
        this.batch = batch;
        camera = new OrthographicCamera();
        viewport = new FillViewport(1280, 720, camera);
        camera.update();
        viewport.apply();
        tmxMapLoader = new TmxMapLoader();
        tiledMap = tmxMapLoader.load("map.tmx");
        tiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
        tiledMapRenderer.setView(camera);
    }

    @Override
    public void show() {
        camera.position.set(0,0,0);
        camera.update();
        viewport.apply();
    }

    @Override
    public void render(float delta) {
        camera.position.set(0,0,0);
        camera.update();
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        viewport.apply();
        tiledMapRenderer.setView(camera);
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        tiledMapRenderer.render();
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
