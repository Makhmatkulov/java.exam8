public class FootballPlayer extends Player{
    public void getInfo() {
        System.out.println("Here is the information about the professional football player, Cristiano Ronaldo.");
    }

    public void getTeamName() {
        System.out.println("Cristiano Ronaldo has played for Sporting, Real Madrid, Juventus, Manchester united and Al-nassr.");
    }

    void nameOfPlayer(){
        System.out.println("Players name: Ronaldo");
    }
    void sportType() {
        System.out.println("Sport type: Football");
    }
    void numberPosition() {
        System.out.println("Players number: 7");
    }
    void teamName() {
        System.out.println("Players team: Al-nassr");
    }
    int countOfRedCard = 0;
    int countOfYellowCard = 1;
    int countOfGoals = 2;

    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.getInfo();
        footballPlayer.getTeamName();
        footballPlayer.nameOfPlayer();
        footballPlayer.sportType();
        footballPlayer.numberPosition();
        footballPlayer.teamName();
        System.out.println("Received red cards: " + footballPlayer.countOfRedCard);
        System.out.println("Received yellow cards: " + footballPlayer.countOfYellowCard);
        System.out.println("Scored goals: " + footballPlayer.countOfGoals);
    }
}
