package com.example.PROJETTP;

public class StoryModel {

    private int image;
    private String titre;

    public StoryModel(int image, String titre) {
        this.image = image;
        this.titre = titre;
    }

    public int getImage() {
        return image;
    }

    public String getTitre() {
        return titre;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

}
