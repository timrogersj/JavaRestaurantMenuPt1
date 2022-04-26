package com.company;

public class MenuItem {

    private String name;
    private String description;
    private Double price;
    private String category;
    private Boolean isNew;


    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = "Not characterized";
        this.isNew = false;
    }

    public MenuItem (String name, String description, Double price, String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;

    }

    public String getName() {return this.name;}

    public void setName(String name) {this.name = name;}

    // getter for .price
    public Double getPrice() {
        return this.price;
    }

    // getter for .description
    public String getDescription() {
        return this.description;
    }

    // getter for .category
    public String getCategory() {
        return this.category;
    }

    // getter for .isNew --> notice the syntax is a little different I didn't use getIsNew() -> just isNew() makes sense as it can only return either true or false
    public boolean isNew() {
        return this.isNew;
    }

    // setter for .price()
    public void setPrice(Double price) {
        this.price = price;
    }

    // setter for .description
    public void setDescription(String description) {
        this.description = description;
    }

    // setter for isNew
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public void setCategory(String category) {this.category = category;}

    @Override
    public String toString() {
        //PseudoCode
        //printOutMenuItem()
        String returnString = "";
        //print itemName
        returnString += "Item Name: " + this.name + "\n";
        //print itemDescription
        returnString += "Item Description: " + this.description + "\n";
        //print itemPrice
        returnString += "Item Price: " + this.price + "\n";
        //print itemCategory
        returnString += "Item Category: " + this.category + "\n";
        //print itemIsNew
        returnString += "Item Is New: " + this.isNew + "\n";

        return returnString;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof MenuItem)) {
            return false;
        }

        MenuItem menuItem = (MenuItem) obj;
        if (menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category))
            return true;

        else return false;
    }
}
