package com.example.sergei.recyclerviewexample;

/**
 * Created by sergei on 29.01.2017.
 */

public class ItemMenuCards {

    String title;
    int imageView;

    public static ItemMenuCards  newInstance(String title, int imageView){
        ItemMenuCards instance = new ItemMenuCards();
        instance.setImageView(imageView);
        instance.setTitle(title);
        return instance;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }


}
