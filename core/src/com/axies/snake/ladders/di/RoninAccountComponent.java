package com.axies.snake.ladders.di;

import com.axies.snake.ladders.roninwallet.RoninAccount;

//@Singleton
//@Component(modules = RoninAccountModule.class)
public interface RoninAccountComponent {
    RoninAccount getRoninAccount();
}
