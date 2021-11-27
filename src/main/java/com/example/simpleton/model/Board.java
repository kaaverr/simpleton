package com.example.simpleton.model;

import java.util.List;
import java.util.Stack;

public class Board {
    private Stack<Card> stack;
    private List<Card> playerCards;
    private List<Card> dealerCards;
    private List<Card> trash;
    private String massage;
    private Suit trump;
    private Card trumpCard;
    private boolean turn;

    public Board() {
    }

    public Board(Stack<Card> stack, List<Card> playerCards, List<Card> dealerCards, List<Card> trash, String massage, Suit trump, Card trumpCard, boolean turn) {
        this.stack = stack;
        this.playerCards = playerCards;
        this.dealerCards = dealerCards;
        this.trash = trash;
        this.massage = massage;
        this.trump = trump;
        this.trumpCard = trumpCard;
        this.turn = turn;
    }

    public Stack<Card> getStack() {
        return stack;
    }

    public void setStack(Stack<Card> stack) {
        this.stack = stack;
    }

    public List<Card> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(List<Card> playerCards) {
        this.playerCards = playerCards;
    }

    public List<Card> getDealerCards() {
        return dealerCards;
    }

    public void setDealerCards(List<Card> dealerCards) {
        this.dealerCards = dealerCards;
    }

    public List<Card> getTrash() {
        return trash;
    }

    public void setTrash(List<Card> trash) {
        this.trash = trash;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Suit getTrump() {
        return trump;
    }

    public void setTrump(Suit trump) {
        this.trump = trump;
    }

    public Card getTrumpCard() {
        return trumpCard;
    }

    public void setTrumpCard(Card trumpCard) {
        this.trumpCard = trumpCard;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    @Override
    public String toString() {
        return "Board{" +
                "stack=" + stack +
                ", playerCards=" + playerCards +
                ", dealerCards=" + dealerCards +
                ", trash=" + trash +
                ", massage='" + massage + '\'' +
                ", trump=" + trump +
                ", trumpCard=" + trumpCard +
                ", turn=" + turn +
                '}';
    }
}
