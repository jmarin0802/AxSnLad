package com.axies.snake.ladders.account;

import com.axies.snake.ladders.axie.AxieToken;

import java.util.List;

public interface Owner {
    public List<AxieToken> getAxieBodyList();

    public void setAxieBodyList(List<AxieToken> axieTokenList);

    public void AddAxieBodyList(AxieToken axieToken);
}
