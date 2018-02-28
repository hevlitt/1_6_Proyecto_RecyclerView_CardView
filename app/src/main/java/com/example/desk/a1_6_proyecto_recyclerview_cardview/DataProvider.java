package com.example.desk.a1_6_proyecto_recyclerview_cardview;

/**
 * Created by desk on 27/02/18.
 */

public class DataProvider {
    private String title;
    private String shortdesc;
    private int image;

    //Generar el constructor

    public DataProvider(String title, String shortdesc, int image) {
        this.title = title;
        this.shortdesc = shortdesc;
        this.image = image;
    }

    //Generar los métodos getter.


    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }


    public int getImage() {
        return image;
    }
}
