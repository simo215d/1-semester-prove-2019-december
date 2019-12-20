package quiz;

public class Sporgsmaal implements Translatable{
    private String sporgsmaalsTekst;
    private int point;
    private Svar[] svar = new Svar[4];
    private int korrektSvarIndex;

    public void setSporgsmaalsTekst(String sporgsmaalsTekst) {
        if (sporgsmaalsTekst.length()>100){
            System.out.println("Too long question!");
            throw new IllegalArgumentException("Spørgsmål må maks. være 100 tegn.");
        } else this.sporgsmaalsTekst = sporgsmaalsTekst;
    }

    public void setPoint(int point) {
        if (point<0){
            throw new IllegalArgumentException("Point skal være større end 0");
        } else this.point = point;
    }

    public void setSvar(Svar[] svar) {
        this.svar[0]=svar[0];
        this.svar[1]=svar[1];
        this.svar[2]=svar[2];
        this.svar[3]=svar[3];
    }

    public void setKorrektSvarIndex(int korrektSvarIndex) {
        this.korrektSvarIndex = korrektSvarIndex;
    }

    public int getKorrektSvarIndex(){
        return korrektSvarIndex;
    }

    public String getSporgsmaalsTekst() {
        return sporgsmaalsTekst;
    }

    public int getPoint() {
        return point;
    }

    public Svar[] getSvar() {
        return svar;
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
