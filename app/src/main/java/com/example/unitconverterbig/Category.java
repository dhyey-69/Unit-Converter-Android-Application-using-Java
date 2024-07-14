// Category.java
package com.example.unitconverterbig;

public class Category {
    private String categoryName;
    private int iconResource;

    public Category(String categoryName, int iconResource) {
        this.categoryName = categoryName;
        this.iconResource = iconResource;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getIconResource() {
        return iconResource;
    }
}
