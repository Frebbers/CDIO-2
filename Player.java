public class Player {
    private int id;
    private int score;

    public Player(int id, int startingScore){
        this.id=id;
        this.score = startingScore;
    }
    public int getScore() {return this.score;}
    public int getId() {return this.id;}
    public void setScore(int input) {this.score = input;}
    public void addScore(int input) {this.score = this.score+input;}

}
