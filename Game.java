public class Game {


    public static void main(String[] args){
    }



    private String name;
    private Die die1;
    private Die die2;
    private Player player1;
    private Player player2;
    private Printer printer;
    public int[] scoreCard;

    

//game constructor
    public Game(String name, Player player1, Player player2, Die die1, Die die2, Printer printer, int[] scoreCard) {
        this.name = name;
        this.player1 = player1;
        this.player2 = player2;
        this.die1 = die1;
        this.die2 = die2;
        this.printer = printer;

       //assign values to scorecard
        scoreCard[0]=250;
        scoreCard[1]=-100;
        scoreCard[2]= 100;
        scoreCard[3]= -20;
        scoreCard[4]= 180;
        scoreCard[5]= 0;
        scoreCard[6]= -70;
        scoreCard[7]= 60;
        scoreCard[8]= -80;
        scoreCard[9]= -50;
        scoreCard[10]= 650;
    }

    //check me later!
    public boolean checkWinner(Player player){return (player.getScore() >= 3000);}
    
    public void playTurn(Player player){
    die1.roll();
    die2.roll();
    //create variable field to track which field the player landed on
    int field = (die1.getValue()+die2.getValue());
    //create variable index to ensure we use the correct index for the scorecard and phrases arrays
    int index = field-2;
    //ensure we do not go out of bounds on the score card
    if ((index) >= 0 && (index) < (scoreCard.length)) {
        //add score to player total and print message
        player.addScore(scoreCard[index]);
        this.printer.printPhrase(index);
    }
    //print error 0, invalid dice roll
    else {this.printer.printErrorPhrase(0);}
    //print end game message if winner has been found.
    if(checkWinner(player)){Printer.printWinnerPhrase(player);}
    //if no one has won and player is on field 10, play another turn.
    else if (field==10){playTurn(player);}

    }
//Unused method. Enables changing language.
//To use, construct a printer object with a new language and pass to this method.
    public void setPrinter(Printer newPrinter){this.printer = newPrinter;}



}