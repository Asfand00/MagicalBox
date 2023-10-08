package MagicalBox;
import java.util.Objects;

/**
 * This is the box class for creating an object box with four attributes:
 * width, depth, height, and array items[]. contains support methods for
 * calculating volume, adding an item to box, removing an item to box, and
 * printing items to user
 *
 * @author Asfandyar tanwer
 * @version 1.0
 */
public class Box {
    
    public final double width; // width of box
    public final double depth; // depth of box
    public final double height; // height of box
    public final String[] items = new String[10]; // list of items with fixed length of 10

    /**
     * This is the Constructor for the box class
     *
     * @param w a double number representing width
     * @param d a double number representing depth
     * @param h a double number representing height
     */
    public Box(double w, double d, double h) {
        this.width = w;
        this.depth = d;
        this.height = h;
    }

    /**
     * This is the volume method for calculating the volume using width, depth, and height
     *
     * @return the volume calculated by width * depth * height
     */
    public double volume() {
        return width * depth * height;
    }

    /**
     * This method adds an item to the array items, displays message when box is full
     *
     * @param item the item to be added to the array items
     */
    public void addItem(String item) {
        // loop checks for item and replaces the first null with item
        int i;
        for (i = 0 ; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Item: [ " + item + " ], has been added to box.");
                System.out.println();
                break; // break loop at the first null in the array
            }
            // checks to see if box is full and displays message
            else if (i == 9 && items[i] != null) {
                System.out.println("Item: [ " + item + " ], cannot be added because box is full.");
                System.out.println();
            }
        }
    }

    /**
     * This method removes an item from the items array, displays message
     * when item is removed or if item does not exist in array. displays message
     * when array is empty/null
     *
     * @param item the item to be removed from the items array
     */
    public void removeItem(String item) {
        // checks if the array is empty
        int e;
        int count = 0;
        for (e = 0; e < items.length; e++) {
            if (items[e] == null) {
                count++;
            }
        }
        if (count == 10) {
            System.out.println("Item: [ " + item + " ], Removal is not possible, it's an empty box.");
            System.out.println();
        }
        // if not empty array, go here
        else {
            // loop checks for item and replaces item with null
            int i;
            for (i = 0; i < items.length; i++) {
                if (Objects.equals(items[i], item)) { // (items[i] == item)

                    items[i] = null;

                    // Displays message to user that item has been removed
                    System.out.println("Item: [ " + item + " ], has been removed");
                    System.out.println();
                    break;
                }
                else if (!Objects.equals(items[i], item) && i == 9) {

                    // Displays message to user that item does not exist in box
                    System.out.println("Item: [ " + item + " ], does not exist in box");
                    System.out.println();
                    break;
                }
            }
        }
    }

    /**
     * This method prints the items in the items array in a formatted manner
     */
    public void printItems() {
        // loop goes through each item and checks for certain conditions
        int i;
        System.out.print("Magical Box: {"); // first half of the box
        for (i = 0 ; i < items.length; i++) {
            if (items[i] == null) {
                continue; // ignore null in the box, so it doesnt print.
            }
            else {
                System.out.print("[ " + items[i] + " ]"); // prints item seperated by comma
            }
        }
        // last half of the box
        System.out.print("}");
        System.out.println();
        System.out.println();
    }
}
