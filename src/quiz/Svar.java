package quiz;

public class Svar implements Translatable{
    private String svarmulighed;

    public Svar(String svarmulighed) {
        this.svarmulighed=svarmulighed;
    }

    public String getSvarmulighed(){
        return svarmulighed;
    }

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
