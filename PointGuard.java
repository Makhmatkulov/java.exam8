public class PointGuard extends BasketballPlayer{
    @Override
    public void getInfo(){
        System.out.println("A professional basketball player, Stephan.");
    }

    @Override
    public void getTeamName() {
        System.out.println("I think Stephan plays for... never mind, I am too lazy to google right now");
    }
    void nameOfPlayer(){
        System.out.println("Name: Stephan");
    }
    void sportType() {
        System.out.println("Sport: Basketball, point guard");
    }
    void numberPosition() {
        System.out.println("Player number: 5");
    }
    void teamName() {
        System.out.println("I do not know.");
    }
    int numberOfGoal = 12;
    int numberOfGuard = 16;
    void numberOfGoal() {
        System.out.println("Scored goals: " + numberOfGoal);
    }
    void numberOfGuard() {
        System.out.println("Scored goals: " + numberOfGuard);
    }

    public static void main(String[] args) {
        PointGuard pointGuard = new PointGuard();
        pointGuard.getInfo();
        pointGuard.getTeamName();
        pointGuard.nameOfPlayer();
        pointGuard.sportType();
        pointGuard.numberPosition();
        pointGuard.teamName();
        pointGuard.numberOfGoal();
        pointGuard.numberOfGuard();
    }
}
