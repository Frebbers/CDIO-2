public class Language {
    private String locale;
    String[] phrase;
    String[] errorPhrase;

    public Language (String locale, String[] phrase, String[] errorPhrase){
        this.locale = locale;
        this.phrase = phrase;
        this.errorPhrase = errorPhrase;
    }
    public String getLocale() {return this.locale;}
    public String phraseOut(int input) {return phrase[input];}
    public String errorPhraseOut(int input) {return errorPhrase[input];}

}
