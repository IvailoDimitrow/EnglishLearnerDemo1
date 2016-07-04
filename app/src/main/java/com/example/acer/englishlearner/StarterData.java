package com.example.acer.englishlearner;

/**
 * Created by Acer on 27.6.2016 г..
 */
public class StarterData {
    int image;
    String text;
    public StarterData(int image,String text) {
        this.image = image;
        this.text = text;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
