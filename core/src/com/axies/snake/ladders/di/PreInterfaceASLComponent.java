package com.axies.snake.ladders.di;

import com.axies.snake.ladders.PreInterfaceASL;
import com.axies.snake.ladders.modulesdagger.PreInterfaceASLModule;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = PreInterfaceASLModule.class)
public interface PreInterfaceASLComponent {
    PreInterfaceASL getPreInterfaceAsl();
}
