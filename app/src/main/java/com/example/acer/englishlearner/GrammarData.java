package com.example.acer.englishlearner;

/**
 * Created by Acer on 28.6.2016 г..
 */
public class GrammarData {
    int imageGrammar;
    String textGrammar;
    public GrammarData(int image,String text) {
        this.imageGrammar = image;
        this.textGrammar = text;
    }
    public String getText() {
        return textGrammar;
    }

    public void setText(String text) {
        this.textGrammar = text;
    }
    public int getImage() {
        return imageGrammar;
    }

    public void setImage(int image) {
        this.imageGrammar = image;
    }
}

