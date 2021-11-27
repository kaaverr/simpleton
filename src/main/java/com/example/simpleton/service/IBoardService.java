package com.example.simpleton.service;

import com.example.simpleton.model.Card;
import com.example.simpleton.model.Suit;

import java.util.List;

public interface IBoardService {
    Card shuffleDeck();
    List<Card> getStack();
    List<Card> getPlayerCard();
    List<Card> getDealerCard();
    List<Card> getPlayerMoves();
    List<Card> getDealerMoves();
    List<Card> getTrash();
    String getMessage();
    boolean getTurn();
    Suit getTrump();


}
