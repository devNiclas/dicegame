package se.jensen.niclas.dicegame;

import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int result;

    public Dice() {

    }

    public int getResult() {
        return result;
    }


    public int throwDice() {
        int dice1 = random.nextInt(1, 7);
        int dice2 = random.nextInt(1, 7);
        result = dice1 + dice2;
        System.out.println("Kast 1: " + dice1);
        System.out.println("Kast 2: " + dice2);
        System.out.println("Totala poäng: " + result);

        return result;
    }


}
