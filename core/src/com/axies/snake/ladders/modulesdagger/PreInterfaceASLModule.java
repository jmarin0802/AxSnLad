package com.axies.snake.ladders.modulesdagger;

import com.axies.snake.ladders.PreInterfaceASL;
import com.axies.snake.ladders.account.Owner;
import com.axies.snake.ladders.account.OwnerImpl;
import com.axies.snake.ladders.axie.factorys.AxieCreator;
import com.axies.snake.ladders.roninwallet.RoninAccount;
import com.axies.snake.ladders.roninwallet.altercreatoraxies.CreatorAlterAxie;
import dagger.Module;
import dagger.Provides;

@Module
public class PreInterfaceASLModule {

    @Provides
    public Owner  owner(){
        return new OwnerImpl();
    }

    @Provides
    public AxieCreator axieCreator(){
        return new AxieCreator();
    }

    @Provides
    public RoninAccount roninAccount(){
        return new CreatorAlterAxie();
    }
}
