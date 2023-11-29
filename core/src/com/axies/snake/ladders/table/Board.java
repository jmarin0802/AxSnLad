package com.axies.snake.ladders.table;

import com.axies.snake.ladders.axie.AxieToken;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

import java.util.ArrayList;
import java.util.List;

public class Board {

    PieceInfo pieceInfo [][];
    int size;
    int squareSize;
    Texture texture;
    TextureRegion textureRegion;
    Array<Sprite> sprites;

    public Board(int size) {
        this.size = size;
        pieceInfo= new PieceInfo[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                pieceInfo[i][j].setTeamList(new ArrayList<Team>());
            }
        }
    }
}
