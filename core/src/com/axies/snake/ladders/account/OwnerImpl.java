package com.axies.snake.ladders.account;

import com.axies.snake.ladders.axie.AxieToken;
import com.badlogic.gdx.Gdx;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class OwnerImpl implements Owner {
    List<AxieToken> axieTokenList;

    @Inject
    public OwnerImpl() {
        Gdx.app.log(OwnerImpl.class.toString(),"Constructor");
        this.axieTokenList = new ArrayList<>();
    }

    public List<AxieToken> getAxieBodyList() {
        return axieTokenList;
    }

    public void setAxieBodyList(List<AxieToken> axieTokenList) {
        this.axieTokenList = axieTokenList;
    }

    public void AddAxieBodyList(AxieToken axieToken){
        axieTokenList.add(axieToken);
    }

    @Override
    public String toString() {
        return "OwnerImpl{" +
                "axieTokenList=" + axieTokenList +
                '}';
    }
}
