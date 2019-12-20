package quiz;

//denne klasse nedarver fra Sporgsmaal så vi behøver ikke skrive alle felter og metoder igen.
public class SporgsmaalMedBillede extends Sporgsmaal {
    private String picturePath = "FruitBowl.png";

    public void setPicturePath(String path){
        this.picturePath=path;
    }

    public String getPicturePath(){
        return picturePath;
    }
}
