public class Setter extends VolleyballPlayer{
    public void getInfo(){
        System.out.println("A professional volleyball setter, Morty.");
    }

    @Override
    public void getTeamName() {
        System.out.println("Plays for a team Los-angels since 2015.");
    }
    void nameOfPlayer(){
        System.out.println("Player name: Morty");
    }
    void sportType() {
        System.out.println("Sport type: Volleyball, setter");
    }
    void numberPosition() {
        System.out.println("Player number: 2");
    }
    void teamName() {
        System.out.println("Team name: Los-angels");
    }
    int numberOfPoints = 14;
    int countOfSets = 45;
    void numberOfPoints() {
        System.out.println("Points received: " + numberOfPoints);
    }
    void countOfSets() {
        System.out.println("Sets performed: " + countOfSets);
    }

    public static void main(String[] args) {
        Setter setter = new Setter();
        setter.getInfo();
        setter.getTeamName();
        setter.nameOfPlayer();
        setter.sportType();
        setter.numberPosition();
        setter.teamName();
        setter.numberOfPoints();
        setter.countOfSets();
    }
}
