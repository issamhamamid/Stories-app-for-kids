package com.example.PROJETTP;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class StoryModel  {

    int image;
   String titre;

   Scene[] scenes;

   boolean favoriteStatus;

    public StoryModel(int image, String titre, Scene[] scenes, boolean favoriteStatus) {
        this.image = image;
        this.titre = titre;
        this.scenes = scenes;
        this.favoriteStatus = favoriteStatus;
    }


    public int getImage() {
        return image;
    }

    public String getTitre() {
        return titre;
    }

    public Scene[] getScenes() {
        return scenes;
    }

    public boolean isFavoriteStatus() {
        return favoriteStatus;
    }


}
