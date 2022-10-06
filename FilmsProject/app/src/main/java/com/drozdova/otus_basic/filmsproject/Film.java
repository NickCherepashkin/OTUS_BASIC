package com.drozdova.otus_basic.filmsproject;

public class Film {
    private String title;
    private String imgName;

    public Film(String title, String imgName) {
        this.title = title;
        this.imgName = imgName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
}
