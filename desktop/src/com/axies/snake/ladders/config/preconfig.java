package com.axies.snake.ladders.config;

import com.axies.snake.ladders.PreInterfaceASL;
import com.axies.snake.ladders.util.LoggerUtil;
import com.badlogic.gdx.ApplicationListener;

import javax.inject.Inject;
import java.util.logging.Logger;

public class preconfig implements ApplicationListener {

    private static final Logger logger = Logger.getLogger(PreInterfaceASL.class.toString());
    @Inject
    PreInterfaceASL preInterfaceASL;

    @Override
    public void create() {
        logger.info("ClassName: " + LoggerUtil.getClassName(getClass())+", Method: create, Output PreInterfaceASL Object: "+preInterfaceASL.toString());
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void render() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
