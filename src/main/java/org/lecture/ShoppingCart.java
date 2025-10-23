package org.lecture;

import java.util.ArrayList;
import java.util.List;

/**
 * The ShoppingCart class represents a container for managing activity packages selected by a user.
 *
 * Each ShoppingCart instance maintains a list of activities, allowing the user to add activity packages
 * along with the desired quantity, calculate the total price of all selected activities,
 * and display the statistics of the current selections.
 */
public class ShoppingCart {

    private final List <Activity> activityList = new ArrayList<>() ;

    public ShoppingCart() {
    }

    // add activity to cart
    public void addPackage( ActivityPackage activityPackage, int amount){
       activityList.add(new Activity(activityPackage, amount));
    }

    // iter over the activity list and calculate the total price
    private double getTotalPrice(){
        double totalPrice = 0;
        for (Activity activity : activityList) {
            totalPrice += activity.getBookedPackages() * activity.getActivityPackage().getPrice();
        }
        return totalPrice;
    }

    // print the statistics of the current selections
    public void prntStatistics(){

        activityList.forEach(activity -> {
            System.out.printf("%-15s Anzahl: %-5d à: %-5d%n", activity.getActivityPackage().name(),
                    activity.getBookedPackages(),
                    activity.getActivityPackage().getPrice());
        });

        System.out.printf("Total price %s", getTotalPrice());
    }

}
