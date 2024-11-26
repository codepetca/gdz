package ca.codepet.gdz;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * First screen of the application. Displayed after the application is created.
 */
public class FirstScreen implements Screen {
    private final GameRoot game;
    private Sprite logo;

    public FirstScreen(GameRoot game) {
        this.game = game;
    }

    @Override
    public void show() {
        // Prepare your screen here.
        Texture logoTexture = new Texture(Gdx.files.internal("textures/icon.png"));
        logo = new Sprite(logoTexture);
    }

    @Override
    public void render(float delta) {
        // Draw your screen here. "delta" is the time since last render in seconds.

        // Clear the screen
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.begin();

        // Draw the logo
        logo.draw(game.batch);
        game.font.draw(game.batch, "Hello World!", 200, 200);

        game.batch.end();

    }

    @Override
    public void resize(int width, int height) {
        // Resize your screen here. The parameters represent the new window size.
        logo.setPosition(width / 2 - logo.getWidth() / 2, height / 2 - logo.getHeight() / 2);

    }

    @Override
    public void pause() {
        // Invoked when your application is paused.
    }

    @Override
    public void resume() {
        // Invoked when your application is resumed after pause.
    }

    @Override
    public void hide() {
        // This method is called when another screen replaces this one.
    }

    @Override
    public void dispose() {
        // Destroy screen's assets here.
    }
}