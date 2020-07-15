package com.kingstech_app.no1_resturant_app;

public class Food {
    String foodName;
    boolean rating;
    boolean cost;
    int qty;
    String discription;
    int foodType;

    public Food(String foodName, boolean rating, boolean cost, int qty, String discription, int foodType) {
        this.foodName = foodName;
        this.rating = rating;
        this.cost = cost;
        this.qty = qty;
        this.discription = discription;
        this.foodType = foodType;
    }
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public boolean isRating() {
        return rating;
    }

    public void setRating(boolean rating) {
        this.rating = rating;
    }

    public boolean isCost() {
        return cost;
    }

    public void setCost(boolean cost) {
        this.cost = cost;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getFoodType() {
        return foodType;
    }

    public void setFoodType(int foodType) {
        this.foodType = foodType;
    }
}
