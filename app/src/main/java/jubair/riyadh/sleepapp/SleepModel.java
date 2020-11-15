package jubair.riyadh.sleepapp;

public class SleepModel {
    String Name,details,fulldec,favorits,lestening;
    int Image,music;

    public SleepModel() {
    }

    public SleepModel(String name, String details, String fulldec, String favorits, String lestening, int image, int music) {
        Name = name;
        this.details = details;
        this.fulldec = fulldec;
        this.favorits = favorits;
        this.lestening = lestening;
        this.Image = image;
        this.music = music;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getFulldec() {
        return fulldec;
    }

    public void setFulldec(String fulldec) {
        this.fulldec = fulldec;
    }

    public String getFavorits() {
        return favorits;
    }

    public void setFavorits(String favorits) {
        this.favorits = favorits;
    }

    public String getLestening() {
        return lestening;
    }

    public void setLestening(String lestening) {
        this.lestening = lestening;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getMusic() {
        return music;
    }

    public void setMusic(int music) {
        this.music = music;
    }
}
