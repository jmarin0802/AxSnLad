package com.axies.snake.ladders.roninwallet;

import com.axies.snake.ladders.axie.AxieToken;

import java.util.List;
import java.util.Map;

public interface RoninAccount {
    Map<String,String> getAxie(String id);
    List<Map<String,String>> axiesListAccount();
}
