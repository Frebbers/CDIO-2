public class test {

    //method for testing game
    public static void testGame(){
    Game testGame = new Game("Test game", 
    new Player(1,1000), 
    new Player(2,1000), 
    new Die(6), new Die (6), 
    new Printer(Language.createDanishLanguage()));

    //checks if anyone has won.
    while (!testGame.checkWinner(testGame.player1) && !testGame.checkWinner(testGame.player2)) {
    //checks if player1 should have won and prints an error if they should
        if (testGame.player1.getScore() >3000) { System.out.println("ERROR! PLAYER 1 HAS ALREADY WON");}
        System.out.println("Begin turn player1");
        //plays a turn with player1
        testGame.playTurn(testGame.player1);
        //checks if player1 has won, then if player2's score is above 3000. Prints an error if they have already won.
        if (!testGame.checkWinner(testGame.player1)) {
            if (testGame.player2.getScore() > 3000) { System.out.println("ERROR! PLAYER 2 HAS ALREADY WON");}
             System.out.println("Begin turn player2");
             //plays a turn with player 2 as the player
            testGame.playTurn(testGame.player2);}
    }
    System.out.println("Game has ended");
}
//Method for testing dice
//Creates 1000 dice and rolls each of them, checking if any are invalid
public static void testDie(){
    Die[] thousandDice = new Die[1000];
    for (int i = 0; i > 1000; i++) {
    thousandDice[i]= new Die(i);
    thousandDice[i].roll();
    int rollTest = (thousandDice[i].getValue());
    System.out.println("Die with " + i + " sides rolled: " + rollTest);
    if (thousandDice[i].getValue()>i+1) {System.out.println("ERROR! dice roll exceeds dice faces!");}
    if (thousandDice[i].getValue()<1) {System.out.println("ERROR! dice roll less than one!");}
    }
}
}
