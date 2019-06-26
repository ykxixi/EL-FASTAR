package com.example.wxx.fast13;

public class Star {
    private String name;
    private int imageId;

    public Star(String aName, int aImageId){
        this.name=aName;
        this.imageId=aImageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
