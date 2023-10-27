public class Language {
    private String locale;
    String[] phrase;
    String[] errorPhrase;
    String winnerPhrase;
    

    public Language (String locale, String[] phrase, String[] errorPhrase, String winnerPhrase){
        this.locale = locale;
        this.phrase = phrase;
        this.errorPhrase = errorPhrase;
        this.winnerPhrase = winnerPhrase;
    }
    public String getLocale() {return this.locale;}
    public String phraseOut(int input) {return phrase[input];}
    public String errorPhraseOut(int input) {return errorPhrase[input];}


}
