package com.example.recyclerviewdog.model;

public class DogModel {
    String DogName;
    int DogImage , Price;

    public DogModel(String dogName, int dogImage, int price) {
        DogName = dogName;
        DogImage = dogImage;
        Price = price;
    }

    public String getDogName() {
        return DogName;
    }

    public void setDogName(String dogName) {
        DogName = dogName;
    }

    public int getDogImage() {
        return DogImage;
    }

    public void setDogImage(int dogImage) {
        DogImage = dogImage;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
