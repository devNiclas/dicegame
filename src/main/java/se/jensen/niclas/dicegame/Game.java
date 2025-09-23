package se.jensen.niclas.dicegame;


import java.util.Scanner;

public class Game {
    private Dice dice;
    private Scanner scanner = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private boolean isRunning = true;

    public Game() {


    }

    public void players() {
        player1 = new Player();
        player2 = new Player();
        dice = new Dice();

//
    }

    public void play() {

        // Ber spelare 1 skriva in sitt namn, kastar illegalArgumentException om inmatningen är tom
        while (true) {
            try {
                System.out.println("Spelare 1: Skriv in ditt förnamn.");
                player1.setFirstName(scanner.nextLine());
                System.out.println("Spelare 1: Skriv in ditt efternamn");
                player1.setLastName(scanner.nextLine());
                break;  // Avbryter loopen om allt gick bra
            } catch (IllegalArgumentException e) {
                // Felmeddelande om användaren lämnade fältet tomt
                System.out.println("Du måste mata in ett namn!");

            }

        }
        while (true) {
            try {
                System.out.println("Spelare 2: Skriv in ditt förnamn.");
                player2.setFirstName(scanner.nextLine());
                System.out.println("Spelare 2: Skriv in ditt efternamn");
                player2.setLastName(scanner.nextLine());
                break;
            } catch (IllegalArgumentException e) {

                System.out.println("Du måste mata in ett namn");
            }
        }


        // Själva spelets omgång

        System.out.println("*******************************************");
        System.out.println(player1.getFullName());
        int roll1 = dice.throwDice();
        System.out.println("*****************************");
        System.out.println(player2.getFullName());
        int roll2 = dice.throwDice();
        player1.addToScore(roll1);
        player2.addToScore(roll2);
        System.out.println(player1.getFullName() + " fick totalt: " + player1.getScore() + " poäng.");
        System.out.println(player2.getFullName() + " fick totalt: " + player2.getScore() + " poäng.");
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getFullName() + " vann!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getFullName() + " vann!");
        } else {
            System.out.println("Oavgjort");

        }
        System.out.println("************************************************************");

        System.out.println("Tryck enter för att komma tillbaka till huvudmenyn.");
        scanner.nextLine();


    }


    // Användarens menyval
    public void menuChoice() {
        while (isRunning) {
            System.out.println("Välkommen till mitt tärningsspel!");
            System.out.println("Skriv in ditt val");
            System.out.println("Spela");
            System.out.println("Avsluta");
            String menuChoice = scanner.nextLine();


            if (menuChoice.equalsIgnoreCase("Spela")) {
                play();

            } else if (menuChoice.equalsIgnoreCase("Avsluta")) {
                isRunning = false;
                System.out.println("Tack för att du spelade!");
            } else {
                System.out.println("Ogiltigt val, försök igen");


            }

        }


    }

    public void startGame() {
        players();
        menuChoice();
        scanner.close();

    }


}










