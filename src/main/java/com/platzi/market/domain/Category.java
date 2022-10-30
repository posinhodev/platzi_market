package com.platzi.market.domain;

public class Category {
    /**
     * Declaracion de variables
     * */
    private int categoryId;
    private String category;
    private boolean active;

    /**
     * Creacion de metodos Geter and Seter
     * */

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
