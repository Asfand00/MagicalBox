import java.util.*;

interface Storage {
    public void addItem(String itemName);
    public void removeItem(String itemName);
    public void printItems();
    public int getNumItems();
}

public class Doraemon implements Storage {

    private final ArrayList<String> magicPocket = new ArrayList<String>();

    public void addItem(String itemName) {
        magicPocket.add(itemName);
    }

    public void removeItem(String itemName) {
        magicPocket.remove(itemName);
    }

    public void printItems() {
        System.out.println("Whats inside Doraemon: " + magicPocket);
    }

    public int getNumItems() {
        return magicPocket.size();
    }

}

class Main {
    
    public static void main(String[] args) {
        Doraemon myDoraemon = new Doraemon();
        myDoraemon.addItem("pencil");
        myDoraemon.addItem("rubber");
        myDoraemon.addItem("textbook");
        myDoraemon.addItem("notebook");
        myDoraemon.addItem("backpack");
        myDoraemon.printItems();
        System.out.println("Count: " + myDoraemon.getNumItems());
        myDoraemon.removeItem("pencil");
        myDoraemon.removeItem("notebook");
        myDoraemon.printItems();
        System.out.println("Count: " + myDoraemon.getNumItems());
    }
}