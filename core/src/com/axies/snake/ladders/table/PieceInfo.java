package com.axies.snake.ladders.table;

import java.util.List;

public class PieceInfo {
    List <Team> teamList;

    public PieceInfo(List<Team> teamList) {
        this.teamList = teamList;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }
}
