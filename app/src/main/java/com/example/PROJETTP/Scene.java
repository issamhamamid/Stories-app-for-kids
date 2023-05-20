package com.example.PROJETTP;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Scene implements Parcelable {

    String scenetext;

    int image;

    public Scene(String scenetext, int image) {
        this.scenetext = scenetext;
        this.image = image;
    }

    protected Scene(Parcel in) {
        scenetext = in.readString();
        image = in.readInt();
    }

    public static final Creator<Scene> CREATOR = new Creator<Scene>() {
        @Override
        public Scene createFromParcel(Parcel in) {
            return new Scene(in);
        }

        @Override
        public Scene[] newArray(int size) {
            return new Scene[size];
        }
    };

    public String getScenetext() {
        return scenetext;
    }

    public int getImage() {
        return image;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(scenetext);
        dest.writeInt(image);
    }
}
