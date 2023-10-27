public class Printer {
    Language currentLanguage;

    public Printer (Language language) {currentLanguage = language;}
    
    public void setLanguage(Language input){this.currentLanguage=input;}
    public void printPhrase(int phrase){System.out.println(currentLanguage.phraseOut(phrase));}
    public String getLanguage(){return this.currentLanguage;}
    public void printErrorPhrase(int input){System.out.println(currentLanguage.errorPhraseOut(input));}
    
}
