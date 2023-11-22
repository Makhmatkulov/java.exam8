public class BasketballPlayer extends Player{

    @Override
    public void getInfo(){
        System.out.println("A professional basketball player, Lebron James.");
    }

    @Override
    public void getTeamName() {
        System.out.println("I think he plays for LA, I am too lazy to google right now");
    }
    void nameOfPlayer(){
        System.out.println("Name: Lebron");
    }
    void sportType() {
        System.out.println("Sport: Basketball");
    }
    void numberPosition() {
        System.out.println("Player number: 7");
    }
    void teamName() {
        System.out.println("I do not know");
    }
    int numberOfGoal = 55;
    void numberOfGoal() {
        System.out.println("Scored goals: " + numberOfGoal);
    }

    public static void main(String[] args) {
        BasketballPlayer basketballPlayer = new BasketballPlayer();
        basketballPlayer.getInfo();
        basketballPlayer.getTeamName();
        basketballPlayer.nameOfPlayer();
        basketballPlayer.sportType();
        basketballPlayer.numberPosition();
        basketballPlayer.teamName();
        basketballPlayer.numberOfGoal();
    }
}
