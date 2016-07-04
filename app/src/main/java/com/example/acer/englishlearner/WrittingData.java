package com.example.acer.englishlearner;

/**
 * Created by Acer on 28.6.2016 г..
 */
public class WrittingData {
        int imageWritting;
        String textWritting;
        public WrittingData(int image,String text) {
            this.imageWritting = image;
            this.textWritting = text;
        }
        public String getText() {
            return textWritting;
        }

        public void setText(String text) {
            this.textWritting = text;
        }
        public int getImage() {
            return imageWritting;
        }

        public void setImage(int image) {
            this.imageWritting = image;
        }
}

