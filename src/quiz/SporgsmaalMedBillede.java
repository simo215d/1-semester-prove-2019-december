package quiz;

public class SporgsmaalMedBillede extends Sporgsmaal {
    private String picturePath = "FruitBowl.png";

    public void setPicturePath(String path){
        this.picturePath=path;
    }

    public String getPicturePath(){
        return picturePath;
    }
}
