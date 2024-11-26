package ca.codepet.gdz;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ca.codepet.gdz.util.FontUtil;

/**
 * {@link com.badlogic.gdx.ApplicationListener} implementation shared by all
 * platforms.
 */
public class GameRoot extends Game {
    public SpriteBatch batch;
    public BitmapFont font;

    @Override
    public void create() {
        batch = new SpriteBatch();
        font = FontUtil.generateFont("fonts/Play-Regular.ttf", 40);
        setScreen(new FirstScreen(GameRoot.this));
    }
}