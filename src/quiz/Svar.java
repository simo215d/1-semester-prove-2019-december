package quiz;

public class Svar implements Translatable{
    private String svarmulighed;

    //en constructor som bliver kaldt når vi laver en ny Svar.
    public Svar(String svarmulighed) {
        this.svarmulighed=svarmulighed;
    }

    public String getSvarmulighed(){
        return svarmulighed;
    }

    //denne metode har vi implementeret fra Translatable og den gør ikke noget endnu
    @Override
    public String translate(String language) {
        if (language.equals(Language.DANISH)) {
            return "Oversættelse er ikke muligt endnu";
        } else if (language.equals(Language.ENGLISH)){
            return "Translation is not available yet";
        }
        return "Language not recognised.";
    }
}
