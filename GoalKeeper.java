public class GoalKeeper extends FootballPlayer{
    public void getInfo() {
        System.out.println("Here is the information about the professional football goalkeeper, Alisson Becker.");
    }

    public void getTeamName() {
        System.out.println("Alisson Becker has played for Rome and Liverpool");
    }
    void nameOfPlayer(){
        System.out.println("Players name: Alisson");
    }
    void sportType() {
        System.out.println("Sport type: Football, goalkeeper");
    }
    void numberPosition() {
        System.out.println("Players number: 1");
    }
    void teamName() {
        System.out.println("Players team: Liverpool");
    }
    int countOfRedCard = 0;
    int countOfYellowCard = 0;
    int countOfGoals = 0;
    int getCountOfSaves = 4;

    public static void main(String[] args) {
        GoalKeeper goalKeeper = new GoalKeeper();
        goalKeeper.getInfo();
        goalKeeper.getTeamName();
        goalKeeper.nameOfPlayer();
        goalKeeper.sportType();
        goalKeeper.numberPosition();
        goalKeeper.teamName();
        System.out.println("Received red cards: " + goalKeeper.countOfRedCard);
        System.out.println("Received yellow cards: " + goalKeeper.countOfYellowCard);
        System.out.println("Scored goals: " + goalKeeper.countOfGoals);
        System.out.println("Saves performed: " + goalKeeper.getCountOfSaves);
    }
}
