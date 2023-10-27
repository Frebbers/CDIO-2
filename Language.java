public class Language {
    private String locale;
    String[] phrase;
    String[] errorPhrase;
    String winnerPhrase;
    

    public Language (String locale, String[] phrase, String[] errorPhrase, String winnerPhrase, String balancePhrase){
        this.locale = locale;
        this.phrase = phrase;
        this.errorPhrase = errorPhrase;
        this.winnerPhrase = winnerPhrase;
        this.balancePhrase = balancePhrase;
    }
    public String getLocale() {return this.locale;}
    public String phraseOut(int input) {return phrase[input];}
    public String errorPhraseOut(int input) {return errorPhrase[input];}

    //static factory method for danish language
public static Language createDanishLanguage(){
return new Language("Danish", new String[]{
    //create phrase for spot 2 
    "Terningerne viser 2...\n Du har fundet et forladt tårn med besynderligt, lysende svær. Du sælger det for 250 mønter",
    //create phrase for spot 3... and so on
    "Terningerne viser 3...\n På vej til byen falder du sammen med murstenene ned i et stort krater. Du mister nogle af dine mønter i faldet.",
    "Terningerne viser 4...\n Du ankommer til en stor, støvet port besmykket med guld og juveler. Du trækker i det gyldne håndtag og det falder af. Du sælger det for 100 mønter.",
    "Terningerne viser 5...\n Du farer vild og befinder dig i en kold ørken. Du tisser lidt i bukserne for at holde dig varm. Et nyt par koster dig 20 mønter.",
    "Terningerne viser 6...\n Du ankommer til en aflukket by. Du åbner porten og en meget taknemmelig dværg giver dig en sæk penge. 'Jeg kunne ikke nå håndtaget!' -siger han. Du fik 180 mønter.",
    "Terningerne viser 7...\n Du støder på et kloster hvor munkene lader dig hvile...",
    "Terningerne viser 8...\n Du søger ly og falder i søvn i en mørk grotte. Du vågner til en tyveknægt som løber med dine penge. Du mister 70 mønter",
    "Terningerne viser 9...\n Du befinder dig ved en hytte i bjergene da du møder en troldmand med en pibe og en stor hat. Han giver dig en ring og beder dig passe godt på den. Du sælger den for 60 mønter.",
    "Terningerne viser 10...\n På vej gennem væggen til skoven bliver du overfaldet og bidt af en varulv. Et nyt sæt tøj koster dig 80 mønter, men du holder dig vågen hele natten og får derfor en ekstra tur.",
    "Terningerne viser 11...\n Du finder et hul i jorden og beslutter dig for at gå ned og undersøge det. Du bliver overfaldet af et usselt væsen som du slår ihjel. Dit svær går i stykker. Et nyt koster dig 50 mønter.",
    "Terningerne viser 12... \n Du finder en guldmine fyldt med det pureste guld. Du fylder taskerne og sælger det for 650 mønter.",}, 
    //Error phrase(s)
    new String[] {"fejl 0, ugyldigt terningkast"}, 
    "Spillet er slut. Vinderen er: Spiller ", "Din nye møntbeholdning er: ");

    }
}
