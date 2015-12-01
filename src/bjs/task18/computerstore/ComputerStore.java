package bjs.task18.computerstore;

import java.util.HashMap;
import bjs.task18.computers.*;

/**
 * Created by YM on 27.11.2015.
 */

/**
 * Presents computer store
 */
public class ComputerStore {

    private DesktopComputersCatalog desktopComputers;

    /**
     * Provides storage for the computer objects
     */
    protected class DesktopComputersCatalog extends HashMap<String, Desktop> {
       //Add user defined functions if necessary, e.g. some search
    }

    /**
     * Helper, print Desktop object in the console
     */
    protected void printDesktop(Desktop desktop) {
        System.out.print(desktop.toString());
        System.out.println("--------------------------------------------\n");
    }

    /**
     * Current constructor
     */
    public ComputerStore() {
        desktopComputers = new DesktopComputersCatalog();
    }

    /**
     * Adds Desktop to the collection
     * @param desktop
     */
    public void addDesktop(Desktop desktop) {
        desktopComputers.put(desktop.getArticle(), desktop);
    }

    /**
     * Gets Desktop object by index
     * @param article
     * @return
     */
    public Desktop getDesktop(String article) {
        return desktopComputers.get(article);
    }

    /**
     * Prints Desktop collection with for cycle
     */
    public void printDesktopComputersFor() {
        for (HashMap.Entry<String, Desktop> entry : desktopComputers.entrySet()) {
            printDesktop(entry.getValue());
        }
    }

    /**
     * Prints Desktop collection with  "forEach" method and lambda
     */
    public void printDesktopComputersForEach() {
        desktopComputers.forEach((key, value)->printDesktop(value));
    }
}
