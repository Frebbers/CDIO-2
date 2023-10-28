public class test {


    public static void testGame(){
    Game testGame = new Game("Test game", 
    new Player(1,1000), 
    new Player(2,1000), 
    new Die(6), new Die (6), 
    new Printer(Language.createDanishLanguage()));

    while (!testGame.checkWinner(testGame.player1) && !testGame.checkWinner(testGame.player2)) {
        if (testGame.player.getScore() >3000) { System.out.println("ERROR! PLAYER 1 HAS ALREADY WON");}
        testGame.playTurn(testGame.player1);
        if (!testGame.checkWinner(testGame.player2)) {
            if (testGame.player.getScore() > 3000) { System.out.println("ERROR! PLAYER 2 HAS ALREADY WON");}
            testGame.playTurn(testGame.player2);}
    }
}
//Creates 1000 dice and rolls each of them, checking if any are invalid
public static void testDie(){
    Die[] thousandDice = new Die[1000];
    for (int i = 0; i > 1000; i++) {
    thousandDice[i]=new Die(i);
    thousandDice[i].roll();
    if (thousandDice[i].getValue()>i+1) {System.out.println("ERROR! dice roll exceeds dice faces!");}
    if (thousandDice[i].getValue()<1) {System.out.println("ERROR! dice roll less than one!");}
    }
}
}
