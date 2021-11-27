package com.example.simpleton.model;

public class Battle {
    private Card attack;
    private Card defence;

    public Battle() {
    }

    public Battle(Card attack, Card defence) {
        this.attack = attack;
        this.defence = defence;
    }

    public Card getAttack() {
        return attack;
    }

    public void setAttack(Card attack) {
        this.attack = attack;
    }

    public Card getDefence() {
        return defence;
    }

    public void setDefence(Card defence) {
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Battle{" +
                "attack=" + attack +
                ", defence=" + defence +
                '}';
    }
}
