package MagicalBox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * This is a Junit 5 test for the class Box.
 * <p>
 * Each method is tested with varying situations to make sure they run smoothly
 * with no errors, comments before each statement explain the action and what should
 * happen.
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 * @see Box
 */

public class BoxTest {

    @Test
    @DisplayName("Create a box with the right attributes")
    void Box() {
        // Create new box
        Box magicBox = new Box(10,10,10);

        // Make sure box list contains all null values by testing last item in box
        Assertions.assertNull(magicBox.items[9]);

        // Make sure dimensions are assigned correctly
        Assertions.assertEquals(10, magicBox.width);
        Assertions.assertEquals(10, magicBox.height);
        Assertions.assertEquals(10, magicBox.depth);
    }

    @Test
    @DisplayName("Calculate the volume of box")
    void volume() {
        // Create new box with set dimensions
        Box magicBox = new Box(10,10,10);

        // Make sure volume is calculated correctly
        Assertions.assertEquals(1000.0, magicBox.volume());
    }

    @Test
    @DisplayName("Add an item to the box")
    void addItem() {
        // Create new box
        Box magicBox = new Box(10,10,10);

        // Add one item
        magicBox.addItem("Book");

        // Check if item was added in right spot
        Assertions.assertEquals("Book", magicBox.items[0]);

        // Add another item
        magicBox.addItem("Pencil");

        // Check again if item was added correctly
        Assertions.assertEquals("Pencil", magicBox.items[1]);

        // Populate box with items
        magicBox.addItem("Book2");
        magicBox.addItem("Book3");
        magicBox.addItem("Book4");
        magicBox.addItem("Book5");
        magicBox.addItem("Book6");
        magicBox.addItem("Book7");
        magicBox.addItem("Book8");

        // Last item in box
        magicBox.addItem("Final Book");

        // Check if item is last item in box
        Assertions.assertEquals("Final Book", magicBox.items[9]);

        // Display Message to user stating that Box is Full
        magicBox.addItem("Poop");
    }

    @Test
    @DisplayName("Remove an item from the box")
    void removeItem() {
        // Create new box
        Box magicBox = new Box(10,10,10);

        // Display empty box
        magicBox.printItems();

        // Display Message to user that box is empty
        magicBox.removeItem("book");

        // Populate magicBox with items.
        magicBox.addItem("Book");
        magicBox.addItem("Pencil");
        magicBox.addItem("Eraser");
        magicBox.addItem("Notebook");
        magicBox.addItem("Laptop");
        magicBox.addItem("Mouse");
        magicBox.addItem("Pen");
        magicBox.addItem("TV");
        magicBox.addItem("Door");
        magicBox.addItem("Chair");

        // Make sure item is in box
        Assertions.assertEquals("Notebook", magicBox.items[3]);

        // Show items currently in box
        magicBox.printItems();

        // Display Message to user that item is removed.
        magicBox.removeItem("Notebook");

        // Make sure item that was notebook in box is now null
        Assertions.assertNull(magicBox.items[3]);

        // Show items after removal from box
        magicBox.printItems();

        // Display Message to user that item does not exist.
        magicBox.removeItem("Notebook");
    }

    @Test
    @DisplayName("Display the magical box to user")
    void printItems() {
        // Create new box
        Box magicBox = new Box(10,10,10);

        // Display empty list
        magicBox.printItems();

        // Populate box with items
        magicBox.addItem("Book");
        magicBox.addItem("Pencil");
        magicBox.addItem("Eraser");
        magicBox.addItem("Notebook");
        magicBox.addItem("Laptop");

        // Show current items in box correctly
        magicBox.printItems();

        // Remove item from box
        magicBox.removeItem("Notebook");

        // Show items in box after removal correctly
        magicBox.printItems();

        // Add an item to box
        magicBox.addItem("Door");

        // Show items in box after adding correctly
        magicBox.printItems();
    }
}
