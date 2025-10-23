package org.lecture;

/**
 * Represents a package type with a specific activity focus and its associated price.
 *
 * Each package has a predefined name and price value, which can be accessed using the methods provided.
 * ActivityPackage types include:
 * - ENTSPANNUNG: Represents a relaxation package.
 * - ABENTEUER: Represents an adventure package.
 * - KULTUR: Represents a cultural package.
 *
 * The pricing of each activity package is fixed and associated with each enum constant.
 */
public enum ActivityPackage {
    ENTSPANNUNG(40),
    ABENTEUER(80),
    KULTUR(60);

    private int price;

    ActivityPackage(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


}
