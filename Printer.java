public class Printer {
    Language currentLanguage;

    public Printer (Language language) {currentLanguage = language;}
    
    public void setLanguage(Language input) {this.currentLanguage=input;}
    public void printPhrase(int phrase) {System.out.println(currentLanguage.phraseOut(phrase));}
    public Language getLanguage() {return this.currentLanguage;}
    public void printErrorPhrase(int input) {System.out.println(currentLanguage.errorPhraseOut(input));}
    //Prints that the winner is the player passed to the method
    public void printWinnerPhrase(int p) {System.out.println(this.currentLanguage.winnerPhrase+p);}
    public void printPreturn() {System.out.println(currentLanguage.turnStart);}
}
