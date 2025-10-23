package org.lecture;

/**
 * The Activity class represents an activity booking that includes a specific activity package
 * and the number of booked packages (quantities).
 *
 * This class stores information about the activity package selected by a user and the corresponding
 * number of packages booked for that activity. It provides methods to retrieve the selected activity package
 * and the quantity booked.
 *
 * Attributes:
 * - activityPackage: Holds the activity package type (e.g., ENTSPANNUNG, ABENTEUER, KULTUR) selected by the user.
 * - bookedPackages: Represents the number of packages booked for the selected activity.
 *
 * Constructor:
 * - The constructor initializes the activity package and the booked quantity through its parameters.
 *
 * Methods:
 * - getActivityPackage(): Returns the selected activity package.
 * - getBookedPackages(): Returns the number of packages booked for the activity.
 */
public class Activity {

    private ActivityPackage activityPackage;
    private int bookedPackages;

    public Activity(ActivityPackage activityPackage, int amount) {
        this.activityPackage = activityPackage;
        this.bookedPackages = amount;
    }

    public ActivityPackage getActivityPackage() {
        return activityPackage;
    }

    public int getBookedPackages() {
        return bookedPackages;
    }
}
