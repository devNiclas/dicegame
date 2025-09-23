package se.jensen.niclas.dicegame;

public class Player {
    // Deklarationer av attribut för player-klassen
    private String firstName;
    private String lastName;
    private int score;

    // Tom konstruktor (default konstruktor) för att vi vill att användaren ska mata in värdena
    public Player() {

    }

    // Set metoder med felhantering
    public void setFirstName(String firstName) {

        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException();

        }
        this.lastName = lastName;
    }

    // Getmetod för att hämta score eftersom score är privat
    public int getScore() {
        return score;
    }

    // Get fullname metod
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Lägger till poäng till spelarens totala score
    // Points är ett argument som anger hur mycket som ska läggas till i score
    public void addToScore(int points) {
        score += points;
    }

    // Metod för att resetta score
    public void resetScore() {
        score = 0;
    }
}
