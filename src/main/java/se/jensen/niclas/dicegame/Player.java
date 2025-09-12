package se.jensen.niclas.dicegame;

public class Player {
    private String firstName;
    private String lastName;
    private int score;

    public Player() {

    }

    // Set metoder
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException();
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException();

        }
    }

    public int getScore() {
        return score;
    }

    // Get fullname metod
    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void addToScore(int points) {
        score += points;
    }

    // Metod för att resetta score
    public void resetScore() {
        score = 0;
    }
}
