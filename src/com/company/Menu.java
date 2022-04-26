package com.company;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    // an empty constructor, it just creates an empty list for the menuItems and uses the current time for lastUpdated
    public Menu() {
        this.lastUpdated = Date.from(Instant.now());
        this.menuItems = new ArrayList<MenuItem>();
    }

    // a constructor that allows the user to create the menu with a pre-existing list of menuItems
    public Menu(ArrayList<MenuItem> items) {
        this.lastUpdated = Date.from(Instant.now());
        this.menuItems = items;
    }

    // getter for .lastUpdated
    public Date getLastUpdated() {
        return lastUpdated;
    }

    // getter for .getMenuItems()
    public ArrayList<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    // no setters --- as of now I don't think there is any reason to overwrite the properties
    public void setMenuItems(ArrayList<MenuItem> menuItems) {this.menuItems = menuItems;}

    public void setLastUpdated(Date lastUpdated) {this.lastUpdated = lastUpdated;}

    public void addMenuItem(MenuItem item) {
        //Add to the list of menu items
        this.menuItems.add(item);
        //Update lastUpdated property (class variable)
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem item) {
        //remove the item from the list
        this.menuItems.remove(item);
        //update the lastUpdated property (class variable)
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        String returnString = "";
        //for menuItem in listOfMenuItems
        for (MenuItem item : this.menuItems) {
            returnString += item.toString() + "\n\n";

        }

        //menuItem.printOutMenuItem();

        return returnString;
    }
}