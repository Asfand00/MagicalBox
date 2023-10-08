package MagicalBox;

/**
 * This class is a demo class for testing the box class and its methods
 *
 * @author Asfandyar Tanwer
 * @version 1.0
 */
public class MagicalBoxDemo {

    /**
     * The main method for the MagicalBoxDemo class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box magicalbox = new Box(10, 10, 10); // create box here

        // print volume of box
        System.out.println("The Volume is: " + magicalbox.volume());
        System.out.println(); // new line

        // add items to box
        magicalbox.addItem("Book");
        magicalbox.addItem("headphones");
        magicalbox.addItem("phone");
        magicalbox.addItem("TV");
        magicalbox.addItem("Controller");
        magicalbox.addItem("Bottle");
        magicalbox.addItem("Candy");
        magicalbox.addItem("Pants");
        magicalbox.addItem("Shirt");
        magicalbox.addItem("Shoes");

        magicalbox.printItems();

        magicalbox.addItem("poop"); // add item to already full box, displays message

        magicalbox.printItems();
        
        magicalbox.removeItem("Book"); // removes book, let user know
        
        magicalbox.printItems();

        magicalbox.removeItem("Book"); // Book does not exist anymore, still lets user know 
        
        magicalbox.printItems();
        
        magicalbox.removeItem("Pants");
        
        magicalbox.printItems();
    }
}
