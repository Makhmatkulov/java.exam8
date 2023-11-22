public class VolleyballPlayer extends Player{
    public void getInfo(){
        System.out.println("A professional volleyball player, Alex.");
    }

    @Override
    public void getTeamName() {
        System.out.println("Plays for a team Chicago since 2010.");
    }
    void nameOfPlayer(){
        System.out.println("Player name: Alex");
    }
    void sportType() {
        System.out.println("Sport type: Volleyball");
    }
    void numberPosition() {
        System.out.println("Player number: 6");
    }
    void teamName() {
        System.out.println("Team name: Chicago");
    }
    int numberOfPoints = 18;
    void numberOfPoints() {
        System.out.println("Points received: " + numberOfPoints);
    }

    public static void main(String[] args) {
        VolleyballPlayer volleyballPlayer = new VolleyballPlayer();
        volleyballPlayer.getInfo();
        volleyballPlayer.getTeamName();
        volleyballPlayer.nameOfPlayer();
        volleyballPlayer.sportType();
        volleyballPlayer.numberPosition();
        volleyballPlayer.teamName();
        volleyballPlayer.numberOfPoints();
    }
}
