package com.axies.snake.ladders.table;

import com.axies.snake.ladders.account.Owner;
import com.axies.snake.ladders.axie.AxieToken;

import java.util.List;

public class Team {
    String teamId;
    List<AxieToken> axieTokenList;

    public Team(String teamId, List<AxieToken> axieTokenList) {
        this.teamId = teamId;
        this.axieTokenList = axieTokenList;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public List<AxieToken> getAxieTokenList() {
        return axieTokenList;
    }

    public void setAxieTokenList(List<AxieToken> axieTokenList) {
        this.axieTokenList = axieTokenList;
    }
}
