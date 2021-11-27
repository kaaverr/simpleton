package com.example.simpleton.service;

import com.example.simpleton.model.Card;

import java.util.List;

public interface IGameService {
    Card makeMove();
    Card dealerMove();
    Card myDefence();
    Card dealerDefence();
    List<Card> giveCards();
    Card rechargeCards();
    List<Card> moveToTrash();
    List<Card> giveUpAndTakeCards();

}
